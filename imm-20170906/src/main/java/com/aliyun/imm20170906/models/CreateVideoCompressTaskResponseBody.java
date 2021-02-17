// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoCompressTaskResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateVideoCompressTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoCompressTaskResponseBody self = new CreateVideoCompressTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoCompressTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateVideoCompressTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoCompressTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
