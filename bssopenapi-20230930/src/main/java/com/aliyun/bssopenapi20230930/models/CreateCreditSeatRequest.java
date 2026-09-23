// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCreditSeatRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionConfigs")
    public java.util.List<CreateCreditSeatRequestSubscriptionConfigs> subscriptionConfigs;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static CreateCreditSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditSeatRequest self = new CreateCreditSeatRequest();
        return TeaModel.build(map, self);
    }

    public CreateCreditSeatRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateCreditSeatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCreditSeatRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCreditSeatRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCreditSeatRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateCreditSeatRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateCreditSeatRequest setSubscriptionConfigs(java.util.List<CreateCreditSeatRequestSubscriptionConfigs> subscriptionConfigs) {
        this.subscriptionConfigs = subscriptionConfigs;
        return this;
    }
    public java.util.List<CreateCreditSeatRequestSubscriptionConfigs> getSubscriptionConfigs() {
        return this.subscriptionConfigs;
    }

    public CreateCreditSeatRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class CreateCreditSeatRequestSubscriptionConfigsConfigs extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Value")
        public String value;

        public static CreateCreditSeatRequestSubscriptionConfigsConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateCreditSeatRequestSubscriptionConfigsConfigs self = new CreateCreditSeatRequestSubscriptionConfigsConfigs();
            return TeaModel.build(map, self);
        }

        public CreateCreditSeatRequestSubscriptionConfigsConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateCreditSeatRequestSubscriptionConfigsConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCreditSeatRequestSubscriptionConfigs extends TeaModel {
        @NameInMap("Configs")
        public java.util.List<CreateCreditSeatRequestSubscriptionConfigsConfigs> configs;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Seats")
        public Long seats;

        public static CreateCreditSeatRequestSubscriptionConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateCreditSeatRequestSubscriptionConfigs self = new CreateCreditSeatRequestSubscriptionConfigs();
            return TeaModel.build(map, self);
        }

        public CreateCreditSeatRequestSubscriptionConfigs setConfigs(java.util.List<CreateCreditSeatRequestSubscriptionConfigsConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<CreateCreditSeatRequestSubscriptionConfigsConfigs> getConfigs() {
            return this.configs;
        }

        public CreateCreditSeatRequestSubscriptionConfigs setSeats(Long seats) {
            this.seats = seats;
            return this;
        }
        public Long getSeats() {
            return this.seats;
        }

    }

}
