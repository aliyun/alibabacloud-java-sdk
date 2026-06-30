// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAcceleratorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): disables automatic payment. After an order is generated, go to the Order Center to complete the payment.</p>
     * </li>
     * <li><p><strong>true</strong>: enables automatic payment. The order is automatically paid.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * <ul>
     * <li><p><strong>true</strong>: enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong> (default): disables auto-renewal.</p>
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
     * <p>This parameter takes effect only when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to use coupons for automatic payment of the bill. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: uses coupons.</p>
     * </li>
     * <li><p><strong>false</strong> (default): does not use coupons.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth billing method. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthPackage</strong>: billed by bandwidth plan.</li>
     * <li><strong>CDT</strong>: billed by traffic and settled through unified settlement by Cloud Data Transfer (CDT).</li>
     * <li><strong>CDT95</strong>: billed by the 95th percentile bandwidth and settled through unified settlement by CDT. This bandwidth billing method is available only to users in the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CDT</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PREPAY (default)</strong>: subscription.</li>
     * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without creating the resource. The system checks the required parameters, request syntax, and business limitations. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration.</p>
     * <ul>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, valid values of <strong>Duration</strong> are <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, valid values of <strong>Duration</strong> are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong>: billed on a monthly basis.</p>
     * </li>
     * <li><p><strong>Year</strong>: billed on a yearly basis.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon number.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50003298014****</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The region ID of the basic Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the basic Alibaba Cloud Global Accelerator (GA) instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxshhcsn****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The labels of the basic Alibaba Cloud Global Accelerator (GA) instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateBasicAcceleratorRequestTag> tag;

    public static CreateBasicAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAcceleratorRequest self = new CreateBasicAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicAcceleratorRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateBasicAcceleratorRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateBasicAcceleratorRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateBasicAcceleratorRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateBasicAcceleratorRequest setBandwidthBillingType(String bandwidthBillingType) {
        this.bandwidthBillingType = bandwidthBillingType;
        return this;
    }
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
    }

    public CreateBasicAcceleratorRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateBasicAcceleratorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicAcceleratorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateBasicAcceleratorRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateBasicAcceleratorRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateBasicAcceleratorRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public CreateBasicAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBasicAcceleratorRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateBasicAcceleratorRequest setTag(java.util.List<CreateBasicAcceleratorRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateBasicAcceleratorRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateBasicAcceleratorRequestTag extends TeaModel {
        /**
         * <p>The label key of the basic Alibaba Cloud Global Accelerator (GA) instance. If you specify this parameter, the value cannot be an empty string.</p>
         * <p>The label key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 label keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value of the basic Alibaba Cloud Global Accelerator (GA) instance. If you specify this parameter, the value cannot be an empty string.</p>
         * <p>The label value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 label values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateBasicAcceleratorRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicAcceleratorRequestTag self = new CreateBasicAcceleratorRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateBasicAcceleratorRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBasicAcceleratorRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
