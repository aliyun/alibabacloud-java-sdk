// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunContinueContentResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunContinueContentResponseBodyHeader header;

    @NameInMap("Payload")
    public RunContinueContentResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunContinueContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunContinueContentResponseBody self = new RunContinueContentResponseBody();
        return TeaModel.build(map, self);
    }

    public RunContinueContentResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunContinueContentResponseBody setHeader(RunContinueContentResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunContinueContentResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunContinueContentResponseBody setPayload(RunContinueContentResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunContinueContentResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunContinueContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunContinueContentResponseBodyHeader extends TeaModel {
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

        public static RunContinueContentResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunContinueContentResponseBodyHeader self = new RunContinueContentResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunContinueContentResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunContinueContentResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunContinueContentResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunContinueContentResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunContinueContentResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunContinueContentResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunContinueContentResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunContinueContentResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunContinueContentResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunContinueContentResponseBodyPayloadOutput self = new RunContinueContentResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunContinueContentResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunContinueContentResponseBodyPayloadUsage extends TeaModel {
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

        public static RunContinueContentResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunContinueContentResponseBodyPayloadUsage self = new RunContinueContentResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunContinueContentResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunContinueContentResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunContinueContentResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunContinueContentResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunContinueContentResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunContinueContentResponseBodyPayloadUsage usage;

        public static RunContinueContentResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunContinueContentResponseBodyPayload self = new RunContinueContentResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunContinueContentResponseBodyPayload setOutput(RunContinueContentResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunContinueContentResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunContinueContentResponseBodyPayload setUsage(RunContinueContentResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunContinueContentResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
