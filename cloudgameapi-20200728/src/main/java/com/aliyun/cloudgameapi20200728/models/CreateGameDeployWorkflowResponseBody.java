// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateGameDeployWorkflowResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 任务id
    @NameInMap("TaskId")
    public String taskId;

    public static CreateGameDeployWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGameDeployWorkflowResponseBody self = new CreateGameDeployWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGameDeployWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGameDeployWorkflowResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
