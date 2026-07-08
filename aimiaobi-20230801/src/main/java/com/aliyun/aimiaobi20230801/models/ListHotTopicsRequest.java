// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotTopicsRequest extends TeaModel {
    /**
     * <p>The unique identifier of the business space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The end of the creation time filter range (inclusive). The value must be in the <code>yyyy-MM-dd HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-04 23:59:59</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start of the creation time filter range (inclusive). The value must be in the <code>yyyy-MM-dd HH:mm:ss</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01 00:00:00</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>Filters the results by a custom business field. The service performs an exact keyword match on this field. The value can be up to 255 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>biz-tag-001</p>
     */
    @NameInMap("CustomField")
    public String customField;

    /**
     * <p>The maximum number of results to return for a single request. If this parameter is not specified, the service uses a default value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. If you do not specify this parameter, the service returns the first page of results. You can get this token from the <code>NextToken</code> response parameter of the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>A list of topic IDs.</p>
     */
    @NameInMap("TopicIds")
    public java.util.List<String> topicIds;

    /**
     * <p>The keywords for a full-text search on hot topics.</p>
     * 
     * <strong>example:</strong>
     * <p>根据热榜主题全文检索</p>
     */
    @NameInMap("TopicQuery")
    public String topicQuery;

    /**
     * <p>Filters the results by hot topic source. For a list of supported hot topic sources, call the <code>ListHotSources</code> operation.</p>
     * <p><code>Aggregation</code>: represents the aggregated list of national hot topics.</p>
     * 
     * <strong>example:</strong>
     * <p>Quark</p>
     */
    @NameInMap("TopicSource")
    public String topicSource;

    /**
     * <p>Filters the results by data version.</p>
     * 
     * <strong>example:</strong>
     * <p>数据版本筛选</p>
     */
    @NameInMap("TopicVersion")
    public String topicVersion;

    /**
     * <p>Filters the results by hot topic.</p>
     */
    @NameInMap("Topics")
    public java.util.List<String> topics;

    /**
     * <p>Specifies whether to include news in the response.</p>
     * 
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

    public ListHotTopicsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListHotTopicsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListHotTopicsRequest setCustomField(String customField) {
        this.customField = customField;
        return this;
    }
    public String getCustomField() {
        return this.customField;
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
