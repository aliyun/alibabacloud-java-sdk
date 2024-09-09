// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTitleGenerationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Header")
    public RunTitleGenerationResponseBodyHeader header;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Payload")
    public RunTitleGenerationResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>94512A33-8EC1-5452-A793-5C91F18ED2F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RunTitleGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTitleGenerationResponseBody self = new RunTitleGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTitleGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunTitleGenerationResponseBody setHeader(RunTitleGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunTitleGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunTitleGenerationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunTitleGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunTitleGenerationResponseBody setPayload(RunTitleGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunTitleGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunTitleGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunTitleGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunTitleGenerationResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccessForbid</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-failed</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <strong>example:</strong>
         * <p>50a1cc8e-717e-4a2b-a76b-dc9734a8564b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>0a3d448f17000139741898287e0eb3</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunTitleGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunTitleGenerationResponseBodyHeader self = new RunTitleGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunTitleGenerationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunTitleGenerationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunTitleGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunTitleGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunTitleGenerationResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunTitleGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunTitleGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunTitleGenerationResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunTitleGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunTitleGenerationResponseBodyPayloadOutput self = new RunTitleGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunTitleGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunTitleGenerationResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunTitleGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunTitleGenerationResponseBodyPayloadUsage self = new RunTitleGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunTitleGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunTitleGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunTitleGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunTitleGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunTitleGenerationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunTitleGenerationResponseBodyPayloadUsage usage;

        public static RunTitleGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunTitleGenerationResponseBodyPayload self = new RunTitleGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunTitleGenerationResponseBodyPayload setOutput(RunTitleGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunTitleGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunTitleGenerationResponseBodyPayload setUsage(RunTitleGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunTitleGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
