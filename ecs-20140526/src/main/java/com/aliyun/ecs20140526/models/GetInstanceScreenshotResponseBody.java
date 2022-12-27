// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotResponseBody extends TeaModel {
    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The JPG-formatted instance screenshot, which is encoded in Base64.
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
