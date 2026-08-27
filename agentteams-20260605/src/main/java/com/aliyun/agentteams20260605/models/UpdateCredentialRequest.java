// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateCredentialRequest extends TeaModel {
    /**
     * <p>The credential value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-yyyyyyyyyyyy</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-e5f6-7890-1234-567890abcdef</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The credential description.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI API key for the team</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The AgentTeams instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ami-2ze8x9c6f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialRequest self = new UpdateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public UpdateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCredentialRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
