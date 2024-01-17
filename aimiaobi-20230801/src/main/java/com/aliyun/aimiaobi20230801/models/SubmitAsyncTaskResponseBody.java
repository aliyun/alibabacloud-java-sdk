// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAsyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitAsyncTaskResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncTaskResponseBody self = new SubmitAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAsyncTaskResponseBody setData(SubmitAsyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAsyncTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitAsyncTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitAsyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAsyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAsyncTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskIntermediateResult")
        public Object taskIntermediateResult;

        @NameInMap("TaskName")
        public String taskName;

        public static SubmitAsyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAsyncTaskResponseBodyData self = new SubmitAsyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAsyncTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SubmitAsyncTaskResponseBodyData setTaskIntermediateResult(Object taskIntermediateResult) {
            this.taskIntermediateResult = taskIntermediateResult;
            return this;
        }
        public Object getTaskIntermediateResult() {
            return this.taskIntermediateResult;
        }

        public SubmitAsyncTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
