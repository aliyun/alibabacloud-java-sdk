// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageModerationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2E6-1I0FGn0zFnl5AflRfhzClma*****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ImageModeration-179ef4f8-d583-4f0c-a293-7c0889c*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateImageModerationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageModerationTaskResponseBody self = new CreateImageModerationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageModerationTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateImageModerationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageModerationTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
