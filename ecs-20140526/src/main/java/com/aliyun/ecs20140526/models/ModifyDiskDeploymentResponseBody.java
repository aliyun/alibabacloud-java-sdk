// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskDeploymentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
