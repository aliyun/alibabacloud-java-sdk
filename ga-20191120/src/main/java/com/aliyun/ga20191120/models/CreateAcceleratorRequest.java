// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **false:** disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true:** enables automatic payment. Payments are automatically completed.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the GA instance. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true:** enables auto-renewal.</p>
     * <p>*   **false:** disables auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months.</p>
     * <br>
     * <p>Valid values: **1** to **12**. Default value: **1**.</p>
     * <br>
     * <p>>  This parameter takes effect only when **AutoRenew** is set to **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to automatically use coupons when making payments. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true:** automatically pays bill by using coupons.</p>
     * <p>*   **false:** does not automatically pay bills by using coupons.</p>
     * <br>
     * <p>>  This parameter takes effect only when **AutoPay** is set to **true**.</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth billing method.</p>
     * <br>
     * <p>*   **BandwidthPackage:** billed based on bandwidth plans.</p>
     * <p>*   **CDT:** billed based on data transfer.</p>
     * <p>*   **CDT95:** billed based on the 95th percentile bandwidth. The billing is managed by Cloud Data Transfer (CDT). This bandwidth billing method is not available by default. Contact your Alibaba Cloud account manager for more information.</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The subscription duration of the GA instance.</p>
     * <br>
     * <p>*   If the **PricingCycle** parameter is set to **Month**, the valid values for the **Duration** parameter are **1** to **9**.</p>
     * <p>*   If the **PricingCycle** parameter is set to **Year**, the valid values for the **Duration** parameter are **1** to **3**.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The billing method of the GA. Default value is PREPAY (subscription).</p>
     * <br>
     * <p>*   PREPAY : subscription.</p>
     * <p>*   POSTPAY : pay-as-you-go</p>
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
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing cycle of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **Month:** billed on a monthly basis.</p>
     * <p>*   **Year:** billed on an annual basis.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * <br>
     * <p>></p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the region in which to create the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the standard GA instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of GA instance. Valid values:</p>
     * <br>
     * <p>*   **1:** Small Ⅰ</p>
     * <p>*   **2:** Small Ⅱ</p>
     * <p>*   **3:** Small Ⅲ</p>
     * <p>*   **5:** Medium Ⅰ</p>
     * <p>*   **8:** Medium Ⅱ</p>
     * <p>*   **10:** Medium Ⅲ</p>
     * <p>*   **20:** Large Ⅰ</p>
     * <p>*   **30:** Large Ⅱ</p>
     * <p>*   **40:** Large Ⅲ</p>
     * <p>*   **50:** Large Ⅳ</p>
     * <p>*   **60:** Large Ⅴ</p>
     * <p>*   **70:** Large Ⅵ</p>
     * <p>*   **80:** Large VⅡ</p>
     * <p>*   **90:** Large VⅢ</p>
     * <p>*   **100:** Super Large Ⅰ</p>
     * <p>*   **200:** Super Large Ⅱ</p>
     * <br>
     * <p>>  GA instances Large III and above are not available by default. To use these instances , contact your Alibaba Cloud account manager.</p>
     * <br>
     * <p>Each instance type provides different capabilities. For more information, see [Instance specifications](~~153127~~).</p>
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
         * <br>
         * <p>*   **UserDefine:** custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate EIP to each acceleration region.</p>
         * <p>*   **Anycast:** automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</p>
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
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the GA instance. The tag value cannot be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag values.</p>
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
