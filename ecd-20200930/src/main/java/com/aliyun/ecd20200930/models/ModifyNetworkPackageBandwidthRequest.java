// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true (default): enables the auto-payment feature.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    Make sure that your account has sufficient balance. Otherwise, no order is generated.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false: disables the auto-payment feature. In this case, an order is generated but you need to make the payment manually.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    To make the payment, log on to the WUYING Workspace console, go to the Orders page, and find the order based on the order ID.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
     * <br>
     * <p>*   Valid values if the premium bandwidth plan is a subscription plan: 2 to 1000.</p>
     * <p>*   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by data transfer (PayByTraffic): 2 to 200.</p>
     * <p>*   Valid values if the premium bandwidth plan is a pay-as-you-go plan that charges by fixed bandwidth (PayByBandwidth): 2 to 1000.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the premium bandwidth plan.</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The promotion ID.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyNetworkPackageBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageBandwidthRequest self = new ModifyNetworkPackageBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageBandwidthRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyNetworkPackageBandwidthRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ModifyNetworkPackageBandwidthRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public ModifyNetworkPackageBandwidthRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ModifyNetworkPackageBandwidthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
