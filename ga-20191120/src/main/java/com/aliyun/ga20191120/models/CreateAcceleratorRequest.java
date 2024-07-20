// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>false:</strong> disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</li>
     * <li><strong>true:</strong> enables automatic payment. Payments are automatically completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the GA instance. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> enables auto-renewal.</li>
     * <li><strong>false:</strong> disables auto-renewal.</li>
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
     * <p> This parameter takes effect only when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to automatically use coupons when making payments. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> automatically pays bill by using coupons.</li>
     * <li><strong>false:</strong> does not automatically pay bills by using coupons.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth billing method.</p>
     * <ul>
     * <li><strong>BandwidthPackage:</strong> billed based on bandwidth plans.</li>
     * <li><strong>CDT:</strong> billed based on data transfer.</li>
     * <li><strong>CDT95:</strong> billed based on the 95th percentile bandwidth. The billing is managed by Cloud Data Transfer (CDT). This bandwidth billing method is not available by default. Contact your Alibaba Cloud account manager for more information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BandwidthPackage</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the system sets <strong>ClientToken</strong> to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the request. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration of the GA instance.</p>
     * <ul>
     * <li>If the <strong>PricingCycle</strong> parameter is set to <strong>Month</strong>, the valid values for the <strong>Duration</strong> parameter are <strong>1</strong> to <strong>9</strong>.</li>
     * <li>If the <strong>PricingCycle</strong> parameter is set to <strong>Year</strong>, the valid values for the <strong>Duration</strong> parameter are <strong>1</strong> to <strong>3</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The billing method of the GA. Default value is PREPAY (subscription).</p>
     * <ul>
     * <li>PREPAY : subscription.</li>
     * <li>POSTPAY : pay-as-you-go</li>
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
     * <p>The name must be 2 to 128 characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing cycle of the GA instance. Valid values:</p>
     * <ul>
     * <li><strong>Month:</strong> billed on a monthly basis.</li>
     * <li><strong>Year:</strong> billed on an annual basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * <blockquote>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50003298014****</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the region in which to create the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
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
     * <p>The type of GA instance. Valid values:</p>
     * <ul>
     * <li><strong>1:</strong> Small Ⅰ</li>
     * <li><strong>2:</strong> Small Ⅱ</li>
     * <li><strong>3:</strong> Small Ⅲ</li>
     * <li><strong>5:</strong> Medium Ⅰ</li>
     * <li><strong>8:</strong> Medium Ⅱ</li>
     * <li><strong>10:</strong> Medium Ⅲ</li>
     * <li><strong>20:</strong> Large Ⅰ</li>
     * <li><strong>30:</strong> Large Ⅱ</li>
     * <li><strong>40:</strong> Large Ⅲ</li>
     * <li><strong>50:</strong> Large Ⅳ</li>
     * <li><strong>60:</strong> Large Ⅴ</li>
     * <li><strong>70:</strong> Large Ⅵ</li>
     * <li><strong>80:</strong> Large VⅡ</li>
     * <li><strong>90:</strong> Large VⅢ</li>
     * <li><strong>100:</strong> Super Large Ⅰ</li>
     * <li><strong>200:</strong> Super Large Ⅱ</li>
     * </ul>
     * <blockquote>
     * <p> GA instances Large III and above are not available by default. To use these instances , contact your Alibaba Cloud account manager.</p>
     * </blockquote>
     * <p>Each instance type provides different capabilities. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance specifications</a>.</p>
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
         * <li><strong>UserDefine:</strong> custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate EIP to each acceleration region.</li>
         * <li><strong>Anycast:</strong> automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</li>
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
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the GA instance. The tag value cannot be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
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
