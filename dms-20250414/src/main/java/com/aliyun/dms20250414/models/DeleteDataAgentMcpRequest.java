// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentMcpRequest extends TeaModel {
    /**
     * <p>The list of MCP Server IDs to delete.</p>
     */
    @NameInMap("McpServerIds")
    public java.util.List<String> mcpServerIds;

    /**
     * <p>The ID of the Data Agent workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atvx***xmz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDataAgentMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentMcpRequest self = new DeleteDataAgentMcpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentMcpRequest setMcpServerIds(java.util.List<String> mcpServerIds) {
        this.mcpServerIds = mcpServerIds;
        return this;
    }
    public java.util.List<String> getMcpServerIds() {
        return this.mcpServerIds;
    }

    public DeleteDataAgentMcpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
