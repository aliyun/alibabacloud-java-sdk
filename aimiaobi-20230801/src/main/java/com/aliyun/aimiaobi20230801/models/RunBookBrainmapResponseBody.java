// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookBrainmapResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunBookBrainmapResponseBodyHeader header;

    @NameInMap("Payload")
    public RunBookBrainmapResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunBookBrainmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunBookBrainmapResponseBody self = new RunBookBrainmapResponseBody();
        return TeaModel.build(map, self);
    }

    public RunBookBrainmapResponseBody setHeader(RunBookBrainmapResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunBookBrainmapResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunBookBrainmapResponseBody setPayload(RunBookBrainmapResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunBookBrainmapResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunBookBrainmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunBookBrainmapResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Success</p>
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
         * <p>3cd10828-0e42-471c-8f1a-931cde20b035</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>0bc1409b17210096103458421ec62e</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunBookBrainmapResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunBookBrainmapResponseBodyHeader self = new RunBookBrainmapResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunBookBrainmapResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunBookBrainmapResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunBookBrainmapResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunBookBrainmapResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunBookBrainmapResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunBookBrainmapResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunBookBrainmapResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunBookBrainmapResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;xxxx&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        public static RunBookBrainmapResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunBookBrainmapResponseBodyPayloadOutput self = new RunBookBrainmapResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunBookBrainmapResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RunBookBrainmapResponseBodyPayloadUsage extends TeaModel {
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

        public static RunBookBrainmapResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunBookBrainmapResponseBodyPayloadUsage self = new RunBookBrainmapResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunBookBrainmapResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunBookBrainmapResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunBookBrainmapResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunBookBrainmapResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunBookBrainmapResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunBookBrainmapResponseBodyPayloadUsage usage;

        public static RunBookBrainmapResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunBookBrainmapResponseBodyPayload self = new RunBookBrainmapResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunBookBrainmapResponseBodyPayload setOutput(RunBookBrainmapResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunBookBrainmapResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunBookBrainmapResponseBodyPayload setUsage(RunBookBrainmapResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunBookBrainmapResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
