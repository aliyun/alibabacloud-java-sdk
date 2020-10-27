// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReActivateInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static ReActivateInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReActivateInstancesRequest self = new ReActivateInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ReActivateInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReActivateInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
