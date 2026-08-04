// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class InitWorkspaceSystemMcpServerRequest extends TeaModel {
    /**
     * <p>The ID of the Data Agent workspace for which to initialize system MCP services. The caller must have at least MEMBER permissions on the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static InitWorkspaceSystemMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        InitWorkspaceSystemMcpServerRequest self = new InitWorkspaceSystemMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public InitWorkspaceSystemMcpServerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
