// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelShrinkRequest extends TeaModel {
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

    @NameInMap("Provider")
    public String provider;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    public static CreateModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelShrinkRequest self = new CreateModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModelShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateModelShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelShrinkRequest setProtocolsShrink(String protocolsShrink) {
        this.protocolsShrink = protocolsShrink;
        return this;
    }
    public String getProtocolsShrink() {
        return this.protocolsShrink;
    }

    public CreateModelShrinkRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateModelShrinkRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public CreateModelShrinkRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
