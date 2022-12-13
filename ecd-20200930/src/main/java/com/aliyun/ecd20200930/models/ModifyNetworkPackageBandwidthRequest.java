// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. Make sure that your account has sufficient balance. Otherwise, abnormal orders are generated.
    // *   false: disables automatic payment. In this case, an order is generated and no billing is implemented. You can log on to the EDS console and complete payments based on the order ID on the **Orders** page.
    // 
    // Default value: true
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // The ID of the Internet access package.
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    // The ID of the sales promotion.
    @NameInMap("PromotionId")
    public String promotionId;

    // The ID of the region.
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
