// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveEvaluateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public RemoveEvaluateTaskResponseBodyTaskManageResult taskManageResult;

    public static RemoveEvaluateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveEvaluateTaskResponseBody self = new RemoveEvaluateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveEvaluateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveEvaluateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveEvaluateTaskResponseBody setTaskManageResult(RemoveEvaluateTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public RemoveEvaluateTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class RemoveEvaluateTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static RemoveEvaluateTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveEvaluateTaskResponseBodyTaskManageResult self = new RemoveEvaluateTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public RemoveEvaluateTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveEvaluateTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
