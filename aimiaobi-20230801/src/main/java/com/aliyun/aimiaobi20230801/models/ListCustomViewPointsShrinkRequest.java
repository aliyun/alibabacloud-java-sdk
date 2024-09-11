// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListCustomViewPointsShrinkRequest extends TeaModel {
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
     * <p>观点</p>
     */
    @NameInMap("Attitude")
    public String attitude;

    /**
     * <strong>example:</strong>
     * <p>观点
     *      *</p>
     */
    @NameInMap("Attitudes")
    public String attitudesShrink;

    /**
     * <strong>example:</strong>
     * <p>461591f4880747f890702c1b90494d1a</p>
     */
    @NameInMap("CustomViewPointId")
    public String customViewPointId;

    /**
     * <strong>example:</strong>
     * <p>7ece3d1212e04c9ca716ae2486228f3f</p>
     */
    @NameInMap("CustomViewPointIds")
    public String customViewPointIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>52</p>
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
     * <p>热榜主题</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <strong>example:</strong>
     * <p>1d20ed14db0840efb1c7eaaf4d46352b</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    public static ListCustomViewPointsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomViewPointsShrinkRequest self = new ListCustomViewPointsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomViewPointsShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListCustomViewPointsShrinkRequest setAttitude(String attitude) {
        this.attitude = attitude;
        return this;
    }
    public String getAttitude() {
        return this.attitude;
    }

    public ListCustomViewPointsShrinkRequest setAttitudesShrink(String attitudesShrink) {
        this.attitudesShrink = attitudesShrink;
        return this;
    }
    public String getAttitudesShrink() {
        return this.attitudesShrink;
    }

    public ListCustomViewPointsShrinkRequest setCustomViewPointId(String customViewPointId) {
        this.customViewPointId = customViewPointId;
        return this;
    }
    public String getCustomViewPointId() {
        return this.customViewPointId;
    }

    public ListCustomViewPointsShrinkRequest setCustomViewPointIdsShrink(String customViewPointIdsShrink) {
        this.customViewPointIdsShrink = customViewPointIdsShrink;
        return this;
    }
    public String getCustomViewPointIdsShrink() {
        return this.customViewPointIdsShrink;
    }

    public ListCustomViewPointsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomViewPointsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomViewPointsShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ListCustomViewPointsShrinkRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

}
