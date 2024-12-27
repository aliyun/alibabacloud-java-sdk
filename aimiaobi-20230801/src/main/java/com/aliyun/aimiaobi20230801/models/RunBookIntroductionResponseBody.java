// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookIntroductionResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunBookIntroductionResponseBodyHeader header;

    @NameInMap("Payload")
    public RunBookIntroductionResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunBookIntroductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunBookIntroductionResponseBody self = new RunBookIntroductionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunBookIntroductionResponseBody setHeader(RunBookIntroductionResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunBookIntroductionResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunBookIntroductionResponseBody setPayload(RunBookIntroductionResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunBookIntroductionResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunBookIntroductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunBookIntroductionResponseBodyHeader extends TeaModel {
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
         * <p>411c4dfa-2168-4379-a902-675d67f453f8</p>
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
         * <p>46e5c2b5-0877-4f09-bd91-ab0cf314e48b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunBookIntroductionResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunBookIntroductionResponseBodyHeader self = new RunBookIntroductionResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunBookIntroductionResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunBookIntroductionResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunBookIntroductionResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunBookIntroductionResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunBookIntroductionResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunBookIntroductionResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunBookIntroductionResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunBookIntroductionResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("KeyPoint")
        public String keyPoint;

        @NameInMap("Summary")
        public String summary;

        public static RunBookIntroductionResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunBookIntroductionResponseBodyPayloadOutput self = new RunBookIntroductionResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunBookIntroductionResponseBodyPayloadOutput setKeyPoint(String keyPoint) {
            this.keyPoint = keyPoint;
            return this;
        }
        public String getKeyPoint() {
            return this.keyPoint;
        }

        public RunBookIntroductionResponseBodyPayloadOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class RunBookIntroductionResponseBodyPayloadUsage extends TeaModel {
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

        public static RunBookIntroductionResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunBookIntroductionResponseBodyPayloadUsage self = new RunBookIntroductionResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunBookIntroductionResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunBookIntroductionResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunBookIntroductionResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunBookIntroductionResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunBookIntroductionResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunBookIntroductionResponseBodyPayloadUsage usage;

        public static RunBookIntroductionResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunBookIntroductionResponseBodyPayload self = new RunBookIntroductionResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunBookIntroductionResponseBodyPayload setOutput(RunBookIntroductionResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunBookIntroductionResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunBookIntroductionResponseBodyPayload setUsage(RunBookIntroductionResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunBookIntroductionResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
