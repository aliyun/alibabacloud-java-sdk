// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateImageToPDFTaskResponseBody extends TeaModel {
    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED-1Bz8z71k5TtsUejT4UJ16Es*****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC564A9A-BA5C-4499-A087-D9B9E76E*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageToPDF-cbe6ae3e-f8dc-4566-9da7-535d5d*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateImageToPDFTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageToPDFTaskResponseBody self = new CreateImageToPDFTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageToPDFTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateImageToPDFTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageToPDFTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
