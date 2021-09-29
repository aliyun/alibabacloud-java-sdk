// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitDeploymentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static SubmitDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeploymentResponseBody self = new SubmitDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitDeploymentResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
