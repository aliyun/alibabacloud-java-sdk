// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenByAuthorizationServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testxxxxx</p>
     */
    @NameInMap("application_federated_credential_name")
    public String applicationFederatedCredentialName;

    /**
     * <strong>example:</strong>
     * <p>eyJraWQiOiJLRVlLZ0Iyxxxxx</p>
     */
    @NameInMap("client_assertion")
    public String clientAssertion;

    /**
     * <strong>example:</strong>
     * <p>urn:ietf:params:oauth:client-assertion-type:jwt-bearer</p>
     */
    @NameInMap("client_assertion_type")
    public String clientAssertionType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>CSEHDcHcrUKHw1CuxkJEHPveWRxxxxx</p>
     */
    @NameInMap("client_secret")
    public String clientSecret;

    /**
     * <strong>example:</strong>
     * <p>testxxxxx</p>
     */
    @NameInMap("client_x509")
    public String clientX509;

    /**
     * <strong>example:</strong>
     * <p>testxxxxx</p>
     */
    @NameInMap("client_x509_chain")
    public String clientX509Chain;

    /**
     * <strong>example:</strong>
     * <p>CO541xY59EsKniV2wvWDXZ4jiKxxxxx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("code_verifier")
    public String codeVerifier;

    /**
     * <strong>example:</strong>
     * <p>DCxxxxxx</p>
     */
    @NameInMap("device_code")
    public String deviceCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>authorization_code</p>
     */
    @NameInMap("grant_type")
    public String grantType;

    /**
     * <strong>example:</strong>
     * <p>testxxxxx</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/xxxxx">https://example.com/xxxxx</a></p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <strong>example:</strong>
     * <p>RTxxxxx</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    /**
     * <strong>example:</strong>
     * <p>openid</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>userxxxxx</p>
     */
    @NameInMap("username")
    public String username;

    public static GenerateTokenByAuthorizationServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenByAuthorizationServerRequest self = new GenerateTokenByAuthorizationServerRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTokenByAuthorizationServerRequest setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
        this.applicationFederatedCredentialName = applicationFederatedCredentialName;
        return this;
    }
    public String getApplicationFederatedCredentialName() {
        return this.applicationFederatedCredentialName;
    }

    public GenerateTokenByAuthorizationServerRequest setClientAssertion(String clientAssertion) {
        this.clientAssertion = clientAssertion;
        return this;
    }
    public String getClientAssertion() {
        return this.clientAssertion;
    }

    public GenerateTokenByAuthorizationServerRequest setClientAssertionType(String clientAssertionType) {
        this.clientAssertionType = clientAssertionType;
        return this;
    }
    public String getClientAssertionType() {
        return this.clientAssertionType;
    }

    public GenerateTokenByAuthorizationServerRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GenerateTokenByAuthorizationServerRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public GenerateTokenByAuthorizationServerRequest setClientX509(String clientX509) {
        this.clientX509 = clientX509;
        return this;
    }
    public String getClientX509() {
        return this.clientX509;
    }

    public GenerateTokenByAuthorizationServerRequest setClientX509Chain(String clientX509Chain) {
        this.clientX509Chain = clientX509Chain;
        return this;
    }
    public String getClientX509Chain() {
        return this.clientX509Chain;
    }

    public GenerateTokenByAuthorizationServerRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateTokenByAuthorizationServerRequest setCodeVerifier(String codeVerifier) {
        this.codeVerifier = codeVerifier;
        return this;
    }
    public String getCodeVerifier() {
        return this.codeVerifier;
    }

    public GenerateTokenByAuthorizationServerRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public GenerateTokenByAuthorizationServerRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GenerateTokenByAuthorizationServerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GenerateTokenByAuthorizationServerRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public GenerateTokenByAuthorizationServerRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GenerateTokenByAuthorizationServerRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GenerateTokenByAuthorizationServerRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
