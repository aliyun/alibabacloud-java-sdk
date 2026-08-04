// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ModifyDataAgentMcpRequest extends TeaModel {
    /**
     * <p>The brief description of the artifact. This parameter can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the MCP server is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The endpoint of the MCP instance.</p>
     * 
     * <strong>example:</strong>
     * <p>http://***.com/mcp</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The request header settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Authorization&quot;:&quot;Bearer ***&quot;}</p>
     */
    @NameInMap("Headers")
    public String headers;

    /**
     * <p>The ID of the MCP server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6126jk***h2</p>
     */
    @NameInMap("McpServerId")
    public String mcpServerId;

    /**
     * <p>The MCP name.</p>
     * 
     * <strong>example:</strong>
     * <p>Efficiency Diagnostics V3</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to include the Alibaba Cloud UID in the request header.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedUidInHeader")
    public Boolean needUidInHeader;

    /**
     * <p>The transport channel type. Valid values: streamablehttp, sse.</p>
     * 
     * <strong>example:</strong>
     * <p>sse</p>
     */
    @NameInMap("TransportType")
    public String transportType;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e3p***v4</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ModifyDataAgentMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataAgentMcpRequest self = new ModifyDataAgentMcpRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataAgentMcpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDataAgentMcpRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyDataAgentMcpRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ModifyDataAgentMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public ModifyDataAgentMcpRequest setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    public ModifyDataAgentMcpRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDataAgentMcpRequest setNeedUidInHeader(Boolean needUidInHeader) {
        this.needUidInHeader = needUidInHeader;
        return this;
    }
    public Boolean getNeedUidInHeader() {
        return this.needUidInHeader;
    }

    public ModifyDataAgentMcpRequest setTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    public String getTransportType() {
        return this.transportType;
    }

    public ModifyDataAgentMcpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
