// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunMultiDocIntroductionResponseBody extends TeaModel {
    /**
     * <p>Response header.</p>
     */
    @NameInMap("Header")
    public RunMultiDocIntroductionResponseBodyHeader header;

    /**
     * <p>Response body.</p>
     */
    @NameInMap("Payload")
    public RunMultiDocIntroductionResponseBodyPayload payload;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunMultiDocIntroductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunMultiDocIntroductionResponseBody self = new RunMultiDocIntroductionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunMultiDocIntroductionResponseBody setHeader(RunMultiDocIntroductionResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunMultiDocIntroductionResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunMultiDocIntroductionResponseBody setPayload(RunMultiDocIntroductionResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunMultiDocIntroductionResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunMultiDocIntroductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunMultiDocIntroductionResponseBodyHeader extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Message does not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Server-sent event (SSE) type.</p>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>Event description.</p>
         * 
         * <strong>example:</strong>
         * <p>模型生成事件</p>
         */
        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <p>Session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>92e16ccb-92b6-4894-abbf-fc6e2929a0df</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b057f2fa-2277-477b-babf-cbc062307828</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>End-to-end trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46e5c2b5-0877-4f09-bd91-ab0cf314e48b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunMultiDocIntroductionResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunMultiDocIntroductionResponseBodyHeader self = new RunMultiDocIntroductionResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunMultiDocIntroductionResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunMultiDocIntroductionResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunMultiDocIntroductionResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunMultiDocIntroductionResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunMultiDocIntroductionResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunMultiDocIntroductionResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunMultiDocIntroductionResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints extends TeaModel {
        /**
         * <p>Key point.</p>
         * 
         * <strong>example:</strong>
         * <p>关键点信息</p>
         */
        @NameInMap("KeyPoint")
        public String keyPoint;

        /**
         * <p>Source of the information.</p>
         * 
         * <strong>example:</strong>
         * <p>信息来源</p>
         */
        @NameInMap("Source")
        public String source;

        public static RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints build(java.util.Map<String, ?> map) throws Exception {
            RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints self = new RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints();
            return TeaModel.build(map, self);
        }

        public RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints setKeyPoint(String keyPoint) {
            this.keyPoint = keyPoint;
            return this;
        }
        public String getKeyPoint() {
            return this.keyPoint;
        }

        public RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class RunMultiDocIntroductionResponseBodyPayloadOutput extends TeaModel {
        /**
         * <p>Key point information.</p>
         */
        @NameInMap("KeyPoints")
        public java.util.List<RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints> keyPoints;

        /**
         * <p>Outline-style summary.</p>
         * 
         * <strong>example:</strong>
         * <p>大纲摘要内容</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static RunMultiDocIntroductionResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunMultiDocIntroductionResponseBodyPayloadOutput self = new RunMultiDocIntroductionResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunMultiDocIntroductionResponseBodyPayloadOutput setKeyPoints(java.util.List<RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints> keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }
        public java.util.List<RunMultiDocIntroductionResponseBodyPayloadOutputKeyPoints> getKeyPoints() {
            return this.keyPoints;
        }

        public RunMultiDocIntroductionResponseBodyPayloadOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class RunMultiDocIntroductionResponseBodyPayloadUsage extends TeaModel {
        /**
         * <p>Number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>Number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>Total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunMultiDocIntroductionResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunMultiDocIntroductionResponseBodyPayloadUsage self = new RunMultiDocIntroductionResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunMultiDocIntroductionResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunMultiDocIntroductionResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunMultiDocIntroductionResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunMultiDocIntroductionResponseBodyPayload extends TeaModel {
        /**
         * <p>Output data.</p>
         */
        @NameInMap("Output")
        public RunMultiDocIntroductionResponseBodyPayloadOutput output;

        /**
         * <p>Token usage.</p>
         */
        @NameInMap("Usage")
        public RunMultiDocIntroductionResponseBodyPayloadUsage usage;

        public static RunMultiDocIntroductionResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunMultiDocIntroductionResponseBodyPayload self = new RunMultiDocIntroductionResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunMultiDocIntroductionResponseBodyPayload setOutput(RunMultiDocIntroductionResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunMultiDocIntroductionResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunMultiDocIntroductionResponseBodyPayload setUsage(RunMultiDocIntroductionResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunMultiDocIntroductionResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
