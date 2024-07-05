// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateStoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>392-1CqzvESGTEeNZ2OWFbRKIM****</p>
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
     * <p>CreateStory-4ef6ff43-edf3-4612-9cc4-0c7f9e19****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryResponseBody self = new CreateStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStoryResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateStoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStoryResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
