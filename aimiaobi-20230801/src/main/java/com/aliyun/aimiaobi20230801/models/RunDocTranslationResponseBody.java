// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocTranslationResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunDocTranslationResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocTranslationResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocTranslationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocTranslationResponseBody self = new RunDocTranslationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocTranslationResponseBody setHeader(RunDocTranslationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocTranslationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocTranslationResponseBody setPayload(RunDocTranslationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocTranslationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocTranslationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocTranslationResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
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
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>411c4dfa-2168-4379-a902-675d67f453f8</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>50a1cc8e-717e-4a2b-a76b-dc9734a8564b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>ebd19b12-0cae-488f-9e41-5a1c825f545b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDocTranslationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocTranslationResponseBodyHeader self = new RunDocTranslationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocTranslationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDocTranslationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDocTranslationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocTranslationResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocTranslationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocTranslationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocTranslationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocTranslationResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static RunDocTranslationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocTranslationResponseBodyPayloadOutput self = new RunDocTranslationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocTranslationResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RunDocTranslationResponseBodyPayloadUsage extends TeaModel {
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

        public static RunDocTranslationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocTranslationResponseBodyPayloadUsage self = new RunDocTranslationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocTranslationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocTranslationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocTranslationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocTranslationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocTranslationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocTranslationResponseBodyPayloadUsage usage;

        public static RunDocTranslationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocTranslationResponseBodyPayload self = new RunDocTranslationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocTranslationResponseBodyPayload setOutput(RunDocTranslationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocTranslationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocTranslationResponseBodyPayload setUsage(RunDocTranslationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocTranslationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
