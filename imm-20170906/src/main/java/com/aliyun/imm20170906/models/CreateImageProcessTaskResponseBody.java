// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateImageProcessTaskResponseBody extends TeaModel {
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateImageProcessTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageProcessTaskResponseBody self = new CreateImageProcessTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageProcessTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateImageProcessTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageProcessTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
