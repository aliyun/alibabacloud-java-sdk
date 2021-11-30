// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAcceleratorAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorAutoRenewAttributeRequest self = new DescribeAcceleratorAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorAutoRenewAttributeRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeAcceleratorAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
