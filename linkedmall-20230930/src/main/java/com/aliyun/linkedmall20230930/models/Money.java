// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Money extends TeaModel {
    @NameInMap("amount")
    public Long amount;

    @NameInMap("amountAsString")
    public String amountAsString;

    @NameInMap("amountString")
    public String amountString;

    @NameInMap("cent")
    public Long cent;

    @NameInMap("currency")
    public MoneyCurrency currency;

    @NameInMap("currencyCode")
    public String currencyCode;

    @NameInMap("positive")
    public Boolean positive;

    public static Money build(java.util.Map<String, ?> map) throws Exception {
        Money self = new Money();
        return TeaModel.build(map, self);
    }

    public Money setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public Money setAmountAsString(String amountAsString) {
        this.amountAsString = amountAsString;
        return this;
    }
    public String getAmountAsString() {
        return this.amountAsString;
    }

    public Money setAmountString(String amountString) {
        this.amountString = amountString;
        return this;
    }
    public String getAmountString() {
        return this.amountString;
    }

    public Money setCent(Long cent) {
        this.cent = cent;
        return this;
    }
    public Long getCent() {
        return this.cent;
    }

    public Money setCurrency(MoneyCurrency currency) {
        this.currency = currency;
        return this;
    }
    public MoneyCurrency getCurrency() {
        return this.currency;
    }

    public Money setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Money setPositive(Boolean positive) {
        this.positive = positive;
        return this;
    }
    public Boolean getPositive() {
        return this.positive;
    }

    public static class MoneyCurrency extends TeaModel {
        @NameInMap("currencyCode")
        public String currencyCode;

        @NameInMap("defaultFractionDigits")
        public Integer defaultFractionDigits;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("numericCode")
        public Integer numericCode;

        @NameInMap("symbol")
        public String symbol;

        public static MoneyCurrency build(java.util.Map<String, ?> map) throws Exception {
            MoneyCurrency self = new MoneyCurrency();
            return TeaModel.build(map, self);
        }

        public MoneyCurrency setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public MoneyCurrency setDefaultFractionDigits(Integer defaultFractionDigits) {
            this.defaultFractionDigits = defaultFractionDigits;
            return this;
        }
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        public MoneyCurrency setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public MoneyCurrency setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }
        public Integer getNumericCode() {
            return this.numericCode;
        }

        public MoneyCurrency setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

    }

}
