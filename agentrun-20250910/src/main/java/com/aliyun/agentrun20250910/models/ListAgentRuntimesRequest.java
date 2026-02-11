// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesRequest extends TeaModel {
    /**
     * <p>根据智能体运行时名称进行模糊匹配过滤</p>
     * 
     * <strong>example:</strong>
     * <p>my-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>用于服务发现的资源组标识符</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123456</p>
     */
    @NameInMap("discoveryResourceGroupId")
    @Deprecated
    public String discoveryResourceGroupId;

    /**
     * <p>当前页码，从1开始计数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回的记录数量</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resourceGroupId")
    @Deprecated
    public String resourceGroupId;

    /**
     * <p>查询模式，支持精确查询和模糊查询</p>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("searchMode")
    public String searchMode;

    /**
     * <p>根据状态进行过滤，多个状态用逗号分隔，支持精确匹配</p>
     * 
     * <strong>example:</strong>
     * <p>READY,CREATING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>根据工作空间ID进行过滤，用于资源隔离和权限管理</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

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

    public ListAgentRuntimesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
