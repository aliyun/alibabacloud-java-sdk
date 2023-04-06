// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **false:** disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated. This is the default value.</p>
     * <p>*   **true:** enables automatic payment. Payments are automatically completed.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <br>
     * <p>*   **true:** enables auto-renewal.</p>
     * <p>*   **false:** disables auto-renewal. This is the default value.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months.</p>
     * <br>
     * <p>Valid values: **1** to **12**. Default value: **1**.</p>
     * <br>
     * <p>>  This parameter takes effect only if **AutoRenew** is set to **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to automatically pay bills by using coupons. Valid values:</p>
     * <br>
     * <p>*   **true:** automatically pays bills by using coupons.</p>
     * <p>*   **false:** does not automatically pay bills by using coupons. This is the default value.</p>
     * <br>
     * <p>>  This parameter takes effect only if **AutoPay** is set to **true**.</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth billing method.</p>
     * <br>
     * <p>*   **BandwidthPackage:** billed based on bandwidth plans.</p>
     * <p>*   **CDT:** billed based on data transfer.</p>
     * <p>*   **CDT95:** billed based on the 95th percentile bandwidth. The billing is managed by Cloud Data Transfer (CDT). This bandwidth billing method is available only for users that are included in the whitelist.</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the value of **RequestId**as the value of **ClientToken**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subscription duration of the GA instance.</p>
     * <br>
     * <p>*   If the **PricingCycle** parameter is set to **Month**, the valid values for the **Duration** parameter are **1** to **9**.</p>
     * <p>*   If the **PricingCycle** parameter is set to **Year**, the valid values for the **Duration** parameter are **1** to **3**.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The configurations of the acceleration area.</p>
     */
    @NameInMap("IpSetConfig")
    public CreateAcceleratorRequestIpSetConfig ipSetConfig;

    /**
     * <p>The name of the GA instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing cycle of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **Month**: billed on a monthly basis.</p>
     * <p>*   **Year**: billed on an annual basis.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * <br>
     * <p>>  This parameter is available only on the Alibaba International Site (alibabacloud.com).</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the region where you want to create the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the standard GA instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
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
     * <p>>  The Large Ⅲ specification and higher specifications are available only for accounts that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
     * <br>
     * <p>Different specifications provide different capabilities. For more information, see [Instance specifications](~~153127~~).</p>
     */
    @NameInMap("Spec")
    public String spec;

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

    public CreateAcceleratorRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
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
         * <p>*   **UserDefine:** custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.</p>
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
        @NameInMap("Key")
        public String key;

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
