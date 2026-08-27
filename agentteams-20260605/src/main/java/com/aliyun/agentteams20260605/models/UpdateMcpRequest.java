// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateMcpRequest extends TeaModel {
    /**
     * <p>The address list of the MCP server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://example.com/mcp%22%5D">https://example.com/mcp&quot;]</a></p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The authentication information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;bearer&quot;,&quot;token&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("AuthConfig")
    public String authConfig;

    /**
     * <p>Specifies whether to enable authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AuthEnabled")
    public Boolean authEnabled;

    /**
     * <p>The client idempotency token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The creation type.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECT_PROXY</p>
     */
    @NameInMap("CreateType")
    public String createType;

    /**
     * <p>The description of the MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an MCP server.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Optional. Fuzzy matches by instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The AgentTeams instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ins-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Required if Type is set to HTTP_TO_MCP.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;:&quot;<a href="https://example.com/swagger.json%22%7D">https://example.com/swagger.json&quot;}</a></p>
     */
    @NameInMap("SwaggerConfig")
    public String swaggerConfig;

    public static UpdateMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpRequest self = new UpdateMcpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public UpdateMcpRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public UpdateMcpRequest setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    public UpdateMcpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateMcpRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public UpdateMcpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMcpRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMcpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMcpRequest setSwaggerConfig(String swaggerConfig) {
        this.swaggerConfig = swaggerConfig;
        return this;
    }
    public String getSwaggerConfig() {
        return this.swaggerConfig;
    }

}
