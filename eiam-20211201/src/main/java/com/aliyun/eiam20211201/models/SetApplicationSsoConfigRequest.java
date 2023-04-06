// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationSsoConfigRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>初始化登录方式，only_app_init_sso or idaas_or_app_init_sso</p>
     */
    @NameInMap("InitLoginType")
    public String initLoginType;

    /**
     * <p>仅only_app_init_sso情况下，SP指定的登录地址</p>
     */
    @NameInMap("InitLoginUrl")
    public String initLoginUrl;

    /**
     * <p>IDaaS EIAM的实例id</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>单点登录类型为Oidc时可以配置</p>
     */
    @NameInMap("OidcSsoConfig")
    public SetApplicationSsoConfigRequestOidcSsoConfig oidcSsoConfig;

    /**
     * <p>单点登录类型为saml2时可以配置</p>
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
         * <p>返回的claim名称</p>
         */
        @NameInMap("ClaimName")
        public String claimName;

        /**
         * <p>返回的claim取值表达式</p>
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
         * <p>返回的access token有效时间，单位为Second</p>
         */
        @NameInMap("AccessTokenEffectiveTime")
        public Long accessTokenEffectiveTime;

        /**
         * <p>Authorization code流中code的有效时间，单位为Second</p>
         */
        @NameInMap("CodeEffectiveTime")
        public Long codeEffectiveTime;

        /**
         * <p>自定义id token返回信息</p>
         */
        @NameInMap("CustomClaims")
        public java.util.List<SetApplicationSsoConfigRequestOidcSsoConfigCustomClaims> customClaims;

        /**
         * <p>OIDC标准参数，如profile、email等</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>应用支持的授权类型，OIDC标准参数</p>
         */
        @NameInMap("GrantTypes")
        public java.util.List<String> grantTypes;

        /**
         * <p>id token有效时间，单位为Second</p>
         */
        @NameInMap("IdTokenEffectiveTime")
        public Long idTokenEffectiveTime;

        /**
         * <p>密码模式使用的身份认证来源id，仅对password模式生效</p>
         */
        @NameInMap("PasswordAuthenticationSourceId")
        public String passwordAuthenticationSourceId;

        /**
         * <p>是否强制需要TOTP二次认证，仅对password模式生效</p>
         */
        @NameInMap("PasswordTotpMfaRequired")
        public Boolean passwordTotpMfaRequired;

        /**
         * <p>支持的PKCE算法类型</p>
         */
        @NameInMap("PkceChallengeMethods")
        public java.util.List<String> pkceChallengeMethods;

        /**
         * <p>是否强制PKCE,authorization_code强制必须指定PKCE参数</p>
         */
        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>Logout回调支持的Uri列表，OIDC协议标准参数。</p>
         */
        @NameInMap("PostLogoutRedirectUris")
        public java.util.List<String> postLogoutRedirectUris;

        /**
         * <p>应用SSO支持的回调的uri列表，OIDC标准参数。</p>
         */
        @NameInMap("RedirectUris")
        public java.util.List<String> redirectUris;

        /**
         * <p>refresh token有效时间，单位为Second</p>
         */
        @NameInMap("RefreshTokenEffective")
        public Long refreshTokenEffective;

        /**
         * <p>隐式流支持的返回类型，OIDC标准参数，如token id_token</p>
         */
        @NameInMap("ResponseTypes")
        public java.util.List<String> responseTypes;

        /**
         * <p>自定义id token返回信息</p>
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
         * <p>SAML属性的Name</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>SAML属性取值表达式</p>
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
         * <p>SAML断言的属性配置</p>
         */
        @NameInMap("AttributeStatements")
        public java.util.List<SetApplicationSsoConfigRequestSamlSsoConfigAttributeStatements> attributeStatements;

        /**
         * <p>默认RelayState取值，可空</p>
         */
        @NameInMap("DefaultRelayState")
        public String defaultRelayState;

        /**
         * <p>SAML标准协议中的NameID格式</p>
         */
        @NameInMap("NameIdFormat")
        public String nameIdFormat;

        /**
         * <p>返回的claim名称</p>
         */
        @NameInMap("NameIdValueExpression")
        public String nameIdValueExpression;

        /**
         * <p>IDaaS签发SAML断言时使用的签名算法</p>
         */
        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        /**
         * <p>SP的EntityId，用于唯一标识SP身份</p>
         */
        @NameInMap("SpEntityId")
        public String spEntityId;

        /**
         * <p>SP的SSO地址，用于接受IDaaS签发的SAML断言</p>
         */
        @NameInMap("SpSsoAcsUrl")
        public String spSsoAcsUrl;

        public static SetApplicationSsoConfigRequestSamlSsoConfig build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationSsoConfigRequestSamlSsoConfig self = new SetApplicationSsoConfigRequestSamlSsoConfig();
            return TeaModel.build(map, self);
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
