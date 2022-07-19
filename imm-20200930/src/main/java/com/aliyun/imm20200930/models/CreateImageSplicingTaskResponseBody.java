// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageSplicingTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateImageSplicingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageSplicingTaskResponseBody self = new CreateImageSplicingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageSplicingTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateImageSplicingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageSplicingTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
