// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 任务id
    @NameInMap("TaskId")
    public String taskId;

    public static CreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponseBody self = new CreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
