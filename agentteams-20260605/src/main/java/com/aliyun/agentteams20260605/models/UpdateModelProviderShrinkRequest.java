// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateModelProviderShrinkRequest extends TeaModel {
    /**
     * <p>The address of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://api.example.com">https://api.example.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The list of API keys for the model provider, in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sk-xxx&quot;]</p>
     */
    @NameInMap("ApiKeys")
    public String apiKeysShrink;

    /**
     * <p>The idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ct-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>updated provider</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The model provider ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-xxx</p>
     */
    @NameInMap("Id")
    public String id;

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
     * <p>The list of protocols supported by the model provider, in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;openai&quot;]</p>
     */
    @NameInMap("Protocols")
    public String protocolsShrink;

    public static UpdateModelProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProviderShrinkRequest self = new UpdateModelProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelProviderShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateModelProviderShrinkRequest setApiKeysShrink(String apiKeysShrink) {
        this.apiKeysShrink = apiKeysShrink;
        return this;
    }
    public String getApiKeysShrink() {
        return this.apiKeysShrink;
    }

    public UpdateModelProviderShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateModelProviderShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelProviderShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateModelProviderShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateModelProviderShrinkRequest setProtocolsShrink(String protocolsShrink) {
        this.protocolsShrink = protocolsShrink;
        return this;
    }
    public String getProtocolsShrink() {
        return this.protocolsShrink;
    }

}
