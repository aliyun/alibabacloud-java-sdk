// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketOidcConfig extends TeaModel {
    @NameInMap("authCodeConfig")
    public HiMarketOidcConfigAuthCodeConfig authCodeConfig;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("grantType")
    public String grantType;

    @NameInMap("identityMapping")
    public HiMarketOidcConfigIdentityMapping identityMapping;

    @NameInMap("logoUrl")
    public String logoUrl;

    @NameInMap("name")
    public String name;

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
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        @NameInMap("clientId")
        public String clientId;

        @NameInMap("clientSecret")
        public String clientSecret;

        @NameInMap("issuer")
        public String issuer;

        @NameInMap("jwkSetUri")
        public String jwkSetUri;

        @NameInMap("redirectUri")
        public String redirectUri;

        @NameInMap("scopes")
        public String scopes;

        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

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
        @NameInMap("customFields")
        public java.util.Map<String, String> customFields;

        @NameInMap("emailField")
        public String emailField;

        @NameInMap("userIdField")
        public String userIdField;

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
