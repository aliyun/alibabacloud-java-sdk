// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateClientSecretRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientName")
    public String clientName;

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
