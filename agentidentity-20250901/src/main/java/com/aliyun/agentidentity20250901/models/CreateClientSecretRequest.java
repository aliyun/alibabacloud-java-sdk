// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateClientSecretRequest extends TeaModel {
    /**
     * <p>The ID of the client. If you specify ClientId, you do not need to specify UserPoolName. Specify either ClientName or ClientId. If both are specified, ClientId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>client_xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The name of the client. Specify either ClientName or ClientId.</p>
     * 
     * <strong>example:</strong>
     * <p>my-web-app</p>
     */
    @NameInMap("ClientName")
    public String clientName;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static CreateClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientSecretRequest self = new CreateClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientSecretRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateClientSecretRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public CreateClientSecretRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
