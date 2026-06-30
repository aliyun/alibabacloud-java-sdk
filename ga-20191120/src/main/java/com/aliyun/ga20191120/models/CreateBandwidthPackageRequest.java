// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Disables automatic payment. After an order is generated, go to the Order Hub to complete the payment.</p>
     * </li>
     * <li><p><strong>true</strong>: Enables automatic payment. Payments are automatically completed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months.</p>
     * <p>Valid values: <strong>1</strong> to <strong>12</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only if <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to use a coupon to automatically pay for the bill. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): No.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only if <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth of the bandwidth plan. Unit: Mbps.
     * Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The type of bandwidth. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: Basic bandwidth.</p>
     * </li>
     * <li><p><strong>Enhanced</strong>: Enhanced bandwidth.</p>
     * </li>
     * <li><p><strong>Advanced</strong>: Advanced bandwidth.</p>
     * </li>
     * </ul>
     * <p>This parameter is required if you set <strong>Type</strong> to <strong>Basic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The billing method for a pay-as-you-go bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>PayByTraffic</strong> (default): pay-by-traffic.</p>
     * </li>
     * <li><p><strong>PayBY95</strong>: pay-by-95th-percentile. This billing method is not available by default. Contact your account manager to use this billing method.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only if <strong>ChargeType</strong> is set to <strong>POSTPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("BillingType")
    public String billingType;

    /**
     * <p>Connected area A of the cross-region acceleration bandwidth plan. Set the value to <strong>China-mainland</strong>.</p>
     * <p>This parameter is available only on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * 
     * <strong>example:</strong>
     * <p>China-mainland</p>
     */
    @NameInMap("CbnGeographicRegionIdA")
    public String cbnGeographicRegionIdA;

    /**
     * <p>Connected area B of the cross-region acceleration bandwidth plan. Set the value to <strong>Global</strong>.</p>
     * <p>This parameter is available only on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("CbnGeographicRegionIdB")
    public String cbnGeographicRegionIdB;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>PREPAY</strong> (default): subscription.</p>
     * </li>
     * <li><p><strong>POSTPAY</strong>: pay-as-you-go. The pay-as-you-go billing method is not available by default. Contact your account manager to use this billing method.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a client token from your client to make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subscription duration.</p>
     * <ul>
     * <li><p>If you set <strong>PricingCycle</strong> to <strong>Month</strong>, valid values for <strong>Duration</strong> are <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If you set <strong>PricingCycle</strong> to <strong>Year</strong>, valid values for <strong>Duration</strong> are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required if you set <strong>ChargeType</strong> to <strong>PREPAY</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong>: monthly billing.</p>
     * </li>
     * <li><p><strong>Year</strong>: yearly billing.</p>
     * </li>
     * </ul>
     * <p>This parameter is required if you set <strong>ChargeType</strong> to <strong>PREPAY</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * <blockquote>
     * <p>This parameter is available only on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50003298014****</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The percentage of the guaranteed minimum bandwidth if you use the pay-by-95th-percentile metering method. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only if <strong>BillingType</strong> is set to <strong>PayBY95</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzrnd67gq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the bandwidth plan.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateBandwidthPackageRequestTag> tag;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: a basic bandwidth plan.</p>
     * </li>
     * <li><p><strong>CrossDomain</strong>: a cross-region acceleration bandwidth plan.</p>
     * </li>
     * </ul>
     * <p>Only <strong>Basic</strong> is supported on the Alibaba Cloud China Website (www\.aliyun.com).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthPackageRequest self = new CreateBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateBandwidthPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateBandwidthPackageRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateBandwidthPackageRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateBandwidthPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateBandwidthPackageRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public CreateBandwidthPackageRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public CreateBandwidthPackageRequest setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
        this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
        return this;
    }
    public String getCbnGeographicRegionIdA() {
        return this.cbnGeographicRegionIdA;
    }

    public CreateBandwidthPackageRequest setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
        this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
        return this;
    }
    public String getCbnGeographicRegionIdB() {
        return this.cbnGeographicRegionIdB;
    }

    public CreateBandwidthPackageRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBandwidthPackageRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateBandwidthPackageRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateBandwidthPackageRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public CreateBandwidthPackageRequest setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public CreateBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBandwidthPackageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateBandwidthPackageRequest setTag(java.util.List<CreateBandwidthPackageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateBandwidthPackageRequestTag> getTag() {
        return this.tag;
    }

    public CreateBandwidthPackageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateBandwidthPackageRequestTag extends TeaModel {
        /**
         * <p>The tag key of the bandwidth plan. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the bandwidth plan. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateBandwidthPackageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateBandwidthPackageRequestTag self = new CreateBandwidthPackageRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateBandwidthPackageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBandwidthPackageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
