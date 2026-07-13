// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelProviderShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKeys")
    public String apiKeysShrink;

    @NameInMap("ClientToken")
    public String clientToken;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Protocols")
    public String protocolsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Provider")
    public String provider;

    public static CreateModelProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderShrinkRequest self = new CreateModelProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateModelProviderShrinkRequest setApiKeysShrink(String apiKeysShrink) {
        this.apiKeysShrink = apiKeysShrink;
        return this;
    }
    public String getApiKeysShrink() {
        return this.apiKeysShrink;
    }

    public CreateModelProviderShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModelProviderShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelProviderShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateModelProviderShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelProviderShrinkRequest setProtocolsShrink(String protocolsShrink) {
        this.protocolsShrink = protocolsShrink;
        return this;
    }
    public String getProtocolsShrink() {
        return this.protocolsShrink;
    }

    public CreateModelProviderShrinkRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
