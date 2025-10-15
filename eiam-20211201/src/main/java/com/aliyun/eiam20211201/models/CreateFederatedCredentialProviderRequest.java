// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateFederatedCredentialProviderRequest extends TeaModel {
    /**
     * <p>联邦凭证提供方描述</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>联邦凭证提供方名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FederatedCredentialProviderName")
    public String federatedCredentialProviderName;

    /**
     * <p>联邦凭证提供方类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkcs7</p>
     */
    @NameInMap("FederatedCredentialProviderType")
    public String federatedCredentialProviderType;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>网络端点ID</p>
     * 
     * <strong>example:</strong>
     * <p>nae_example_id</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>OIDC配置</p>
     */
    @NameInMap("OidcProviderConfig")
    public CreateFederatedCredentialProviderRequestOidcProviderConfig oidcProviderConfig;

    /**
     * <p>PKCS7配置</p>
     */
    @NameInMap("Pkcs7ProviderConfig")
    public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig pkcs7ProviderConfig;

    /**
     * <p>私有CA配置</p>
     */
    @NameInMap("PrivateCaProviderConfig")
    public CreateFederatedCredentialProviderRequestPrivateCaProviderConfig privateCaProviderConfig;

    public static CreateFederatedCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederatedCredentialProviderRequest self = new CreateFederatedCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederatedCredentialProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFederatedCredentialProviderRequest setFederatedCredentialProviderName(String federatedCredentialProviderName) {
        this.federatedCredentialProviderName = federatedCredentialProviderName;
        return this;
    }
    public String getFederatedCredentialProviderName() {
        return this.federatedCredentialProviderName;
    }

    public CreateFederatedCredentialProviderRequest setFederatedCredentialProviderType(String federatedCredentialProviderType) {
        this.federatedCredentialProviderType = federatedCredentialProviderType;
        return this;
    }
    public String getFederatedCredentialProviderType() {
        return this.federatedCredentialProviderType;
    }

    public CreateFederatedCredentialProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFederatedCredentialProviderRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public CreateFederatedCredentialProviderRequest setOidcProviderConfig(CreateFederatedCredentialProviderRequestOidcProviderConfig oidcProviderConfig) {
        this.oidcProviderConfig = oidcProviderConfig;
        return this;
    }
    public CreateFederatedCredentialProviderRequestOidcProviderConfig getOidcProviderConfig() {
        return this.oidcProviderConfig;
    }

    public CreateFederatedCredentialProviderRequest setPkcs7ProviderConfig(CreateFederatedCredentialProviderRequestPkcs7ProviderConfig pkcs7ProviderConfig) {
        this.pkcs7ProviderConfig = pkcs7ProviderConfig;
        return this;
    }
    public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig getPkcs7ProviderConfig() {
        return this.pkcs7ProviderConfig;
    }

    public CreateFederatedCredentialProviderRequest setPrivateCaProviderConfig(CreateFederatedCredentialProviderRequestPrivateCaProviderConfig privateCaProviderConfig) {
        this.privateCaProviderConfig = privateCaProviderConfig;
        return this;
    }
    public CreateFederatedCredentialProviderRequestPrivateCaProviderConfig getPrivateCaProviderConfig() {
        return this.privateCaProviderConfig;
    }

    public static class CreateFederatedCredentialProviderRequestOidcProviderConfig extends TeaModel {
        @NameInMap("Audiences")
        public java.util.List<String> audiences;

        /**
         * <p>Issuer</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>Jwks来源</p>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("JwksSource")
        public String jwksSource;

        /**
         * <p>JWKS 端点</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/jwks">https://example.com/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>静态获取的jwks</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;keys&quot;: [
         *     {
         *       &quot;kty&quot;: &quot;RSA&quot;,
         *       &quot;e&quot;: &quot;AQAB&quot;,
         *       &quot;use&quot;: &quot;sig&quot;,
         *       &quot;kid&quot;: &quot;KEY2RzsjRrimRASiAhCjBo18YwDoxpYHnHtv&quot;,
         *       &quot;n&quot;: &quot;qrsfFfSZngqKOxVE29ZIR4SXkwKq029B3HLDAZui_Pwaxwn8FssR9QdwsljZS06BTDp10vhPgqMB7s7TmHulL3I4WuSB-l4uXXXXX&quot;
         *     }
         *   ]
         * }</p>
         */
        @NameInMap("StaticJwks")
        public String staticJwks;

        /**
         * <p>信任条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static CreateFederatedCredentialProviderRequestOidcProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateFederatedCredentialProviderRequestOidcProviderConfig self = new CreateFederatedCredentialProviderRequestOidcProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateFederatedCredentialProviderRequestOidcProviderConfig setAudiences(java.util.List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public java.util.List<String> getAudiences() {
            return this.audiences;
        }

        public CreateFederatedCredentialProviderRequestOidcProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public CreateFederatedCredentialProviderRequestOidcProviderConfig setJwksSource(String jwksSource) {
            this.jwksSource = jwksSource;
            return this;
        }
        public String getJwksSource() {
            return this.jwksSource;
        }

        public CreateFederatedCredentialProviderRequestOidcProviderConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public CreateFederatedCredentialProviderRequestOidcProviderConfig setStaticJwks(String staticJwks) {
            this.staticJwks = staticJwks;
            return this;
        }
        public String getStaticJwks() {
            return this.staticJwks;
        }

        public CreateFederatedCredentialProviderRequestOidcProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates extends TeaModel {
        /**
         * <p>Root证书内容</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIE+zCCA0egAwIBAgIJAJZY0ZY0ZY0Z
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("Content")
        public String content;

        public static CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates self = new CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateFederatedCredentialProviderRequestPkcs7ProviderConfig extends TeaModel {
        /**
         * <p>pkcs7证书列表</p>
         */
        @NameInMap("Certificates")
        public java.util.List<CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> certificates;

        /**
         * <p>CMS验证模式</p>
         * 
         * <strong>example:</strong>
         * <p>cert_chain</p>
         */
        @NameInMap("CmsVerificationMode")
        public String cmsVerificationMode;

        /**
         * <p>签名有效期, 单位秒，1200</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("SignatureEffectiveTime")
        public Long signatureEffectiveTime;

        /**
         * <p>获取签名时间的表达式</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7.signingTime</p>
         */
        @NameInMap("SigningTimeValueExpression")
        public String signingTimeValueExpression;

        /**
         * <p>证书信任锚点来源</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>信任条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static CreateFederatedCredentialProviderRequestPkcs7ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateFederatedCredentialProviderRequestPkcs7ProviderConfig self = new CreateFederatedCredentialProviderRequestPkcs7ProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig setCertificates(java.util.List<CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig setCmsVerificationMode(String cmsVerificationMode) {
            this.cmsVerificationMode = cmsVerificationMode;
            return this;
        }
        public String getCmsVerificationMode() {
            return this.cmsVerificationMode;
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig setSignatureEffectiveTime(Long signatureEffectiveTime) {
            this.signatureEffectiveTime = signatureEffectiveTime;
            return this;
        }
        public Long getSignatureEffectiveTime() {
            return this.signatureEffectiveTime;
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig setSigningTimeValueExpression(String signingTimeValueExpression) {
            this.signingTimeValueExpression = signingTimeValueExpression;
            return this;
        }
        public String getSigningTimeValueExpression() {
            return this.signingTimeValueExpression;
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates extends TeaModel {
        /**
         * <p>Root证书内容</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIE+zCCA0egAwIBAgIJAJZY0ZY0ZY0Z
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("Content")
        public String content;

        public static CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates self = new CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateFederatedCredentialProviderRequestPrivateCaProviderConfig extends TeaModel {
        /**
         * <p>Root证书列表</p>
         */
        @NameInMap("Certificates")
        public java.util.List<CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> certificates;

        /**
         * <p>Root证书获取方式</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>Root证书的信任条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static CreateFederatedCredentialProviderRequestPrivateCaProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateFederatedCredentialProviderRequestPrivateCaProviderConfig self = new CreateFederatedCredentialProviderRequestPrivateCaProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateFederatedCredentialProviderRequestPrivateCaProviderConfig setCertificates(java.util.List<CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public CreateFederatedCredentialProviderRequestPrivateCaProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public CreateFederatedCredentialProviderRequestPrivateCaProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

}
