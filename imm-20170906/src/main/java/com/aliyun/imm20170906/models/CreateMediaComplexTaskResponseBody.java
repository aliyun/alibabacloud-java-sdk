// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateMediaComplexTaskResponseBody extends TeaModel {
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateMediaComplexTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaComplexTaskResponseBody self = new CreateMediaComplexTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaComplexTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateMediaComplexTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaComplexTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
