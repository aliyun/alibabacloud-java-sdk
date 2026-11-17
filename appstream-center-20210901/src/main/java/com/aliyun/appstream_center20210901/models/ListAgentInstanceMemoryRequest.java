// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAgentInstanceMemoryRequest extends TeaModel {
    /**
     * <p>Filters by the business platform to which the Agent belongs. If omitted, no restriction is applied to the business platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>Filters by Agent provider. If omitted, queries providers that support memory management. <code>JVSCopilot</code> is not supported for memory management in this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>AgenticComputer</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>Filters by business type code. If omitted, no restriction is applied to the business type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The list of end user IDs to include in the query results. Exact match is applied. You can specify up to 200 IDs.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The list of end user IDs to exclude from the query results. You can specify up to 200 IDs. If used together with EndUserIds, these users are excluded from the inclusion scope.</p>
     */
    @NameInMap("ExcludedEndUserIds")
    public java.util.List<String> excludedEndUserIds;

    /**
     * <p>Filters by the memory switch configured for the instance.</p>
     * <ul>
     * <li><code>ENABLED</code>: The instance memory switch is turned on.</li>
     * <li><code>DISABLED</code>: The instance memory switch is turned off.
     * If both values are specified, instances matching either status are returned.</li>
     * </ul>
     */
    @NameInMap("MemoryStatuses")
    public java.util.List<String> memoryStatuses;

    /**
     * <p>The page number. Pages start from 1. If this parameter is not specified or is set to 0, the first page is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword used for inclusion matching. Specify the search field by using SearchType. If left empty, no keyword filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-d8ut</p>
     */
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    /**
     * <p>The search scope for the keyword. Default value: <code>ALL</code>.</p>
     * <ul>
     * <li><code>ALL</code>: Searches the resource ID, resource name, runtime ID, and end user ID.</li>
     * <li><code>RESOURCE_ID</code>: Searches the resource ID.</li>
     * <li><code>RESOURCE_NAME</code>: Searches the resource name.</li>
     * <li><code>RUNTIME_ID</code>: Searches the runtime ID.</li>
     * <li><code>END_USER_ID</code>: Searches the end user ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RESOURCE_ID</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    public static ListAgentInstanceMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceMemoryRequest self = new ListAgentInstanceMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceMemoryRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ListAgentInstanceMemoryRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ListAgentInstanceMemoryRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListAgentInstanceMemoryRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public ListAgentInstanceMemoryRequest setExcludedEndUserIds(java.util.List<String> excludedEndUserIds) {
        this.excludedEndUserIds = excludedEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludedEndUserIds() {
        return this.excludedEndUserIds;
    }

    public ListAgentInstanceMemoryRequest setMemoryStatuses(java.util.List<String> memoryStatuses) {
        this.memoryStatuses = memoryStatuses;
        return this;
    }
    public java.util.List<String> getMemoryStatuses() {
        return this.memoryStatuses;
    }

    public ListAgentInstanceMemoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentInstanceMemoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentInstanceMemoryRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public ListAgentInstanceMemoryRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

}
