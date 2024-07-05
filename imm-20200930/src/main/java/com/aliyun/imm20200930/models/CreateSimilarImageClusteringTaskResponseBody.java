// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateSimilarImageClusteringTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3BF-1UhtFyrua71eOkFlqYq23Co****</p>
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
     * <p>SimilarImageClustering-48d0a0f3-8459-47f4-b8af-ff49c64****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateSimilarImageClusteringTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarImageClusteringTaskResponseBody self = new CreateSimilarImageClusteringTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimilarImageClusteringTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateSimilarImageClusteringTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSimilarImageClusteringTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
