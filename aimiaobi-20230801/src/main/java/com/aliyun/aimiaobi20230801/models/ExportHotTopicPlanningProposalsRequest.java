// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportHotTopicPlanningProposalsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>025c6cee437741368098b790c90166f8</p>
     */
    @NameInMap("CustomViewPointIds")
    public java.util.List<String> customViewPointIds;

    /**
     * <strong>example:</strong>
     * <p>导出文档类型，word:导出为word,xmind:导处为xmind</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("Titles")
    public java.util.List<String> titles;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热榜主题</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热榜源</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <strong>example:</strong>
     * <p>选题策划类型：CustomViewPoints:自定义视角，HotViewPoints:热门视角、TimedViewPoints:时效性视角、WebReviewPoints:网友视角、FreshViewPoints:新颖视角</p>
     */
    @NameInMap("ViewPointType")
    public String viewPointType;

    public static ExportHotTopicPlanningProposalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportHotTopicPlanningProposalsRequest self = new ExportHotTopicPlanningProposalsRequest();
        return TeaModel.build(map, self);
    }

    public ExportHotTopicPlanningProposalsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ExportHotTopicPlanningProposalsRequest setCustomViewPointIds(java.util.List<String> customViewPointIds) {
        this.customViewPointIds = customViewPointIds;
        return this;
    }
    public java.util.List<String> getCustomViewPointIds() {
        return this.customViewPointIds;
    }

    public ExportHotTopicPlanningProposalsRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportHotTopicPlanningProposalsRequest setTitles(java.util.List<String> titles) {
        this.titles = titles;
        return this;
    }
    public java.util.List<String> getTitles() {
        return this.titles;
    }

    public ExportHotTopicPlanningProposalsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExportHotTopicPlanningProposalsRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public ExportHotTopicPlanningProposalsRequest setViewPointType(String viewPointType) {
        this.viewPointType = viewPointType;
        return this;
    }
    public String getViewPointType() {
        return this.viewPointType;
    }

}
