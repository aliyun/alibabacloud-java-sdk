// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2C2-1I0EG57VR37J4rQ8oKG6C9*****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>FF3B7D81-66AE-47E0-BF69-157DCF18*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>formatconvert-00bec802-073a-4b61-ba3b-39bc2fdd*****</p>
     */
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
