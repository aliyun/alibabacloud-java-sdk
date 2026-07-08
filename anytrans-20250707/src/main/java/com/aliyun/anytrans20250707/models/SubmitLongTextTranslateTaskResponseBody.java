// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitLongTextTranslateTaskResponseBody extends TeaModel {
    /**
     * <p>The result code of the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The object that contains the returned data.</p>
     */
    @NameInMap("data")
    public SubmitLongTextTranslateTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>A message that corresponds to the code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique ID for the API request, used for tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>C2D45266-3135-1A06-AD7F-69E782ED596F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
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
         * <p>The status of the translation task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the long-text translation task.</p>
         * 
         * <strong>example:</strong>
         * <p>a8f25f25-0b36-4349-857f-e19a43f69e51</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>A custom string passed from the request to the response unmodified. This is useful for tracking or correlating API calls.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;traceId&quot;:&quot;trace_123456&quot;}</p>
         */
        @NameInMap("trackingData")
        public String trackingData;

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

        public SubmitLongTextTranslateTaskResponseBodyData setTrackingData(String trackingData) {
            this.trackingData = trackingData;
            return this;
        }
        public String getTrackingData() {
            return this.trackingData;
        }

    }

}
