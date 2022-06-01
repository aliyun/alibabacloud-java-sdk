// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateOAuthTokenRequest extends TeaModel {
    // clientId
    @NameInMap("clientId")
    public String clientId;

    // client_secret
    @NameInMap("clientSecret")
    public String clientSecret;

    // 当前grantType=code时必传
    @NameInMap("code")
    public String code;

    // 授权类型：code，token
    @NameInMap("grantType")
    public String grantType;

    // code = token时必传
    @NameInMap("login")
    public String login;

    // 授权范围.例如：read:repo,write:repo
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
