// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **false** (default): disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true**: enables automatic payment. Payments are automatically completed.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false** (default): does not enable auto-renewal.</p>
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
     * <p>Specifies whether to automatically pay bills by using coupons. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     * <br>
     * <p>>  This parameter is required only if **AutoPay** is set to **true**.</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The bandwidth of the bandwidth plan. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **2** to **2000**.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The type of the bandwidth. Valid values:</p>
     * <br>
     * <p>*   **Basic**: standard bandwidth</p>
     * <p>*   **Enhanced**: enhanced bandwidth</p>
     * <p>*   **Advanced**: premium bandwidth</p>
     * <br>
     * <p>If **Type** is set to **Basic**, this parameter is required.</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The metering method that is used when you use the pay-as-you-go billing method. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic** (default): pay-by-data-transfer</p>
     * <p>*   **PayBY95**: pay-by-95th-percentile By default, the pay-by-95th-percentile metering method is unavailable. If you want to use the metering method, contact your account manager.</p>
     */
    @NameInMap("BillingType")
    public String billingType;

    /**
     * <p>Area A to be connected. Set the value to **China-mainland**.</p>
     * <br>
     * <p>You can set this parameter only if you call this operation on the international site (alibabacloud.com).</p>
     */
    @NameInMap("CbnGeographicRegionIdA")
    public String cbnGeographicRegionIdA;

    /**
     * <p>Area B to be connected. Set the value to **Global**.</p>
     * <br>
     * <p>You can set this parameter only if you call this operation on the international site (alibabacloud.com).</p>
     */
    @NameInMap("CbnGeographicRegionIdB")
    public String cbnGeographicRegionIdB;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **PREPAY** (default): subscription</p>
     * <p>*   **POSTPAY**: pay-as-you-go By default, the pay-as-you-go billing method is unavailable. If you want to use the billing method, contact your account manager.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. The ClientToken value contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subscription duration.</p>
     * <br>
     * <p>*   If the **PricingCycle** parameter is set to **Month**, the valid values for the **Duration** parameter are **1** to **9**.</p>
     * <p>*   If the **PricingCycle** parameter is set to **Year**, the valid values for the **Duration** parameter are **1** to **3**.</p>
     * <br>
     * <p>If **ChargeType** is set to **PREPAY**, this parameter is required.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <br>
     * <p>*   **Month**: billed on a monthly basis.</p>
     * <p>*   **Year**: billed on an annual basis.</p>
     * <br>
     * <p>If **ChargeType** is set to **PREPAY**, this parameter is required.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The coupon code.</p>
     * <br>
     * <p>>  This parameter is only available on the international site (alibabacloud.com).</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile-bandwidth metering method is used. Valid values: **30** to **100**.</p>
     * <br>
     * <p>>  This parameter is required only if **BillingType** is set to **PayBY95**.</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The ID of the region where the GA instance is deployed. **cn-hangzhou** is returned.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<CreateBandwidthPackageRequestTag> tag;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **Basic**: a basic bandwidth plan</p>
     * <p>*   **CrossDomain**: a cross-region acceleration bandwidth plan</p>
     * <br>
     * <p>If you call this operation on the Alibaba Cloud China site, only **Basic** is supported.</p>
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
        @NameInMap("Key")
        public String key;

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
