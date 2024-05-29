// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationSsoConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

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
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The Open ID Connect (OIDC)-based SSO configuration attributes of the application.</p>
     */
    @NameInMap("OidcSsoConfig")
    public SetApplicationSsoConfigRequestOidcSsoConfig oidcSsoConfig;

    /**
     * <p>The Security Assertion Markup Language (SAML)-based SSO configuration attributes of the application.</p>
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
         * <p>The claim name.</p>
         */
        @NameInMap("ClaimName")
        public String claimName;

        /**
         * <p>The expression that is used to generate the value of the claim.</p>
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
        public java.util.List<SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims> customClaims;

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
         * <p>The ID of the identity authentication source in password mode. Specify this parameter only when the value of the GrantTypes parameter includes the password mode.</p>
         */
        @NameInMap("PasswordAuthenticationSourceId")
        public String passwordAuthenticationSourceId;

        /**
         * <p>Specifies whether time-based one-time password (TOTP) authentication is required in password mode. Specify this parameter only when the value of the GrantTypes parameter includes the password mode.</p>
         */
        @NameInMap("PasswordTotpMfaRequired")
        public Boolean passwordTotpMfaRequired;

        /**
         * <p>The algorithms that are used to calculate the code challenge for PKCE.</p>
         */
        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        /**
         * <p>Specifies whether the SSO of the application requires Proof Key for Code Exchange (PKCE) (RFC 7636).</p>
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
         * <p>The response types that are supported by the application. Specify this parameter when the value of the GrantTypes parameter includes the implicit mode.</p>
         */
        @NameInMap("ResponseTypes")
        public java.util.List<String> responseTypes;

        /**
         * <p>The custom expression that is used to generate the subject ID returned for the ID token.</p>
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
         * <p>The attribute name.</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>The expression that is used to generate the value of the attribute.</p>
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

    public static class SetApplicationSsoConfigRequestSamlSsoConfig extends TeaModel {
        /**
         * <p>assertion是否签名</p>
         */
        @NameInMap("AssertionSigned")
        public Boolean assertionSigned;

        /**
         * <p>The additional user attributes in the SAML assertion.</p>
         */
        @NameInMap("AttributeStatements")
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements> attributeStatements;

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
