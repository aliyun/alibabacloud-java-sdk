// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocSummaryResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunDocSummaryResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocSummaryResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3259D344-E871-5DE0-8FFE-CDA21F8D4382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocSummaryResponseBody self = new RunDocSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocSummaryResponseBody setHeader(RunDocSummaryResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocSummaryResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocSummaryResponseBody setPayload(RunDocSummaryResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocSummaryResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocSummaryResponseBodyHeader extends TeaModel {
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
         * <p>92e16ccb-92b6-4894-abbf-fc6e2929a0df</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

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

        public static RunDocSummaryResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocSummaryResponseBodyHeader self = new RunDocSummaryResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocSummaryResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDocSummaryResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDocSummaryResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocSummaryResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocSummaryResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocSummaryResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocSummaryResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocSummaryResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static RunDocSummaryResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocSummaryResponseBodyPayloadOutput self = new RunDocSummaryResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocSummaryResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RunDocSummaryResponseBodyPayloadUsage extends TeaModel {
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

        public static RunDocSummaryResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocSummaryResponseBodyPayloadUsage self = new RunDocSummaryResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocSummaryResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocSummaryResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocSummaryResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocSummaryResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocSummaryResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocSummaryResponseBodyPayloadUsage usage;

        public static RunDocSummaryResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocSummaryResponseBodyPayload self = new RunDocSummaryResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocSummaryResponseBodyPayload setOutput(RunDocSummaryResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocSummaryResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocSummaryResponseBodyPayload setUsage(RunDocSummaryResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocSummaryResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
