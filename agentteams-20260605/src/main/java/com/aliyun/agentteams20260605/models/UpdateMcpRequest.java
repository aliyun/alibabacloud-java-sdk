// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateMcpRequest extends TeaModel {
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
