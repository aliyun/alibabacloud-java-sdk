// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceHealthStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeInstanceHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHealthStatusRequest self = new DescribeInstanceHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHealthStatusRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceHealthStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
