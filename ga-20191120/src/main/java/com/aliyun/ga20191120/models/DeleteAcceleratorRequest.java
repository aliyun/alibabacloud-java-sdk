// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteAcceleratorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    public static DeleteAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAcceleratorRequest self = new DeleteAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

}
