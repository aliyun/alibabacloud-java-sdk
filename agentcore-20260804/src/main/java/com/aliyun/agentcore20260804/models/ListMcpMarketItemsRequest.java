// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpMarketItemsRequest extends TeaModel {
    /**
     * <p>The keyword used to filter MCP marketplace templates.</p>
     * 
     * <strong>example:</strong>
     * <p>Knowledge</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of records to return in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The MCP type.</p>
     * 
     * <strong>example:</strong>
     * <p>CODE_PACKAGE</p>
     */
    @NameInMap("mcpType")
    public String mcpType;

    /**
     * <p>The pagination token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The official usage tag.</p>
     * 
     * <strong>example:</strong>
     * <p>KNOWLEDGE_BASE</p>
     */
    @NameInMap("officialTag")
    public String officialTag;

    public static ListMcpMarketItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcpMarketItemsRequest self = new ListMcpMarketItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListMcpMarketItemsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListMcpMarketItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpMarketItemsRequest setMcpType(String mcpType) {
        this.mcpType = mcpType;
        return this;
    }
    public String getMcpType() {
        return this.mcpType;
    }

    public ListMcpMarketItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpMarketItemsRequest setOfficialTag(String officialTag) {
        this.officialTag = officialTag;
        return this;
    }
    public String getOfficialTag() {
        return this.officialTag;
    }

}
