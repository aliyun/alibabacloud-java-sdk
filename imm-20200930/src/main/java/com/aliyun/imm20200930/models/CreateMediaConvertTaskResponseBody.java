// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0ED-1Bz8z71k5TtsUejT4UJ16Es****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFFE0B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>MediaConvert-adb1ee28-c4c9-42a7-9f54-3b8eadcb****</p>
     */
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
