// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunHotwordResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunHotwordResponseBodyHeader header;

    @NameInMap("Payload")
    public RunHotwordResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunHotwordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunHotwordResponseBody self = new RunHotwordResponseBody();
        return TeaModel.build(map, self);
    }

    public RunHotwordResponseBody setHeader(RunHotwordResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunHotwordResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunHotwordResponseBody setPayload(RunHotwordResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunHotwordResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunHotwordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunHotwordResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>92e16ccb-92b6-4894-abbf-fc6e2929a0df</p>
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
         * <p>0abb7e3217356108993888059ee72b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunHotwordResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunHotwordResponseBodyHeader self = new RunHotwordResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunHotwordResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunHotwordResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunHotwordResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunHotwordResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunHotwordResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunHotwordResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunHotwordResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunHotwordResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        public static RunHotwordResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunHotwordResponseBodyPayloadOutput self = new RunHotwordResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunHotwordResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RunHotwordResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunHotwordResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunHotwordResponseBodyPayloadUsage self = new RunHotwordResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunHotwordResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunHotwordResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunHotwordResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunHotwordResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunHotwordResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunHotwordResponseBodyPayloadUsage usage;

        public static RunHotwordResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunHotwordResponseBodyPayload self = new RunHotwordResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunHotwordResponseBodyPayload setOutput(RunHotwordResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunHotwordResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunHotwordResponseBodyPayload setUsage(RunHotwordResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunHotwordResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
