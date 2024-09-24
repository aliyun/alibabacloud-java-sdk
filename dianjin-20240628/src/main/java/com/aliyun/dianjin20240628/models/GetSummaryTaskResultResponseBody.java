// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetSummaryTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetSummaryTaskResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0bc13a9517168617617186457e401f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetSummaryTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryTaskResultResponseBody self = new GetSummaryTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSummaryTaskResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetSummaryTaskResultResponseBody setData(GetSummaryTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSummaryTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetSummaryTaskResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetSummaryTaskResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetSummaryTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSummaryTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSummaryTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSummaryTaskResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetSummaryTaskResultResponseBodyDataChoicesMessage extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        @NameInMap("toolCalls")
        public java.util.List<java.util.Map<String, ?>> toolCalls;

        public static GetSummaryTaskResultResponseBodyDataChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryTaskResultResponseBodyDataChoicesMessage self = new GetSummaryTaskResultResponseBodyDataChoicesMessage();
            return TeaModel.build(map, self);
        }

        public GetSummaryTaskResultResponseBodyDataChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSummaryTaskResultResponseBodyDataChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetSummaryTaskResultResponseBodyDataChoicesMessage setToolCalls(java.util.List<java.util.Map<String, ?>> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class GetSummaryTaskResultResponseBodyDataChoices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("message")
        public GetSummaryTaskResultResponseBodyDataChoicesMessage message;

        public static GetSummaryTaskResultResponseBodyDataChoices build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryTaskResultResponseBodyDataChoices self = new GetSummaryTaskResultResponseBodyDataChoices();
            return TeaModel.build(map, self);
        }

        public GetSummaryTaskResultResponseBodyDataChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public GetSummaryTaskResultResponseBodyDataChoices setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetSummaryTaskResultResponseBodyDataChoices setMessage(GetSummaryTaskResultResponseBodyDataChoicesMessage message) {
            this.message = message;
            return this;
        }
        public GetSummaryTaskResultResponseBodyDataChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class GetSummaryTaskResultResponseBodyDataUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("imageCount")
        public Integer imageCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("imageTokens")
        public Integer imageTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("inputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("outputTokens")
        public Integer outputTokens;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("totalTokens")
        public Integer totalTokens;

        public static GetSummaryTaskResultResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryTaskResultResponseBodyDataUsage self = new GetSummaryTaskResultResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public GetSummaryTaskResultResponseBodyDataUsage setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

        public GetSummaryTaskResultResponseBodyDataUsage setImageTokens(Integer imageTokens) {
            this.imageTokens = imageTokens;
            return this;
        }
        public Integer getImageTokens() {
            return this.imageTokens;
        }

        public GetSummaryTaskResultResponseBodyDataUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public GetSummaryTaskResultResponseBodyDataUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public GetSummaryTaskResultResponseBodyDataUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetSummaryTaskResultResponseBodyData extends TeaModel {
        @NameInMap("choices")
        public java.util.List<GetSummaryTaskResultResponseBodyDataChoices> choices;

        /**
         * <strong>example:</strong>
         * <p>1726285125915</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <strong>example:</strong>
         * <p>1202</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>0bc13a9517168617617186457e401f</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("totalTokens")
        public Integer totalTokens;

        @NameInMap("usage")
        public GetSummaryTaskResultResponseBodyDataUsage usage;

        public static GetSummaryTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryTaskResultResponseBodyData self = new GetSummaryTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSummaryTaskResultResponseBodyData setChoices(java.util.List<GetSummaryTaskResultResponseBodyDataChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<GetSummaryTaskResultResponseBodyDataChoices> getChoices() {
            return this.choices;
        }

        public GetSummaryTaskResultResponseBodyData setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetSummaryTaskResultResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSummaryTaskResultResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetSummaryTaskResultResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetSummaryTaskResultResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetSummaryTaskResultResponseBodyData setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public GetSummaryTaskResultResponseBodyData setUsage(GetSummaryTaskResultResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetSummaryTaskResultResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
