// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateOAuthTokenRequest extends TeaModel {
    /**
     * <p>clientId</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("clientId")
    public String clientId;

    /**
     * <p>client_secret</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("clientSecret")
    public String clientSecret;

    @NameInMap("code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("grantType")
    public String grantType;

    @NameInMap("login")
    public String login;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scope")
    public String scope;

    public static CreateOAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuthTokenRequest self = new CreateOAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateOAuthTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateOAuthTokenRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public CreateOAuthTokenRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOAuthTokenRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public CreateOAuthTokenRequest setLogin(String login) {
        this.login = login;
        return this;
    }
    public String getLogin() {
        return this.login;
    }

    public CreateOAuthTokenRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
