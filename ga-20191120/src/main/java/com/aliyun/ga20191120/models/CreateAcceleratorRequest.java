// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **false**: disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true**: enables automatic payment. Payments are automatically completed.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the GA instance. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false** disables auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months.</p>
     * <br>
     * <p>Valid values: **1** to **12**. Default value: **1**.</p>
     * <br>
     * <p>>  This parameter is required only if **AutoRenew** is set to **true**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>Specifies whether to automatically pay bills by using coupons. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: automatically pays bill by using coupons.</p>
     * <p>*   **false**: does not automatically pay bills by using coupons.</p>
     * <br>
     * <p>>  This parameter is required only if **AutoPay** is set to **true**.</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
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
     * <p>The name must be 2 to 128 characters in length and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
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

    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The ID of the region in which to create the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **1**: Small Ⅰ</p>
     * <p>*   **2**: Small Ⅱ</p>
     * <p>*   **3**: Small Ⅲ</p>
     * <p>*   **5**: Medium Ⅰ</p>
     * <p>*   **8**: Medium Ⅱ</p>
     * <p>*   **10**: Medium Ⅲ</p>
     * <p>*   **20**: Large Ⅰ</p>
     * <p>*   **30**: Large Ⅱ</p>
     * <p>*   **40**: Large Ⅲ</p>
     * <p>*   **50**: Large Ⅳ</p>
     * <p>*   **60**: Large Ⅴ</p>
     * <p>*   **70**: Large Ⅵ</p>
     * <p>*   **80**: Large VⅡ</p>
     * <p>*   **90**: Large VⅢ</p>
     * <p>*   **100**: Super Large Ⅰ</p>
     * <p>*   **200**: Super Large Ⅱ</p>
     * <p>*   **300**: Super Large Ⅲ</p>
     * <br>
     * <p>>  The Large Ⅲ and higher specifications are available only for accounts that are added to the whitelist. To apply to be added to the whitelist, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).</p>
     * <br>
     * <p>Each instance specification provides different capabilities. For more information, see [Instance specifications](~~153127~~).</p>
     */
    @NameInMap("Spec")
    public String spec;

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

    public static class CreateAcceleratorRequestIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <br>
         * <p>*   **UserDefine**: custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.</p>
         * <p>*   **Anycast**: automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</p>
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

}
