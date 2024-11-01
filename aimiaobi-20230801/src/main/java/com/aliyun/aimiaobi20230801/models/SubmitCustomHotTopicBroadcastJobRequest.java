// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomHotTopicBroadcastJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HotTopicBroadcastConfig")
    public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig hotTopicBroadcastConfig;

    /**
     * <strong>example:</strong>
     * <p>热点版本</p>
     */
    @NameInMap("HotTopicVersion")
    public String hotTopicVersion;

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

    public static SubmitCustomHotTopicBroadcastJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomHotTopicBroadcastJobRequest self = new SubmitCustomHotTopicBroadcastJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomHotTopicBroadcastJobRequest setHotTopicBroadcastConfig(SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig hotTopicBroadcastConfig) {
        this.hotTopicBroadcastConfig = hotTopicBroadcastConfig;
        return this;
    }
    public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig getHotTopicBroadcastConfig() {
        return this.hotTopicBroadcastConfig;
    }

    public SubmitCustomHotTopicBroadcastJobRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public SubmitCustomHotTopicBroadcastJobRequest setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public SubmitCustomHotTopicBroadcastJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SummaryImageCount")
        public Integer summaryImageCount;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("SummaryModel")
        public String summaryModel;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("SummaryPrompt")
        public String summaryPrompt;

        public static SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig self = new SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig setSummaryImageCount(Integer summaryImageCount) {
            this.summaryImageCount = summaryImageCount;
            return this;
        }
        public Integer getSummaryImageCount() {
            return this.summaryImageCount;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig setSummaryModel(String summaryModel) {
            this.summaryModel = summaryModel;
            return this;
        }
        public String getSummaryModel() {
            return this.summaryModel;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig setSummaryPrompt(String summaryPrompt) {
            this.summaryPrompt = summaryPrompt;
            return this;
        }
        public String getSummaryPrompt() {
            return this.summaryPrompt;
        }

    }

    public static class SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>views</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <strong>example:</strong>
         * <p>维度名称</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights self = new SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights();
            return TeaModel.build(map, self);
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;科技&quot;,&quot;经济&quot;,&quot;时政&quot;,&quot;娱乐&quot;]</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("CustomHotValueWeights")
        public java.util.List<SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights> customHotValueWeights;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopicCount")
        public Integer topicCount;

        public static SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig self = new SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig();
            return TeaModel.build(map, self);
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig setCustomHotValueWeights(java.util.List<SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights> customHotValueWeights) {
            this.customHotValueWeights = customHotValueWeights;
            return this;
        }
        public java.util.List<SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfigCustomHotValueWeights> getCustomHotValueWeights() {
            return this.customHotValueWeights;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig setTopicCount(Integer topicCount) {
            this.topicCount = topicCount;
            return this;
        }
        public Integer getTopicCount() {
            return this.topicCount;
        }

    }

    public static class SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StepForCustomSummaryStyleConfig")
        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StepForNewsBroadcastContentConfig")
        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig;

        public static SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig self = new SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig();
            return TeaModel.build(map, self);
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig setStepForCustomSummaryStyleConfig(SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig stepForCustomSummaryStyleConfig) {
            this.stepForCustomSummaryStyleConfig = stepForCustomSummaryStyleConfig;
            return this;
        }
        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForCustomSummaryStyleConfig getStepForCustomSummaryStyleConfig() {
            return this.stepForCustomSummaryStyleConfig;
        }

        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfig setStepForNewsBroadcastContentConfig(SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig stepForNewsBroadcastContentConfig) {
            this.stepForNewsBroadcastContentConfig = stepForNewsBroadcastContentConfig;
            return this;
        }
        public SubmitCustomHotTopicBroadcastJobRequestHotTopicBroadcastConfigStepForNewsBroadcastContentConfig getStepForNewsBroadcastContentConfig() {
            return this.stepForNewsBroadcastContentConfig;
        }

    }

}
