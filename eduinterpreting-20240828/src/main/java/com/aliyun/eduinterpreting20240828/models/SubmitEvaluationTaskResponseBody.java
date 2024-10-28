// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduinterpreting20240828.models;

import com.aliyun.tea.*;

public class SubmitEvaluationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BA3BB7D0-E098-5F0C-AF25-0BEFAEE7D1F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8fb75c55-98b5-4b82-ae67-5dbb9a0646cc</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static SubmitEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEvaluationTaskResponseBody self = new SubmitEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitEvaluationTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
