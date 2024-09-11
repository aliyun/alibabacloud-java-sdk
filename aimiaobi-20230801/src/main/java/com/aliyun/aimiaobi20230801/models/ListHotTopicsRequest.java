// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotTopicsRequest extends TeaModel {
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
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TopicIds")
    public java.util.List<String> topicIds;

    /**
     * <strong>example:</strong>
     * <p>根据热榜主题全文检索</p>
     */
    @NameInMap("TopicQuery")
    public String topicQuery;

    /**
     * <strong>example:</strong>
     * <p>热榜源筛选，支持的热榜源。热榜源详见API：ListHotSources</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <strong>example:</strong>
     * <p>数据版本筛选</p>
     */
    @NameInMap("TopicVersion")
    public String topicVersion;

    @NameInMap("Topics")
    public java.util.List<String> topics;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithNews")
    public Boolean withNews;

    public static ListHotTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicsRequest self = new ListHotTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListHotTopicsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListHotTopicsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotTopicsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotTopicsRequest setTopicIds(java.util.List<String> topicIds) {
        this.topicIds = topicIds;
        return this;
    }
    public java.util.List<String> getTopicIds() {
        return this.topicIds;
    }

    public ListHotTopicsRequest setTopicQuery(String topicQuery) {
        this.topicQuery = topicQuery;
        return this;
    }
    public String getTopicQuery() {
        return this.topicQuery;
    }

    public ListHotTopicsRequest setTopicSource(String topicSource) {
        this.topicSource = topicSource;
        return this;
    }
    public String getTopicSource() {
        return this.topicSource;
    }

    public ListHotTopicsRequest setTopicVersion(String topicVersion) {
        this.topicVersion = topicVersion;
        return this;
    }
    public String getTopicVersion() {
        return this.topicVersion;
    }

    public ListHotTopicsRequest setTopics(java.util.List<String> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<String> getTopics() {
        return this.topics;
    }

    public ListHotTopicsRequest setWithNews(Boolean withNews) {
        this.withNews = withNews;
        return this;
    }
    public Boolean getWithNews() {
        return this.withNews;
    }

}
