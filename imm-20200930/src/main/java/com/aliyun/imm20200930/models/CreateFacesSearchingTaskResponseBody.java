// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFacesSearchingTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0ED-1Bz8z71k5TtsUejT4UJ16****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>B1E79399-05F7-06D8-95FE-EBE17BA*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>CreateFacesSearchingTask-00bec802-073a-4b61-ba*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateFacesSearchingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFacesSearchingTaskResponseBody self = new CreateFacesSearchingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFacesSearchingTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateFacesSearchingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFacesSearchingTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
