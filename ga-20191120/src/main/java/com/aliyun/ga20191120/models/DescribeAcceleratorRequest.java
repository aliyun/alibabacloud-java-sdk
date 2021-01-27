// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    public static DescribeAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorRequest self = new DescribeAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

}
