// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentMcpShrinkRequest extends TeaModel {
    /**
     * <p>The list of MCP Server IDs to delete.</p>
     */
    @NameInMap("McpServerIds")
    public String mcpServerIdsShrink;

    /**
     * <p>The ID of the Data Agent workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atvx***xmz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDataAgentMcpShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentMcpShrinkRequest self = new DeleteDataAgentMcpShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentMcpShrinkRequest setMcpServerIdsShrink(String mcpServerIdsShrink) {
        this.mcpServerIdsShrink = mcpServerIdsShrink;
        return this;
    }
    public String getMcpServerIdsShrink() {
        return this.mcpServerIdsShrink;
    }

    public DeleteDataAgentMcpShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
