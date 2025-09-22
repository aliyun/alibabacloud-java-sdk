// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitDocTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitDocTranslateTaskResponseBodyData data;

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
     * <p>377A48D7-7CFA-53F9-8CA2-14FE3F2774B6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitDocTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocTranslateTaskResponseBody self = new SubmitDocTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocTranslateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitDocTranslateTaskResponseBody setData(SubmitDocTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocTranslateTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitDocTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDocTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitDocTranslateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitDocTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ready</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>d3a2397bc2c14ab4a2e40a4f5b46241b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitDocTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocTranslateTaskResponseBodyData self = new SubmitDocTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocTranslateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitDocTranslateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
