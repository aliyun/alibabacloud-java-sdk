// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDecodeBlindWatermarkTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("RequestId")
    public String requestId;

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
