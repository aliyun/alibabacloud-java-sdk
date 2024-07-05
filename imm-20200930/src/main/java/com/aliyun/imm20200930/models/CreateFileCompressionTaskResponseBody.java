// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFileCompressionTaskResponseBody extends TeaModel {
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
     * <p>FileCompression-3579a380-6f7a-4a9d-b9d2-65996*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateFileCompressionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileCompressionTaskResponseBody self = new CreateFileCompressionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileCompressionTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateFileCompressionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileCompressionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
