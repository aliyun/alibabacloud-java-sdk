// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("TargetBandwidthPackageId")
    public String targetBandwidthPackageId;

    public static ReplaceBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBandwidthPackageRequest self = new ReplaceBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ReplaceBandwidthPackageRequest setTargetBandwidthPackageId(String targetBandwidthPackageId) {
        this.targetBandwidthPackageId = targetBandwidthPackageId;
        return this;
    }
    public String getTargetBandwidthPackageId() {
        return this.targetBandwidthPackageId;
    }

}
