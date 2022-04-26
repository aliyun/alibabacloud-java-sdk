// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateMediaConvertTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConvertTaskResponseBody self = new CreateMediaConvertTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaConvertTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateMediaConvertTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaConvertTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
