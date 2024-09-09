// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStyleFeatureAnalysisResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunStyleFeatureAnalysisResponseBodyHeader header;

    @NameInMap("Payload")
    public RunStyleFeatureAnalysisResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>d3be9981-ca2d-4e17-bf31-1c0a628e9f99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunStyleFeatureAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunStyleFeatureAnalysisResponseBody self = new RunStyleFeatureAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunStyleFeatureAnalysisResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunStyleFeatureAnalysisResponseBody setHeader(RunStyleFeatureAnalysisResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunStyleFeatureAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunStyleFeatureAnalysisResponseBody setPayload(RunStyleFeatureAnalysisResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunStyleFeatureAnalysisResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunStyleFeatureAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunStyleFeatureAnalysisResponseBodyHeader extends TeaModel {
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

        public static RunStyleFeatureAnalysisResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunStyleFeatureAnalysisResponseBodyHeader self = new RunStyleFeatureAnalysisResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunStyleFeatureAnalysisResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunStyleFeatureAnalysisResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>这是测试输出</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunStyleFeatureAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunStyleFeatureAnalysisResponseBodyPayloadOutput self = new RunStyleFeatureAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunStyleFeatureAnalysisResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunStyleFeatureAnalysisResponseBodyPayloadUsage extends TeaModel {
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

        public static RunStyleFeatureAnalysisResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunStyleFeatureAnalysisResponseBodyPayloadUsage self = new RunStyleFeatureAnalysisResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunStyleFeatureAnalysisResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunStyleFeatureAnalysisResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunStyleFeatureAnalysisResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunStyleFeatureAnalysisResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunStyleFeatureAnalysisResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunStyleFeatureAnalysisResponseBodyPayloadUsage usage;

        public static RunStyleFeatureAnalysisResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunStyleFeatureAnalysisResponseBodyPayload self = new RunStyleFeatureAnalysisResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunStyleFeatureAnalysisResponseBodyPayload setOutput(RunStyleFeatureAnalysisResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunStyleFeatureAnalysisResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunStyleFeatureAnalysisResponseBodyPayload setUsage(RunStyleFeatureAnalysisResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunStyleFeatureAnalysisResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
