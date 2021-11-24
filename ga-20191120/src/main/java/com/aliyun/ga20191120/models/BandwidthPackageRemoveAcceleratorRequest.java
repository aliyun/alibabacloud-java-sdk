// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class BandwidthPackageRemoveAcceleratorRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("RegionId")
    public String regionId;

    public static BandwidthPackageRemoveAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        BandwidthPackageRemoveAcceleratorRequest self = new BandwidthPackageRemoveAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public BandwidthPackageRemoveAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public BandwidthPackageRemoveAcceleratorRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public BandwidthPackageRemoveAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
