// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</li>
     * <li><strong>true</strong>: enables automatic payment. Payments are automatically completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong> (default): does not enable auto-renewal.</li>
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
     * <p> This parameter is required only if <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to automatically pay bills by using coupons. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required only if <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth of the bandwidth plan. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The type of the bandwidth. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: standard bandwidth</li>
     * <li><strong>Enhanced</strong>: enhanced bandwidth</li>
     * <li><strong>Advanced</strong>: premium bandwidth</li>
     * </ul>
     * <p>If <strong>Type</strong> is set to <strong>Basic</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The metering method that is used when you use the pay-as-you-go billing method. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong> (default)</li>
     * <li><strong>PayBY95</strong> By default, the pay-by-95th-percentile metering method is unavailable. If you want to use the metering method, contact your account manager.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you set <strong>ChargeType</strong> to <strong>POSTPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("BillingType")
    public String billingType;

    /**
     * <p>Area A to be connected. Set the value to <strong>China-mainland</strong>.</p>
     * <p>You can set this parameter only if you call this operation on the international site (alibabacloud.com).</p>
     * 
     * <strong>example:</strong>
     * <p>China-mainland</p>
     */
    @NameInMap("CbnGeographicRegionIdA")
    public String cbnGeographicRegionIdA;

    /**
     * <p>Area B to be connected. Set the value to <strong>Global</strong>.</p>
     * <p>You can set this parameter only if you call this operation on the international site (alibabacloud.com).</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("CbnGeographicRegionIdB")
    public String cbnGeographicRegionIdB;

    /**
     * <p>The billing method of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>PREPAY</strong> (default): subscription.</li>
     * <li><strong>POSTPAY</strong>: pay-as-you-go. By default, the pay-as-you-go billing method is unavailable. If you want to use the billing method, contact your account manager.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <li>If the <strong>PricingCycle</strong> parameter is set to <strong>Month</strong>, the valid values for the <strong>Duration</strong> parameter are <strong>1</strong> to <strong>9</strong>.</li>
     * <li>If the <strong>PricingCycle</strong> parameter is set to <strong>Year</strong>, the valid values for the <strong>Duration</strong> parameter are <strong>1</strong> to <strong>3</strong>.</li>
     * </ul>
     * <p>If <strong>ChargeType</strong> is set to <strong>PREPAY</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: billed on a monthly basis.</li>
     * <li><strong>Year</strong>: billed on an annual basis.</li>
     * </ul>
     * <p>If <strong>ChargeType</strong> is set to <strong>PREPAY</strong>, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * <blockquote>
     * <p> This parameter is only available on the international site (alibabacloud.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50003298014****</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile-bandwidth metering method is used. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only if <strong>BillingType</strong> is set to <strong>PayBY95</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The ID of the region where the GA instance is deployed. <strong>cn-hangzhou</strong> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzrnd67gq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags to add to the bandwidth plan.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateBandwidthPackageRequestTag> tag;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: a basic bandwidth plan</li>
     * <li><strong>CrossDomain</strong>: a cross-region acceleration bandwidth plan</li>
     * </ul>
     * <p>If you call this operation on the Alibaba Cloud China site, only <strong>Basic</strong> is supported.</p>
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
         * <p>The tag key.</p>
         * <p>The tag keys cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>Each tag key corresponds to a tag value. Valid values of <strong>N</strong>: <strong>1</strong> to <strong>20</strong>.</p>
         * <p>The value cannot exceed 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
