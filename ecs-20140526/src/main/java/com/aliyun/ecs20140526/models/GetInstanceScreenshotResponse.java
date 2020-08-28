// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Screenshot")
    @Validation(required = true)
    public String screenshot;

    public static GetInstanceScreenshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceScreenshotResponse self = new GetInstanceScreenshotResponse();
        return TeaModel.build(map, self);
    }

}
