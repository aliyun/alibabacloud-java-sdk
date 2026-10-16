// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolClientShrinkRequest extends TeaModel {
    /**
     * <p>The validity period of the access token, in seconds. Valid values: 900 to 10800. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AccessTokenValidity")
    public String accessTokenValidity;

    /**
     * <p>The name of the client. The name must be unique within the same user pool and must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-web-app</p>
     */
    @NameInMap("ClientName")
    public String clientName;

    /**
     * <p>Specifies whether to enforce Proof Key for Code Exchange (PKCE). Valid values:</p>
     * <ul>
     * <li>true: Enforced. The code_challenge parameter is required in the authorization code flow.</li>
     * <li>false: Not enforced.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnforcePKCE")
    public Boolean enforcePKCE;

    /**
     * <p>The list of OAuth redirect URIs. After authorization is complete, the user\&quot;s browser is redirected to one of the URIs in the list.</p>
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
     * <p>Specifies whether an application secret is required. Valid values:</p>
     * <ul>
     * <li>true: Required. This value applies to confidential clients such as server-side applications. You must call CreateClientSecret to create a secret.</li>
     * <li>false: Not required. This value applies to public clients such as single-page applications (SPAs) and mobile applications.</li>
     * </ul>
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

    public static CreateUserPoolClientShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolClientShrinkRequest self = new CreateUserPoolClientShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolClientShrinkRequest setAccessTokenValidity(String accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }
    public String getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    public CreateUserPoolClientShrinkRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public CreateUserPoolClientShrinkRequest setEnforcePKCE(Boolean enforcePKCE) {
        this.enforcePKCE = enforcePKCE;
        return this;
    }
    public Boolean getEnforcePKCE() {
        return this.enforcePKCE;
    }

    public CreateUserPoolClientShrinkRequest setRedirectURIsShrink(String redirectURIsShrink) {
        this.redirectURIsShrink = redirectURIsShrink;
        return this;
    }
    public String getRedirectURIsShrink() {
        return this.redirectURIsShrink;
    }

    public CreateUserPoolClientShrinkRequest setRefreshTokenValidity(String refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }
    public String getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    public CreateUserPoolClientShrinkRequest setScopesShrink(String scopesShrink) {
        this.scopesShrink = scopesShrink;
        return this;
    }
    public String getScopesShrink() {
        return this.scopesShrink;
    }

    public CreateUserPoolClientShrinkRequest setSecretRequired(Boolean secretRequired) {
        this.secretRequired = secretRequired;
        return this;
    }
    public Boolean getSecretRequired() {
        return this.secretRequired;
    }

    public CreateUserPoolClientShrinkRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
