// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchAtiAgentRegisterInfoMarketRequest extends TeaModel {
    /**
     * <p>Ensures the idempotency of the request. Generate a unique parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The keyword for searching. Matches against agent name, domain name, and description.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries per batch query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for the paged query. Settings: maximum value: 100. Default value: 20. This parameter controls paging behavior.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The communication protocol that the agent endpoint follows, which determines how callers interact with the agent.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>MCP: Model Context Protocol, an agent tool calling protocol developed by Anthropic.</li>
     * <li>A2A: Agent-to-Agent Protocol, a cross-agent communication protocol developed by Google.</li>
     * <li>OpenAPI: Standard RESTful API specification (Swagger/OpenAPI).</li>
     * </ul>
     * <p>Other agents or clients use this protocol identifier to determine how to communicate with the agent. For example, MCP uses the MCP SDK, A2A uses the A2A SDK, and OpenAPI uses standard HTTP requests.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Queries agents based on the agent status.</p>
     * 
     * <strong>example:</strong>
     * <p>活跃</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Queries agents based on the trust level.</p>
     * 
     * <strong>example:</strong>
     * <p>基础认证</p>
     */
    @NameInMap("TrustLevel")
    public String trustLevel;

    public static SearchAtiAgentRegisterInfoMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAtiAgentRegisterInfoMarketRequest self = new SearchAtiAgentRegisterInfoMarketRequest();
        return TeaModel.build(map, self);
    }

    public SearchAtiAgentRegisterInfoMarketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SearchAtiAgentRegisterInfoMarketRequest setTrustLevel(String trustLevel) {
        this.trustLevel = trustLevel;
        return this;
    }
    public String getTrustLevel() {
        return this.trustLevel;
    }

}
