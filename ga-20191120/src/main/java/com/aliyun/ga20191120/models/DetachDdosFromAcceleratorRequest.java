// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachDdosFromAcceleratorRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("RegionId")
    public String regionId;

    public static DetachDdosFromAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDdosFromAcceleratorRequest self = new DetachDdosFromAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public DetachDdosFromAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DetachDdosFromAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
