// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoModerationTaskResponseBody extends TeaModel {
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
     * <p>VideoModeration-9442a216-4691-4a48-846d-76daccaf*****</p>
     */
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
