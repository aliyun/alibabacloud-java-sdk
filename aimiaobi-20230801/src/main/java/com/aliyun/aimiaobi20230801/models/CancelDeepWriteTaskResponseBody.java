// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CancelDeepWriteTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelDeepWriteTaskResponseBodyData data;

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

    public static CancelDeepWriteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDeepWriteTaskResponseBody self = new CancelDeepWriteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDeepWriteTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelDeepWriteTaskResponseBody setData(CancelDeepWriteTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelDeepWriteTaskResponseBodyData getData() {
        return this.data;
    }

    public CancelDeepWriteTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CancelDeepWriteTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelDeepWriteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelDeepWriteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelDeepWriteTaskResponseBodyData extends TeaModel {
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>cancelled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>xbabac91-fdad-44d6-95ce-******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CancelDeepWriteTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelDeepWriteTaskResponseBodyData self = new CancelDeepWriteTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelDeepWriteTaskResponseBodyData setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public CancelDeepWriteTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CancelDeepWriteTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
