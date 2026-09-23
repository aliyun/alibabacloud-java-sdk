// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class RenewCreditSeatRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static RenewCreditSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewCreditSeatRequest self = new RenewCreditSeatRequest();
        return TeaModel.build(map, self);
    }

    public RenewCreditSeatRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewCreditSeatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewCreditSeatRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewCreditSeatRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewCreditSeatRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RenewCreditSeatRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public RenewCreditSeatRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
