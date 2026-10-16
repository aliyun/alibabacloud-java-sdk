// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteClientSecretRequest extends TeaModel {
    /**
     * <p>The client ID. Specify either this parameter or ClientName. If both are specified, ClientId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>client-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client name. Specify either this parameter or ClientId.</p>
     * 
     * <strong>example:</strong>
     * <p>my-web-app</p>
     */
    @NameInMap("ClientName")
    public String clientName;

    /**
     * <p>The key ID of the client secret to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>secret-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("ClientSecretId")
    public String clientSecretId;

    /**
     * <p>The user pool name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
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
