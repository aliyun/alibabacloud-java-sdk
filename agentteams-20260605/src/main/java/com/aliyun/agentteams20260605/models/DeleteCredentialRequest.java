// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class DeleteCredentialRequest extends TeaModel {
    /**
     * <p>The idempotence token that ensures the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-e5f6-7890-1234-567890abcdef</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The name of the credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialRequest self = new DeleteCredentialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteCredentialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
