// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolClientShrinkRequest extends TeaModel {
    /**
     * <p>The validity period of the access token, in seconds. Valid values: 900 to 10800. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AccessTokenValidity")
    public String accessTokenValidity;

    /**
     * <p>The name of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>my-web-app</p>
     */
    @NameInMap("ClientName")
    public String clientName;

    /**
     * <p>Specifies whether Proof Key for Code Exchange (PKCE) is enforced.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnforcePKCE")
    public Boolean enforcePKCE;

    /**
     * <p>The new list of OAuth callback URLs. Specifying this parameter replaces all existing callback URLs.</p>
     */
    @NameInMap("RedirectURIs")
    public String redirectURIsShrink;

    /**
     * <p>The validity period of the refresh token, in seconds. Valid values: 7200 to 31536000 (90 days). Default value: 2592000 (30 days).</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("RefreshTokenValidity")
    public String refreshTokenValidity;

    /**
     * <p>The scopes granted to the application. You can specify multiple scopes.</p>
     */
    @NameInMap("Scopes")
    public String scopesShrink;

    /**
     * <p>Specifies whether an application secret is required. A value of true indicates a confidential client, and a value of false indicates a public client.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SecretRequired")
    public Boolean secretRequired;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateUserPoolClientShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPoolClientShrinkRequest self = new UpdateUserPoolClientShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPoolClientShrinkRequest setAccessTokenValidity(String accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }
    public String getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    public UpdateUserPoolClientShrinkRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public UpdateUserPoolClientShrinkRequest setEnforcePKCE(Boolean enforcePKCE) {
        this.enforcePKCE = enforcePKCE;
        return this;
    }
    public Boolean getEnforcePKCE() {
        return this.enforcePKCE;
    }

    public UpdateUserPoolClientShrinkRequest setRedirectURIsShrink(String redirectURIsShrink) {
        this.redirectURIsShrink = redirectURIsShrink;
        return this;
    }
    public String getRedirectURIsShrink() {
        return this.redirectURIsShrink;
    }

    public UpdateUserPoolClientShrinkRequest setRefreshTokenValidity(String refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }
    public String getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    public UpdateUserPoolClientShrinkRequest setScopesShrink(String scopesShrink) {
        this.scopesShrink = scopesShrink;
        return this;
    }
    public String getScopesShrink() {
        return this.scopesShrink;
    }

    public UpdateUserPoolClientShrinkRequest setSecretRequired(Boolean secretRequired) {
        this.secretRequired = secretRequired;
        return this;
    }
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

    public UpdateUserPoolClientShrinkRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
