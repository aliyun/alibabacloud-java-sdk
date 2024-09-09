// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunAbbreviationContentResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunAbbreviationContentResponseBodyHeader header;

    @NameInMap("Payload")
    public RunAbbreviationContentResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunAbbreviationContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunAbbreviationContentResponseBody self = new RunAbbreviationContentResponseBody();
        return TeaModel.build(map, self);
    }

    public RunAbbreviationContentResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunAbbreviationContentResponseBody setHeader(RunAbbreviationContentResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunAbbreviationContentResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunAbbreviationContentResponseBody setPayload(RunAbbreviationContentResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunAbbreviationContentResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunAbbreviationContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunAbbreviationContentResponseBodyHeader extends TeaModel {
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

        public static RunAbbreviationContentResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunAbbreviationContentResponseBodyHeader self = new RunAbbreviationContentResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunAbbreviationContentResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunAbbreviationContentResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunAbbreviationContentResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunAbbreviationContentResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunAbbreviationContentResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunAbbreviationContentResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunAbbreviationContentResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunAbbreviationContentResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunAbbreviationContentResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunAbbreviationContentResponseBodyPayloadOutput self = new RunAbbreviationContentResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunAbbreviationContentResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunAbbreviationContentResponseBodyPayloadUsage extends TeaModel {
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

        public static RunAbbreviationContentResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunAbbreviationContentResponseBodyPayloadUsage self = new RunAbbreviationContentResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunAbbreviationContentResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunAbbreviationContentResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunAbbreviationContentResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunAbbreviationContentResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunAbbreviationContentResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunAbbreviationContentResponseBodyPayloadUsage usage;

        public static RunAbbreviationContentResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunAbbreviationContentResponseBodyPayload self = new RunAbbreviationContentResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunAbbreviationContentResponseBodyPayload setOutput(RunAbbreviationContentResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunAbbreviationContentResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunAbbreviationContentResponseBodyPayload setUsage(RunAbbreviationContentResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunAbbreviationContentResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
