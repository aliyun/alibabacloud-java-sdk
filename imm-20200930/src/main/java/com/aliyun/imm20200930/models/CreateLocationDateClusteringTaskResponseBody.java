// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateLocationDateClusteringTaskResponseBody extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>B121940C-9794-4EE3-8D6E-F8EC525F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateLocationDateClusteringTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationDateClusteringTaskResponseBody self = new CreateLocationDateClusteringTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLocationDateClusteringTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateLocationDateClusteringTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLocationDateClusteringTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
