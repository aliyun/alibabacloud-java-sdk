// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageAddAcceleratorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    public static BandwidthPackageAddAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        BandwidthPackageAddAcceleratorRequest self = new BandwidthPackageAddAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public BandwidthPackageAddAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BandwidthPackageAddAcceleratorRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public BandwidthPackageAddAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

}
