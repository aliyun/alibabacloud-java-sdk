// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    public java.util.List<String> accelerators;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

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

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Ratio")
    public Integer ratio;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("Type")
    public String type;

    public static DescribeBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageResponseBody self = new DescribeBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageResponseBody setAccelerators(java.util.List<String> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<String> getAccelerators() {
        return this.accelerators;
    }

    public DescribeBandwidthPackageResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeBandwidthPackageResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DescribeBandwidthPackageResponseBody setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public DescribeBandwidthPackageResponseBody setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public DescribeBandwidthPackageResponseBody setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
        this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
        return this;
    }
    public String getCbnGeographicRegionIdA() {
        return this.cbnGeographicRegionIdA;
    }

    public DescribeBandwidthPackageResponseBody setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
        this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
        return this;
    }
    public String getCbnGeographicRegionIdB() {
        return this.cbnGeographicRegionIdB;
    }

    public DescribeBandwidthPackageResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeBandwidthPackageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeBandwidthPackageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeBandwidthPackageResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeBandwidthPackageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeBandwidthPackageResponseBody setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public DescribeBandwidthPackageResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwidthPackageResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeBandwidthPackageResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
