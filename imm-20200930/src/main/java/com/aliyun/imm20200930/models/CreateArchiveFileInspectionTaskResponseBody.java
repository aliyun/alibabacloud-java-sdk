// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateArchiveFileInspectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0ED-1Bz8z71k5TtsUejT4UJ16Es*****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>EC564A9A-BA5C-4499-A087-D9B9E76E*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ArchiveFileInspection-8475218e-d86e-4c66-b3cf-50e74d6c****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateArchiveFileInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateArchiveFileInspectionTaskResponseBody self = new CreateArchiveFileInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateArchiveFileInspectionTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateArchiveFileInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateArchiveFileInspectionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
