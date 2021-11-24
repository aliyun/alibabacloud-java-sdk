// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicAcceleratorRequest extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBasicAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicAcceleratorRequest self = new DeleteBasicAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBasicAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteBasicAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
