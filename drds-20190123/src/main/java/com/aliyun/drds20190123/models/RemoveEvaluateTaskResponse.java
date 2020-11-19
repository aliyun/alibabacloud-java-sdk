// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveEvaluateTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public RemoveEvaluateTaskResponseTaskManageResult taskManageResult;

    public static RemoveEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEvaluateTaskResponse self = new RemoveEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEvaluateTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveEvaluateTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveEvaluateTaskResponse setTaskManageResult(RemoveEvaluateTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public RemoveEvaluateTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class RemoveEvaluateTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static RemoveEvaluateTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveEvaluateTaskResponseTaskManageResult self = new RemoveEvaluateTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public RemoveEvaluateTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RemoveEvaluateTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
