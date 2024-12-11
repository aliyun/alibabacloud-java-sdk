// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ThirdApp extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Name")
    public String name;

    @NameInMap("OidcSsoConfig")
    public ThirdAppOidcSsoConfig oidcSsoConfig;

    @NameInMap("Secrets")
    public java.util.List<ThirdAppSecrets> secrets;

    public static ThirdApp build(java.util.Map<String, ?> map) throws Exception {
        ThirdApp self = new ThirdApp();
        return TeaModel.build(map, self);
    }

    public ThirdApp setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ThirdApp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ThirdApp setOidcSsoConfig(ThirdAppOidcSsoConfig oidcSsoConfig) {
        this.oidcSsoConfig = oidcSsoConfig;
        return this;
    }
    public ThirdAppOidcSsoConfig getOidcSsoConfig() {
        return this.oidcSsoConfig;
    }

    public ThirdApp setSecrets(java.util.List<ThirdAppSecrets> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.List<ThirdAppSecrets> getSecrets() {
        return this.secrets;
    }

    public static class ThirdAppOidcSsoConfigEndpoints extends TeaModel {
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        @NameInMap("DiscoveryEndpoint")
        public String discoveryEndpoint;

        @NameInMap("GuestAuthorizationEndpoint")
        public String guestAuthorizationEndpoint;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("JwksEndpoint")
        public String jwksEndpoint;

        @NameInMap("LogoutEndpoint")
        public String logoutEndpoint;

        @NameInMap("RevokeEndpoint")
        public String revokeEndpoint;

        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        @NameInMap("UserinfoEndpoint")
        public String userinfoEndpoint;

        public static ThirdAppOidcSsoConfigEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ThirdAppOidcSsoConfigEndpoints self = new ThirdAppOidcSsoConfigEndpoints();
            return TeaModel.build(map, self);
        }

        public ThirdAppOidcSsoConfigEndpoints setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setGuestAuthorizationEndpoint(String guestAuthorizationEndpoint) {
            this.guestAuthorizationEndpoint = guestAuthorizationEndpoint;
            return this;
        }
        public String getGuestAuthorizationEndpoint() {
            return this.guestAuthorizationEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ThirdAppOidcSsoConfigEndpoints setJwksEndpoint(String jwksEndpoint) {
            this.jwksEndpoint = jwksEndpoint;
            return this;
        }
        public String getJwksEndpoint() {
            return this.jwksEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setLogoutEndpoint(String logoutEndpoint) {
            this.logoutEndpoint = logoutEndpoint;
            return this;
        }
        public String getLogoutEndpoint() {
            return this.logoutEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setRevokeEndpoint(String revokeEndpoint) {
            this.revokeEndpoint = revokeEndpoint;
            return this;
        }
        public String getRevokeEndpoint() {
            return this.revokeEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public ThirdAppOidcSsoConfigEndpoints setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class ThirdAppOidcSsoConfig extends TeaModel {
        @NameInMap("AccessTokenEffectiveTime")
        public Integer accessTokenEffectiveTime;

        @NameInMap("CodeEffectiveTime")
        public Integer codeEffectiveTime;

        @NameInMap("EnableAuthLogin")
        public Boolean enableAuthLogin;

        @NameInMap("Endpoints")
        public ThirdAppOidcSsoConfigEndpoints endpoints;

        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        @NameInMap("GrantTypes")
        public java.util.List<String> grantTypes;

        @NameInMap("IdTokenAlgorithmType")
        public Integer idTokenAlgorithmType;

        @NameInMap("IdTokenEffectiveTime")
        public Integer idTokenEffectiveTime;

        @NameInMap("RedirectUris")
        public java.util.List<String> redirectUris;

        @NameInMap("RefreshTokenEffective")
        public Integer refreshTokenEffective;

        public static ThirdAppOidcSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            ThirdAppOidcSsoConfig self = new ThirdAppOidcSsoConfig();
            return TeaModel.build(map, self);
        }

        public ThirdAppOidcSsoConfig setAccessTokenEffectiveTime(Integer accessTokenEffectiveTime) {
            this.accessTokenEffectiveTime = accessTokenEffectiveTime;
            return this;
        }
        public Integer getAccessTokenEffectiveTime() {
            return this.accessTokenEffectiveTime;
        }

        public ThirdAppOidcSsoConfig setCodeEffectiveTime(Integer codeEffectiveTime) {
            this.codeEffectiveTime = codeEffectiveTime;
            return this;
        }
        public Integer getCodeEffectiveTime() {
            return this.codeEffectiveTime;
        }

        public ThirdAppOidcSsoConfig setEnableAuthLogin(Boolean enableAuthLogin) {
            this.enableAuthLogin = enableAuthLogin;
            return this;
        }
        public Boolean getEnableAuthLogin() {
            return this.enableAuthLogin;
        }

        public ThirdAppOidcSsoConfig setEndpoints(ThirdAppOidcSsoConfigEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public ThirdAppOidcSsoConfigEndpoints getEndpoints() {
            return this.endpoints;
        }

        public ThirdAppOidcSsoConfig setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public ThirdAppOidcSsoConfig setGrantTypes(java.util.List<String> grantTypes) {
            this.grantTypes = grantTypes;
            return this;
        }
        public java.util.List<String> getGrantTypes() {
            return this.grantTypes;
        }

        public ThirdAppOidcSsoConfig setIdTokenAlgorithmType(Integer idTokenAlgorithmType) {
            this.idTokenAlgorithmType = idTokenAlgorithmType;
            return this;
        }
        public Integer getIdTokenAlgorithmType() {
            return this.idTokenAlgorithmType;
        }

        public ThirdAppOidcSsoConfig setIdTokenEffectiveTime(Integer idTokenEffectiveTime) {
            this.idTokenEffectiveTime = idTokenEffectiveTime;
            return this;
        }
        public Integer getIdTokenEffectiveTime() {
            return this.idTokenEffectiveTime;
        }

        public ThirdAppOidcSsoConfig setRedirectUris(java.util.List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

        public ThirdAppOidcSsoConfig setRefreshTokenEffective(Integer refreshTokenEffective) {
            this.refreshTokenEffective = refreshTokenEffective;
            return this;
        }
        public Integer getRefreshTokenEffective() {
            return this.refreshTokenEffective;
        }

    }

    public static class ThirdAppSecrets extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Secret")
        public String secret;

        public static ThirdAppSecrets build(java.util.Map<String, ?> map) throws Exception {
            ThirdAppSecrets self = new ThirdAppSecrets();
            return TeaModel.build(map, self);
        }

        public ThirdAppSecrets setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ThirdAppSecrets setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

}
