// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentMcpRequest extends TeaModel {
    /**
     * <p>A compatible pagination parameter. The actual number of records per page is controlled by PageSize.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A compatible pagination token. The actual page sequence is controlled by PageNumber.</p>
     * 
     * <strong>example:</strong>
     * <p>page-2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page. Valid values: 1 to 500. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to return only MCP Servers that are enabled and in the ready state. Default value: false.</p>
     */
    @NameInMap("ReadyOnly")
    public Boolean readyOnly;

    /**
     * <p>The keyword for name search. The server performs a fuzzy match against MCP Server names.</p>
     * 
     * <strong>example:</strong>
     * <p>analytics</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The MCP Server type. Valid values:</p>
     * <ul>
     * <li>system: system MCP.</li>
     * <li>customer: custom MCP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The Data Agent workspace ID. The caller must have at least MEMBER permissions on this workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atvx***xmz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDataAgentMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentMcpRequest self = new ListDataAgentMcpRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentMcpRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentMcpRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentMcpRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentMcpRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentMcpRequest setReadyOnly(Boolean readyOnly) {
        this.readyOnly = readyOnly;
        return this;
    }
    public Boolean getReadyOnly() {
        return this.readyOnly;
    }

    public ListDataAgentMcpRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListDataAgentMcpRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListDataAgentMcpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
