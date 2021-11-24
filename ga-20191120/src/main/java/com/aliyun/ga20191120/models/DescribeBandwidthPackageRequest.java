// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageRequest extends TeaModel {
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageRequest self = new DescribeBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DescribeBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
