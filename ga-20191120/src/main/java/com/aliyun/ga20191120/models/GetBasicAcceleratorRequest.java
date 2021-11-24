// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAcceleratorRequest extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAcceleratorRequest self = new GetBasicAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
