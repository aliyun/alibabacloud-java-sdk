// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWriteToneGenerationResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunWriteToneGenerationResponseBodyHeader header;

    @NameInMap("Payload")
    public RunWriteToneGenerationResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>FB698445-61DA-5361-BF73-1C5F1157E888</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunWriteToneGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunWriteToneGenerationResponseBody self = new RunWriteToneGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunWriteToneGenerationResponseBody setHeader(RunWriteToneGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunWriteToneGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunWriteToneGenerationResponseBody setPayload(RunWriteToneGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunWriteToneGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunWriteToneGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunWriteToneGenerationResponseBodyHeader extends TeaModel {
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
         * <p>F1953EE6-157C-40DC-BBF1-87C98AC27C51</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>F1953EE6-157C-40DC-BBF1-87C98AC27C51</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>F1953EE6-157C-40DC-BBF1-87C98AC27C51</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunWriteToneGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunWriteToneGenerationResponseBodyHeader self = new RunWriteToneGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunWriteToneGenerationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunWriteToneGenerationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunWriteToneGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunWriteToneGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunWriteToneGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunWriteToneGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunWriteToneGenerationResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunWriteToneGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunWriteToneGenerationResponseBodyPayloadOutput self = new RunWriteToneGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunWriteToneGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunWriteToneGenerationResponseBodyPayloadUsage extends TeaModel {
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

        public static RunWriteToneGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunWriteToneGenerationResponseBodyPayloadUsage self = new RunWriteToneGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunWriteToneGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunWriteToneGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunWriteToneGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunWriteToneGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunWriteToneGenerationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunWriteToneGenerationResponseBodyPayloadUsage usage;

        public static RunWriteToneGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunWriteToneGenerationResponseBodyPayload self = new RunWriteToneGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunWriteToneGenerationResponseBodyPayload setOutput(RunWriteToneGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunWriteToneGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunWriteToneGenerationResponseBodyPayload setUsage(RunWriteToneGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunWriteToneGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
