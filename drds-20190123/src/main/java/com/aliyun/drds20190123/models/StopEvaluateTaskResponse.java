// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopEvaluateTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public StopEvaluateTaskResponseTaskManageResult taskManageResult;

    public static StopEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEvaluateTaskResponse self = new StopEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopEvaluateTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopEvaluateTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopEvaluateTaskResponse setTaskManageResult(StopEvaluateTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StopEvaluateTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StopEvaluateTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StopEvaluateTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StopEvaluateTaskResponseTaskManageResult self = new StopEvaluateTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StopEvaluateTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StopEvaluateTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
