// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelProviderRequest extends TeaModel {
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
    public java.util.List<String> apiKeys;

    /**
     * <p>The idempotency token that ensures the idempotence of the request.</p>
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
     * <p>my provider</p>
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
     * <p>Optional. The instance name for fuzzy matching.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of protocols supported by the model provider, in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;openai&quot;]</p>
     */
    @NameInMap("Protocols")
    public java.util.List<String> protocols;

    /**
     * <p>Optional. The instance status for exact matching.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Provider")
    public String provider;

    public static CreateModelProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderRequest self = new CreateModelProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateModelProviderRequest setApiKeys(java.util.List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    public CreateModelProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModelProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateModelProviderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelProviderRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public CreateModelProviderRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
