// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    public static CreateOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskResponseBody self = new CreateOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOfficeConversionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
