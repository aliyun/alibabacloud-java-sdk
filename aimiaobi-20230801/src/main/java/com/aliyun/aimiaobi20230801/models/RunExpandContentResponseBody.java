// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunExpandContentResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunExpandContentResponseBodyHeader header;

    @NameInMap("Payload")
    public RunExpandContentResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunExpandContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunExpandContentResponseBody self = new RunExpandContentResponseBody();
        return TeaModel.build(map, self);
    }

    public RunExpandContentResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunExpandContentResponseBody setHeader(RunExpandContentResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunExpandContentResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunExpandContentResponseBody setPayload(RunExpandContentResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunExpandContentResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunExpandContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunExpandContentResponseBodyHeader extends TeaModel {
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

        public static RunExpandContentResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunExpandContentResponseBodyHeader self = new RunExpandContentResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunExpandContentResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunExpandContentResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunExpandContentResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunExpandContentResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunExpandContentResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunExpandContentResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunExpandContentResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunExpandContentResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunExpandContentResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunExpandContentResponseBodyPayloadOutput self = new RunExpandContentResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunExpandContentResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunExpandContentResponseBodyPayloadUsage extends TeaModel {
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

        public static RunExpandContentResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunExpandContentResponseBodyPayloadUsage self = new RunExpandContentResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunExpandContentResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunExpandContentResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunExpandContentResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunExpandContentResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunExpandContentResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunExpandContentResponseBodyPayloadUsage usage;

        public static RunExpandContentResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunExpandContentResponseBodyPayload self = new RunExpandContentResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunExpandContentResponseBodyPayload setOutput(RunExpandContentResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunExpandContentResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunExpandContentResponseBodyPayload setUsage(RunExpandContentResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunExpandContentResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
