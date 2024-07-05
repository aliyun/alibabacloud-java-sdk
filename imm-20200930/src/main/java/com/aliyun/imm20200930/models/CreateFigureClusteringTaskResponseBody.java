// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClusteringTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0ED-1Bz8z71k5TtsUejT4UJ16****</p>
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
     * <p>formatconvert-00bec802-073a-4b61-ba3b-39bc****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateFigureClusteringTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFigureClusteringTaskResponseBody self = new CreateFigureClusteringTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFigureClusteringTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateFigureClusteringTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFigureClusteringTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
