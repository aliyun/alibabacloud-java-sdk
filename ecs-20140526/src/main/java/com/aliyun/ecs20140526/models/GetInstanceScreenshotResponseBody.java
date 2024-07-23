// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1gbz20g229bvu5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Base64-encoded instance screenshot in the JPG format.</p>
     * 
     * <strong>example:</strong>
     * <p>iVBORw0KGgoA...AAABJRU5ErkJggg==</p>
     */
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
