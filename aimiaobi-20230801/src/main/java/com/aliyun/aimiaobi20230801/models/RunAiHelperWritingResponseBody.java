// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunAiHelperWritingResponseBody extends TeaModel {
    /**
     * <p>业务处理结果状态码</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>流式响应的头部信息，包含事件类型、状态码等元数据</p>
     */
    @NameInMap("Header")
    public RunAiHelperWritingResponseBodyHeader header;

    /**
     * <p>HTTP响应状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>业务处理结果描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>包含写作输出内容和Token使用量统计</p>
     */
    @NameInMap("Payload")
    public RunAiHelperWritingResponseBodyPayload payload;

    /**
     * <p>本次API请求的唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否处理成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunAiHelperWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunAiHelperWritingResponseBody self = new RunAiHelperWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunAiHelperWritingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunAiHelperWritingResponseBody setHeader(RunAiHelperWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunAiHelperWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunAiHelperWritingResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunAiHelperWritingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunAiHelperWritingResponseBody setPayload(RunAiHelperWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunAiHelperWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunAiHelperWritingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunAiHelperWritingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunAiHelperWritingResponseBodyHeader extends TeaModel {
        /**
         * <p>请求错误时的错误码</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>请求错误时的详细错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>参数错误</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>SSE事件类型，如：result-generated(生成结果)、task-finished(任务完成)</p>
         * 
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>当前写作会话的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>session-xxxxx</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <p>写作任务的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>用于问题排查的链路追踪标识</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunAiHelperWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunAiHelperWritingResponseBodyHeader self = new RunAiHelperWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunAiHelperWritingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunAiHelperWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunAiHelperWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunAiHelperWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunAiHelperWritingResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunAiHelperWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunAiHelperWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunAiHelperWritingResponseBodyPayloadOutput extends TeaModel {
        /**
         * <p>AI生成的文章内容，流式返回时为增量文本</p>
         * 
         * <strong>example:</strong>
         * <p>人工智能正在深刻改变我们的生活...</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>返回的写作参数键值对</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;wordCount&quot;: &quot;1000&quot;}</p>
         */
        @NameInMap("WritingParams")
        public java.util.Map<String, String> writingParams;

        public static RunAiHelperWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunAiHelperWritingResponseBodyPayloadOutput self = new RunAiHelperWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunAiHelperWritingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunAiHelperWritingResponseBodyPayloadOutput setWritingParams(java.util.Map<String, String> writingParams) {
            this.writingParams = writingParams;
            return this;
        }
        public java.util.Map<String, String> getWritingParams() {
            return this.writingParams;
        }

    }

    public static class RunAiHelperWritingResponseBodyPayloadUsage extends TeaModel {
        /**
         * <p>输入内容消耗的Token数量</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>生成内容消耗的Token数量</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>输入和输出Token的总和</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunAiHelperWritingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunAiHelperWritingResponseBodyPayloadUsage self = new RunAiHelperWritingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunAiHelperWritingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunAiHelperWritingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunAiHelperWritingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunAiHelperWritingResponseBodyPayload extends TeaModel {
        /**
         * <p>AI生成的写作内容</p>
         */
        @NameInMap("Output")
        public RunAiHelperWritingResponseBodyPayloadOutput output;

        /**
         * <p>本次请求的Token消耗统计</p>
         */
        @NameInMap("Usage")
        public RunAiHelperWritingResponseBodyPayloadUsage usage;

        public static RunAiHelperWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunAiHelperWritingResponseBodyPayload self = new RunAiHelperWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunAiHelperWritingResponseBodyPayload setOutput(RunAiHelperWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunAiHelperWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunAiHelperWritingResponseBodyPayload setUsage(RunAiHelperWritingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunAiHelperWritingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
