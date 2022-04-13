// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Screenshot")
    public String screenshot;

    public static GetInstanceScreenshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceScreenshotResponseBody self = new GetInstanceScreenshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceScreenshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceScreenshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceScreenshotResponseBody setScreenshot(String screenshot) {
        this.screenshot = screenshot;
        return this;
    }
    public String getScreenshot() {
        return this.screenshot;
    }

}
