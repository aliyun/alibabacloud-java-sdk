// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   `true`: enables automatic payment. Make sure that your Alibaba Cloud account has sufficient balance. If your Alibaba Cloud account does not have sufficient balance, abnormal orders are generated.</p>
     * <p>*   `false`: disables automatic payment. In this case, an order is generated, but no payment is complete. You can log on to the Elastic Desktop Service (EDS) console and complete the payment based on the order ID on the **Orders** page.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The bandwidth of the Internet access package. Unit: Mbit/s. Valid values: 10 to 1000.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the Internet access package.</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The ID of the promotion. You can call the `GetResourcePrice` operation to obtain the ID of the promotion.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
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
