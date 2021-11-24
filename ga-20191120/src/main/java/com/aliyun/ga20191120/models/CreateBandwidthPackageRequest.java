// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBandwidthPackageRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("BillingType")
    public String billingType;

    @NameInMap("CbnGeographicRegionIdA")
    public String cbnGeographicRegionIdA;

    @NameInMap("CbnGeographicRegionIdB")
    public String cbnGeographicRegionIdB;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Ratio")
    public Integer ratio;

    @NameInMap("RegionId")
    public String regionId;

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

    public CreateBandwidthPackageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
