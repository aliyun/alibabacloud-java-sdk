// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListModelConnectionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return associated model summaries for each model connection. By default, model summaries are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeModels")
    public Boolean includeModels;

    /**
     * <p>The number of records per page. Valid values: 0 to 100. If this parameter is not set or is set to 0, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The model connection name. The name must be 1 to 128 non-whitespace characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token. Pass the token returned in the previous query. An empty response indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWwtY29ubmVjdGlvbjoxMA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The invocation protocol used to filter model connections.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI/v1</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The model provider type used to filter model connections.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("providerType")
    public String providerType;

    /**
     * <p>The name matching mode. Takes effect only when Name is set. Valid values: accurate (exact match), blur (fuzzy match). Default value: blur.</p>
     * 
     * <strong>example:</strong>
     * <p>blur</p>
     */
    @NameInMap("searchType")
    public String searchType;

    public static ListModelConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelConnectionsRequest self = new ListModelConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelConnectionsRequest setIncludeModels(Boolean includeModels) {
        this.includeModels = includeModels;
        return this;
    }
    public Boolean getIncludeModels() {
        return this.includeModels;
    }

    public ListModelConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelConnectionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelConnectionsRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ListModelConnectionsRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public ListModelConnectionsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

}
