// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListTopicViewPointRecommendEventListRequest extends TeaModel {
    /**
     * <p>Unique identifier for the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Hot spot event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Maximum number of results to return. Defaults to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListTopicViewPointRecommendEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicViewPointRecommendEventListRequest self = new ListTopicViewPointRecommendEventListRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicViewPointRecommendEventListRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListTopicViewPointRecommendEventListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListTopicViewPointRecommendEventListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTopicViewPointRecommendEventListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
