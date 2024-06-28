// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. The server checks whether a request that uses the same client token has been received. If a request that uses the same client token has been received, the server returns the same request result as the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>JASIOFKVNVIXXXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The logistics address of this order. This parameter is generally valid for physical orders.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;cityCode&quot;:&quot;330100&quot;,&quot;cityName&quot;:&quot;Hangzhou&quot;,&quot;contactName&quot;:&quot;Test&quot;,&quot;countryCode&quot;:&quot;&quot;,&quot;districtName&quot;:&quot;Puyan Street&quot;,&quot;email&quot;:&quot;\<em>\</em>@example.com&quot;,&quot;mobilePhone&quot;:&quot;153564848844&quot;,&quot;phone&quot;:&quot;1234567&quot;,&quot;provCode&quot;:&quot;330000&quot;,&quot;provName&quot;:&quot;Zhejiang&quot;,&quot;streetCode&quot;:&quot;33010610&quot;,&quot;streetName&quot;:&quot;Zhuantang&quot;,&quot;zipCode&quot;:&quot;0000&quot;}</p>
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
     * <blockquote>
     * <p> This parameter is required if you create a subscription instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The code of the service to which the instance belongs. You can query the service code by calling the <strong>QueryProductList</strong> operation or viewing <strong>Codes of Alibaba Cloud Services</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The auto-renewal period. Unit: month.</p>
     * <blockquote>
     * <p> This parameter is required if the <strong>RenewalStatus</strong> parameter is set to <strong>AutoRenewal</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RenewPeriod")
    public Integer renewPeriod;

    /**
     * <p>The renewal method. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: The instance is automatically renewed.</li>
     * <li>ManualRenewal: The instance is manually renewed.</li>
     * </ul>
     * <p>Default value: ManualRenewal.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualRenewal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>Subscription: the subscription billing method.</li>
     * <li>PayAsYouGo: the pay-as-you-go billing method.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value property of the Nth module. Value of N: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
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
