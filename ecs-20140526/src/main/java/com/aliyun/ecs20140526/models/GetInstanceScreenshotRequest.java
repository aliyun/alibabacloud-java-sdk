// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("WakeUp")
    public Boolean wakeUp;

    public static GetInstanceScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceScreenshotRequest self = new GetInstanceScreenshotRequest();
        return TeaModel.build(map, self);
    }

}
