// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class LlmStreamChatResponseBody extends TeaModel {
    /**
     * <p>List of model generation results</p>
     */
    @NameInMap("Choices")
    public java.util.List<LlmStreamChatResponseBodyChoices> choices;

    /**
     * <p>Timestamp of session creation</p>
     * 
     * <strong>example:</strong>
     * <p>1750990728</p>
     */
    @NameInMap("Created")
    public Long created;

    /**
     * <p>Streaming response error information content</p>
     */
    @NameInMap("Error")
    public LlmStreamChatResponseBodyError error;

    /**
     * <p>Unique ID for this session</p>
     * 
     * <strong>example:</strong>
     * <p>chatcmpl-777bce52-93d3-9f8c-89c3-e99884f4f57f</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Model identifier</p>
     * 
     * <strong>example:</strong>
     * <p>deepseek-v3</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Response type</p>
     * 
     * <strong>example:</strong>
     * <p>chat.completion.chunk</p>
     */
    @NameInMap("Object")
    public String object;

    /**
     * <p>Unique request ID</p>
     * 
     * <strong>example:</strong>
     * <p>21d296d6-594e-97de-812f-925ec6e05673</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>System fingerprint</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("SystemFingerprint")
    public String systemFingerprint;

    /**
     * <p>Token usage</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static LlmStreamChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LlmStreamChatResponseBody self = new LlmStreamChatResponseBody();
        return TeaModel.build(map, self);
    }

    public LlmStreamChatResponseBody setChoices(java.util.List<LlmStreamChatResponseBodyChoices> choices) {
        this.choices = choices;
        return this;
    }
    public java.util.List<LlmStreamChatResponseBodyChoices> getChoices() {
        return this.choices;
    }

    public LlmStreamChatResponseBody setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public LlmStreamChatResponseBody setError(LlmStreamChatResponseBodyError error) {
        this.error = error;
        return this;
    }
    public LlmStreamChatResponseBodyError getError() {
        return this.error;
    }

    public LlmStreamChatResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LlmStreamChatResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public LlmStreamChatResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public LlmStreamChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LlmStreamChatResponseBody setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
        return this;
    }
    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }

    public LlmStreamChatResponseBody setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public static class LlmStreamChatResponseBodyChoicesDelta extends TeaModel {
        /**
         * <p>Real-time generated text content</p>
         * 
         * <strong>example:</strong>
         * <p>我是Deepseek-V3，有什么可以帮你</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Role identifier</p>
         * 
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("Role")
        public String role;

        public static LlmStreamChatResponseBodyChoicesDelta build(java.util.Map<String, ?> map) throws Exception {
            LlmStreamChatResponseBodyChoicesDelta self = new LlmStreamChatResponseBodyChoicesDelta();
            return TeaModel.build(map, self);
        }

        public LlmStreamChatResponseBodyChoicesDelta setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public LlmStreamChatResponseBodyChoicesDelta setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class LlmStreamChatResponseBodyChoices extends TeaModel {
        /**
         * <p>Incremental content object</p>
         */
        @NameInMap("Delta")
        public LlmStreamChatResponseBodyChoicesDelta delta;

        /**
         * <p>For streaming output, it is null while generating and becomes \&quot;stop\&quot; if the generation ends due to a stop token.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>Stream sequence number</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>Token probability information</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Logprobs")
        public String logprobs;

        public static LlmStreamChatResponseBodyChoices build(java.util.Map<String, ?> map) throws Exception {
            LlmStreamChatResponseBodyChoices self = new LlmStreamChatResponseBodyChoices();
            return TeaModel.build(map, self);
        }

        public LlmStreamChatResponseBodyChoices setDelta(LlmStreamChatResponseBodyChoicesDelta delta) {
            this.delta = delta;
            return this;
        }
        public LlmStreamChatResponseBodyChoicesDelta getDelta() {
            return this.delta;
        }

        public LlmStreamChatResponseBodyChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public LlmStreamChatResponseBodyChoices setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public LlmStreamChatResponseBodyChoices setLogprobs(String logprobs) {
            this.logprobs = logprobs;
            return this;
        }
        public String getLogprobs() {
            return this.logprobs;
        }

    }

    public static class LlmStreamChatResponseBodyError extends TeaModel {
        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>data_inspection_failed</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Input data may contain inappropriate content.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Parameter that caused the error</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Param")
        public String param;

        /**
         * <p>Error type</p>
         * 
         * <strong>example:</strong>
         * <p>data_inspection_failed</p>
         */
        @NameInMap("Type")
        public String type;

        public static LlmStreamChatResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            LlmStreamChatResponseBodyError self = new LlmStreamChatResponseBodyError();
            return TeaModel.build(map, self);
        }

        public LlmStreamChatResponseBodyError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public LlmStreamChatResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public LlmStreamChatResponseBodyError setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public LlmStreamChatResponseBodyError setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
