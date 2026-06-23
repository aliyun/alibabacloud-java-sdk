// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunChatResultGenerationResponseBody extends TeaModel {
    /**
     * <p>Details of the model-generated content.</p>
     */
    @NameInMap("choices")
    public java.util.List<RunChatResultGenerationResponseBodyChoices> choices;

    /**
     * <p>Creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1720602203</p>
     */
    @NameInMap("created")
    public Long created;

    /**
     * <p>Request identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>eb2b6139-ddf1-91a0-a47f-df7617ae9032</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Large Language Model (LLM) ID.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eb2b6139-ddf1-91a0-a47f-df7617ae9032</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    /**
     * <p>Total tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("totalTokens")
    public Integer totalTokens;

    /**
     * <p>Usage.</p>
     */
    @NameInMap("usage")
    public RunChatResultGenerationResponseBodyUsage usage;

    public static RunChatResultGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunChatResultGenerationResponseBody self = new RunChatResultGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunChatResultGenerationResponseBody setChoices(java.util.List<RunChatResultGenerationResponseBodyChoices> choices) {
        this.choices = choices;
        return this;
    }
    public java.util.List<RunChatResultGenerationResponseBodyChoices> getChoices() {
        return this.choices;
    }

    public RunChatResultGenerationResponseBody setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public RunChatResultGenerationResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RunChatResultGenerationResponseBody setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunChatResultGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunChatResultGenerationResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public RunChatResultGenerationResponseBody setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    public RunChatResultGenerationResponseBody setUsage(RunChatResultGenerationResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public RunChatResultGenerationResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class RunChatResultGenerationResponseBodyChoicesMessage extends TeaModel {
        /**
         * <p>Message content.</p>
         * 
         * <strong>example:</strong>
         * <p>你是谁</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>List of tool calls.</p>
         */
        @NameInMap("toolCalls")
        public java.util.List<java.util.Map<String, ?>> toolCalls;

        public static RunChatResultGenerationResponseBodyChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationResponseBodyChoicesMessage self = new RunChatResultGenerationResponseBodyChoicesMessage();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationResponseBodyChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunChatResultGenerationResponseBodyChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public RunChatResultGenerationResponseBodyChoicesMessage setToolCalls(java.util.List<java.util.Map<String, ?>> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class RunChatResultGenerationResponseBodyChoices extends TeaModel {
        /**
         * <p>Three possible values:</p>
         * <ul>
         * <li><p>null while generating;</p>
         * </li>
         * <li><p>&quot;stop&quot; if generation ends due to a stop condition in the input parameters;</p>
         * </li>
         * <li><p>&quot;length&quot; if generation ends because the output is too long.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <p>Sequence number of the generated result. Default is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>Chat message.</p>
         */
        @NameInMap("message")
        public RunChatResultGenerationResponseBodyChoicesMessage message;

        public static RunChatResultGenerationResponseBodyChoices build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationResponseBodyChoices self = new RunChatResultGenerationResponseBodyChoices();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationResponseBodyChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public RunChatResultGenerationResponseBodyChoices setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RunChatResultGenerationResponseBodyChoices setMessage(RunChatResultGenerationResponseBodyChoicesMessage message) {
            this.message = message;
            return this;
        }
        public RunChatResultGenerationResponseBodyChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class RunChatResultGenerationResponseBodyUsage extends TeaModel {
        /**
         * <p>Number of images. Returned by models such as wanx.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("imageCount")
        public Integer imageCount;

        /**
         * <p>Image tokens. Returned by models such as qwen-vl.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("imageTokens")
        public Integer imageTokens;

        /**
         * <p>Input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("inputTokens")
        public Integer inputTokens;

        /**
         * <p>Output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("outputTokens")
        public Integer outputTokens;

        /**
         * <p>Total tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("totalTokens")
        public Integer totalTokens;

        public static RunChatResultGenerationResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationResponseBodyUsage self = new RunChatResultGenerationResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationResponseBodyUsage setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public RunChatResultGenerationResponseBodyUsage setImageTokens(Integer imageTokens) {
            this.imageTokens = imageTokens;
            return this;
        }
        public Integer getImageTokens() {
            return this.imageTokens;
        }

        public RunChatResultGenerationResponseBodyUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public RunChatResultGenerationResponseBodyUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public RunChatResultGenerationResponseBodyUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

}
