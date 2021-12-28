// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBandwidthResourcePackagesRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("PackageSize")
    public Integer packageSize;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateBandwidthResourcePackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBandwidthResourcePackagesRequest self = new CreateBandwidthResourcePackagesRequest();
        return TeaModel.build(map, self);
    }

    public CreateBandwidthResourcePackagesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateBandwidthResourcePackagesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateBandwidthResourcePackagesRequest setPackageSize(Integer packageSize) {
        this.packageSize = packageSize;
        return this;
    }
    public Integer getPackageSize() {
        return this.packageSize;
    }

    public CreateBandwidthResourcePackagesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateBandwidthResourcePackagesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateBandwidthResourcePackagesRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateBandwidthResourcePackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
