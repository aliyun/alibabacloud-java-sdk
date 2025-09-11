// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitImageTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitImageTranslateTaskResponseBodyData data;

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
     * <p>42FF90E5-5D40-5797-AAF6-8A4D837CCCD5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitImageTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageTranslateTaskResponseBody self = new SubmitImageTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitImageTranslateTaskResponseBody setData(SubmitImageTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitImageTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitImageTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitImageTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImageTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitImageTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitImageTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2746f4be-cff2-465e-a2c6-12bff30ce0f9</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitImageTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageTranslateTaskResponseBodyData self = new SubmitImageTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitImageTranslateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitImageTranslateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
