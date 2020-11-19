// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartEvaluateTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public StartEvaluateTaskResponseTaskManageResult taskManageResult;

    public static StartEvaluateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEvaluateTaskResponse self = new StartEvaluateTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartEvaluateTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartEvaluateTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartEvaluateTaskResponse setTaskManageResult(StartEvaluateTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StartEvaluateTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StartEvaluateTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StartEvaluateTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StartEvaluateTaskResponseTaskManageResult self = new StartEvaluateTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StartEvaluateTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StartEvaluateTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
