// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDeepWriteTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeepWriteTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDeepWriteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeepWriteTaskResponseBody self = new GetDeepWriteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeepWriteTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeepWriteTaskResponseBody setData(GetDeepWriteTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeepWriteTaskResponseBodyData getData() {
        return this.data;
    }

    public GetDeepWriteTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeepWriteTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeepWriteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeepWriteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeepWriteTaskResponseBodyData extends TeaModel {
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>queued</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>a2267372-6042-46a4-aab0-1670dfc38c94</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetDeepWriteTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeepWriteTaskResponseBodyData self = new GetDeepWriteTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeepWriteTaskResponseBodyData setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetDeepWriteTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeepWriteTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
