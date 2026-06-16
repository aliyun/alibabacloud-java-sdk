// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListToolsRequest extends TeaModel {
    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Tool Name, supports fuzzy search</p>
     * 
     * <strong>example:</strong>
     * <p>tool-1</p>
     */
    @NameInMap("toolName")
    public String toolName;

    /**
     * <p>Tool type</p>
     * 
     * <strong>example:</strong>
     * <p>MCP</p>
     */
    @NameInMap("toolType")
    public String toolType;

    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-xyz789</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>List of workspace IDs, separated by commas</p>
     * 
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

    public ListToolsRequest setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
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
