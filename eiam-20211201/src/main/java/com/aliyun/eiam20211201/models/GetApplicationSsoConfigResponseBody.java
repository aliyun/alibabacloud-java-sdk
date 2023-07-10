// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationSsoConfigResponseBody extends TeaModel {
    /**
     * <p>The SSO configuration information of the application.</p>
     */
    @NameInMap("ApplicationSsoConfig")
    public GetApplicationSsoConfigResponseBodyApplicationSsoConfig applicationSsoConfig;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The claim name.</p>
         */
        @NameInMap("ClaimName")
        public String claimName;

        /**
         * <p>The expression that is used to generate the value of the claim.</p>
         */
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
        /**
         * <p>The validity period of the issued access token. Unit: seconds. Default value: 1200.</p>
         */
        @NameInMap("AccessTokenEffectiveTime")
        public Long accessTokenEffectiveTime;

        /**
         * <p>The validity period of the issued code. Unit: seconds. Default value: 60.</p>
         */
        @NameInMap("CodeEffectiveTime")
        public Long codeEffectiveTime;

        /**
         * <p>The custom claims that are returned for the ID token.</p>
         */
        @NameInMap("CustomClaims")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims> customClaims;

        /**
         * <p>The scopes of user attributes that can be returned for the UserInfo endpoint or ID token.</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>The list of grant types that are supported for OIDC protocols.</p>
         */
        @NameInMap("GrantTypes")
        public java.util.List<String> grantTypes;

        /**
         * <p>The validity period of the issued ID token. Unit: seconds. Default value: 300.</p>
         */
        @NameInMap("IdTokenEffectiveTime")
        public Long idTokenEffectiveTime;

        /**
         * <p>The ID of the identity authentication source in password mode. This parameter is returned only when the value of the GrantTypes parameter includes the password mode.</p>
         */
        @NameInMap("PasswordAuthenticationSourceId")
        public String passwordAuthenticationSourceId;

        /**
         * <p>Indicates whether time-based one-time password (TOTP) authentication is required in password mode. This parameter is returned only when the value of the GrantTypes parameter includes the password mode.</p>
         */
        @NameInMap("PasswordTotpMfaRequired")
        public Boolean passwordTotpMfaRequired;

        /**
         * <p>The algorithms that are used to calculate the code challenge for PKCE.</p>
         */
        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        /**
         * <p>Indicates whether the SSO of the application requires Proof Key for Code Exchange (PKCE) (RFC 7636).</p>
         */
        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The list of logout redirect URIs that are supported by the application.</p>
         */
        @NameInMap("PostLogoutRedirectUris")
        public java.util.List<String> postLogoutRedirectUris;

        /**
         * <p>The list of redirect URIs that are supported by the application.</p>
         */
        @NameInMap("RedirectUris")
        public java.util.List<String> redirectUris;

        /**
         * <p>The validity period of the issued refresh token. Unit: seconds. Default value: 86400.</p>
         */
        @NameInMap("RefreshTokenEffective")
        public Long refreshTokenEffective;

        /**
         * <p>The response types that are supported by the application. This parameter is returned when the value of the GrantTypes parameter includes the implicit mode.</p>
         */
        @NameInMap("ResponseTypes")
        public java.util.List<String> responseTypes;

        /**
         * <p>The custom expression that is used to generate the subject ID returned for the ID token.</p>
         */
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

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setPasswordAuthenticationSourceId(String passwordAuthenticationSourceId) {
            this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
            return this;
        }
        public String getPasswordAuthenticationSourceId() {
            return this.passwordAuthenticationSourceId;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setPasswordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
            this.passwordTotpMfaRequired = passwordTotpMfaRequired;
            return this;
        }
        public Boolean getPasswordTotpMfaRequired() {
            return this.passwordTotpMfaRequired;
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
        /**
         * <p>The OAuth2.0 authorization endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("Oauth2AuthorizationEndpoint")
        public String oauth2AuthorizationEndpoint;

        /**
         * <p>The OAuth2.0 device authorization endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("Oauth2DeviceAuthorizationEndpoint")
        public String oauth2DeviceAuthorizationEndpoint;

        /**
         * <p>The OAuth2.0 token revocation endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("Oauth2RevokeEndpoint")
        public String oauth2RevokeEndpoint;

        /**
         * <p>The OAuth2.0 token endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("Oauth2TokenEndpoint")
        public String oauth2TokenEndpoint;

        /**
         * <p>The OIDC UserInfo endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("Oauth2UserinfoEndpoint")
        public String oauth2UserinfoEndpoint;

        /**
         * <p>The information about the OIDC issuer. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("OidcIssuer")
        public String oidcIssuer;

        /**
         * <p>The JSON Web Key Set (JWKS) URL of the OIDC issuer. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("OidcJwksEndpoint")
        public String oidcJwksEndpoint;

        /**
         * <p>The OIDC relying party (RP)-initiated logout endpoint. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("OidcLogoutEndpoint")
        public String oidcLogoutEndpoint;

        /**
         * <p>The metadata URL of the SAML protocol. This parameter is returned only when the SSO protocol of the application is SAML 2.0.</p>
         */
        @NameInMap("SamlMetaEndpoint")
        public String samlMetaEndpoint;

        /**
         * <p>The request receiving URL of the SAML protocol. This parameter is returned only when the SSO protocol of the application is SAML 2.0.</p>
         */
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
        /**
         * <p>The attribute name.</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The expression that is used to generate the value of the attribute.</p>
         */
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
        /**
         * <p>assertion是否签名</p>
         */
        @NameInMap("AssertionSigned")
        public Boolean assertionSigned;

        /**
         * <p>The additional user attributes in the SAML assertion.</p>
         */
        @NameInMap("AttributeStatements")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements> attributeStatements;

        /**
         * <p>The default value of the RelayState attribute. If the SSO request is initiated in EIAM, the RelayState attribute in the SAML response is set to this default value.</p>
         */
        @NameInMap("DefaultRelayState")
        public String defaultRelayState;

        /**
         * <p>The Format attribute of the NameID element in the SAML assertion. Valid values:</p>
         * <br>
         * <p>*   urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: No format is specified. How to resolve the NameID element depends on the application.</p>
         * <p>*   urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: The NameID element must be an email address.</p>
         * <p>*   urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: The NameID element must be persistent.</p>
         * <p>*   urn:oasis:names:tc:SAML:2.0:nameid-format:transient: The NameID element must be transient.</p>
         */
        @NameInMap("NameIdFormat")
        public String nameIdFormat;

        /**
         * <p>The expression that is used to generate the value of NameID in the SAML assertion.</p>
         */
        @NameInMap("NameIdValueExpression")
        public String nameIdValueExpression;

        /**
         * <p>response是否签名</p>
         */
        @NameInMap("ResponseSigned")
        public Boolean responseSigned;

        /**
         * <p>The algorithm that is used to calculate the signature for the SAML assertion.</p>
         */
        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        /**
         * <p>The entity ID of the application in SAML. The application assumes the role of service provider.</p>
         */
        @NameInMap("SpEntityId")
        public String spEntityId;

        /**
         * <p>The Assertion Consumer Service (ACS) URL of the application in SAML. The application assumes the role of service provider.</p>
         */
        @NameInMap("SpSsoAcsUrl")
        public String spSsoAcsUrl;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setAssertionSigned(Boolean assertionSigned) {
            this.assertionSigned = assertionSigned;
            return this;
        }
        public Boolean getAssertionSigned() {
            return this.assertionSigned;
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

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setResponseSigned(Boolean responseSigned) {
            this.responseSigned = responseSigned;
            return this;
        }
        public Boolean getResponseSigned() {
            return this.responseSigned;
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
        /**
         * <p>The initial SSO method. Valid values:</p>
         * <br>
         * <p>*   only_app_init_sso: Only application-initiated SSO is allowed. This method is selected by default when the SSO protocol of the application is an OIDC protocol. If this method is selected when the SSO protocol of the application is SAML, the InitLoginUrl parameter is required.</p>
         * <p>*   idaas_or_app_init_sso: IDaaS-initiated SSO and application-initiated SSO are allowed. This method is selected by default when the SSO protocol of the application is SAML. If this method is selected when the SSO protocol of the application is an OIDC protocol, the InitLoginUrl parameter is required.</p>
         */
        @NameInMap("InitLoginType")
        public String initLoginType;

        /**
         * <p>The initial webhook URL of SSO. This parameter is required when the SSO protocol of the application is an OIDC protocol and the InitLoginType parameters is set to idaas_or_app_init_sso or when the SSO protocol of the application is SAML and the InitLoginType parameter is set to only_app_init_sso.</p>
         */
        @NameInMap("InitLoginUrl")
        public String initLoginUrl;

        /**
         * <p>The Open ID Connect (OIDC)-based SSO configuration attributes of the application. This parameter is returned only when the SSO protocol of the application is an OIDC protocol.</p>
         */
        @NameInMap("OidcSsoConfig")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig oidcSsoConfig;

        /**
         * <p>The configuration of the metadata endpoint provided by the application.</p>
         */
        @NameInMap("ProtocolEndpointDomain")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain protocolEndpointDomain;

        /**
         * <p>The Security Assertion Markup Language (SAML)-based SSO configuration attributes of the application. This parameter is returned only when the SSO protocol of the application is SAML 2.0.</p>
         */
        @NameInMap("SamlSsoConfig")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig samlSsoConfig;

        /**
         * <p>The SSO feature status of the application. Valid values:</p>
         * <br>
         * <p>*   enabled: The feature is enabled.</p>
         * <p>*   disabled: The feature is disabled.</p>
         */
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
