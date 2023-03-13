// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDetectVideoLabelsTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateDetectVideoLabelsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectVideoLabelsTaskResponseBody self = new CreateDetectVideoLabelsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDetectVideoLabelsTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateDetectVideoLabelsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDetectVideoLabelsTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
