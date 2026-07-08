// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportHotTopicPlanningProposalsRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Custom viewpoint ID. Use this parameter for custom viewpoint topic planning.</p>
     * 
     * <strong>example:</strong>
     * <p>025c6cee437741368098b790c90166f8</p>
     */
    @NameInMap("CustomViewPointIds")
    public java.util.List<String> customViewPointIds;

    /**
     * <p>Document export format</p>
     * <ul>
     * <li><p>word: Export as a Word document</p>
     * </li>
     * <li><p>xmind: Export as an XMind file</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>word</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>Filter topic planning documents by title</p>
     */
    @NameInMap("Titles")
    public java.util.List<String> titles;

    /**
     * <p>Hot list topic</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热榜主题</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>Hot list source</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热榜源</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <p>Topic planning type</p>
     * <ul>
     * <li><p>CustomViewPoints: Custom viewpoint</p>
     * </li>
     * <li><p>HotViewPoints: Popular viewpoint</p>
     * </li>
     * <li><p>TimedViewPoints: Time-sensitive viewpoint</p>
     * </li>
     * <li><p>WebReviewPoints: Public viewpoint</p>
     * </li>
     * <li><p>FreshViewPoints: Fresh viewpoint</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CustomViewPoints</p>
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
