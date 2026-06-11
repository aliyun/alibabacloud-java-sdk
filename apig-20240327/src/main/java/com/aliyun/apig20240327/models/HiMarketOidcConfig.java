// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketOidcConfig extends TeaModel {
    /**
     * <p>Configuration settings for the authorization code grant type.</p>
     */
    @NameInMap("authCodeConfig")
    public HiMarketOidcConfigAuthCodeConfig authCodeConfig;

    /**
     * <p>Enables or disables this identity provider. If set to <code>false</code>, users cannot sign in with this provider.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The OAuth 2.0 grant type. For OIDC, this must be <code>authorization_code</code>.</p>
     */
    @NameInMap("grantType")
    public String grantType;

    /**
     * <p>Specifies how to map claims from an ID token to user attributes in your system.</p>
     */
    @NameInMap("identityMapping")
    public HiMarketOidcConfigIdentityMapping identityMapping;

    /**
     * <p>The URL for the provider\&quot;s logo. This logo appears on the sign-in page.</p>
     */
    @NameInMap("logoUrl")
    public String logoUrl;

    /**
     * <p>The provider\&quot;s display name. This name appears on the sign-in page.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The unique identifier for the identity provider.</p>
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
         * <p>The URL of the identity provider\&quot;s authorization endpoint.</p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The client ID obtained from the identity provider after registering your application.</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The client secret obtained from the identity provider after registering your application.</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        /**
         * <p>The identity provider\&quot;s unique issuer URL, used to validate ID tokens.</p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The provider\&quot;s JWK Set URI. This URI provides the public keys needed to verify ID token signatures.</p>
         */
        @NameInMap("jwkSetUri")
        public String jwkSetUri;

        /**
         * <p>The application\&quot;s redirect URI. The provider sends the authorization code to this URI after successful authentication. You must register this URI with the identity provider.</p>
         */
        @NameInMap("redirectUri")
        public String redirectUri;

        /**
         * <p>A space-separated list of scopes to request from the provider. The <code>openid</code> scope is required for OIDC authentication. For example: <code>openid profile email</code>.</p>
         */
        @NameInMap("scopes")
        public String scopes;

        /**
         * <p>The URL of the identity provider\&quot;s token endpoint.</p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The URL of the identity provider\&quot;s user info endpoint.</p>
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
         * <p>Maps additional claims from the ID token to custom user attributes. For each mapping, the key is the target attribute in your system, and the value is the name of the claim from the ID token.</p>
         */
        @NameInMap("customFields")
        public java.util.Map<String, String> customFields;

        /**
         * <p>The ID token claim that maps to the user\&quot;s email address. The <code>email</code> claim is a common choice.</p>
         */
        @NameInMap("emailField")
        public String emailField;

        /**
         * <p>The ID token claim that maps to the user\&quot;s unique ID. The <code>sub</code> claim is a common choice.</p>
         */
        @NameInMap("userIdField")
        public String userIdField;

        /**
         * <p>The ID token claim that maps to the user\&quot;s display name. Common choices include <code>name</code> and <code>preferred_username</code>.</p>
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
