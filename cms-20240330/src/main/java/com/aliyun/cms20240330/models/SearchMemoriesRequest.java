// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SearchMemoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>972772996913709056</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>mm_480d961a1b5e4efe84603f4cbc0f</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("filters")
    public java.util.Map<String, ?> filters;

    /**
     * <strong>example:</strong>
     * <p>What I like</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("rerank")
    public Boolean rerank;

    /**
     * <strong>example:</strong>
     * <p>L1</p>
     */
    @NameInMap("retrieveLevel")
    public String retrieveLevel;

    /**
     * <strong>example:</strong>
     * <p>test_session_001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>experience</p>
     */
    @NameInMap("searchType")
    public String searchType;

    /**
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topK")
    public Integer topK;

    /**
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

    public SearchMemoriesRequest setFilters(java.util.Map<String, ?> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
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

    public SearchMemoriesRequest setRetrieveLevel(String retrieveLevel) {
        this.retrieveLevel = retrieveLevel;
        return this;
    }
    public String getRetrieveLevel() {
        return this.retrieveLevel;
    }

    public SearchMemoriesRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public SearchMemoriesRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchMemoriesRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
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
