// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelCardsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListAiModelCardsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAiModelCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelCardsResponseBody self = new ListAiModelCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiModelCardsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAiModelCardsResponseBody setData(ListAiModelCardsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAiModelCardsResponseBodyData getData() {
        return this.data;
    }

    public ListAiModelCardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAiModelCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAiModelCardsResponseBodyDataItemsAvailablePaths extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>OpenAICompatible</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAiModelCardsResponseBodyDataItemsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            ListAiModelCardsResponseBodyDataItemsAvailablePaths self = new ListAiModelCardsResponseBodyDataItemsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public ListAiModelCardsResponseBodyDataItemsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListAiModelCardsResponseBodyDataItemsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAiModelCardsResponseBodyDataItemsCredit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAiModelCardsResponseBodyDataItemsCredit build(java.util.Map<String, ?> map) throws Exception {
            ListAiModelCardsResponseBodyDataItemsCredit self = new ListAiModelCardsResponseBodyDataItemsCredit();
            return TeaModel.build(map, self);
        }

        public ListAiModelCardsResponseBodyDataItemsCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public ListAiModelCardsResponseBodyDataItemsCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public ListAiModelCardsResponseBodyDataItemsCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public ListAiModelCardsResponseBodyDataItemsCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAiModelCardsResponseBodyDataItemsMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static ListAiModelCardsResponseBodyDataItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            ListAiModelCardsResponseBodyDataItemsMeta self = new ListAiModelCardsResponseBodyDataItemsMeta();
            return TeaModel.build(map, self);
        }

        public ListAiModelCardsResponseBodyDataItemsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public ListAiModelCardsResponseBodyDataItemsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public ListAiModelCardsResponseBodyDataItemsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public ListAiModelCardsResponseBodyDataItemsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public ListAiModelCardsResponseBodyDataItemsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class ListAiModelCardsResponseBodyDataItems extends TeaModel {
        @NameInMap("availablePaths")
        public java.util.List<ListAiModelCardsResponseBodyDataItemsAvailablePaths> availablePaths;

        @NameInMap("credit")
        public ListAiModelCardsResponseBodyDataItemsCredit credit;

        /**
         * <strong>example:</strong>
         * <p>{&quot;functionCalling&quot;:true,&quot;toolChoice&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
         * <strong>example:</strong>
         * <p>gw-8c13d2b4f8a1</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("meta")
        public ListAiModelCardsResponseBodyDataItemsMeta meta;

        /**
         * <strong>example:</strong>
         * <p>mc-8c13d2b4f8a1</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("modelProvider")
        public String modelProvider;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p><a href="http://https://dashscope-intl.aliyuncs.com">http://https://dashscope-intl.aliyuncs.com</a></p>
         */
        @NameInMap("sourceURL")
        public String sourceURL;

        /**
         * <strong>example:</strong>
         * <p>2026-07-14 18:30:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListAiModelCardsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAiModelCardsResponseBodyDataItems self = new ListAiModelCardsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAiModelCardsResponseBodyDataItems setAvailablePaths(java.util.List<ListAiModelCardsResponseBodyDataItemsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<ListAiModelCardsResponseBodyDataItemsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public ListAiModelCardsResponseBodyDataItems setCredit(ListAiModelCardsResponseBodyDataItemsCredit credit) {
            this.credit = credit;
            return this;
        }
        public ListAiModelCardsResponseBodyDataItemsCredit getCredit() {
            return this.credit;
        }

        public ListAiModelCardsResponseBodyDataItems setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public ListAiModelCardsResponseBodyDataItems setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListAiModelCardsResponseBodyDataItems setMeta(ListAiModelCardsResponseBodyDataItemsMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListAiModelCardsResponseBodyDataItemsMeta getMeta() {
            return this.meta;
        }

        public ListAiModelCardsResponseBodyDataItems setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public ListAiModelCardsResponseBodyDataItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListAiModelCardsResponseBodyDataItems setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public ListAiModelCardsResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAiModelCardsResponseBodyDataItems setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }
        public String getSourceURL() {
            return this.sourceURL;
        }

        public ListAiModelCardsResponseBodyDataItems setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListAiModelCardsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListAiModelCardsResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListAiModelCardsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAiModelCardsResponseBodyData self = new ListAiModelCardsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAiModelCardsResponseBodyData setItems(java.util.List<ListAiModelCardsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAiModelCardsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListAiModelCardsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAiModelCardsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAiModelCardsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
