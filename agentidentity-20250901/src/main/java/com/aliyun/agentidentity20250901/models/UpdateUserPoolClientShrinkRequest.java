// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateUserPoolClientShrinkRequest extends TeaModel {
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
    public String redirectURIsShrink;

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
