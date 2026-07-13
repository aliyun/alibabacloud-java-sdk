// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateMcpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    @NameInMap("AuthConfig")
    public String authConfig;

    @NameInMap("AuthEnabled")
    public Boolean authEnabled;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreateType")
    public String createType;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Protocol")
    public String protocol;

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
