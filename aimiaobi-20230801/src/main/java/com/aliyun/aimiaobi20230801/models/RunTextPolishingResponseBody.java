// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTextPolishingResponseBody extends TeaModel {
    /**
     * <p>Response header.</p>
     */
    @NameInMap("Header")
    public RunTextPolishingResponseBodyHeader header;

    /**
     * <p>Response body.</p>
     */
    @NameInMap("Payload")
    public RunTextPolishingResponseBodyPayload payload;

    /**
     * <p>Unique request identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunTextPolishingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTextPolishingResponseBody self = new RunTextPolishingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTextPolishingResponseBody setHeader(RunTextPolishingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunTextPolishingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunTextPolishingResponseBody setPayload(RunTextPolishingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunTextPolishingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunTextPolishingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunTextPolishingResponseBodyHeader extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>错误码</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The SSE event. \<code>task-started\\</code>: started. \<code>task-finished\\</code>: finished. \<code>task-failed\\</code>: failed.</p>
         * 
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>Parent session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("OriginSessionId")
        public String originSessionId;

        /**
         * <p>Session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>End-to-end trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>全链路ID</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunTextPolishingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunTextPolishingResponseBodyHeader self = new RunTextPolishingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunTextPolishingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunTextPolishingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunTextPolishingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunTextPolishingResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunTextPolishingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunTextPolishingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunTextPolishingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunTextPolishingResponseBodyPayloadOutput extends TeaModel {
        /**
         * <p>Text generation result.</p>
         * 
         * <strong>example:</strong>
         * <p>文本生成结果</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunTextPolishingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunTextPolishingResponseBodyPayloadOutput self = new RunTextPolishingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunTextPolishingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunTextPolishingResponseBodyPayloadUsage extends TeaModel {
        /**
         * <p>Number of tokens used for input.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>Number of tokens used for output.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>Total number of tokens used for this call.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunTextPolishingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunTextPolishingResponseBodyPayloadUsage self = new RunTextPolishingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunTextPolishingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunTextPolishingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunTextPolishingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunTextPolishingResponseBodyPayload extends TeaModel {
        /**
         * <p>Output.</p>
         */
        @NameInMap("Output")
        public RunTextPolishingResponseBodyPayloadOutput output;

        /**
         * <p>Token consumption.</p>
         */
        @NameInMap("Usage")
        public RunTextPolishingResponseBodyPayloadUsage usage;

        public static RunTextPolishingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunTextPolishingResponseBodyPayload self = new RunTextPolishingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunTextPolishingResponseBodyPayload setOutput(RunTextPolishingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunTextPolishingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunTextPolishingResponseBodyPayload setUsage(RunTextPolishingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunTextPolishingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
