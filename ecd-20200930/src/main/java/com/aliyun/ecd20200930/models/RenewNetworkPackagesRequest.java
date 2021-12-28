// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RegionId")
    public String regionId;

    public static RenewNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewNetworkPackagesRequest self = new RenewNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public RenewNetworkPackagesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public RenewNetworkPackagesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewNetworkPackagesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewNetworkPackagesRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public RenewNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
