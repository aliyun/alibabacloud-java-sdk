// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunGenerateQuestionsResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunGenerateQuestionsResponseBodyHeader header;

    @NameInMap("Payload")
    public RunGenerateQuestionsResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunGenerateQuestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunGenerateQuestionsResponseBody self = new RunGenerateQuestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public RunGenerateQuestionsResponseBody setHeader(RunGenerateQuestionsResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunGenerateQuestionsResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunGenerateQuestionsResponseBody setPayload(RunGenerateQuestionsResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunGenerateQuestionsResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunGenerateQuestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunGenerateQuestionsResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>3cd10828-0e42-471c-8f1a-931cde20b035</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>0bc3b4b417362160345997589e5f6e</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunGenerateQuestionsResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunGenerateQuestionsResponseBodyHeader self = new RunGenerateQuestionsResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunGenerateQuestionsResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunGenerateQuestionsResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunGenerateQuestionsResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunGenerateQuestionsResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunGenerateQuestionsResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunGenerateQuestionsResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunGenerateQuestionsResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunGenerateQuestionsResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static RunGenerateQuestionsResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunGenerateQuestionsResponseBodyPayloadOutput self = new RunGenerateQuestionsResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunGenerateQuestionsResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RunGenerateQuestionsResponseBodyPayloadUsage extends TeaModel {
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

        public static RunGenerateQuestionsResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunGenerateQuestionsResponseBodyPayloadUsage self = new RunGenerateQuestionsResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunGenerateQuestionsResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunGenerateQuestionsResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunGenerateQuestionsResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunGenerateQuestionsResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunGenerateQuestionsResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunGenerateQuestionsResponseBodyPayloadUsage usage;

        public static RunGenerateQuestionsResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunGenerateQuestionsResponseBodyPayload self = new RunGenerateQuestionsResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunGenerateQuestionsResponseBodyPayload setOutput(RunGenerateQuestionsResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunGenerateQuestionsResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunGenerateQuestionsResponseBodyPayload setUsage(RunGenerateQuestionsResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunGenerateQuestionsResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
