// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateMcpRequest extends TeaModel {
    /**
     * <p>The list of MCP server addresses.</p>
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
     * <p>The client idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The creation type. Default value: DIRECT_PROXY.</p>
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
     * <p>The AgentTeams instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ins-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Optional. Fuzzy match by instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>streamable</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The Swagger configuration. This parameter is required if Type is set to HTTP_TO_MCP.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;:&quot;<a href="https://example.com/swagger.json%22%7D">https://example.com/swagger.json&quot;}</a></p>
     */
    @NameInMap("SwaggerConfig")
    public String swaggerConfig;

    public static CreateMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpRequest self = new CreateMcpRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public CreateMcpRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public CreateMcpRequest setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    public CreateMcpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMcpRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateMcpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMcpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMcpRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMcpRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateMcpRequest setSwaggerConfig(String swaggerConfig) {
        this.swaggerConfig = swaggerConfig;
        return this;
    }
    public String getSwaggerConfig() {
        return this.swaggerConfig;
    }

}
