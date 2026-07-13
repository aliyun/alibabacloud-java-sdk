// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateMcpShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addresses")
    public String addressesShrink;

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

    public static CreateMcpShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpShrinkRequest self = new CreateMcpShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpShrinkRequest setAddressesShrink(String addressesShrink) {
        this.addressesShrink = addressesShrink;
        return this;
    }
    public String getAddressesShrink() {
        return this.addressesShrink;
    }

    public CreateMcpShrinkRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public CreateMcpShrinkRequest setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    public CreateMcpShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMcpShrinkRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CreateMcpShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMcpShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMcpShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMcpShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateMcpShrinkRequest setSwaggerConfig(String swaggerConfig) {
        this.swaggerConfig = swaggerConfig;
        return this;
    }
    public String getSwaggerConfig() {
        return this.swaggerConfig;
    }

}
