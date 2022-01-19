// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateFigureClusteringTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
