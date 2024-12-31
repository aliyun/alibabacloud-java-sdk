// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCashDetailResponseBody extends TeaModel {
    @NameInMap("AmountOwed")
    public String amountOwed;

    @NameInMap("AvailableCredit")
    public String availableCredit;

    @NameInMap("BalanceAmount")
    public String balanceAmount;

    @NameInMap("CreditCardAmount")
    public String creditCardAmount;

    @NameInMap("CreditLimit")
    public String creditLimit;

    @NameInMap("EnableThresholdAlert")
    public String enableThresholdAlert;

    @NameInMap("FrozenAmount")
    public String frozenAmount;

    @NameInMap("MiniAlertThreshold")
    public Long miniAlertThreshold;

    @NameInMap("RemmitanceAmount")
    public String remmitanceAmount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCashDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCashDetailResponseBody self = new DescribeCashDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCashDetailResponseBody setAmountOwed(String amountOwed) {
        this.amountOwed = amountOwed;
        return this;
    }
    public String getAmountOwed() {
        return this.amountOwed;
    }

    public DescribeCashDetailResponseBody setAvailableCredit(String availableCredit) {
        this.availableCredit = availableCredit;
        return this;
    }
    public String getAvailableCredit() {
        return this.availableCredit;
    }

    public DescribeCashDetailResponseBody setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }
    public String getBalanceAmount() {
        return this.balanceAmount;
    }

    public DescribeCashDetailResponseBody setCreditCardAmount(String creditCardAmount) {
        this.creditCardAmount = creditCardAmount;
        return this;
    }
    public String getCreditCardAmount() {
        return this.creditCardAmount;
    }

    public DescribeCashDetailResponseBody setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
    public String getCreditLimit() {
        return this.creditLimit;
    }

    public DescribeCashDetailResponseBody setEnableThresholdAlert(String enableThresholdAlert) {
        this.enableThresholdAlert = enableThresholdAlert;
        return this;
    }
    public String getEnableThresholdAlert() {
        return this.enableThresholdAlert;
    }

    public DescribeCashDetailResponseBody setFrozenAmount(String frozenAmount) {
        this.frozenAmount = frozenAmount;
        return this;
    }
    public String getFrozenAmount() {
        return this.frozenAmount;
    }

    public DescribeCashDetailResponseBody setMiniAlertThreshold(Long miniAlertThreshold) {
        this.miniAlertThreshold = miniAlertThreshold;
        return this;
    }
    public Long getMiniAlertThreshold() {
        return this.miniAlertThreshold;
    }

    public DescribeCashDetailResponseBody setRemmitanceAmount(String remmitanceAmount) {
        this.remmitanceAmount = remmitanceAmount;
        return this;
    }
    public String getRemmitanceAmount() {
        return this.remmitanceAmount;
    }

    public DescribeCashDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
