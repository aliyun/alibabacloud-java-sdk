// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateFederatedCredentialProviderRequest extends TeaModel {
    /**
     * <p>The federated trust source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcp_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("FederatedCredentialProviderId")
    public String federatedCredentialProviderId;

    /**
     * <p>The federated trust source name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FederatedCredentialProviderName")
    public String federatedCredentialProviderName;

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
     * <p>The network access endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_public</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>The OIDC configuration.</p>
     */
    @NameInMap("OidcProviderConfig")
    public UpdateFederatedCredentialProviderRequestOidcProviderConfig oidcProviderConfig;

    /**
     * <p>The PKCS7 configuration.</p>
     */
    @NameInMap("Pkcs7ProviderConfig")
    public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig pkcs7ProviderConfig;

    /**
     * <p>The private CA configuration.</p>
     */
    @NameInMap("PrivateCaProviderConfig")
    public UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig privateCaProviderConfig;

    public static UpdateFederatedCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFederatedCredentialProviderRequest self = new UpdateFederatedCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFederatedCredentialProviderRequest setFederatedCredentialProviderId(String federatedCredentialProviderId) {
        this.federatedCredentialProviderId = federatedCredentialProviderId;
        return this;
    }
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    public UpdateFederatedCredentialProviderRequest setFederatedCredentialProviderName(String federatedCredentialProviderName) {
        this.federatedCredentialProviderName = federatedCredentialProviderName;
        return this;
    }
    public String getFederatedCredentialProviderName() {
        return this.federatedCredentialProviderName;
    }

    public UpdateFederatedCredentialProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFederatedCredentialProviderRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public UpdateFederatedCredentialProviderRequest setOidcProviderConfig(UpdateFederatedCredentialProviderRequestOidcProviderConfig oidcProviderConfig) {
        this.oidcProviderConfig = oidcProviderConfig;
        return this;
    }
    public UpdateFederatedCredentialProviderRequestOidcProviderConfig getOidcProviderConfig() {
        return this.oidcProviderConfig;
    }

    public UpdateFederatedCredentialProviderRequest setPkcs7ProviderConfig(UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig pkcs7ProviderConfig) {
        this.pkcs7ProviderConfig = pkcs7ProviderConfig;
        return this;
    }
    public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig getPkcs7ProviderConfig() {
        return this.pkcs7ProviderConfig;
    }

    public UpdateFederatedCredentialProviderRequest setPrivateCaProviderConfig(UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig privateCaProviderConfig) {
        this.privateCaProviderConfig = privateCaProviderConfig;
        return this;
    }
    public UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig getPrivateCaProviderConfig() {
        return this.privateCaProviderConfig;
    }

    public static class UpdateFederatedCredentialProviderRequestOidcProviderConfig extends TeaModel {
        /**
         * <p>The list of audiences.</p>
         */
        @NameInMap("Audiences")
        public java.util.List<String> audiences;

        /**
         * <p>The JWKS source.</p>
         * <p>This parameter is required.</p>
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
         *       &quot;n&quot;: &quot;qrsfFfSZngqKOxVE29ZIR4SXkwKq029B3HLDAZui_Pwaxwn8FssR9QdwsljZS06BTDp10vhPgqMB7s7TmHulL3I4WuSB-l4uXTXXXX&quot;
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

        public static UpdateFederatedCredentialProviderRequestOidcProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateFederatedCredentialProviderRequestOidcProviderConfig self = new UpdateFederatedCredentialProviderRequestOidcProviderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateFederatedCredentialProviderRequestOidcProviderConfig setAudiences(java.util.List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public java.util.List<String> getAudiences() {
            return this.audiences;
        }

        public UpdateFederatedCredentialProviderRequestOidcProviderConfig setJwksSource(String jwksSource) {
            this.jwksSource = jwksSource;
            return this;
        }
        public String getJwksSource() {
            return this.jwksSource;
        }

        public UpdateFederatedCredentialProviderRequestOidcProviderConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public UpdateFederatedCredentialProviderRequestOidcProviderConfig setStaticJwks(String staticJwks) {
            this.staticJwks = staticJwks;
            return this;
        }
        public String getStaticJwks() {
            return this.staticJwks;
        }

        public UpdateFederatedCredentialProviderRequestOidcProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates extends TeaModel {
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

        public static UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates self = new UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig extends TeaModel {
        /**
         * <p>The list of PKCS7 certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> certificates;

        /**
         * <p>The CMS verification mode.</p>
         * 
         * <strong>example:</strong>
         * <p>cert</p>
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
         * <p>This parameter is required.</p>
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

        public static UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig self = new UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig setCertificates(java.util.List<UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<UpdateFederatedCredentialProviderRequestPkcs7ProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig setCmsVerificationMode(String cmsVerificationMode) {
            this.cmsVerificationMode = cmsVerificationMode;
            return this;
        }
        public String getCmsVerificationMode() {
            return this.cmsVerificationMode;
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig setSignatureEffectiveTime(Long signatureEffectiveTime) {
            this.signatureEffectiveTime = signatureEffectiveTime;
            return this;
        }
        public Long getSignatureEffectiveTime() {
            return this.signatureEffectiveTime;
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig setSigningTimeValueExpression(String signingTimeValueExpression) {
            this.signingTimeValueExpression = signingTimeValueExpression;
            return this;
        }
        public String getSigningTimeValueExpression() {
            return this.signingTimeValueExpression;
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public UpdateFederatedCredentialProviderRequestPkcs7ProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates extends TeaModel {
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

        public static UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates self = new UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig extends TeaModel {
        /**
         * <p>The list of root certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> certificates;

        /**
         * <p>The method used to retrieve the root certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>The trust condition of the root certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig self = new UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig setCertificates(java.util.List<UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<UpdateFederatedCredentialProviderRequestPrivateCaProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public UpdateFederatedCredentialProviderRequestPrivateCaProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

}
