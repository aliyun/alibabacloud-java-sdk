// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocBrainmapResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunDocBrainmapResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocBrainmapResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocBrainmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocBrainmapResponseBody self = new RunDocBrainmapResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocBrainmapResponseBody setHeader(RunDocBrainmapResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocBrainmapResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocBrainmapResponseBody setPayload(RunDocBrainmapResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocBrainmapResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocBrainmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocBrainmapResponseBodyHeader extends TeaModel {
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
         * <p>task-failed</p>
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
         * <p>161816</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>6427cdf4-2ffe-4d05-b0ef-c4adceea90f4</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDocBrainmapResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocBrainmapResponseBodyHeader self = new RunDocBrainmapResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocBrainmapResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDocBrainmapResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDocBrainmapResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocBrainmapResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocBrainmapResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocBrainmapResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocBrainmapResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocBrainmapResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;xxxx&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        public static RunDocBrainmapResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocBrainmapResponseBodyPayloadOutput self = new RunDocBrainmapResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocBrainmapResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RunDocBrainmapResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>65</p>
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
         * <p>165</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunDocBrainmapResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocBrainmapResponseBodyPayloadUsage self = new RunDocBrainmapResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocBrainmapResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocBrainmapResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocBrainmapResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocBrainmapResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocBrainmapResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocBrainmapResponseBodyPayloadUsage usage;

        public static RunDocBrainmapResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocBrainmapResponseBodyPayload self = new RunDocBrainmapResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocBrainmapResponseBodyPayload setOutput(RunDocBrainmapResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocBrainmapResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocBrainmapResponseBodyPayload setUsage(RunDocBrainmapResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocBrainmapResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
