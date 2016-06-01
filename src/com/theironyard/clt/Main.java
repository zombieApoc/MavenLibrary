package com.theironyard.clt;

import org.jscience.*;
import org.jscience.economics.money.Currency;
import org.jscience.economics.money.Money;
import org.jscience.physics.amount.Amount;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;
import javax.measure.unit.UnitFormat;

import static org.jscience.economics.money.Currency.USD;

/**
 * Created by Ultramar on 5/24/16.
 */
public class Main {

    public static void main(String[] args) {
        tipCalaulator(20.67, 0.20);

    }

    public static Amount<Money> tipCalaulator(double check, double percent) {
        Amount<Money> start = Amount.valueOf(check, USD);
        System.out.println(start.times(percent).toText());
        return start.times(percent);
    }
}
