// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenRequest extends TeaModel {
    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>The client secret. This parameter is required if grant_type is set to client_credentials.</p>
     * 
     * <strong>example:</strong>
     * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
     */
    @NameInMap("client_secret")
    public String clientSecret;

    /**
     * <p>The authorization code. This parameter is required if grant_type is set to authorization_code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("code_verifier")
    public String codeVerifier;

    /**
     * <p>The device code. This parameter is required if grant_type is set to authorization_code.urn:ietf:params:oauth:grant-type:device_code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("device_code")
    public String deviceCode;

    /**
     * <p>The excluded tags.</p>
     * 
     * <strong>example:</strong>
     * <p>ATxxx</p>
     */
    @NameInMap("exclusive_tag")
    public String exclusiveTag;

    /**
     * <p>The authorization type. Valid values:</p>
     * <ul>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * <li></li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li>authorization_code</li>
     * <li>urn:ietf:params:oauth:grant-type:device_code</li>
     * <li>refresh_token</li>
     * <li>client_credentials: You must specify the client_id and client_secret parameters.</li>
     * <li>password: This option is not supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client_credentials</p>
     */
    @NameInMap("grant_type")
    public String grantType;

    /**
     * <p>The username. This parameter is required if grant_type is set to password. The password authentication type is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The redirect URI. This parameter is required if grant_type is set to authorization_code. The value of this parameter must be the same as the redirect URI in the request to obtain the authorization code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The refreshed token. This parameter is required if grant_type is set to refresh_token.</p>
     * 
     * <strong>example:</strong>
     * <p>ATxxx</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    /**
     * <p>The authorization scope. Valid values:</p>
     * <ul>
     * <li>openid</li>
     * <li>email</li>
     * <li>phone</li>
     * <li>profile</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The username. This parameter is required if grant_type is set to password. The password authentication type is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>uesrname_001</p>
     */
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
