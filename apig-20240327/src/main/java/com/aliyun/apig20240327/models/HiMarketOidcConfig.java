// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketOidcConfig extends TeaModel {
    /**
     * <p>The OAuth2 Authorization Code configuration.</p>
     */
    @NameInMap("authCodeConfig")
    public HiMarketOidcConfigAuthCodeConfig authCodeConfig;

    /**
     * <p>Indicates whether the OIDC configuration is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The authorization type.</p>
     * 
     * <strong>example:</strong>
     * <p>authorization_code</p>
     */
    @NameInMap("grantType")
    public String grantType;

    /**
     * <p>The identity field mapping configuration.</p>
     */
    @NameInMap("identityMapping")
    public HiMarketOidcConfigIdentityMapping identityMapping;

    /**
     * <p>The provider logo URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/logo.png">https://example.com/logo.png</a></p>
     */
    @NameInMap("logoUrl")
    public String logoUrl;

    /**
     * <p>The OIDC configuration name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-oidc-config</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The OIDC provider name.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云IDaaS</p>
     */
    @NameInMap("provider")
    public String provider;

    public static HiMarketOidcConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketOidcConfig self = new HiMarketOidcConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketOidcConfig setAuthCodeConfig(HiMarketOidcConfigAuthCodeConfig authCodeConfig) {
        this.authCodeConfig = authCodeConfig;
        return this;
    }
    public HiMarketOidcConfigAuthCodeConfig getAuthCodeConfig() {
        return this.authCodeConfig;
    }

    public HiMarketOidcConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public HiMarketOidcConfig setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public HiMarketOidcConfig setIdentityMapping(HiMarketOidcConfigIdentityMapping identityMapping) {
        this.identityMapping = identityMapping;
        return this;
    }
    public HiMarketOidcConfigIdentityMapping getIdentityMapping() {
        return this.identityMapping;
    }

    public HiMarketOidcConfig setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public HiMarketOidcConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HiMarketOidcConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public static class HiMarketOidcConfigAuthCodeConfig extends TeaModel {
        /**
         * <p>The authorization endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idaas.example.com/oauth2/authorize">https://idaas.example.com/oauth2/authorize</a></p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The OAuth2 client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-client-id</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The OAuth2 client secret.</p>
         * 
         * <strong>example:</strong>
         * <p>my-client-secret</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        /**
         * <p>The OIDC issuer URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idaas.example.com">https://idaas.example.com</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The JWKS public key set URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idaas.example.com/.well-known/jwks.json">https://idaas.example.com/.well-known/jwks.json</a></p>
         */
        @NameInMap("jwkSetUri")
        public String jwkSetUri;

        /**
         * <p>The OAuth2 redirect URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gateway.example.com/callback">https://gateway.example.com/callback</a></p>
         */
        @NameInMap("redirectUri")
        public String redirectUri;

        /**
         * <p>The OAuth2 authorization scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>openid profile email</p>
         */
        @NameInMap("scopes")
        public String scopes;

        /**
         * <p>The token endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idaas.example.com/oauth2/token">https://idaas.example.com/oauth2/token</a></p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The UserInfo endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idaas.example.com/userinfo">https://idaas.example.com/userinfo</a></p>
         */
        @NameInMap("userInfoEndpoint")
        public String userInfoEndpoint;

        public static HiMarketOidcConfigAuthCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            HiMarketOidcConfigAuthCodeConfig self = new HiMarketOidcConfigAuthCodeConfig();
            return TeaModel.build(map, self);
        }

        public HiMarketOidcConfigAuthCodeConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public HiMarketOidcConfigAuthCodeConfig setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public HiMarketOidcConfigAuthCodeConfig setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public HiMarketOidcConfigAuthCodeConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public HiMarketOidcConfigAuthCodeConfig setJwkSetUri(String jwkSetUri) {
            this.jwkSetUri = jwkSetUri;
            return this;
        }
        public String getJwkSetUri() {
            return this.jwkSetUri;
        }

        public HiMarketOidcConfigAuthCodeConfig setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public String getRedirectUri() {
            return this.redirectUri;
        }

        public HiMarketOidcConfigAuthCodeConfig setScopes(String scopes) {
            this.scopes = scopes;
            return this;
        }
        public String getScopes() {
            return this.scopes;
        }

        public HiMarketOidcConfigAuthCodeConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public HiMarketOidcConfigAuthCodeConfig setUserInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = userInfoEndpoint;
            return this;
        }
        public String getUserInfoEndpoint() {
            return this.userInfoEndpoint;
        }

    }

    public static class HiMarketOidcConfigIdentityMapping extends TeaModel {
        /**
         * <p>The custom field mappings.</p>
         */
        @NameInMap("customFields")
        public java.util.Map<String, String> customFields;

        /**
         * <p>The identity field name that corresponds to the email address.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("emailField")
        public String emailField;

        /**
         * <p>The identity field name that corresponds to the user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("userIdField")
        public String userIdField;

        /**
         * <p>The identity field name that corresponds to the username.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("userNameField")
        public String userNameField;

        public static HiMarketOidcConfigIdentityMapping build(java.util.Map<String, ?> map) throws Exception {
            HiMarketOidcConfigIdentityMapping self = new HiMarketOidcConfigIdentityMapping();
            return TeaModel.build(map, self);
        }

        public HiMarketOidcConfigIdentityMapping setCustomFields(java.util.Map<String, String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.Map<String, String> getCustomFields() {
            return this.customFields;
        }

        public HiMarketOidcConfigIdentityMapping setEmailField(String emailField) {
            this.emailField = emailField;
            return this;
        }
        public String getEmailField() {
            return this.emailField;
        }

        public HiMarketOidcConfigIdentityMapping setUserIdField(String userIdField) {
            this.userIdField = userIdField;
            return this;
        }
        public String getUserIdField() {
            return this.userIdField;
        }

        public HiMarketOidcConfigIdentityMapping setUserNameField(String userNameField) {
            this.userNameField = userNameField;
            return this;
        }
        public String getUserNameField() {
            return this.userNameField;
        }

    }

}
