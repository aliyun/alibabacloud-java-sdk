// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportHotTopicPlanningProposalsShrinkRequest extends TeaModel {
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
    public String customViewPointIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>导出文档类型，word:导出为word,xmind:导处为xmind</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("Titles")
    public String titlesShrink;

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

    public static ExportHotTopicPlanningProposalsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportHotTopicPlanningProposalsShrinkRequest self = new ExportHotTopicPlanningProposalsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setCustomViewPointIdsShrink(String customViewPointIdsShrink) {
        this.customViewPointIdsShrink = customViewPointIdsShrink;
        return this;
    }
    public String getCustomViewPointIdsShrink() {
        return this.customViewPointIdsShrink;
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setTitlesShrink(String titlesShrink) {
        this.titlesShrink = titlesShrink;
        return this;
    }
    public String getTitlesShrink() {
        return this.titlesShrink;
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public ExportHotTopicPlanningProposalsShrinkRequest setViewPointType(String viewPointType) {
        this.viewPointType = viewPointType;
        return this;
    }
    public String getViewPointType() {
        return this.viewPointType;
    }

}
