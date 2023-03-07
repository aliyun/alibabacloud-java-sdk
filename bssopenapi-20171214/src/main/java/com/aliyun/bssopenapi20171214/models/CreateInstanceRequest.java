// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. The server checks whether a request that uses the same client token has been received. If a request that uses the same client token has been received, the server returns the same request result as the previous request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The logistics address of this order. This parameter is generally valid for physical orders.</p>
     */
    @NameInMap("Logistics")
    public String logistics;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The details of the modules.</p>
     */
    @NameInMap("Parameter")
    public java.util.List<CreateInstanceRequestParameter> parameter;

    /**
     * <p>The subscription duration. Unit: month. The value must be an integral multiple of 12.</p>
     * <br>
     * <p>>  This parameter is required if you create a subscription instance.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The code of the service to which the instance belongs. You can query the service code by calling the **QueryProductList** operation or viewing **Codes of Alibaba Cloud Services**.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The auto-renewal period. Unit: month.</p>
     * <br>
     * <p>>  This parameter is required if the **RenewalStatus** parameter is set to **AutoRenewal**.</p>
     */
    @NameInMap("RenewPeriod")
    public Integer renewPeriod;

    /**
     * <p>The renewal method. Valid values:</p>
     * <br>
     * <p>*   AutoRenewal: The instance is automatically renewed.</p>
     * <p>*   ManualRenewal: The instance is manually renewed.</p>
     * <br>
     * <p>Default value: ManualRenewal.</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: the subscription billing method.</p>
     * <p>*   PayAsYouGo: the pay-as-you-go billing method.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceRequest setLogistics(String logistics) {
        this.logistics = logistics;
        return this;
    }
    public String getLogistics() {
        return this.logistics;
    }

    public CreateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceRequest setParameter(java.util.List<CreateInstanceRequestParameter> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.List<CreateInstanceRequestParameter> getParameter() {
        return this.parameter;
    }

    public CreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateInstanceRequest setRenewPeriod(Integer renewPeriod) {
        this.renewPeriod = renewPeriod;
        return this;
    }
    public Integer getRenewPeriod() {
        return this.renewPeriod;
    }

    public CreateInstanceRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public CreateInstanceRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class CreateInstanceRequestParameter extends TeaModel {
        /**
         * <p>The code property of the Nth module. Value of N: 1 to 100. If multiple module property parameters are involved, concatenate multiple parameters based on the value of N in sequence.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value property of the Nth module. Value of N: 1 to 100.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestParameter self = new CreateInstanceRequestParameter();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestParameter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateInstanceRequestParameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
