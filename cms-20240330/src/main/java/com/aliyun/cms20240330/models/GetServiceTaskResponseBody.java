// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task details object. Common fields include taskId, serviceId, workspace, regionId, ip, taskType, extraInfo (taskConfig JSON for LiveDebug), createTime, and updateTime.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;serviceId&quot;:&quot;ggxw4lnjuz@f2fd3a6265a254a052afb&quot;,&quot;taskType&quot;:&quot;live_debug_log_probe&quot;,&quot;ip&quot;:&quot;10.0.0.1&quot;,&quot;extraInfo&quot;:&quot;{\&quot;probeType\&quot;:\&quot;LOG\&quot;,\&quot;language\&quot;:\&quot;java\&quot;}&quot;}</p>
     */
    @NameInMap("serviceTask")
    public java.util.Map<String, ?> serviceTask;

    public static GetServiceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTaskResponseBody self = new GetServiceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceTaskResponseBody setServiceTask(java.util.Map<String, ?> serviceTask) {
        this.serviceTask = serviceTask;
        return this;
    }
    public java.util.Map<String, ?> getServiceTask() {
        return this.serviceTask;
    }

}
