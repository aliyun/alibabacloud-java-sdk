// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateMcpShrinkRequest extends TeaModel {
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
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SwaggerConfig")
    public String swaggerConfig;

    public static UpdateMcpShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpShrinkRequest self = new UpdateMcpShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpShrinkRequest setAddressesShrink(String addressesShrink) {
        this.addressesShrink = addressesShrink;
        return this;
    }
    public String getAddressesShrink() {
        return this.addressesShrink;
    }

    public UpdateMcpShrinkRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public UpdateMcpShrinkRequest setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    public UpdateMcpShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateMcpShrinkRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public UpdateMcpShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMcpShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMcpShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMcpShrinkRequest setSwaggerConfig(String swaggerConfig) {
        this.swaggerConfig = swaggerConfig;
        return this;
    }
    public String getSwaggerConfig() {
        return this.swaggerConfig;
    }

}
