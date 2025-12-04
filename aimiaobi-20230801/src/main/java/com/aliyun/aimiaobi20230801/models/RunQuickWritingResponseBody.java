// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunQuickWritingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunQuickWritingResponseBodyHeader header;

    @NameInMap("Payload")
    public RunQuickWritingResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunQuickWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunQuickWritingResponseBody self = new RunQuickWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunQuickWritingResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunQuickWritingResponseBody setHeader(RunQuickWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunQuickWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunQuickWritingResponseBody setPayload(RunQuickWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunQuickWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunQuickWritingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunQuickWritingResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>错误码</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>全链路ID</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunQuickWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunQuickWritingResponseBodyHeader self = new RunQuickWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunQuickWritingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunQuickWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunQuickWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunQuickWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunQuickWritingResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunQuickWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunQuickWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunQuickWritingResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>文本生成结果</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunQuickWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunQuickWritingResponseBodyPayloadOutput self = new RunQuickWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunQuickWritingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunQuickWritingResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunQuickWritingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunQuickWritingResponseBodyPayloadUsage self = new RunQuickWritingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunQuickWritingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunQuickWritingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunQuickWritingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunQuickWritingResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunQuickWritingResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunQuickWritingResponseBodyPayloadUsage usage;

        public static RunQuickWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunQuickWritingResponseBodyPayload self = new RunQuickWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunQuickWritingResponseBodyPayload setOutput(RunQuickWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunQuickWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunQuickWritingResponseBodyPayload setUsage(RunQuickWritingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunQuickWritingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
