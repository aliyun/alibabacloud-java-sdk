// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesRequest extends TeaModel {
    /**
     * <p>Filters the results by agent runtime name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>The service discovery resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123456</p>
     */
    @NameInMap("discoveryResourceGroupId")
    @Deprecated
    public String discoveryResourceGroupId;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. This parameter is deprecated.</p>
     */
    @NameInMap("resourceGroupId")
    @Deprecated
    public String resourceGroupId;

    /**
     * <p>The search mode.</p>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("searchMode")
    public String searchMode;

    /**
     * <p>Filters the results by status.</p>
     * 
     * <strong>example:</strong>
     * <p>READY,CREATING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Filters the results by system tags. Separate multiple tags with commas. This parameter supports only exact matches.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:tag1,acs:ecs:tag2</p>
     */
    @NameInMap("systemTags")
    public String systemTags;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>A comma-separated string of workspace IDs.</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListAgentRuntimesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimesRequest self = new ListAgentRuntimesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimesRequest setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    @Deprecated
    public ListAgentRuntimesRequest setDiscoveryResourceGroupId(String discoveryResourceGroupId) {
        this.discoveryResourceGroupId = discoveryResourceGroupId;
        return this;
    }
    public String getDiscoveryResourceGroupId() {
        return this.discoveryResourceGroupId;
    }

    public ListAgentRuntimesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    @Deprecated
    public ListAgentRuntimesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAgentRuntimesRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public ListAgentRuntimesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAgentRuntimesRequest setSystemTags(String systemTags) {
        this.systemTags = systemTags;
        return this;
    }
    public String getSystemTags() {
        return this.systemTags;
    }

    public ListAgentRuntimesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListAgentRuntimesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
