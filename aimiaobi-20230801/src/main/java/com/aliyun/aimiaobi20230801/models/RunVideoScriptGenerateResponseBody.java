// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunVideoScriptGenerateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Header")
    public RunVideoScriptGenerateResponseBodyHeader header;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this action.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Payload")
    public RunVideoScriptGenerateResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunVideoScriptGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunVideoScriptGenerateResponseBody self = new RunVideoScriptGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public RunVideoScriptGenerateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunVideoScriptGenerateResponseBody setHeader(RunVideoScriptGenerateResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunVideoScriptGenerateResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunVideoScriptGenerateResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunVideoScriptGenerateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunVideoScriptGenerateResponseBody setPayload(RunVideoScriptGenerateResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunVideoScriptGenerateResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunVideoScriptGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunVideoScriptGenerateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunVideoScriptGenerateResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ScriptNumberExceed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <strong>example:</strong>
         * <p>b057f2fa-2277-477b-babf-cbc062307828</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2150451a17191950923411783e2927</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunVideoScriptGenerateResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyHeader self = new RunVideoScriptGenerateResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunVideoScriptGenerateResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunVideoScriptGenerateResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunVideoScriptGenerateResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunVideoScriptGenerateResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunVideoScriptGenerateResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunVideoScriptGenerateResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunVideoScriptGenerateResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Text")
        public String text;

        public static RunVideoScriptGenerateResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyPayloadOutput self = new RunVideoScriptGenerateResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunVideoScriptGenerateResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunVideoScriptGenerateResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyPayloadUsage self = new RunVideoScriptGenerateResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoScriptGenerateResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoScriptGenerateResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoScriptGenerateResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunVideoScriptGenerateResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunVideoScriptGenerateResponseBodyPayloadUsage usage;

        public static RunVideoScriptGenerateResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyPayload self = new RunVideoScriptGenerateResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyPayload setOutput(RunVideoScriptGenerateResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunVideoScriptGenerateResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunVideoScriptGenerateResponseBodyPayload setUsage(RunVideoScriptGenerateResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoScriptGenerateResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
