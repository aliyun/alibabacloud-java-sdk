// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolClientRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AccessTokenValidity")
    public String accessTokenValidity;

    /**
     * <strong>example:</strong>
     * <p>my-web-app</p>
     */
    @NameInMap("ClientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnforcePKCE")
    public Boolean enforcePKCE;

    @NameInMap("RedirectURIs")
    public java.util.List<String> redirectURIs;

    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("RefreshTokenValidity")
    public String refreshTokenValidity;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SecretRequired")
    public Boolean secretRequired;

    /**
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateUserPoolClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPoolClientRequest self = new UpdateUserPoolClientRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPoolClientRequest setAccessTokenValidity(String accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }
    public String getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    public UpdateUserPoolClientRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public UpdateUserPoolClientRequest setEnforcePKCE(Boolean enforcePKCE) {
        this.enforcePKCE = enforcePKCE;
        return this;
    }
    public Boolean getEnforcePKCE() {
        return this.enforcePKCE;
    }

    public UpdateUserPoolClientRequest setRedirectURIs(java.util.List<String> redirectURIs) {
        this.redirectURIs = redirectURIs;
        return this;
    }
    public java.util.List<String> getRedirectURIs() {
        return this.redirectURIs;
    }

    public UpdateUserPoolClientRequest setRefreshTokenValidity(String refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }
    public String getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    public UpdateUserPoolClientRequest setSecretRequired(Boolean secretRequired) {
        this.secretRequired = secretRequired;
        return this;
    }
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

    public UpdateUserPoolClientRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
