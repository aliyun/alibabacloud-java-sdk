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
     * <p>The client secret. This parameter is required when \<code>grant_type\\</code> is \<code>client_credentials\\</code> and the \<code>client_secret_post\\</code> method is used.</p>
     * 
     * <strong>example:</strong>
     * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
     */
    @NameInMap("client_secret")
    public String clientSecret;

    /**
     * <p>The authorization code. This parameter is required when \<code>grant_type\\</code> is \<code>authorization_code\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The code verifier. This is used in the authorization code grant type when PKCE is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("code_verifier")
    public String codeVerifier;

    /**
     * <p>The device code. This parameter is required when \<code>grant_type\\</code> is \<code>urn:ietf:params:oauth:grant-type:device_code\\</code> (device flow).</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("device_code")
    public String deviceCode;

    /**
     * <p>The excluded tag.</p>
     * 
     * <strong>example:</strong>
     * <p>ATxxx</p>
     */
    @NameInMap("exclusive_tag")
    public String exclusiveTag;

    /**
     * <p>The authorization grant type. The following types are supported:</p>
     * <ul>
     * <li><p>\<code>client_credentials\\</code>: Client credentials grant. Requires \<code>client_id\\</code> and \<code>client_secret\\</code>.</p>
     * </li>
     * <li><p>\<code>refresh_token\\</code>: Refresh token grant.</p>
     * </li>
     * <li><p>\<code>authorization_code\\</code>: Authorization code grant.</p>
     * </li>
     * <li><p>\<code>urn:ietf:params:oauth:grant-type:device_code\\</code>: Device flow.</p>
     * </li>
     * <li><p>\<code>password\\</code>: Password grant.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client_credentials</p>
     */
    @NameInMap("grant_type")
    public String grantType;

    /**
     * <p>The username. This parameter is required for password mode.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The redirection URI. This parameter is required for the authorization code grant type. It must match the redirection URI in the request to get the authorization code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The refresh token. This parameter is required when \<code>grant_type\\</code> is \<code>refresh_token\\</code> (refresh token grant).</p>
     * 
     * <strong>example:</strong>
     * <p>ATxxx</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    /**
     * <p>The scope. This parameter is optional. Multiple values are supported. Separate multiple values with spaces.
     * Valid values:</p>
     * <ul>
     * <li><p>openid</p>
     * </li>
     * <li><p>email</p>
     * </li>
     * <li><p>phone</p>
     * </li>
     * <li><p>profile</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The username. This parameter is required for the password grant type.</p>
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
