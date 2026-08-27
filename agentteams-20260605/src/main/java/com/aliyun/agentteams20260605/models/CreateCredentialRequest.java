// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    /**
     * <p>The credential value. This is a sensitive field and is not returned in plaintext.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxx</p>
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
     * <p>The credential key. The value must match the regular expression <code>^[A-Z_\\][A-Z0-9_\\]*\\$</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPENAI_API_KEY</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialRequest self = new CreateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCredentialRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
