// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookSmartCardResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunBookSmartCardResponseBodyHeader header;

    @NameInMap("Payload")
    public RunBookSmartCardResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunBookSmartCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunBookSmartCardResponseBody self = new RunBookSmartCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RunBookSmartCardResponseBody setHeader(RunBookSmartCardResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunBookSmartCardResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunBookSmartCardResponseBody setPayload(RunBookSmartCardResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunBookSmartCardResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunBookSmartCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunBookSmartCardResponseBodyHeader extends TeaModel {
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
         * <p>finished</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
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
         * <p>1a0e898717105546647125853d4f54</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunBookSmartCardResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunBookSmartCardResponseBodyHeader self = new RunBookSmartCardResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunBookSmartCardResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunBookSmartCardResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunBookSmartCardResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunBookSmartCardResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunBookSmartCardResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunBookSmartCardResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunBookSmartCardResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunBookSmartCardResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static RunBookSmartCardResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunBookSmartCardResponseBodyPayloadOutput self = new RunBookSmartCardResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunBookSmartCardResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunBookSmartCardResponseBodyPayloadOutput setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class RunBookSmartCardResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>101</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunBookSmartCardResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunBookSmartCardResponseBodyPayloadUsage self = new RunBookSmartCardResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunBookSmartCardResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunBookSmartCardResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunBookSmartCardResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunBookSmartCardResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunBookSmartCardResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunBookSmartCardResponseBodyPayloadUsage usage;

        public static RunBookSmartCardResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunBookSmartCardResponseBodyPayload self = new RunBookSmartCardResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunBookSmartCardResponseBodyPayload setOutput(RunBookSmartCardResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunBookSmartCardResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunBookSmartCardResponseBodyPayload setUsage(RunBookSmartCardResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunBookSmartCardResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
