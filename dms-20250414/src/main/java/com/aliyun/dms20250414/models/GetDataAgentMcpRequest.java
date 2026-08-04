// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentMcpRequest extends TeaModel {
    /**
     * <p>The unique identifier of the MCP Server to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>44lg***z65</p>
     */
    @NameInMap("McpServerId")
    public String mcpServerId;

    /**
     * <p>The Data Agent workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atvx***xmz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDataAgentMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentMcpRequest self = new GetDataAgentMcpRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAgentMcpRequest setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    public GetDataAgentMcpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
