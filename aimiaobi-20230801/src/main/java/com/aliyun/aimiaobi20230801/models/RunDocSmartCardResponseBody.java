// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocSmartCardResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunDocSmartCardResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocSmartCardResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocSmartCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocSmartCardResponseBody self = new RunDocSmartCardResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocSmartCardResponseBody setHeader(RunDocSmartCardResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocSmartCardResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocSmartCardResponseBody setPayload(RunDocSmartCardResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocSmartCardResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocSmartCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocSmartCardResponseBodyHeader extends TeaModel {
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
         * <p>07181f55-2311-48af-8048-132a77dee020</p>
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
         * <p>0abb781c17337107444473701ed7c3</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDocSmartCardResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocSmartCardResponseBodyHeader self = new RunDocSmartCardResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocSmartCardResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDocSmartCardResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDocSmartCardResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocSmartCardResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocSmartCardResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocSmartCardResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocSmartCardResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocSmartCardResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static RunDocSmartCardResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocSmartCardResponseBodyPayloadOutput self = new RunDocSmartCardResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocSmartCardResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunDocSmartCardResponseBodyPayloadOutput setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class RunDocSmartCardResponseBodyPayloadUsage extends TeaModel {
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

        public static RunDocSmartCardResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocSmartCardResponseBodyPayloadUsage self = new RunDocSmartCardResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocSmartCardResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocSmartCardResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocSmartCardResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocSmartCardResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocSmartCardResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocSmartCardResponseBodyPayloadUsage usage;

        public static RunDocSmartCardResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocSmartCardResponseBodyPayload self = new RunDocSmartCardResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocSmartCardResponseBodyPayload setOutput(RunDocSmartCardResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocSmartCardResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocSmartCardResponseBodyPayload setUsage(RunDocSmartCardResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocSmartCardResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
