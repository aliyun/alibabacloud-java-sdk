// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunPptOutlineGenerationResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response header.</p>
     */
    @NameInMap("Header")
    public RunPptOutlineGenerationResponseBodyHeader header;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response body.</p>
     */
    @NameInMap("Payload")
    public RunPptOutlineGenerationResponseBodyPayload payload;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code>: The request was successful. \<code>false\\</code>: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunPptOutlineGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPptOutlineGenerationResponseBody self = new RunPptOutlineGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPptOutlineGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunPptOutlineGenerationResponseBody setHeader(RunPptOutlineGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunPptOutlineGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunPptOutlineGenerationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunPptOutlineGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunPptOutlineGenerationResponseBody setPayload(RunPptOutlineGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunPptOutlineGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunPptOutlineGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunPptOutlineGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunPptOutlineGenerationResponseBodyHeader extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The SSE event. \<code>task-started\\</code>: The task starts. \<code>task-finished\\</code>: The task is complete. \<code>task-failed\\</code>: The task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a3d7c9f-3a6d-4e49-b176-2d8721a27397</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8996314ce5514867943c71935e6a45af</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec3a17435601877224179ecc8a</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunPptOutlineGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunPptOutlineGenerationResponseBodyHeader self = new RunPptOutlineGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunPptOutlineGenerationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunPptOutlineGenerationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunPptOutlineGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunPptOutlineGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunPptOutlineGenerationResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunPptOutlineGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunPptOutlineGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunPptOutlineGenerationResponseBodyPayloadOutput extends TeaModel {
        /**
         * <p>The output content.</p>
         * 
         * <strong>example:</strong>
         * <p>文本生成结果</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunPptOutlineGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunPptOutlineGenerationResponseBodyPayloadOutput self = new RunPptOutlineGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunPptOutlineGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunPptOutlineGenerationResponseBodyPayload extends TeaModel {
        /**
         * <p>The output.</p>
         */
        @NameInMap("Output")
        public RunPptOutlineGenerationResponseBodyPayloadOutput output;

        public static RunPptOutlineGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunPptOutlineGenerationResponseBodyPayload self = new RunPptOutlineGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunPptOutlineGenerationResponseBodyPayload setOutput(RunPptOutlineGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunPptOutlineGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

    }

}
