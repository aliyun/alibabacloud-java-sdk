// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitLongTextTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitLongTextTranslateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>400392FF-2F47-549A-A7FF-60FA4121D19E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitLongTextTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitLongTextTranslateTaskResponseBody self = new SubmitLongTextTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitLongTextTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitLongTextTranslateTaskResponseBody setData(SubmitLongTextTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitLongTextTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitLongTextTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitLongTextTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitLongTextTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitLongTextTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitLongTextTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2746f4be-cff2-465e-a2c6-12bff30ce0f9</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitLongTextTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitLongTextTranslateTaskResponseBodyData self = new SubmitLongTextTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitLongTextTranslateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitLongTextTranslateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
