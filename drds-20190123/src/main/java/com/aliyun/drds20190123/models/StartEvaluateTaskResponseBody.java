// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartEvaluateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public StartEvaluateTaskResponseBodyTaskManageResult taskManageResult;

    public static StartEvaluateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartEvaluateTaskResponseBody self = new StartEvaluateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartEvaluateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartEvaluateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartEvaluateTaskResponseBody setTaskManageResult(StartEvaluateTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StartEvaluateTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StartEvaluateTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static StartEvaluateTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StartEvaluateTaskResponseBodyTaskManageResult self = new StartEvaluateTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StartEvaluateTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StartEvaluateTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
