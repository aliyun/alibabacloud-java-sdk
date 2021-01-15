// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateRealtimeTaskResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实时任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static CreateRealtimeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtimeTaskResponseBody self = new CreateRealtimeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRealtimeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRealtimeTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
