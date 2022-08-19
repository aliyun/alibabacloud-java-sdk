// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenRequest extends TeaModel {
    @NameInMap("client_id")
    public String clientId;

    @NameInMap("client_secret")
    public String clientSecret;

    @NameInMap("code")
    public String code;

    @NameInMap("code_verifier")
    public String codeVerifier;

    @NameInMap("device_code")
    public String deviceCode;

    @NameInMap("exclusive_tag")
    public String exclusiveTag;

    @NameInMap("grant_type")
    public String grantType;

    @NameInMap("password")
    public String password;

    @NameInMap("redirect_uri")
    public String redirectUri;

    @NameInMap("refresh_token")
    public String refreshToken;

    @NameInMap("scope")
    public String scope;

    @NameInMap("username")
    public String username;

    public static GenerateTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenRequest self = new GenerateTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GenerateTokenRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public GenerateTokenRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateTokenRequest setCodeVerifier(String codeVerifier) {
        this.codeVerifier = codeVerifier;
        return this;
    }
    public String getCodeVerifier() {
        return this.codeVerifier;
    }

    public GenerateTokenRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public GenerateTokenRequest setExclusiveTag(String exclusiveTag) {
        this.exclusiveTag = exclusiveTag;
        return this;
    }
    public String getExclusiveTag() {
        return this.exclusiveTag;
    }

    public GenerateTokenRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GenerateTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateTokenRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public GenerateTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GenerateTokenRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GenerateTokenRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
