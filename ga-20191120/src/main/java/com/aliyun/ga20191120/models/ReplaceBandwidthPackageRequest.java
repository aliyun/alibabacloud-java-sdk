// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TargetBandwidthPackageId")
    public String targetBandwidthPackageId;

    public static ReplaceBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBandwidthPackageRequest self = new ReplaceBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceBandwidthPackageRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ReplaceBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ReplaceBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceBandwidthPackageRequest setTargetBandwidthPackageId(String targetBandwidthPackageId) {
        this.targetBandwidthPackageId = targetBandwidthPackageId;
        return this;
    }
    public String getTargetBandwidthPackageId() {
        return this.targetBandwidthPackageId;
    }

}
