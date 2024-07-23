// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDeploymentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D69846D9-F17F-51C0-8AC6-B4B71777****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the disk migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bp67acfmxazb4p****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDiskDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskDeploymentResponseBody self = new ModifyDiskDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDiskDeploymentResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
