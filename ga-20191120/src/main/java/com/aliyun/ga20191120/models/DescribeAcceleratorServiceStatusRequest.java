// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorServiceStatusRequest extends TeaModel {
    /**
     * <p>The region ID of the GA instance. Set the value to cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAcceleratorServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorServiceStatusRequest self = new DescribeAcceleratorServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
