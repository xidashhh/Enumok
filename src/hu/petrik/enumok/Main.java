package hu.petrik.enumok;

import hu.petrik.enumok.bolygo.Bolygo;

public class Main {
    public static void main(String[] args) {
        for (Bolygo bolygo: Bolygo.values()){
            System.out.println(bolygo);
        }
    }
}
