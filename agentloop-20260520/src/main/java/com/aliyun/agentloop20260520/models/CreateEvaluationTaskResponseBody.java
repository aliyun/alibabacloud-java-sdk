// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluationTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The evaluation task status. After creation, the status is typically <code>Pending</code>. After asynchronous orchestration, the status may change to <code>Running</code> or <code>Scheduling</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The evaluation task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluationTaskResponseBody self = new CreateEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEvaluationTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateEvaluationTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
