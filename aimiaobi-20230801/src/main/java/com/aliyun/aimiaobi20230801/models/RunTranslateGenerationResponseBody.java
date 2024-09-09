// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTranslateGenerationResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunTranslateGenerationResponseBodyHeader header;

    @NameInMap("Payload")
    public RunTranslateGenerationResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>DA021073-17CE-5CCF-9FEB-93226C766887</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunTranslateGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTranslateGenerationResponseBody self = new RunTranslateGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTranslateGenerationResponseBody setHeader(RunTranslateGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunTranslateGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunTranslateGenerationResponseBody setPayload(RunTranslateGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunTranslateGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunTranslateGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunTranslateGenerationResponseBodyHeader extends TeaModel {
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
         * <p>91C2B2B8-7D12-4A8D-A724-1E576D30C096</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>0abb781d17146157564845243e20b5</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunTranslateGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunTranslateGenerationResponseBodyHeader self = new RunTranslateGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunTranslateGenerationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunTranslateGenerationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunTranslateGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunTranslateGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunTranslateGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunTranslateGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunTranslateGenerationResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunTranslateGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunTranslateGenerationResponseBodyPayloadOutput self = new RunTranslateGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunTranslateGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunTranslateGenerationResponseBodyPayloadUsage extends TeaModel {
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

        public static RunTranslateGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunTranslateGenerationResponseBodyPayloadUsage self = new RunTranslateGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunTranslateGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunTranslateGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunTranslateGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunTranslateGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunTranslateGenerationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunTranslateGenerationResponseBodyPayloadUsage usage;

        public static RunTranslateGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunTranslateGenerationResponseBodyPayload self = new RunTranslateGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunTranslateGenerationResponseBodyPayload setOutput(RunTranslateGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunTranslateGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunTranslateGenerationResponseBodyPayload setUsage(RunTranslateGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunTranslateGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
