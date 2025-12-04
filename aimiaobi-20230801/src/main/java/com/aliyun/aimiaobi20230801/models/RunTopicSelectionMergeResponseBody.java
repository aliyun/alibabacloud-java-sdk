// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTopicSelectionMergeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunTopicSelectionMergeResponseBodyHeader header;

    @NameInMap("Payload")
    public RunTopicSelectionMergeResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunTopicSelectionMergeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTopicSelectionMergeResponseBody self = new RunTopicSelectionMergeResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTopicSelectionMergeResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunTopicSelectionMergeResponseBody setHeader(RunTopicSelectionMergeResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunTopicSelectionMergeResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunTopicSelectionMergeResponseBody setPayload(RunTopicSelectionMergeResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunTopicSelectionMergeResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunTopicSelectionMergeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunTopicSelectionMergeResponseBodyHeader extends TeaModel {
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
        @NameInMap("OriginSessionId")
        public String originSessionId;

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

        public static RunTopicSelectionMergeResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunTopicSelectionMergeResponseBodyHeader self = new RunTopicSelectionMergeResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunTopicSelectionMergeResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunTopicSelectionMergeResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunTopicSelectionMergeResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunTopicSelectionMergeResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunTopicSelectionMergeResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunTopicSelectionMergeResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunTopicSelectionMergeResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunTopicSelectionMergeResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunTopicSelectionMergeResponseBodyPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>文本生成结果</p>
         */
        @NameInMap("Text")
        public String text;

        @NameInMap("Topic")
        public TopicSelection topic;

        public static RunTopicSelectionMergeResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunTopicSelectionMergeResponseBodyPayloadOutput self = new RunTopicSelectionMergeResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunTopicSelectionMergeResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunTopicSelectionMergeResponseBodyPayloadOutput setTopic(TopicSelection topic) {
            this.topic = topic;
            return this;
        }
        public TopicSelection getTopic() {
            return this.topic;
        }

    }

    public static class RunTopicSelectionMergeResponseBodyPayloadUsage extends TeaModel {
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

        @NameInMap("TokenMap")
        public java.util.Map<String, Long> tokenMap;

        /**
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunTopicSelectionMergeResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunTopicSelectionMergeResponseBodyPayloadUsage self = new RunTopicSelectionMergeResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunTopicSelectionMergeResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunTopicSelectionMergeResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunTopicSelectionMergeResponseBodyPayloadUsage setTokenMap(java.util.Map<String, Long> tokenMap) {
            this.tokenMap = tokenMap;
            return this;
        }
        public java.util.Map<String, Long> getTokenMap() {
            return this.tokenMap;
        }

        public RunTopicSelectionMergeResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunTopicSelectionMergeResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunTopicSelectionMergeResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunTopicSelectionMergeResponseBodyPayloadUsage usage;

        public static RunTopicSelectionMergeResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunTopicSelectionMergeResponseBodyPayload self = new RunTopicSelectionMergeResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunTopicSelectionMergeResponseBodyPayload setOutput(RunTopicSelectionMergeResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunTopicSelectionMergeResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunTopicSelectionMergeResponseBodyPayload setUsage(RunTopicSelectionMergeResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunTopicSelectionMergeResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
