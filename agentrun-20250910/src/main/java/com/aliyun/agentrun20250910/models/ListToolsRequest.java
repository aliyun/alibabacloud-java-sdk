// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListToolsRequest extends TeaModel {
    /**
     * <p>当前页码，从 1 开始</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回的工具数量，用于分页查询</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>按工具类型过滤，可选值：MCP、FUNCTIONCALL、SKILL</p>
     * 
     * <strong>example:</strong>
     * <p>MCP</p>
     */
    @NameInMap("toolType")
    public String toolType;

    /**
     * <p>按工作空间ID过滤，查询指定工作空间下的工具</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-xyz789</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>ws1,ws2</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListToolsRequest self = new ListToolsRequest();
        return TeaModel.build(map, self);
    }

    public ListToolsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListToolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListToolsRequest setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

    public ListToolsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListToolsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
