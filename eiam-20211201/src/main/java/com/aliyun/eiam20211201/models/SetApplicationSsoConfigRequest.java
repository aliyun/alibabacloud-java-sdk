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
     * <p>Ensures the idempotence of the request. You can generate a parameter value on your client to ensure that the parameter value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>client-examplexxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The initial single sign-on (SSO) method. Valid values:</p>
     * <ul>
     * <li>only_app_init_sso: SSO is initiated only by the application. This is the default value for OIDC applications. If this method is specified for a SAML application, InitLoginUrl must be specified.</li>
     * <li>idaas_or_app_init_sso: SSO can be initiated by the IDaaS portal or the application. This is the default value for SAML applications. If this method is specified for an OIDC application, InitLoginUrl must be specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>only_app_init_sso</p>
     */
    @NameInMap("InitLoginType")
    public String initLoginType;

    /**
     * <p>The trigger URL for the initialization of single sign-on (SSO) logon.
     * This parameter is required when the InitLoginType Settings for an OIDC protocol (Protocol Type) application are set to idaas_or_app_init_sso.
     * This parameter is required when the InitLoginType Settings for a SAML protocol (Protocol Type) application are set to only_app_init_sso.</p>
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
     * <p>The SSO attribute configuration parameters for the OIDC protocol.</p>
     */
    @NameInMap("OidcSsoConfig")
    public SetApplicationSsoConfigRequestOidcSsoConfig oidcSsoConfig;

    /**
     * <p>The SSO attribute configuration parameters for the SAML protocol.</p>
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
         * <p>The name of the returned claim.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Role&quot;</p>
         */
        @NameInMap("ClaimName")
        public String claimName;

        /**
         * <p>The value expression of the returned claim.</p>
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
         * <p>The validity period of the issued access token, in seconds. Default value: 1200 (20 minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("AccessTokenEffectiveTime")
        public Long accessTokenEffectiveTime;

        /**
         * <p>Specifies whether the application is allowed to request the IDaaS EIAM authorization server as a public client. This feature can be enabled only for the authorization code mode and device mode. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowedPublicClient")
        public Boolean allowedPublicClient;

        /**
         * <p>The validity period of the issued code, in seconds. Default value: 60 (1 minute).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CodeEffectiveTime")
        public Long codeEffectiveTime;

        /**
         * <p>The custom user information included in the returned ID token.</p>
         */
        @NameInMap("CustomClaims")
        public java.util.List<SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims> customClaims;

        /**
         * <p>The standard OIDC scope parameter, which specifies the range of user attributes that can be returned by the userinfo endpoint or the ID token.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>The list of supported OIDC grant types.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;authorization_code&quot;]</p>
         */
        @NameInMap("GrantTypes")
        public java.util.List<String> grantTypes;

        /**
         * <p>The validity period of the issued ID token, in seconds. Default value: 300 seconds (5 minutes).</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("IdTokenEffectiveTime")
        public Long idTokenEffectiveTime;

        /**
         * <p>The ID of the authentication source used for the password mode. This parameter takes effect only when the GrantTypes specified for the OIDC application includes the password mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ia_password</p>
         */
        @NameInMap("PasswordAuthenticationSourceId")
        public String passwordAuthenticationSourceId;

        /**
         * <p>Specifies whether time-based one-time password (TOTP) multi-factor authentication (MFA) is mandatory for the password mode. This parameter takes effect only when the GrantTypes specified for the OIDC application includes the password mode.</p>
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
         * <p>[&quot;S256&quot;]</p>
         */
        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        /**
         * <p>Specifies whether Proof Key for Code Exchange (PKCE) (RFC 7636) is mandatory for application SSO.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The list of logout callback URLs supported by the application.</p>
         */
        @NameInMap("PostLogoutRedirectUris")
        public java.util.List<String> postLogoutRedirectUris;

        /**
         * <p>The list of redirect URIs supported by the application.</p>
         */
        @NameInMap("RedirectUris")
        public java.util.List<String> redirectUris;

        /**
         * <p>The validity period of the issued refresh token, in seconds. Default value: 86400 seconds (1 day).</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("RefreshTokenEffective")
        public Long refreshTokenEffective;

        /**
         * <p>The response types supported by the application when OidcSsoConfig.GrantTypes includes the implicit mode.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;token id_token&quot;]</p>
         */
        @NameInMap("ResponseTypes")
        public java.util.List<String> responseTypes;

        /**
         * <p>The custom value expression for the sub claim returned in the ID token.</p>
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
         * <p>The value expression of the attribute in the SAML assertion.</p>
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
         * <p>The RelayState value.</p>
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
         * <p>Specifies whether the assertion must be signed. ResponseSigned and AssertionSigned cannot both be set to false. Valid values:</p>
         * <ul>
         * <li>true: The assertion must be signed.</li>
         * <li>false: The assertion does not need to be signed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssertionSigned")
        public Boolean assertionSigned;

        /**
         * <p>The configuration of additional user attributes included in the SAML assertion.</p>
         */
        @NameInMap("AttributeStatements")
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements> attributeStatements;

        /**
         * <p>The default RelayState value. When a user\&quot;s single sign-on (SSO) logon request is initiated by EIAM, the SAML response provided by EIAM specifies the RelayState as this value.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://home.console.aliyun.com">https://home.console.aliyun.com</a></p>
         */
        @NameInMap("DefaultRelayState")
        public String defaultRelayState;

        /**
         * <p>The entity ID that represents the identity provider (IdP) in the SAML protocol. Both URL and URN formats are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/">https://example.com/</a></p>
         */
        @NameInMap("IdPEntityId")
        public String idPEntityId;

        /**
         * <p>The standard NameID format for the SAML protocol. Valid values:</p>
         * <ul>
         * <li>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified: Unspecified. The application determines how to parse the NameID.</li>
         * <li>urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress: Email address format.</li>
         * <li>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent: Persistent NameID.</li>
         * <li>urn:oasis:names:tc:SAML:2.0:nameid-format:transient: Transient NameID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified</p>
         */
        @NameInMap("NameIdFormat")
        public String nameIdFormat;

        /**
         * <p>The expression used to generate the actual value of the NameID for the SAML protocol.</p>
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
         * <p>Specifies whether to enable signature verification for SSO AuthnRequest. Default value: false. If this parameter is set to true, spSigningCertificates must be configured and the array cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequireAuthnRequestSigned")
        public Boolean requireAuthnRequestSigned;

        /**
         * <p>Specifies whether the response must be signed. ResponseSigned and AssertionSigned cannot both be set to false. Valid values:</p>
         * <ul>
         * <li>true: The response must be signed.</li>
         * <li>false: The response does not need to be signed.</li>
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
         * <p>The SAML entity ID of the application (SP).</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:cloudcomputing</p>
         */
        @NameInMap("SpEntityId")
        public String spEntityId;

        /**
         * <p>The array of SP signature verification certificates in PEM format. A maximum of two certificates are allowed, and they are shared by SSO and single logout (SLO). The format and validity of each certificate are verified during writing. If more than two certificates are provided, the request is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX -----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("SpSigningCertificates")
        public java.util.List<String> spSigningCertificates;

        /**
         * <p>The callback URL used by the SP to receive the LogoutResponse. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/api/slo/response">https://example.com/api/slo/response</a></p>
         */
        @NameInMap("SpSloResponseUrl")
        public String spSloResponseUrl;

        /**
         * <p>The SAML assertion consumer URL of the application (SP).</p>
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

        public SetApplicationSsoConfigRequestSamlSsoConfig setRequireAuthnRequestSigned(Boolean requireAuthnRequestSigned) {
            this.requireAuthnRequestSigned = requireAuthnRequestSigned;
            return this;
        }
        public Boolean getRequireAuthnRequestSigned() {
            return this.requireAuthnRequestSigned;
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

        public SetApplicationSsoConfigRequestSamlSsoConfig setSpSigningCertificates(java.util.List<String> spSigningCertificates) {
            this.spSigningCertificates = spSigningCertificates;
            return this;
        }
        public java.util.List<String> getSpSigningCertificates() {
            return this.spSigningCertificates;
        }

        public SetApplicationSsoConfigRequestSamlSsoConfig setSpSloResponseUrl(String spSloResponseUrl) {
            this.spSloResponseUrl = spSloResponseUrl;
            return this;
        }
        public String getSpSloResponseUrl() {
            return this.spSloResponseUrl;
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
