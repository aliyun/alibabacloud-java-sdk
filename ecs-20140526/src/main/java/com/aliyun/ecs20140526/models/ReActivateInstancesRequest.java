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

}
