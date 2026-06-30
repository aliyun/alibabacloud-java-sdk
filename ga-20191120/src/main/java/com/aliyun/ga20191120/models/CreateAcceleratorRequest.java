// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Disables automatic payment. After an order is generated, go to the Order Hub to complete the payment.</p>
     * </li>
     * <li><p><strong>true</strong>: Enables automatic payment. The system automatically completes the payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
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
     * <p>The auto-renewal duration. Unit: month.</p>
     * <p>Valid values: <strong>1</strong> to <strong>12</strong>. Default value: <strong>1</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to automatically apply coupons to your bills. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): No.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only when <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth of the standard GA instance. Unit: <strong>Mbps</strong>.</p>
     * <p>Valid values: 200 to 5000.</p>
     * <blockquote>
     * <p>This parameter is required and valid only when the access mode of the acceleration area is Anycast.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The bandwidth billing method.</p>
     * <ul>
     * <li><p><strong>BandwidthPackage</strong>: Billed by bandwidth plan.</p>
     * </li>
     * <li><p><strong>CDT</strong>: Billed by data transfer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BandwidthPackage</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>A client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to make sure that the value is unique among different requests. The ClientToken parameter can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. If the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</p>
     * </li>
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
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, the valid values for <strong>Duration</strong> are <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, the valid values for <strong>Duration</strong> are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> (the billing method of the GA instance) is set to <strong>PREPAY</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The billing method of the GA instance.</p>
     * <ul>
     * <li><p>PREPAY (default): subscription.</p>
     * </li>
     * <li><p>POSTPAY: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The configurations of the acceleration area.</p>
     */
    @NameInMap("IpSetConfig")
    public CreateAcceleratorRequestIpSetConfig ipSetConfig;

    /**
     * <p>The name of the GA instance.</p>
     * <p>The name must be 1 to 128 characters in length, start with a letter, and can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong>: Billed by month.</p>
     * </li>
     * <li><p><strong>Year</strong>: Billed by year.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if <strong>InstanceChargeType</strong> (the billing method of the GA instance) is set to <strong>PREPAY</strong> (subscription).</p>
     * </blockquote>
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
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The ID of the resource group to which the standard GA instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzrnd67gq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance type of the GA instance. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Small I</p>
     * </li>
     * <li><p><strong>2</strong>: Small II</p>
     * </li>
     * <li><p><strong>3</strong>: Small III</p>
     * </li>
     * <li><p><strong>5</strong>: Medium I</p>
     * </li>
     * <li><p><strong>8</strong>: Medium II</p>
     * </li>
     * <li><p><strong>10</strong>: Medium III</p>
     * </li>
     * <li><p><strong>20</strong>: Large I</p>
     * </li>
     * <li><p><strong>30</strong>: Large II</p>
     * </li>
     * <li><p><strong>40</strong>: Large III</p>
     * </li>
     * <li><p><strong>50</strong>: Large IV</p>
     * </li>
     * <li><p><strong>60</strong>: Large V</p>
     * </li>
     * <li><p><strong>70</strong>: Large VI</p>
     * </li>
     * <li><p><strong>80</strong>: Large VII</p>
     * </li>
     * <li><p><strong>90</strong>: Large VIII</p>
     * </li>
     * <li><p><strong>100</strong>: Super Large I</p>
     * </li>
     * <li><p><strong>200</strong>: Super Large II</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Currently, the Large III and higher instance types are available only to users on the whitelist. To use these instance types, contact your account manager.</p>
     * </li>
     * <li><p>This parameter is required if <strong>InstanceChargeType</strong> (the billing method of the GA instance) is set to <strong>PREPAY</strong> (subscription).</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>The definitions of different instance types are different. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tags of the GA instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAcceleratorRequestTag> tag;

    public static CreateAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAcceleratorRequest self = new CreateAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAcceleratorRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAcceleratorRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAcceleratorRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateAcceleratorRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateAcceleratorRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateAcceleratorRequest setBandwidthBillingType(String bandwidthBillingType) {
        this.bandwidthBillingType = bandwidthBillingType;
        return this;
    }
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
    }

    public CreateAcceleratorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAcceleratorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAcceleratorRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateAcceleratorRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateAcceleratorRequest setIpSetConfig(CreateAcceleratorRequestIpSetConfig ipSetConfig) {
        this.ipSetConfig = ipSetConfig;
        return this;
    }
    public CreateAcceleratorRequestIpSetConfig getIpSetConfig() {
        return this.ipSetConfig;
    }

    public CreateAcceleratorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAcceleratorRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateAcceleratorRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    @Deprecated
    public CreateAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAcceleratorRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAcceleratorRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateAcceleratorRequest setTag(java.util.List<CreateAcceleratorRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAcceleratorRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateAcceleratorRequestIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefine</strong>: Custom nearby access mode. Select acceleration areas and regions as needed. Global Accelerator provides a separate elastic IP address (EIP) for each acceleration region.</p>
         * </li>
         * <li><p><strong>Anycast</strong>: Automatic nearby access mode. You do not need to configure an acceleration area. Global Accelerator provides an Anycast EIP for multiple regions. Users connect to the nearest access point of the Alibaba Cloud network using the Anycast EIP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefine</p>
         */
        @NameInMap("AccessMode")
        public String accessMode;

        public static CreateAcceleratorRequestIpSetConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAcceleratorRequestIpSetConfig self = new CreateAcceleratorRequestIpSetConfig();
            return TeaModel.build(map, self);
        }

        public CreateAcceleratorRequestIpSetConfig setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

    }

    public static class CreateAcceleratorRequestTag extends TeaModel {
        /**
         * <p>The tag key of the GA instance. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the GA instance. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAcceleratorRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAcceleratorRequestTag self = new CreateAcceleratorRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAcceleratorRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAcceleratorRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
