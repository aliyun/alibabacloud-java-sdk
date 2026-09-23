// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AddCreditSeatsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Configs")
    public java.util.List<AddCreditSeatsRequestConfigs> configs;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Seats")
    public Long seats;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static AddCreditSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCreditSeatsRequest self = new AddCreditSeatsRequest();
        return TeaModel.build(map, self);
    }

    public AddCreditSeatsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCreditSeatsRequest setConfigs(java.util.List<AddCreditSeatsRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<AddCreditSeatsRequestConfigs> getConfigs() {
        return this.configs;
    }

    public AddCreditSeatsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddCreditSeatsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public AddCreditSeatsRequest setSeats(Long seats) {
        this.seats = seats;
        return this;
    }
    public Long getSeats() {
        return this.seats;
    }

    public AddCreditSeatsRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class AddCreditSeatsRequestConfigs extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Value")
        public String value;

        public static AddCreditSeatsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            AddCreditSeatsRequestConfigs self = new AddCreditSeatsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public AddCreditSeatsRequestConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddCreditSeatsRequestConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
