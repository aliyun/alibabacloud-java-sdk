// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateFederatedCredentialProviderRequest extends TeaModel {
    @NameInMap("CloudIdPProviderConfig")
    public CreateFederatedCredentialProviderRequestCloudIdPProviderConfig cloudIdPProviderConfig;

    /**
     * <p>The description of the federated trust source.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the federated trust source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FederatedCredentialProviderName")
    public String federatedCredentialProviderName;

    /**
     * <p>The type of the federated trust source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkcs7</p>
     */
    @NameInMap("FederatedCredentialProviderType")
    public String federatedCredentialProviderType;

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
     * <p>The ID of the network access endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_example_id</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>The OIDC configuration.</p>
     */
    @NameInMap("OidcProviderConfig")
    public CreateFederatedCredentialProviderRequestOidcProviderConfig oidcProviderConfig;

    /**
     * <p>The PKCS7 configuration.</p>
     */
    @NameInMap("Pkcs7ProviderConfig")
    public CreateFederatedCredentialProviderRequestPkcs7ProviderConfig pkcs7ProviderConfig;

    /**
     * <p>The private CA configuration.</p>
     */
    @NameInMap("PrivateCaProviderConfig")
    public CreateFederatedCredentialProviderRequestPrivateCaProviderConfig privateCaProviderConfig;

    public static CreateFederatedCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFederatedCredentialProviderRequest self = new CreateFederatedCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFederatedCredentialProviderRequest setCloudIdPProviderConfig(CreateFederatedCredentialProviderRequestCloudIdPProviderConfig cloudIdPProviderConfig) {
        this.cloudIdPProviderConfig = cloudIdPProviderConfig;
        return this;
    }
    public CreateFederatedCredentialProviderRequestCloudIdPProviderConfig getCloudIdPProviderConfig() {
        return this.cloudIdPProviderConfig;
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

    public static class CreateFederatedCredentialProviderRequestCloudIdPProviderConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>idp_m7hk2hbnew5ir3ycfabug6xxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        public static CreateFederatedCredentialProviderRequestCloudIdPProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateFederatedCredentialProviderRequestCloudIdPProviderConfig self = new CreateFederatedCredentialProviderRequestCloudIdPProviderConfig();
            return TeaModel.build(map, self);
        }

        public CreateFederatedCredentialProviderRequestCloudIdPProviderConfig setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

    }

    public static class CreateFederatedCredentialProviderRequestOidcProviderConfig extends TeaModel {
        /**
         * <p>The list of audiences.</p>
         */
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
         * <p>The source of the JWKS.</p>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("JwksSource")
        public String jwksSource;

        /**
         * <p>The JWKS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/jwks">https://example.com/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>The statically retrieved JWKS.</p>
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
         * <p>The trust condition.</p>
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
         * <p>The content of the root certificate.</p>
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
         * <p>The list of PKCS7 certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<CreateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> certificates;

        /**
         * <p>The CMS verification mode.</p>
         * 
         * <strong>example:</strong>
         * <p>cert_chain</p>
         */
        @NameInMap("CmsVerificationMode")
        public String cmsVerificationMode;

        /**
         * <p>The validity period of the signature.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("SignatureEffectiveTime")
        public Long signatureEffectiveTime;

        /**
         * <p>The expression used to retrieve the signing time.</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7.signingTime</p>
         */
        @NameInMap("SigningTimeValueExpression")
        public String signingTimeValueExpression;

        /**
         * <p>The source of the certificate trust anchor.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>The trust condition.</p>
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
         * <p>The content of the root certificate.</p>
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
         * <p>The list of root certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<CreateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> certificates;

        /**
         * <p>The method used to retrieve the root certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>The trust condition for the root certificate.</p>
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
