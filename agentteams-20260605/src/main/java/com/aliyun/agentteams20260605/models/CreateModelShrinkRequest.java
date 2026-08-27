// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The model description.</p>
     * 
     * <strong>example:</strong>
     * <p>my model</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Optional. Fuzzy matches instances by name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of protocols supported by the model, in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;openai&quot;]</p>
     */
    @NameInMap("Protocols")
    public String protocolsShrink;

    /**
     * <p>The provider identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The ID of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-xxx</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    /**
     * <p>The name of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-provider</p>
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
