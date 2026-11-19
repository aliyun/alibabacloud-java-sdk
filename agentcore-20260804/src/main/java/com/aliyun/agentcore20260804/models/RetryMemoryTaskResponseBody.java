// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryMemoryTaskResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public RetryMemoryTaskResponseBodyData data;

    /**
     * <p>httpStatusCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RetryMemoryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryMemoryTaskResponseBody self = new RetryMemoryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryMemoryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryMemoryTaskResponseBody setData(RetryMemoryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryMemoryTaskResponseBodyData getData() {
        return this.data;
    }

    public RetryMemoryTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RetryMemoryTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryMemoryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryMemoryTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetryMemoryTaskResponseBodyData extends TeaModel {
        /**
         * <p>status</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>taskId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static RetryMemoryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryMemoryTaskResponseBodyData self = new RetryMemoryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryMemoryTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RetryMemoryTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
