// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSummaryGenerateResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunSummaryGenerateResponseBodyHeader header;

    @NameInMap("Payload")
    public RunSummaryGenerateResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunSummaryGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSummaryGenerateResponseBody self = new RunSummaryGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSummaryGenerateResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunSummaryGenerateResponseBody setHeader(RunSummaryGenerateResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunSummaryGenerateResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunSummaryGenerateResponseBody setPayload(RunSummaryGenerateResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunSummaryGenerateResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunSummaryGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunSummaryGenerateResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Pop sign mismatch, please check.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>模型生成事件</p>
         */
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
         * <p>2150451a17191950923411783e2927</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunSummaryGenerateResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunSummaryGenerateResponseBodyHeader self = new RunSummaryGenerateResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunSummaryGenerateResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunSummaryGenerateResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunSummaryGenerateResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunSummaryGenerateResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunSummaryGenerateResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunSummaryGenerateResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunSummaryGenerateResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunSummaryGenerateResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunSummaryGenerateResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunSummaryGenerateResponseBodyPayloadOutput self = new RunSummaryGenerateResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunSummaryGenerateResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunSummaryGenerateResponseBodyPayloadUsage extends TeaModel {
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

        public static RunSummaryGenerateResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunSummaryGenerateResponseBodyPayloadUsage self = new RunSummaryGenerateResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunSummaryGenerateResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunSummaryGenerateResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunSummaryGenerateResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunSummaryGenerateResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunSummaryGenerateResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunSummaryGenerateResponseBodyPayloadUsage usage;

        public static RunSummaryGenerateResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunSummaryGenerateResponseBodyPayload self = new RunSummaryGenerateResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunSummaryGenerateResponseBodyPayload setOutput(RunSummaryGenerateResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunSummaryGenerateResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunSummaryGenerateResponseBodyPayload setUsage(RunSummaryGenerateResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunSummaryGenerateResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
