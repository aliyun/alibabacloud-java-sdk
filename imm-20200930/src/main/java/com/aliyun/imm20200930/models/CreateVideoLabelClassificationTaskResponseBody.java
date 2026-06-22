// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoLabelClassificationTaskResponseBody extends TeaModel {
    /**
     * <p>The event ID of the task. You can use this ID to query task information notifications in the <a href="https://www.aliyun.com/product/aliware/eventbridge">EventBridge</a> service.</p>
     * 
     * <strong>example:</strong>
     * <p>03F-1Qt1Yn5RZZ0Zh3ZdYlDblv7****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFFE0B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task. You can use the <a href="https://help.aliyun.com/document_detail/478241.html">GetTask</a> operation to view task information or the <a href="https://help.aliyun.com/document_detail/478224.html">GetVideoLabelClassificationResult</a> operation to obtain the results of the video label detection task.</p>
     * 
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
