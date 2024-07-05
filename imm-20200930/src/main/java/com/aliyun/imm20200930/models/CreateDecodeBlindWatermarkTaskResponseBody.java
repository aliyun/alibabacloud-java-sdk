// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDecodeBlindWatermarkTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>27C-1jyAP5qQI7RoI8lFFwvMrWtl0ft</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>4A7A2D0E-D8B8-4DA0-8127-EB32C6600ADE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>DecodeBlindWatermark-78ac8f3b-59e0-45a6-9b67-32168c3f22b9</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateDecodeBlindWatermarkTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDecodeBlindWatermarkTaskResponseBody self = new CreateDecodeBlindWatermarkTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDecodeBlindWatermarkTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateDecodeBlindWatermarkTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDecodeBlindWatermarkTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
