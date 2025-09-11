// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitHtmlTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitHtmlTranslateTaskResponseBodyData data;

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
     * <strong>example:</strong>
     * <p>72E4FDA1-5474-5DC1-8DFF-968BEEA65C49</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitHtmlTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitHtmlTranslateTaskResponseBody self = new SubmitHtmlTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitHtmlTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitHtmlTranslateTaskResponseBody setData(SubmitHtmlTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitHtmlTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitHtmlTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitHtmlTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitHtmlTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitHtmlTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitHtmlTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>in_process</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2746f4be-cff2-465e-a2c6-12bff30ce0f9</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitHtmlTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitHtmlTranslateTaskResponseBodyData self = new SubmitHtmlTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitHtmlTranslateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitHtmlTranslateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
