// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The client idempotency token. The server checks whether a request with the same ClientToken has been made. If yes, the server returns the result of the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>JASIOFKVNVIXXXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The logistics address for this order. This parameter is typically valid for orders of physical products.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;cityCode&quot;:&quot;330100&quot;,&quot;cityName&quot;:&quot;Hangzhou&quot;,&quot;contactName&quot;:&quot;Test&quot;,&quot;countryCode&quot;:&quot;&quot;,&quot;districtName&quot;:&quot;Puyan Street&quot;,&quot;email&quot;:&quot;**@example.com&quot;,&quot;mobilePhone&quot;:&quot;153564848844&quot;,&quot;phone&quot;:&quot;1234567&quot;,&quot;provCode&quot;:&quot;330000&quot;,&quot;provName&quot;:&quot;Zhejiang Province&quot;,&quot;streetCode&quot;:&quot;33010610&quot;,&quot;streetName&quot;:&quot;Zhuantang&quot;,&quot;zipCode&quot;:&quot;0000&quot;}</p>
     */
    @NameInMap("Logistics")
    public String logistics;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of modules.</p>
     */
    @NameInMap("Parameter")
    public java.util.List<CreateInstanceRequestParameter> parameter;

    /**
     * <p>The subscription period. Unit: months. For yearly subscription products, specify a multiple of 12.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period.</p>
     * <ul>
     * <li><p>PricingCycle=1: The unit of the subscription period is year.</p>
     * </li>
     * <li><p>PricingCycle=2: The unit of the subscription period is month.</p>
     * </li>
     * <li><p>PricingCycle=3: The unit of the subscription period is day.</p>
     * </li>
     * </ul>
     * <p>Default value: PricingCycle=2.</p>
     * <p>This parameter is applicable only to specific product types (ProductType is ddos_originpre_public_cn, ddosDip, ddoscoo, ddos_originpre_public_intl, ddosDip_intl, or ddoscoo_intl).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PricingCycle")
    public Long pricingCycle;

    /**
     * <p>The product code. You can call the <strong>QueryProductList</strong> operation to query the product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cdn</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>Cdn</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The auto-renewal epoch. Unit: months.</p>
     * <blockquote>
     * <p>This parameter is required when you set <strong>RenewalStatus</strong> to <strong>AutoRenewal</strong> in Settings.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("RenewPeriod")
    public Integer renewPeriod;

    /**
     * <p>The auto-renewal status. Valid values:</p>
     * <ul>
     * <li>AutoRenewal: auto-renewal is enabled.</li>
     * <li>ManualRenewal: manual renewal.</li>
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
     * <li>Subscription: subscription.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
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

    public CreateInstanceRequest setPricingCycle(Long pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public Long getPricingCycle() {
        return this.pricingCycle;
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
         * <p>The code of the Nth module property. Valid values of N: 1 to 100. If multiple module properties exist, concatenate them in the format of N=1, 2, 3...N.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The value of the Nth module property. Valid values of N: 1 to 100.</p>
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
