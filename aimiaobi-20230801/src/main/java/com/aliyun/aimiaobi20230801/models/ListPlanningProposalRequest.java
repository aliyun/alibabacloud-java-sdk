// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPlanningProposalRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Custom viewpoint ID (used for custom viewpoint planning proposal scenarios).</p>
     * 
     * <strong>example:</strong>
     * <p>e7b26a9e1211444db8f0a984361a5e0f</p>
     */
    @NameInMap("CustomViewPointId")
    public String customViewPointId;

    /**
     * <p>List of custom viewpoint IDs (used for custom viewpoint planning proposal scenarios).</p>
     * 
     * <strong>example:</strong>
     * <p>27971fc8f3ce4ed58c7e7fc4b503e432</p>
     */
    @NameInMap("CustomViewPointIds")
    public java.util.List<String> customViewPointIds;

    /**
     * <p>Maximum number of returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>下一页的Token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Filter planning proposal titles, corresponding to the viewpoint names of each planning proposal type.</p>
     * 
     * <strong>example:</strong>
     * <p>标题
     *      *</p>
     */
    @NameInMap("Titles")
    public java.util.List<String> titles;

    /**
     * <p>Hot topic subject.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热榜主题</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>Hot topic source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>热榜源</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <p>Hot spot event data version.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-10_08</p>
     */
    @NameInMap("TopicVersion")
    public String topicVersion;

    /**
     * <p>Planning proposal type</p>
     * <ul>
     * <li><p>CustomViewPoints: Custom viewpoint</p>
     * </li>
     * <li><p>HotViewPoints: Hot viewpoint</p>
     * </li>
     * <li><p>TimedViewPoints: Time-sensitive viewpoint</p>
     * </li>
     * <li><p>WebReviewPoints: User viewpoint</p>
     * </li>
     * <li><p>FreshViewPoints: Fresh viewpoint</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomViewPoints</p>
     */
    @NameInMap("ViewPointType")
    public String viewPointType;

    public static ListPlanningProposalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlanningProposalRequest self = new ListPlanningProposalRequest();
        return TeaModel.build(map, self);
    }

    public ListPlanningProposalRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListPlanningProposalRequest setCustomViewPointId(String customViewPointId) {
        this.customViewPointId = customViewPointId;
        return this;
    }
    public String getCustomViewPointId() {
        return this.customViewPointId;
    }

    public ListPlanningProposalRequest setCustomViewPointIds(java.util.List<String> customViewPointIds) {
        this.customViewPointIds = customViewPointIds;
        return this;
    }
    public java.util.List<String> getCustomViewPointIds() {
        return this.customViewPointIds;
    }

    public ListPlanningProposalRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPlanningProposalRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPlanningProposalRequest setTitles(java.util.List<String> titles) {
        this.titles = titles;
        return this;
    }
    public java.util.List<String> getTitles() {
        return this.titles;
    }

    public ListPlanningProposalRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ListPlanningProposalRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public ListPlanningProposalRequest setTopicVersion(String topicVersion) {
        this.topicVersion = topicVersion;
        return this;
    }
    public String getTopicVersion() {
        return this.topicVersion;
    }

    public ListPlanningProposalRequest setViewPointType(String viewPointType) {
        this.viewPointType = viewPointType;
        return this;
    }
    public String getViewPointType() {
        return this.viewPointType;
    }

}
