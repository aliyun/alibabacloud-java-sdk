// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunKeywordsExtractionGenerationResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunKeywordsExtractionGenerationResponseBodyHeader header;

    @NameInMap("Payload")
    public RunKeywordsExtractionGenerationResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>419F3FBE-5C8D-5949-AC29-E9615235D15A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunKeywordsExtractionGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunKeywordsExtractionGenerationResponseBody self = new RunKeywordsExtractionGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunKeywordsExtractionGenerationResponseBody setHeader(RunKeywordsExtractionGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunKeywordsExtractionGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunKeywordsExtractionGenerationResponseBody setPayload(RunKeywordsExtractionGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunKeywordsExtractionGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunKeywordsExtractionGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunKeywordsExtractionGenerationResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccessForbid</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
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
         * <p>1a3d7c9f-3a6d-4e49-b176-2d8721a27397</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>8d55b429d7c6d321fcff54823e8d317b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>210bc4e817219607963985396de8bd</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunKeywordsExtractionGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunKeywordsExtractionGenerationResponseBodyHeader self = new RunKeywordsExtractionGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunKeywordsExtractionGenerationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunKeywordsExtractionGenerationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunKeywordsExtractionGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunKeywordsExtractionGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunKeywordsExtractionGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunKeywordsExtractionGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunKeywordsExtractionGenerationResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunKeywordsExtractionGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunKeywordsExtractionGenerationResponseBodyPayloadOutput self = new RunKeywordsExtractionGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunKeywordsExtractionGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunKeywordsExtractionGenerationResponseBodyPayloadUsage extends TeaModel {
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

        public static RunKeywordsExtractionGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunKeywordsExtractionGenerationResponseBodyPayloadUsage self = new RunKeywordsExtractionGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunKeywordsExtractionGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunKeywordsExtractionGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunKeywordsExtractionGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunKeywordsExtractionGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunKeywordsExtractionGenerationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunKeywordsExtractionGenerationResponseBodyPayloadUsage usage;

        public static RunKeywordsExtractionGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunKeywordsExtractionGenerationResponseBodyPayload self = new RunKeywordsExtractionGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunKeywordsExtractionGenerationResponseBodyPayload setOutput(RunKeywordsExtractionGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunKeywordsExtractionGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunKeywordsExtractionGenerationResponseBodyPayload setUsage(RunKeywordsExtractionGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunKeywordsExtractionGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
