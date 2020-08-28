// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInvocationRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InvokeId")
    @Validation(required = true)
    public String invokeId;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    public static StopInvocationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInvocationRequest self = new StopInvocationRequest();
        return TeaModel.build(map, self);
    }

}
