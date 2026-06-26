// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolClientShrinkRequest extends TeaModel {
    @NameInMap("AccessTokenValidity")
    public String accessTokenValidity;

    @NameInMap("ClientName")
    public String clientName;

    @NameInMap("EnforcePKCE")
    public Boolean enforcePKCE;

    @NameInMap("RedirectURIs")
    public String redirectURIsShrink;

    @NameInMap("RefreshTokenValidity")
    public String refreshTokenValidity;

    @NameInMap("SecretRequired")
    public Boolean secretRequired;

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
