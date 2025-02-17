// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunCommentGenerationResponseBodyHeader header;

    @NameInMap("Payload")
    public RunCommentGenerationResponseBodyPayload payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCommentGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationResponseBody self = new RunCommentGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunCommentGenerationResponseBody setHeader(RunCommentGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunCommentGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunCommentGenerationResponseBody setPayload(RunCommentGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunCommentGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunCommentGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunCommentGenerationResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
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
         * <p>0bd58ea2-dc38-45da-ac02-17f05cb9040b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunCommentGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyHeader self = new RunCommentGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunCommentGenerationResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunCommentGenerationResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunCommentGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunCommentGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunCommentGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunCommentGenerationResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Text")
        public String text;

        public static RunCommentGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyPayloadOutput self = new RunCommentGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunCommentGenerationResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunCommentGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyPayloadUsage self = new RunCommentGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunCommentGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunCommentGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunCommentGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunCommentGenerationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunCommentGenerationResponseBodyPayloadUsage usage;

        public static RunCommentGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunCommentGenerationResponseBodyPayload self = new RunCommentGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunCommentGenerationResponseBodyPayload setOutput(RunCommentGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunCommentGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunCommentGenerationResponseBodyPayload setUsage(RunCommentGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunCommentGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
