// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpsRequest extends TeaModel {
    /**
     * <p>Filters the results by custom tags. An exact match is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Knowledge base</p>
     */
    @NameInMap("customTag")
    public String customTag;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The MCP service name or service ID. This parameter is used in conjunction with SearchType.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-server</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Filters the results by official usage tags.</p>
     * 
     * <strong>example:</strong>
     * <p>KNOWLEDGE_BASE</p>
     */
    @NameInMap("officialTag")
    public String officialTag;

    /**
     * <p>The name matching mode. This parameter takes effect only when Name is specified. Valid values: accurate (exact match) and blur (fuzzy match). Default value: blur.</p>
     * 
     * <strong>example:</strong>
     * <p>blur</p>
     */
    @NameInMap("searchType")
    public String searchType;

    /**
     * <p>Specifies whether the service is still subject to official template usage constraints.</p>
     */
    @NameInMap("usageActive")
    public Boolean usageActive;

    public static ListMcpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcpsRequest self = new ListMcpsRequest();
        return TeaModel.build(map, self);
    }

    public ListMcpsRequest setCustomTag(String customTag) {
        this.customTag = customTag;
        return this;
    }
    public String getCustomTag() {
        return this.customTag;
    }

    public ListMcpsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMcpsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpsRequest setOfficialTag(String officialTag) {
        this.officialTag = officialTag;
        return this;
    }
    public String getOfficialTag() {
        return this.officialTag;
    }

    public ListMcpsRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public ListMcpsRequest setUsageActive(Boolean usageActive) {
        this.usageActive = usageActive;
        return this;
    }
    public Boolean getUsageActive() {
        return this.usageActive;
    }

}
