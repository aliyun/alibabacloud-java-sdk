// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunVideoScriptGenerateResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates a normal response. This field is returned when the \<code>Content-Type\\</code> is \<code>json\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response header.</p>
     */
    @NameInMap("Header")
    public RunVideoScriptGenerateResponseBodyHeader header;

    /**
     * <p>The HTTP status code. This field is returned when the \<code>Content-Type\\</code> is \<code>json\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The error description. This field is returned when the \<code>Content-Type\\</code> is \<code>json\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response body.</p>
     */
    @NameInMap("Payload")
    public RunVideoScriptGenerateResponseBodyPayload payload;

    /**
     * <p>The unique ID of the request. This field is returned when the \<code>Content-Type\\</code> is \<code>json\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success. \<code>false\\</code> indicates failure. This field is returned when the \<code>Content-Type\\</code> is \<code>json\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunVideoScriptGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunVideoScriptGenerateResponseBody self = new RunVideoScriptGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public RunVideoScriptGenerateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunVideoScriptGenerateResponseBody setHeader(RunVideoScriptGenerateResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunVideoScriptGenerateResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunVideoScriptGenerateResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunVideoScriptGenerateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunVideoScriptGenerateResponseBody setPayload(RunVideoScriptGenerateResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunVideoScriptGenerateResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunVideoScriptGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunVideoScriptGenerateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunVideoScriptGenerateResponseBodyHeader extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ScriptNumberExceed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>脚本篇数超限</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>result-generated</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b057f2fa-2277-477b-babf-cbc062307828</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2150451a17191950923411783e2927</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunVideoScriptGenerateResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyHeader self = new RunVideoScriptGenerateResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunVideoScriptGenerateResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunVideoScriptGenerateResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunVideoScriptGenerateResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunVideoScriptGenerateResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunVideoScriptGenerateResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunVideoScriptGenerateResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunVideoScriptGenerateResponseBodyPayloadOutput extends TeaModel {
        /**
         * <p>The text generation result.</p>
         * 
         * <strong>example:</strong>
         * <p>大家好，我是[xxx]。今天带大家走进黄山，感受奇松、怪石、云海、温泉的绝美风光。首站迎客松，800年历史，枝干如臂，热情迎接每一位游客。接着登光明顶，360度全景尽收眼底。再探秘西海大峡谷，体验原始自然的震撼。最后，在温泉中放松身心，享受旅途的美好。希望这次旅行能给你留下难忘的记忆。我是[你的名字]，感谢观看，我们下次再见！&quot;,&quot;91522b25a4f440189320c9ede8ae6c85&quot;:&quot;大家好，我是[您的名字]，今天带大家探索黄山的奇妙之旅。首先，我们将见到黄山的象征——迎客松，感受它800年的历史与欢迎。随后攀登光明顶，迎接壮丽的日出；漫步西海大峡谷，体验险峻之美；最后，在温泉中放松身心。希望这次旅行能让你爱上黄山。谢谢观看！&quot;,&quot;1c23af4a899e4b908bdcffa7d8d0ddc9&quot;:&quot;大家好，欢迎来到黄山！这里以奇松、怪石、云海、温泉四绝闻名。从云谷寺开始，感受古朴氛围；挑战百步云梯，体验攀登乐趣；漫步西海大峡谷，领略壮丽景色；最后在玉屏楼迎接日出，享受心灵的宁静。希望这次旅行给你留下美好回忆！</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunVideoScriptGenerateResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyPayloadOutput self = new RunVideoScriptGenerateResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunVideoScriptGenerateResponseBodyPayloadUsage extends TeaModel {
        /**
         * <p>The number of tokens used for the input.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The number of tokens for the output.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunVideoScriptGenerateResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyPayloadUsage self = new RunVideoScriptGenerateResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunVideoScriptGenerateResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunVideoScriptGenerateResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunVideoScriptGenerateResponseBodyPayload extends TeaModel {
        /**
         * <p>The output content object.</p>
         */
        @NameInMap("Output")
        public RunVideoScriptGenerateResponseBodyPayloadOutput output;

        /**
         * <p>The token usage.</p>
         */
        @NameInMap("Usage")
        public RunVideoScriptGenerateResponseBodyPayloadUsage usage;

        public static RunVideoScriptGenerateResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunVideoScriptGenerateResponseBodyPayload self = new RunVideoScriptGenerateResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunVideoScriptGenerateResponseBodyPayload setOutput(RunVideoScriptGenerateResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunVideoScriptGenerateResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunVideoScriptGenerateResponseBodyPayload setUsage(RunVideoScriptGenerateResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunVideoScriptGenerateResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
