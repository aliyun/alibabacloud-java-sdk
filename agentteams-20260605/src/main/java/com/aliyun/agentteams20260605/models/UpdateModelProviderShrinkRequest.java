// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateModelProviderShrinkRequest extends TeaModel {
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
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
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
