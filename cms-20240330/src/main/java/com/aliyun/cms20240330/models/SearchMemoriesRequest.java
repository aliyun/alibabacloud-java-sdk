// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SearchMemoriesRequest extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>972772996913709056</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>App key assigned by the merchant</p>
     * 
     * <strong>example:</strong>
     * <p>mm_480d961a1b5e4efe84603f4cbc0f</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>Resource metadata</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>Query text</p>
     * 
     * <strong>example:</strong>
     * <p>What I like</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Rerank the search results.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("rerank")
    public Boolean rerank;

    /**
     * <p>Run ID</p>
     * 
     * <strong>example:</strong>
     * <p>test_session_001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>Number of top results to return</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topK")
    public Integer topK;

    /**
     * <p>User ID</p>
     * 
     * <strong>example:</strong>
     * <p>test_session_001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static SearchMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMemoriesRequest self = new SearchMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMemoriesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SearchMemoriesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SearchMemoriesRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public SearchMemoriesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchMemoriesRequest setRerank(Boolean rerank) {
        this.rerank = rerank;
        return this;
    }
    public Boolean getRerank() {
        return this.rerank;
    }

    public SearchMemoriesRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public SearchMemoriesRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public SearchMemoriesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
