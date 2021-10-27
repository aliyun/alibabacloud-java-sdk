// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopEvaluateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public StopEvaluateTaskResponseBodyTaskManageResult taskManageResult;

    public static StopEvaluateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopEvaluateTaskResponseBody self = new StopEvaluateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopEvaluateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopEvaluateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopEvaluateTaskResponseBody setTaskManageResult(StopEvaluateTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StopEvaluateTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StopEvaluateTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static StopEvaluateTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StopEvaluateTaskResponseBodyTaskManageResult self = new StopEvaluateTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StopEvaluateTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopEvaluateTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
