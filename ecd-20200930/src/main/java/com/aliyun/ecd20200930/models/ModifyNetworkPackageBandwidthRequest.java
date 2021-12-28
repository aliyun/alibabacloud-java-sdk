// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    @NameInMap("PromotionId")
    public String promotionId;

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
