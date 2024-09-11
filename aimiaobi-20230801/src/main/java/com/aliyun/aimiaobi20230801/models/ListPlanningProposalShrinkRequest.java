// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPlanningProposalShrinkRequest extends TeaModel {
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
     * <p>e7b26a9e1211444db8f0a984361a5e0f</p>
     */
    @NameInMap("CustomViewPointId")
    public String customViewPointId;

    /**
     * <strong>example:</strong>
     * <p>27971fc8f3ce4ed58c7e7fc4b503e432</p>
     */
    @NameInMap("CustomViewPointIds")
    public String customViewPointIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>73</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>标题
     *      *</p>
     */
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
     * <p>2024-09-10_08</p>
     */
    @NameInMap("TopicVersion")
    public String topicVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomViewPoints</p>
     */
    @NameInMap("ViewPointType")
    public String viewPointType;

    public static ListPlanningProposalShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlanningProposalShrinkRequest self = new ListPlanningProposalShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPlanningProposalShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListPlanningProposalShrinkRequest setCustomViewPointId(String customViewPointId) {
        this.customViewPointId = customViewPointId;
        return this;
    }
    public String getCustomViewPointId() {
        return this.customViewPointId;
    }

    public ListPlanningProposalShrinkRequest setCustomViewPointIdsShrink(String customViewPointIdsShrink) {
        this.customViewPointIdsShrink = customViewPointIdsShrink;
        return this;
    }
    public String getCustomViewPointIdsShrink() {
        return this.customViewPointIdsShrink;
    }

    public ListPlanningProposalShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPlanningProposalShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPlanningProposalShrinkRequest setTitlesShrink(String titlesShrink) {
        this.titlesShrink = titlesShrink;
        return this;
    }
    public String getTitlesShrink() {
        return this.titlesShrink;
    }

    public ListPlanningProposalShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ListPlanningProposalShrinkRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public ListPlanningProposalShrinkRequest setTopicVersion(String topicVersion) {
        this.topicVersion = topicVersion;
        return this;
    }
    public String getTopicVersion() {
        return this.topicVersion;
    }

    public ListPlanningProposalShrinkRequest setViewPointType(String viewPointType) {
        this.viewPointType = viewPointType;
        return this;
    }
    public String getViewPointType() {
        return this.viewPointType;
    }

}
