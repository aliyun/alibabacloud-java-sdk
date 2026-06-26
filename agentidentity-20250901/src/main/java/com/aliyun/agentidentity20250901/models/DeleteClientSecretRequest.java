// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteClientSecretRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientName")
    public String clientName;

    @NameInMap("ClientSecretId")
    public String clientSecretId;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static DeleteClientSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientSecretRequest self = new DeleteClientSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientSecretRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DeleteClientSecretRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public DeleteClientSecretRequest setClientSecretId(String clientSecretId) {
        this.clientSecretId = clientSecretId;
        return this;
    }
    public String getClientSecretId() {
        return this.clientSecretId;
    }

    public DeleteClientSecretRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
