// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationSsoConfigResponseBody extends TeaModel {
    /**
     * <p>The SSO configuration of the application.</p>
     */
    @NameInMap("ApplicationSsoConfig")
    public GetApplicationSsoConfigResponseBodyApplicationSsoConfig applicationSsoConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
         * <p>The name of the claim.</p>
         * 
         * <strong>example:</strong>
         * <p>userOuIds</p>
         */
        @NameInMap("ClaimName")
        public String claimName;

        /**
         * <p>The expression used to generate the value of the claim.</p>
         * 
         * <strong>example:</strong>
         * <p>ObjectToJsonString(user.organizationalUnits)</p>
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
         * <p>The validity period of the access token. Unit: seconds. Default value: 1200 (20 minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("AccessTokenEffectiveTime")
        public Long accessTokenEffectiveTime;

        /**
         * <p>Indicates whether the application is allowed to make requests to the IDaaS EIAM authorization server as a public client. This feature is supported only for the authorization code and device code grant types. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowedPublicClient")
        public String allowedPublicClient;

        /**
         * <p>The validity period of the authorization code. Unit: seconds. Default value: 60 (1 minute).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CodeEffectiveTime")
        public Long codeEffectiveTime;

        /**
         * <p>The custom claims that are returned in the ID token.</p>
         */
        @NameInMap("CustomClaims")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfigCustomClaims> customClaims;

        /**
         * <p>The OIDC-compliant scope parameter. This parameter specifies the scope of user attributes that can be returned by the userinfo endpoint or included in the ID token.</p>
         * 
         * <strong>example:</strong>
         * <p>profile，email</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>The list of OIDC grant types that are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        @NameInMap("GrantTypes")
        public java.util.List<String> grantTypes;

        /**
         * <p>The validity period of the ID token. Unit: seconds. Default value: 300 (5 minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("IdTokenEffectiveTime")
        public Long idTokenEffectiveTime;

        /**
         * <p>The ID of the authentication source for password-based logon. This parameter is valid only if GrantTypes for the OIDC application is set to password.</p>
         * 
         * <strong>example:</strong>
         * <p>ia_password</p>
         */
        @NameInMap("PasswordAuthenticationSourceId")
        public String passwordAuthenticationSourceId;

        /**
         * <p>Indicates whether Time-based One-Time Password (TOTP) multi-factor authentication (MFA) is required for password-based logon. This parameter is valid only if GrantTypes for the OIDC application is set to password.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordTotpMfaRequired")
        public Boolean passwordTotpMfaRequired;

        /**
         * <p>The algorithm used to calculate the code challenge in PKCE.</p>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        /**
         * <p>Indicates whether Proof Key for Code Exchange (PKCE) is required for the application SSO. For more information, see RFC 7636.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The list of post-logout redirect URIs.</p>
         */
        @NameInMap("PostLogoutRedirectUris")
        public java.util.List<String> postLogoutRedirectUris;

        /**
         * <p>The list of redirect URIs that the application supports.</p>
         */
        @NameInMap("RedirectUris")
        public java.util.List<String> redirectUris;

        /**
         * <p>The validity period of the refresh token. Unit: seconds. Default value: 86400 (1 day).</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("RefreshTokenEffective")
        public Long refreshTokenEffective;

        /**
         * <p>The response type that the application supports. This parameter is returned only if OidcSsoConfig.GrantTypes is set to implicit.</p>
         * 
         * <strong>example:</strong>
         * <p>token id_token</p>
         */
        @NameInMap("ResponseTypes")
        public java.util.List<String> responseTypes;

        /**
         * <p>The expression used to generate the value of the sub claim in the ID token.</p>
         * 
         * <strong>example:</strong>
         * <p>user.userid</p>
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

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig setAllowedPublicClient(String allowedPublicClient) {
            this.allowedPublicClient = allowedPublicClient;
            return this;
        }
        public String getAllowedPublicClient() {
            return this.allowedPublicClient;
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
         * <p>The OAuth 2.0 authorization endpoint. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/authorize">https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/authorize</a></p>
         */
        @NameInMap("Oauth2AuthorizationEndpoint")
        public String oauth2AuthorizationEndpoint;

        /**
         * <p>The OAuth 2.0 device authorization endpoint. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/device/code">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/device/code</a></p>
         */
        @NameInMap("Oauth2DeviceAuthorizationEndpoint")
        public String oauth2DeviceAuthorizationEndpoint;

        /**
         * <p>The OAuth 2.0 token revocation endpoint. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/revoke">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/revoke</a></p>
         */
        @NameInMap("Oauth2RevokeEndpoint")
        public String oauth2RevokeEndpoint;

        /**
         * <p>The OAuth 2.0 token endpoint. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/token">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/token</a></p>
         */
        @NameInMap("Oauth2TokenEndpoint")
        public String oauth2TokenEndpoint;

        /**
         * <p>The OIDC userinfo endpoint. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/userinfo">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oauth2/userinfo</a></p>
         */
        @NameInMap("Oauth2UserinfoEndpoint")
        public String oauth2UserinfoEndpoint;

        /**
         * <p>The OIDC issuer. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc</a></p>
         */
        @NameInMap("OidcIssuer")
        public String oidcIssuer;

        /**
         * <p>The JSON Web Key Set (JWKS) endpoint for OIDC. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc/jwks">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk2676rypm/app_mltta64q65enci54slingvvsgq/oidc/jwks</a></p>
         */
        @NameInMap("OidcJwksEndpoint")
        public String oidcJwksEndpoint;

        /**
         * <p>The OIDC Relying Party (RP)-initiated logout endpoint. This parameter is returned only when the application uses OIDC for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/logout">https://l1seshcn.aliyunidaas.com/login/app/app_mltta64q65enci54slingvvsgq/oauth2/logout</a></p>
         */
        @NameInMap("OidcLogoutEndpoint")
        public String oidcLogoutEndpoint;

        /**
         * <p>The metadata endpoint for the SAML protocol. This parameter is returned only when the application uses SAML 2.0 for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://l1seshcn.aliyunidaas.com/api/v2/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/meta">https://l1seshcn.aliyunidaas.com/api/v2/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/meta</a></p>
         */
        @NameInMap("SamlMetaEndpoint")
        public String samlMetaEndpoint;

        /**
         * <p>The endpoint that receives AuthnRequest requests for the SAML protocol. This parameter is returned only when the application uses SAML 2.0 for SSO.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://l1seshcn.aliyunidaas.com/login/app/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/sso">https://l1seshcn.aliyunidaas.com/login/app/app_mltuxdwd4lq4eer6tmtlmaxm5e/saml2/sso</a></p>
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
         * <p>The name of the attribute in the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName">https://www.aliyun.com/SAML-Role/Attributes/RoleSessionName</a></p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The expression used to generate the value of the attribute in the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
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

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates extends TeaModel {
        /**
         * <p>The display name of the RelayState.</p>
         * 
         * <strong>example:</strong>
         * <p>Ram Account SSO</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The optional RelayState value. The display names of multiple redirect URLs are shown on the application card in the application portal. After a user clicks a URL and completes the SSO, the user is redirected to the URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
         */
        @NameInMap("RelayState")
        public String relayState;

        public static GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates self = new GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates();
            return TeaModel.build(map, self);
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }
        public String getRelayState() {
            return this.relayState;
        }

    }

    public static class GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig extends TeaModel {
        /**
         * <p>Indicates whether the assertion needs to be signed. ResponseSigned and AssertionSigned cannot both be false.</p>
         * <ul>
         * <li><p>true: The assertion must be signed.</p>
         * </li>
         * <li><p>false: The assertion does not need to be signed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssertionSigned")
        public Boolean assertionSigned;

        /**
         * <p>The configuration of additional user attributes in the SAML assertion.</p>
         */
        @NameInMap("AttributeStatements")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigAttributeStatements> attributeStatements;

        /**
         * <p>The default value of RelayState. If the SSO is initiated by EIAM, the RelayState in the SAML response is set to this value.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
         */
        @NameInMap("DefaultRelayState")
        public String defaultRelayState;

        /**
         * <p>The EntityID of the identity provider (IdP) in the SAML protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/">https://example.com/</a></p>
         */
        @NameInMap("IdPEntityId")
        public String idPEntityId;

        /**
         * <p>The format of the NameID in the SAML protocol. Valid values:</p>
         * <ul>
         * <li><p>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: Unspecified. The application determines how to parse the NameID.</p>
         * </li>
         * <li><p>urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: Email address format.</p>
         * </li>
         * <li><p>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: Persistent NameID.</p>
         * </li>
         * <li><p>urn:oasis:names:tc:SAML:2.0:nameid-format:transient: Transient NameID.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified</p>
         */
        @NameInMap("NameIdFormat")
        public String nameIdFormat;

        /**
         * <p>The expression used to generate the value of the NameID in the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
         */
        @NameInMap("NameIdValueExpression")
        public String nameIdValueExpression;

        /**
         * <p>The optional RelayState values. The display names of multiple redirect URLs are shown on the application card in the application portal. After a user clicks a URL and completes the SSO, the user is redirected to the URL. You must specify a default redirect URL before you can specify optional RelayState values.</p>
         */
        @NameInMap("OptionalRelayStates")
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates> optionalRelayStates;

        /**
         * <p>Indicates whether the response needs to be signed. ResponseSigned and AssertionSigned cannot both be false.</p>
         * <ul>
         * <li><p>true: The response must be signed.</p>
         * </li>
         * <li><p>false: The response does not need to be signed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResponseSigned")
        public Boolean responseSigned;

        /**
         * <p>The signature algorithm for the SAML assertion.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA-SHA256</p>
         */
        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        /**
         * <p>The SAML EntityID of the application (service provider).</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:cloudcomputing</p>
         */
        @NameInMap("SpEntityId")
        public String spEntityId;

        /**
         * <p>The SAML assertion consumer service (ACS) URL of the application (service provider).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin.aliyun.com/saml-role/sso">https://signin.aliyun.com/saml-role/sso</a></p>
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

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setIdPEntityId(String idPEntityId) {
            this.idPEntityId = idPEntityId;
            return this;
        }
        public String getIdPEntityId() {
            return this.idPEntityId;
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

        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig setOptionalRelayStates(java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates> optionalRelayStates) {
            this.optionalRelayStates = optionalRelayStates;
            return this;
        }
        public java.util.List<GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfigOptionalRelayStates> getOptionalRelayStates() {
            return this.optionalRelayStates;
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
         * <p>The SSO initiation method. Valid values:</p>
         * <ul>
         * <li><p>only_app_init_sso: SSO is initiated only by the application. This is the default value for OIDC applications. If this method is used for a SAML application, you must specify InitLoginUrl.</p>
         * </li>
         * <li><p>idaas_or_app_init_sso: SSO can be initiated by the IDaaS console or the application. This is the default value for SAML applications. If this method is used for an OIDC application, you must specify InitLoginUrl.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>only_app_init_sso</p>
         */
        @NameInMap("InitLoginType")
        public String initLoginType;

        /**
         * <p>The URL that triggers SSO. This parameter is required when InitLoginType for an OIDC application is set to idaas_or_app_init_sso. This parameter is also required when InitLoginType for a SAML application is set to only_app_init_sso.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF">http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF</a></p>
         */
        @NameInMap("InitLoginUrl")
        public String initLoginUrl;

        /**
         * <p>The SSO configuration parameters for the application that uses OpenID Connect (OIDC). This parameter is returned only when the application uses OIDC for SSO.</p>
         */
        @NameInMap("OidcSsoConfig")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigOidcSsoConfig oidcSsoConfig;

        /**
         * <p>The configuration of the metadata endpoint provided by the application.</p>
         */
        @NameInMap("ProtocolEndpointDomain")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigProtocolEndpointDomain protocolEndpointDomain;

        /**
         * <p>The SSO configuration parameters for the application that uses Security Assertion Markup Language (SAML) 2.0. This parameter is returned only when the application uses SAML 2.0 for SSO.</p>
         */
        @NameInMap("SamlSsoConfig")
        public GetApplicationSsoConfigResponseBodyApplicationSsoConfigSamlSsoConfig samlSsoConfig;

        /**
         * <p>The status of the SSO feature for the application. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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
