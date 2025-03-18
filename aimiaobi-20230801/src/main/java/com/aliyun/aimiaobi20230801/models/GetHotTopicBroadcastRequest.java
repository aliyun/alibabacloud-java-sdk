// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetHotTopicBroadcastRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CalcTotalToken")
    public Boolean calcTotalToken;

    /**
     * <strong>example:</strong>
     * <p>分类筛选</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>2024-10-11_13</p>
     */
    @NameInMap("HotTopicVersion")
    public String hotTopicVersion;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Size")
    public Integer size;

    @NameInMap("StepForCustomSummaryStyleConfig")
    public GetHotTopicBroadcastRequestStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

    @NameInMap("StepForNewsBroadcastContentConfig")
    public GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig;

    /**
     * <strong>example:</strong>
     * <p>[&quot;主题1&quot;,&quot;主题2&quot;]</p>
     */
    @NameInMap("Topics")
    public java.util.List<String> topics;

    /**
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
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("SummaryImageCount")
        public Integer summaryImageCount;

        /**
         * <strong>example:</strong>
         * <p>摘要模型</p>
         */
        @NameInMap("SummaryModel")
        public String summaryModel;

        /**
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
         * <strong>example:</strong>
         * <p>views</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
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
         * <strong>example:</strong>
         * <p>[&quot;科技&quot;,&quot;经济&quot;,&quot;时政&quot;,&quot;娱乐&quot;]</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("CustomHotValueWeights")
        public java.util.List<GetHotTopicBroadcastRequestStepForNewsBroadcastContentConfigCustomHotValueWeights> customHotValueWeights;

        /**
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
