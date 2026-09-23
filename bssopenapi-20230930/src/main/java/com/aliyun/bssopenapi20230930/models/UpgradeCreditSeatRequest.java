// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpgradeCreditSeatRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Configs")
    public java.util.List<UpgradeCreditSeatRequestConfigs> configs;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static UpgradeCreditSeatRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCreditSeatRequest self = new UpgradeCreditSeatRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeCreditSeatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeCreditSeatRequest setConfigs(java.util.List<UpgradeCreditSeatRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<UpgradeCreditSeatRequestConfigs> getConfigs() {
        return this.configs;
    }

    public UpgradeCreditSeatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeCreditSeatRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpgradeCreditSeatRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpgradeCreditSeatRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class UpgradeCreditSeatRequestConfigs extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Value")
        public String value;

        public static UpgradeCreditSeatRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpgradeCreditSeatRequestConfigs self = new UpgradeCreditSeatRequestConfigs();
            return TeaModel.build(map, self);
        }

        public UpgradeCreditSeatRequestConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpgradeCreditSeatRequestConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
