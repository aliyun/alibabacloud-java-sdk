// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationSsoConfigResponseBody extends TeaModel {
    @NameInMap("ApplicationSsoConfig")
    public GetApplicationSsoConfigResponseBodyApplicationSsoConfig applicationSsoConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationSsoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationSsoConfigResponseBody self = new GetApplicationSsoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationSsoConfigResponseBody setApplicationSsoConfig(GetApplicationSsoConfigResponseBodyApplicationSsoConfig applicationSsoConfig) {
        this.applicationSsoConfig = applicationSsoConfig;
        return this;
    }
    public GetApplicationSsoConfigResponseBodyApplicationSsoConfig getApplicationSsoConfig() {
        return this.applicationSsoConfig;
    }

    public GetApplicationSsoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims extends TeaModel {
        @NameInMap("ClaimName")
        public String claimName;

        @NameInMap("ClaimValueExpression")
        public String claimValueExpression;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims setClaimName(String claimName) {
            this.claimName = claimName;
            return this;
        }
        public String getClaimName() {
            return this.claimName;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims setClaimValueExpression(String claimValueExpression) {
            this.claimValueExpression = claimValueExpression;
            return this;
        }
        public String getClaimValueExpression() {
            return this.claimValueExpression;
        }

    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig extends TeaModel {
        @NameInMap("AccessTokenEffectiveTime")
        public Long accessTokenEffectiveTime;

        @NameInMap("CodeEffectiveTime")
        public Long codeEffectiveTime;

        @NameInMap("CustomClaims")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims> customClaims;

        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        @NameInMap("GrantTypes")
        public java.util.List<String> grantTypes;

        @NameInMap("IdTokenEffectiveTime")
        public Long idTokenEffectiveTime;

        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        @NameInMap("PostLogoutRedirectUris")
        public java.util.List<String> postLogoutRedirectUris;

        @NameInMap("RedirectUris")
        public java.util.List<String> redirectUris;

        @NameInMap("RefreshTokenEffective")
        public Long refreshTokenEffective;

        @NameInMap("ResponseTypes")
        public java.util.List<String> responseTypes;

        @NameInMap("SubjectIdExpression")
        public String subjectIdExpression;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setAccessTokenEffectiveTime(Long accessTokenEffectiveTime) {
            this.accessTokenEffectiveTime = accessTokenEffectiveTime;
            return this;
        }
        public Long getAccessTokenEffectiveTime() {
            return this.accessTokenEffectiveTime;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setCodeEffectiveTime(Long codeEffectiveTime) {
            this.codeEffectiveTime = codeEffectiveTime;
            return this;
        }
        public Long getCodeEffectiveTime() {
            return this.codeEffectiveTime;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setCustomClaims(java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims> customClaims) {
            this.customClaims = customClaims;
            return this;
        }
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims> getCustomClaims() {
            return this.customClaims;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setGrantTypes(java.util.List<String> grantTypes) {
            this.grantTypes = grantTypes;
            return this;
        }
        public java.util.List<String> getGrantTypes() {
            return this.grantTypes;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setIdTokenEffectiveTime(Long idTokenEffectiveTime) {
            this.idTokenEffectiveTime = idTokenEffectiveTime;
            return this;
        }
        public Long getIdTokenEffectiveTime() {
            return this.idTokenEffectiveTime;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setPkceChallengeMethods(java.util.List<String> pkceChallengeMethods) {
            this.pkceChallengeMethods = pkceChallengeMethods;
            return this;
        }
        public java.util.List<String> getPkceChallengeMethods() {
            return this.pkceChallengeMethods;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setPostLogoutRedirectUris(java.util.List<String> postLogoutRedirectUris) {
            this.postLogoutRedirectUris = postLogoutRedirectUris;
            return this;
        }
        public java.util.List<String> getPostLogoutRedirectUris() {
            return this.postLogoutRedirectUris;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setRedirectUris(java.util.List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setRefreshTokenEffective(Long refreshTokenEffective) {
            this.refreshTokenEffective = refreshTokenEffective;
            return this;
        }
        public Long getRefreshTokenEffective() {
            return this.refreshTokenEffective;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setResponseTypes(java.util.List<String> responseTypes) {
            this.responseTypes = responseTypes;
            return this;
        }
        public java.util.List<String> getResponseTypes() {
            return this.responseTypes;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setSubjectIdExpression(String subjectIdExpression) {
            this.subjectIdExpression = subjectIdExpression;
            return this;
        }
        public String getSubjectIdExpression() {
            return this.subjectIdExpression;
        }

    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain extends TeaModel {
        @NameInMap("Oauth2AuthorizationEndpoint")
        public String oauth2AuthorizationEndpoint;

        @NameInMap("Oauth2DeviceAuthorizationEndpoint")
        public String oauth2DeviceAuthorizationEndpoint;

        @NameInMap("Oauth2RevokeEndpoint")
        public String oauth2RevokeEndpoint;

        @NameInMap("Oauth2TokenEndpoint")
        public String oauth2TokenEndpoint;

        @NameInMap("Oauth2UserinfoEndpoint")
        public String oauth2UserinfoEndpoint;

        @NameInMap("OidcIssuer")
        public String oidcIssuer;

        @NameInMap("OidcJwksEndpoint")
        public String oidcJwksEndpoint;

        @NameInMap("OidcLogoutEndpoint")
        public String oidcLogoutEndpoint;

        @NameInMap("SamlMetaEndpoint")
        public String samlMetaEndpoint;

        @NameInMap("SamlSsoEndpoint")
        public String samlSsoEndpoint;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOauth2AuthorizationEndpoint(String oauth2AuthorizationEndpoint) {
            this.oauth2AuthorizationEndpoint = oauth2AuthorizationEndpoint;
            return this;
        }
        public String getOauth2AuthorizationEndpoint() {
            return this.oauth2AuthorizationEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOauth2DeviceAuthorizationEndpoint(String oauth2DeviceAuthorizationEndpoint) {
            this.oauth2DeviceAuthorizationEndpoint = oauth2DeviceAuthorizationEndpoint;
            return this;
        }
        public String getOauth2DeviceAuthorizationEndpoint() {
            return this.oauth2DeviceAuthorizationEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOauth2RevokeEndpoint(String oauth2RevokeEndpoint) {
            this.oauth2RevokeEndpoint = oauth2RevokeEndpoint;
            return this;
        }
        public String getOauth2RevokeEndpoint() {
            return this.oauth2RevokeEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOauth2TokenEndpoint(String oauth2TokenEndpoint) {
            this.oauth2TokenEndpoint = oauth2TokenEndpoint;
            return this;
        }
        public String getOauth2TokenEndpoint() {
            return this.oauth2TokenEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOauth2UserinfoEndpoint(String oauth2UserinfoEndpoint) {
            this.oauth2UserinfoEndpoint = oauth2UserinfoEndpoint;
            return this;
        }
        public String getOauth2UserinfoEndpoint() {
            return this.oauth2UserinfoEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOidcIssuer(String oidcIssuer) {
            this.oidcIssuer = oidcIssuer;
            return this;
        }
        public String getOidcIssuer() {
            return this.oidcIssuer;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOidcJwksEndpoint(String oidcJwksEndpoint) {
            this.oidcJwksEndpoint = oidcJwksEndpoint;
            return this;
        }
        public String getOidcJwksEndpoint() {
            return this.oidcJwksEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setOidcLogoutEndpoint(String oidcLogoutEndpoint) {
            this.oidcLogoutEndpoint = oidcLogoutEndpoint;
            return this;
        }
        public String getOidcLogoutEndpoint() {
            return this.oidcLogoutEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setSamlMetaEndpoint(String samlMetaEndpoint) {
            this.samlMetaEndpoint = samlMetaEndpoint;
            return this;
        }
        public String getSamlMetaEndpoint() {
            return this.samlMetaEndpoint;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain setSamlSsoEndpoint(String samlSsoEndpoint) {
            this.samlSsoEndpoint = samlSsoEndpoint;
            return this;
        }
        public String getSamlSsoEndpoint() {
            return this.samlSsoEndpoint;
        }

    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValueExpression")
        public String attributeValueExpression;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements setAttributeValueExpression(String attributeValueExpression) {
            this.attributeValueExpression = attributeValueExpression;
            return this;
        }
        public String getAttributeValueExpression() {
            return this.attributeValueExpression;
        }

    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig extends TeaModel {
        @NameInMap("AttributeStatements")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements> attributeStatements;

        @NameInMap("DefaultRelayState")
        public String defaultRelayState;

        @NameInMap("NameIdFormat")
        public String nameIdFormat;

        @NameInMap("NameIdValueExpression")
        public String nameIdValueExpression;

        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        @NameInMap("SpEntityId")
        public String spEntityId;

        @NameInMap("SpSsoAcsUrl")
        public String spSsoAcsUrl;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setAttributeStatements(java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements> attributeStatements) {
            this.attributeStatements = attributeStatements;
            return this;
        }
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements> getAttributeStatements() {
            return this.attributeStatements;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setDefaultRelayState(String defaultRelayState) {
            this.defaultRelayState = defaultRelayState;
            return this;
        }
        public String getDefaultRelayState() {
            return this.defaultRelayState;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setNameIdFormat(String nameIdFormat) {
            this.nameIdFormat = nameIdFormat;
            return this;
        }
        public String getNameIdFormat() {
            return this.nameIdFormat;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setNameIdValueExpression(String nameIdValueExpression) {
            this.nameIdValueExpression = nameIdValueExpression;
            return this;
        }
        public String getNameIdValueExpression() {
            return this.nameIdValueExpression;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setSpEntityId(String spEntityId) {
            this.spEntityId = spEntityId;
            return this;
        }
        public String getSpEntityId() {
            return this.spEntityId;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setSpSsoAcsUrl(String spSsoAcsUrl) {
            this.spSsoAcsUrl = spSsoAcsUrl;
            return this;
        }
        public String getSpSsoAcsUrl() {
            return this.spSsoAcsUrl;
        }

    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfig extends TeaModel {
        @NameInMap("InitLoginType")
        public String initLoginType;

        @NameInMap("InitLoginUrl")
        public String initLoginUrl;

        @NameInMap("OidcSsoConfig")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig oidcSsoConfig;

        @NameInMap("ProtocolEndpointDomain")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain protocolEndpointDomain;

        @NameInMap("SamlSsoConfig")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig samlSsoConfig;

        @NameInMap("SsoStatus")
        public String ssoStatus;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfig self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfig setInitLoginType(String initLoginType) {
            this.initLoginType = initLoginType;
            return this;
        }
        public String getInitLoginType() {
            return this.initLoginType;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfig setInitLoginUrl(String initLoginUrl) {
            this.initLoginUrl = initLoginUrl;
            return this;
        }
        public String getInitLoginUrl() {
            return this.initLoginUrl;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfig setOidcSsoConfig(GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig oidcSsoConfig) {
            this.oidcSsoConfig = oidcSsoConfig;
            return this;
        }
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig getOidcSsoConfig() {
            return this.oidcSsoConfig;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfig setProtocolEndpointDomain(GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain protocolEndpointDomain) {
            this.protocolEndpointDomain = protocolEndpointDomain;
            return this;
        }
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain getProtocolEndpointDomain() {
            return this.protocolEndpointDomain;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfig setSamlSsoConfig(GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig samlSsoConfig) {
            this.samlSsoConfig = samlSsoConfig;
            return this;
        }
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig getSamlSsoConfig() {
            return this.samlSsoConfig;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfig setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

}
