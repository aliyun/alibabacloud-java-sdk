// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoLabelClassificationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>03F-1Qt1Yn5RZZ0Zh3ZdYlDblv7****</p>
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
     * <p>VideoLabelClassification-2f157087-91df-4fda-8c3e-232407ec*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateVideoLabelClassificationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoLabelClassificationTaskResponseBody self = new CreateVideoLabelClassificationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoLabelClassificationTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public CreateVideoLabelClassificationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoLabelClassificationTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
