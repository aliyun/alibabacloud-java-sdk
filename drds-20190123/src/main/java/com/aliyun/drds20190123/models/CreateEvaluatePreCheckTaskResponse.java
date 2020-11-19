// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluatePreCheckTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static CreateEvaluatePreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatePreCheckTaskResponse self = new CreateEvaluatePreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatePreCheckTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEvaluatePreCheckTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateEvaluatePreCheckTaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
