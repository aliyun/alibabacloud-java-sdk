// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoModerationTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateVideoModerationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoModerationTaskResponseBody self = new CreateVideoModerationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoModerationTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateVideoModerationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoModerationTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
