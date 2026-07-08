// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetHotTopicBroadcastRequest extends TeaModel {
    /**
     * <p>Whether to compute the total token count</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CalcTotalToken")
    public Boolean calcTotalToken;

    /**
     * <p>categorization Filter</p>
     * 
     * <strong>example:</strong>
     * <p>分类筛选</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>hot spot Version</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-11_13</p>
     */
    @NameInMap("HotTopicVersion")
    public String hotTopicVersion;

    /**
     * <p>Full-text index for hot spot Regions (when this parameter is present, current does not take effect)</p>
     * 
     * <strong>example:</strong>
     * <p>重庆 成都 浙江 杭州</p>
     */
    @NameInMap("LocationQuery")
    public String locationQuery;

    /**
     * <p>List of Regions for news retrieval (keyword filtering)</p>
     */
    @NameInMap("Locations")
    public java.util.List<String> locations;

    /**
     * <p>Full-text index (full-text retrieval for title, hot spot summary, and Region) (when this parameter is present, current does not take effect)</p>
     * 
     * <strong>example:</strong>
     * <p>重庆新闻</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Custom output style configuration</p>
     */
    @NameInMap("StepForCustomSummaryStyleConfig")
    public GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

    /**
     * <p>Hot Spot News Broadcast Content Configuration</p>
     */
    @NameInMap("StepForNewsBroadcastContentConfig")
    public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig;

    /**
     * <p>topic Filter</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;主题1&quot;,&quot;主题2&quot;]</p>
     */
    @NameInMap("Topics")
    public java.util.List<String> topics;

    /**
     * <p>UUID of the Alibaba Cloud Model Studio workspace: obtain the <a href="https://help.aliyun.com/document_detail/2587495.html">Workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetHotTopicBroadcastRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotTopicBroadcastRequest self = new GetHotTopicBroadcastRequest();
        return TeaModel.build(map, self);
    }

    public GetHotTopicBroadcastRequest setCalcTotalToken(Boolean calcTotalToken) {
        this.calcTotalToken = calcTotalToken;
        return this;
    }
    public Boolean getCalcTotalToken() {
        return this.calcTotalToken;
    }

    public GetHotTopicBroadcastRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetHotTopicBroadcastRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public GetHotTopicBroadcastRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public GetHotTopicBroadcastRequest setLocationQuery(String locationQuery) {
        this.locationQuery = locationQuery;
        return this;
    }
    public String getLocationQuery() {
        return this.locationQuery;
    }

    public GetHotTopicBroadcastRequest setLocations(java.util.List<String> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<String> getLocations() {
        return this.locations;
    }

    public GetHotTopicBroadcastRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetHotTopicBroadcastRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetHotTopicBroadcastRequest setStepForCustomSummaryStyleConfig(GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig) {
        this.stepForCustomSummaryStyleConfig = stepForCustomSummaryStyleConfig;
        return this;
    }
    public GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig getStepForCustomSummaryStyleConfig() {
        return this.stepForCustomSummaryStyleConfig;
    }

    public GetHotTopicBroadcastRequest setStepForNewsBroadcastContentConfig(GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig) {
        this.stepForNewsBroadcastContentConfig = stepForNewsBroadcastContentConfig;
        return this;
    }
    public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig getStepForNewsBroadcastContentConfig() {
        return this.stepForNewsBroadcastContentConfig;
    }

    public GetHotTopicBroadcastRequest setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public GetHotTopicBroadcastRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig extends TeaModel {
        /**
         * <p>Summary – number of images</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("SummaryImageCount")
        public Integer summaryImageCount;

        /**
         * <p>Summary model</p>
         * 
         * <strong>example:</strong>
         * <p>摘要模型</p>
         */
        @NameInMap("SummaryModel")
        public String summaryModel;

        /**
         * <p>Summary - Custom Prompt</p>
         * 
         * <strong>example:</strong>
         * <p>摘要-自定义Prompt</p>
         */
        @NameInMap("SummaryPrompt")
        public String summaryPrompt;

        public static GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig self = new GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig setSummaryImageCount(Integer summaryImageCount) {
            this.summaryImageCount = summaryImageCount;
            return this;
        }
        public Integer getSummaryImageCount() {
            return this.summaryImageCount;
        }

        public GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig setSummaryModel(String summaryModel) {
            this.summaryModel = summaryModel;
            return this;
        }
        public String getSummaryModel() {
            return this.summaryModel;
        }

        public GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig setSummaryPrompt(String summaryPrompt) {
            this.summaryPrompt = summaryPrompt;
            return this;
        }
        public String getSummaryPrompt() {
            return this.summaryPrompt;
        }

    }

    public static class GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights extends TeaModel {
        /**
         * <p>Dimension key</p>
         * 
         * <strong>example:</strong>
         * <p>views</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>weight</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights self = new GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig extends TeaModel {
        /**
         * <p>List of selected channels</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;科技&quot;,&quot;经济&quot;,&quot;时政&quot;,&quot;娱乐&quot;]</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>Custom hot spot weight</p>
         */
        @NameInMap("CustomHotValueWeights")
        @Deprecated
        public java.util.List<GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights> customHotValueWeights;

        /**
         * <p>topic Quantity</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopicCount")
        public Integer topicCount;

        public static GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig build(java.util.Map<String, ?> map) throws Exception {
            GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig self = new GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig();
            return TeaModel.build(map, self);
        }

        public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        @Deprecated
        public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig setCustomHotValueWeights(java.util.List<GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights> customHotValueWeights) {
            this.customHotValueWeights = customHotValueWeights;
            return this;
        }
        public java.util.List<GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights> getCustomHotValueWeights() {
            return this.customHotValueWeights;
        }

        public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig setTopicCount(Integer topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Integer getTopicCount() {
            return this.topicCount;
        }

    }

}
