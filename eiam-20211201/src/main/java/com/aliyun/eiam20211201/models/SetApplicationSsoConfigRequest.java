// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationSsoConfigRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>client-examplexxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The SSO initiation method. Valid values:</p>
     * <ul>
     * <li><p>only_app_init_sso: SSO is initiated only by the application. This is the default value for OIDC applications. If you set this parameter to this value for a SAML application, you must specify InitLoginUrl.</p>
     * </li>
     * <li><p>idaas_or_app_init_sso: SSO can be initiated by the IDaaS console or the application. This is the default value for SAML applications. If you set this parameter to this value for an OIDC application, you must specify InitLoginUrl.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>only_app_init_sso</p>
     */
    @NameInMap("InitLoginType")
    public String initLoginType;

    /**
     * <p>The URL that is used to initiate SSO. You must specify this parameter if you set InitLoginType to idaas_or_app_init_sso for an OIDC application. You must specify this parameter if you set InitLoginType to only_app_init_sso for a SAML application.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF">http://127.0.0.1:8000/start_login?enterprise_code=ABCDEF</a></p>
     */
    @NameInMap("InitLoginUrl")
    public String initLoginUrl;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The SSO properties for an application that uses the OIDC protocol.</p>
     */
    @NameInMap("OidcSsoConfig")
    public SetApplicationSsoConfigRequestOidcSsoConfig oidcSsoConfig;

    /**
     * <p>The SSO properties for an application that uses the SAML protocol.</p>
     */
    @NameInMap("SamlSsoConfig")
    public SetApplicationSsoConfigRequestSamlSsoConfig samlSsoConfig;

    public static SetApplicationSsoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationSsoConfigRequest self = new SetApplicationSsoConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetApplicationSsoConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetApplicationSsoConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetApplicationSsoConfigRequest setInitLoginType(String initLoginType) {
        this.initLoginType = initLoginType;
        return this;
    }
    public String getInitLoginType() {
        return this.initLoginType;
    }

    public SetApplicationSsoConfigRequest setInitLoginUrl(String initLoginUrl) {
        this.initLoginUrl = initLoginUrl;
        return this;
    }
    public String getInitLoginUrl() {
        return this.initLoginUrl;
    }

    public SetApplicationSsoConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetApplicationSsoConfigRequest setOidcSsoConfig(SetApplicationSsoConfigRequestOidcSsoConfig oidcSsoConfig) {
        this.oidcSsoConfig = oidcSsoConfig;
        return this;
    }
    public SetApplicationSsoConfigRequestOidcSsoConfig getOidcSsoConfig() {
        return this.oidcSsoConfig;
    }

    public SetApplicationSsoConfigRequest setSamlSsoConfig(SetApplicationSsoConfigRequestSamlSsoConfig samlSsoConfig) {
        this.samlSsoConfig = samlSsoConfig;
        return this;
    }
    public SetApplicationSsoConfigRequestSamlSsoConfig getSamlSsoConfig() {
        return this.samlSsoConfig;
    }

    public static class SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims extends TeaModel {
        /**
         * <p>The name of the claim.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Role&quot;</p>
         */
        @NameInMap("ClaimName")
        public String claimName;

        /**
         * <p>The expression used to generate the value of the claim.</p>
         * 
         * <strong>example:</strong>
         * <p>user.dict.applicationRole</p>
         */
        @NameInMap("ClaimValueExpression")
        public String claimValueExpression;

        public static SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims self = new SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims();
            return TeaModel.build(map, self);
        }

        public SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims setClaimName(String claimName) {
            this.claimName = claimName;
            return this;
        }
        public String getClaimName() {
            return this.claimName;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims setClaimValueExpression(String claimValueExpression) {
            this.claimValueExpression = claimValueExpression;
            return this;
        }
        public String getClaimValueExpression() {
            return this.claimValueExpression;
        }

    }

    public static class SetApplicationSsoConfigRequestOidcSsoConfig extends TeaModel {
        /**
         * <p>The validity period of the access token. Unit: seconds. Default value: 1200 (20 minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("AccessTokenEffectiveTime")
        public Long accessTokenEffectiveTime;

        /**
         * <p>Specifies whether the application is allowed to act as a public client to request the IDaaS authorization server. This parameter can be enabled only for the authorization code grant type and the device authorization grant type. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowedPublicClient")
        public Boolean allowedPublicClient;

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
        public java.util.List<SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims> customClaims;

        /**
         * <p>The scope parameter in the OIDC protocol. This parameter specifies the scope of user information that can be returned by the userinfo endpoint or included in the ID token.</p>
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
         * <p>300</p>
         */
        @NameInMap("IdTokenEffectiveTime")
        public Long idTokenEffectiveTime;

        /**
         * <p>The ID of the identity source for the resource owner password credentials grant type. This parameter is valid only when the GrantTypes for the OIDC application is set to password.</p>
         * 
         * <strong>example:</strong>
         * <p>ia_password</p>
         */
        @NameInMap("PasswordAuthenticationSourceId")
        public String passwordAuthenticationSourceId;

        /**
         * <p>Specifies whether Time-based One-time Password (TOTP) multi-factor authentication (MFA) is required for the resource owner password credentials grant type. This parameter is valid only when the GrantTypes for the OIDC application is set to password.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordTotpMfaRequired")
        public Boolean passwordTotpMfaRequired;

        /**
         * <p>The algorithm used to compute the code challenge in PKCE.</p>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        /**
         * <p>Specifies whether Proof Key for Code Exchange (PKCE) (RFC 7636) is required for application SSO.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The list of post-logout redirect URIs that the application supports.</p>
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
         * <p>The response type supported by the application when OidcSsoConfig.GrantTypes is set to implicit.</p>
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

        public static SetApplicationSsoConfigRequestOidcSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationSsoConfigRequestOidcSsoConfig self = new SetApplicationSsoConfigRequestOidcSsoConfig();
            return TeaModel.build(map, self);
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setAccessTokenEffectiveTime(Long accessTokenEffectiveTime) {
            this.accessTokenEffectiveTime = accessTokenEffectiveTime;
            return this;
        }
        public Long getAccessTokenEffectiveTime() {
            return this.accessTokenEffectiveTime;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setAllowedPublicClient(Boolean allowedPublicClient) {
            this.allowedPublicClient = allowedPublicClient;
            return this;
        }
        public Boolean getAllowedPublicClient() {
            return this.allowedPublicClient;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setCodeEffectiveTime(Long codeEffectiveTime) {
            this.codeEffectiveTime = codeEffectiveTime;
            return this;
        }
        public Long getCodeEffectiveTime() {
            return this.codeEffectiveTime;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setCustomClaims(java.util.List<SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims> customClaims) {
            this.customClaims = customClaims;
            return this;
        }
        public java.util.List<SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims> getCustomClaims() {
            return this.customClaims;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setGrantTypes(java.util.List<String> grantTypes) {
            this.grantTypes = grantTypes;
            return this;
        }
        public java.util.List<String> getGrantTypes() {
            return this.grantTypes;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setIdTokenEffectiveTime(Long idTokenEffectiveTime) {
            this.idTokenEffectiveTime = idTokenEffectiveTime;
            return this;
        }
        public Long getIdTokenEffectiveTime() {
            return this.idTokenEffectiveTime;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setPasswordAuthenticationSourceId(String passwordAuthenticationSourceId) {
            this.passwordAuthenticationSourceId = passwordAuthenticationSourceId;
            return this;
        }
        public String getPasswordAuthenticationSourceId() {
            return this.passwordAuthenticationSourceId;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setPasswordTotpMfaRequired(Boolean passwordTotpMfaRequired) {
            this.passwordTotpMfaRequired = passwordTotpMfaRequired;
            return this;
        }
        public Boolean getPasswordTotpMfaRequired() {
            return this.passwordTotpMfaRequired;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setPkceChallengeMethods(java.util.List<String> pkceChallengeMethods) {
            this.pkceChallengeMethods = pkceChallengeMethods;
            return this;
        }
        public java.util.List<String> getPkceChallengeMethods() {
            return this.pkceChallengeMethods;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setPostLogoutRedirectUris(java.util.List<String> postLogoutRedirectUris) {
            this.postLogoutRedirectUris = postLogoutRedirectUris;
            return this;
        }
        public java.util.List<String> getPostLogoutRedirectUris() {
            return this.postLogoutRedirectUris;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setRedirectUris(java.util.List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setRefreshTokenEffective(Long refreshTokenEffective) {
            this.refreshTokenEffective = refreshTokenEffective;
            return this;
        }
        public Long getRefreshTokenEffective() {
            return this.refreshTokenEffective;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setResponseTypes(java.util.List<String> responseTypes) {
            this.responseTypes = responseTypes;
            return this;
        }
        public java.util.List<String> getResponseTypes() {
            return this.responseTypes;
        }

        public SetApplicationSsoConfigRequestOidcSsoConfig setSubjectIdExpression(String subjectIdExpression) {
            this.subjectIdExpression = subjectIdExpression;
            return this;
        }
        public String getSubjectIdExpression() {
            return this.subjectIdExpression;
        }

    }

    public static class SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements extends TeaModel {
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

        public static SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements self = new SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements();
            return TeaModel.build(map, self);
        }

        public SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements setAttributeValueExpression(String attributeValueExpression) {
            this.attributeValueExpression = attributeValueExpression;
            return this;
        }
        public String getAttributeValueExpression() {
            return this.attributeValueExpression;
        }

    }

    public static class SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates extends TeaModel {
        /**
         * <p>The display name of the RelayState.</p>
         * 
         * <strong>example:</strong>
         * <p>Ram</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The value of RelayState.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ram.console.aliyun.com/">https://ram.console.aliyun.com/</a></p>
         */
        @NameInMap("RelayState")
        public String relayState;

        public static SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates self = new SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates();
            return TeaModel.build(map, self);
        }

        public SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates setRelayState(String relayState) {
            this.relayState = relayState;
            return this;
        }
        public String getRelayState() {
            return this.relayState;
        }

    }

    public static class SetApplicationSsoConfigRequestSamlSsoConfig extends TeaModel {
        /**
         * <p>Specifies whether the assertion must be signed. ResponseSigned and AssertionSigned cannot both be false.</p>
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
         * <p>The configurations of additional user attributes in the SAML assertion.</p>
         */
        @NameInMap("AttributeStatements")
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements> attributeStatements;

        /**
         * <p>The default value of RelayState. When an SSO request is initiated by IDaaS, the SAML response provided by IDaaS contains this value for RelayState.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
         */
        @NameInMap("DefaultRelayState")
        public String defaultRelayState;

        /**
         * <p>The entity ID of the identity provider (IdP) in the SAML protocol. The value can be in a URL or URN format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/">https://example.com/</a></p>
         */
        @NameInMap("IdPEntityId")
        public String idPEntityId;

        /**
         * <p>The format of the NameID in the SAML protocol. Valid values:</p>
         * <ul>
         * <li><p>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: The format is not specified. The application determines how to parse the NameID.</p>
         * </li>
         * <li><p>urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: The email address format.</p>
         * </li>
         * <li><p>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: The persistent NameID.</p>
         * </li>
         * <li><p>urn:oasis:names:tc:SAML:2.0:nameid-format:transient: The transient NameID.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified</p>
         */
        @NameInMap("NameIdFormat")
        public String nameIdFormat;

        /**
         * <p>The expression used to generate the value of the NameID in the SAML protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>user.email</p>
         */
        @NameInMap("NameIdValueExpression")
        public String nameIdValueExpression;

        /**
         * <p>The optional RelayState configurations.</p>
         */
        @NameInMap("OptionalRelayStates")
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates> optionalRelayStates;

        /**
         * <p>Specifies whether the response must be signed. ResponseSigned and AssertionSigned cannot both be false.</p>
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
         * <p>The entity ID of the application (service provider) that uses SAML.</p>
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

        public static SetApplicationSsoConfigRequestSamlSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationSsoConfigRequestSamlSsoConfig self = new SetApplicationSsoConfigRequestSamlSsoConfig();
            return TeaModel.build(map, self);
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setAssertionSigned(Boolean assertionSigned) {
            this.assertionSigned = assertionSigned;
            return this;
        }
        public Boolean getAssertionSigned() {
            return this.assertionSigned;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setAttributeStatements(java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements> attributeStatements) {
            this.attributeStatements = attributeStatements;
            return this;
        }
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements> getAttributeStatements() {
            return this.attributeStatements;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setDefaultRelayState(String defaultRelayState) {
            this.defaultRelayState = defaultRelayState;
            return this;
        }
        public String getDefaultRelayState() {
            return this.defaultRelayState;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setIdPEntityId(String idPEntityId) {
            this.idPEntityId = idPEntityId;
            return this;
        }
        public String getIdPEntityId() {
            return this.idPEntityId;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setNameIdFormat(String nameIdFormat) {
            this.nameIdFormat = nameIdFormat;
            return this;
        }
        public String getNameIdFormat() {
            return this.nameIdFormat;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setNameIdValueExpression(String nameIdValueExpression) {
            this.nameIdValueExpression = nameIdValueExpression;
            return this;
        }
        public String getNameIdValueExpression() {
            return this.nameIdValueExpression;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setOptionalRelayStates(java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates> optionalRelayStates) {
            this.optionalRelayStates = optionalRelayStates;
            return this;
        }
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigOptionalRelayStates> getOptionalRelayStates() {
            return this.optionalRelayStates;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setResponseSigned(Boolean responseSigned) {
            this.responseSigned = responseSigned;
            return this;
        }
        public Boolean getResponseSigned() {
            return this.responseSigned;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setSpEntityId(String spEntityId) {
            this.spEntityId = spEntityId;
            return this;
        }
        public String getSpEntityId() {
            return this.spEntityId;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setSpSsoAcsUrl(String spSsoAcsUrl) {
            this.spSsoAcsUrl = spSsoAcsUrl;
            return this;
        }
        public String getSpSsoAcsUrl() {
            return this.spSsoAcsUrl;
        }

    }

}
