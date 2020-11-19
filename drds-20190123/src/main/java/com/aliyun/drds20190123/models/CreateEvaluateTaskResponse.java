// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateEvaluateTaskResponseData data;

    public static CreateEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateTaskResponse self = new CreateEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEvaluateTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateEvaluateTaskResponse setData(CreateEvaluateTaskResponseData data) {
        this.data = data;
        return this;
    }
    public CreateEvaluateTaskResponseData getData() {
        return this.data;
    }

    public static class CreateEvaluateTaskResponseData extends TeaModel {
        @NameInMap("TaskIds")
        @Validation(required = true)
        public java.util.List<String> taskIds;

        public static CreateEvaluateTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluateTaskResponseData self = new CreateEvaluateTaskResponseData();
            return TeaModel.build(map, self);
        }

        public CreateEvaluateTaskResponseData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

}
