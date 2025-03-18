// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocWashingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunDocWashingResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocWashingResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocWashingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocWashingResponseBody self = new RunDocWashingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocWashingResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunDocWashingResponseBody setHeader(RunDocWashingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocWashingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocWashingResponseBody setPayload(RunDocWashingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocWashingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocWashingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocWashingResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>task-finished</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>20247a52-23e2-46fb-943d-309cdee2bc6d</p>
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
         * <p>2150451a17191950923411783e2927</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDocWashingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocWashingResponseBodyHeader self = new RunDocWashingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocWashingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocWashingResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocWashingResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunDocWashingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocWashingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocWashingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocWashingResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Text")
        public String text;

        public static RunDocWashingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocWashingResponseBodyPayloadOutput self = new RunDocWashingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocWashingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunDocWashingResponseBodyPayloadUsage extends TeaModel {
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

        public static RunDocWashingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocWashingResponseBodyPayloadUsage self = new RunDocWashingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocWashingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocWashingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocWashingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocWashingResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocWashingResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocWashingResponseBodyPayloadUsage usage;

        public static RunDocWashingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocWashingResponseBodyPayload self = new RunDocWashingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocWashingResponseBodyPayload setOutput(RunDocWashingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocWashingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocWashingResponseBodyPayload setUsage(RunDocWashingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocWashingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
