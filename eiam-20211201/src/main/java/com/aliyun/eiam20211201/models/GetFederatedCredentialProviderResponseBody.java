// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetFederatedCredentialProviderResponseBody extends TeaModel {
    /**
     * <p>The federated credential provider.</p>
     */
    @NameInMap("FederatedCredentialProvider")
    public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider federatedCredentialProvider;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFederatedCredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFederatedCredentialProviderResponseBody self = new GetFederatedCredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFederatedCredentialProviderResponseBody setFederatedCredentialProvider(GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider federatedCredentialProvider) {
        this.federatedCredentialProvider = federatedCredentialProvider;
        return this;
    }
    public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider getFederatedCredentialProvider() {
        return this.federatedCredentialProvider;
    }

    public GetFederatedCredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig extends TeaModel {
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig extends TeaModel {
        /**
         * <p>A list of audiences for the OIDC credential.</p>
         */
        @NameInMap("Audiences")
        public java.util.List<String> audiences;

        /**
         * <p>The dynamically obtained JWKS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("DynamicJwks")
        public String dynamicJwks;

        /**
         * <p>The issuer of the OIDC credential.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test.idaas.com/v2/oauth">http://test.idaas.com/v2/oauth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The time of the last JWKS retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("JwksLastObtainedTime")
        public Long jwksLastObtainedTime;

        /**
         * <p>The source of the JSON Web Key Set (JWKS).</p>
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
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>The static JWKS content.</p>
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
         * <p>The trust condition for the OIDC provider.</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setAudiences(java.util.List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public java.util.List<String> getAudiences() {
            return this.audiences;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setDynamicJwks(String dynamicJwks) {
            this.dynamicJwks = dynamicJwks;
            return this;
        }
        public String getDynamicJwks() {
            return this.dynamicJwks;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setJwksLastObtainedTime(Long jwksLastObtainedTime) {
            this.jwksLastObtainedTime = jwksLastObtainedTime;
            return this;
        }
        public Long getJwksLastObtainedTime() {
            return this.jwksLastObtainedTime;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setJwksSource(String jwksSource) {
            this.jwksSource = jwksSource;
            return this;
        }
        public String getJwksSource() {
            return this.jwksSource;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setStaticJwks(String staticJwks) {
            this.staticJwks = staticJwks;
            return this;
        }
        public String getStaticJwks() {
            return this.staticJwks;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata extends TeaModel {
        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The time when the certificate becomes valid.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates extends TeaModel {
        /**
         * <p>The certificate metadata.</p>
         */
        @NameInMap("CertificateMetadata")
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata certificateMetadata;

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIE+zCCA0egAwIBAgIJAJZY0ZY0ZY0Z
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2b18947a6a9fc7764fd8b5fb18a863b0c6daxxx</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates setCertificateMetadata(GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata certificateMetadata) {
            this.certificateMetadata = certificateMetadata;
            return this;
        }
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificatesCertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig extends TeaModel {
        /**
         * <p>A list of PKCS#7 certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates> certificates;

        /**
         * <p>The Cryptographic Message Syntax (CMS) verification mode.</p>
         * 
         * <strong>example:</strong>
         * <p>cert</p>
         */
        @NameInMap("CmsVerificationMode")
        public String cmsVerificationMode;

        /**
         * <p>The validity period of the signature, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("SignatureEffectiveTime")
        public Long signatureEffectiveTime;

        /**
         * <p>An expression that specifies the signing time.</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7.payload.jsonData.audience.signingTime</p>
         */
        @NameInMap("SigningTimeValueExpression")
        public String signingTimeValueExpression;

        /**
         * <p>The source of the certificate trust anchor.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>The trust condition for the PKCS#7 provider.</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;certNo&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig setCertificates(java.util.List<GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig setCmsVerificationMode(String cmsVerificationMode) {
            this.cmsVerificationMode = cmsVerificationMode;
            return this;
        }
        public String getCmsVerificationMode() {
            return this.cmsVerificationMode;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig setSignatureEffectiveTime(Long signatureEffectiveTime) {
            this.signatureEffectiveTime = signatureEffectiveTime;
            return this;
        }
        public Long getSignatureEffectiveTime() {
            return this.signatureEffectiveTime;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig setSigningTimeValueExpression(String signingTimeValueExpression) {
            this.signingTimeValueExpression = signingTimeValueExpression;
            return this;
        }
        public String getSigningTimeValueExpression() {
            return this.signingTimeValueExpression;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata extends TeaModel {
        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The time when the certificate becomes valid.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates extends TeaModel {
        /**
         * <p>The certificate metadata.</p>
         */
        @NameInMap("CertificateMetadata")
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata certificateMetadata;

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

        /**
         * <p>The fingerprint of the root certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2b18947a6a9fc7764fd8b5fb18a863b0c6daxxx</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates setCertificateMetadata(GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata certificateMetadata) {
            this.certificateMetadata = certificateMetadata;
            return this;
        }
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificatesCertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig extends TeaModel {
        /**
         * <p>A list of root certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates> certificates;

        /**
         * <p>The method for obtaining the root certificate.</p>
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
         * <p>IsNullOrEmpty(&quot;certNo&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig setCertificates(java.util.List<GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider extends TeaModel {
        @NameInMap("CloudIdPProviderConfig")
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig cloudIdPProviderConfig;

        /**
         * <p>The time when the provider was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the federated credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_asd123XXX</p>
         */
        @NameInMap("FederatedCredentialProviderId")
        public String federatedCredentialProviderId;

        /**
         * <p>The name of the federated credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FederatedCredentialProviderName")
        public String federatedCredentialProviderName;

        /**
         * <p>The type of the federated credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7</p>
         */
        @NameInMap("FederatedCredentialProviderType")
        public String federatedCredentialProviderType;

        /**
         * <p>The ID of the EIAM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qlbbighyxbu42xl7eninojXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>inae_public</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The OpenID Connect (OIDC) configuration.</p>
         */
        @NameInMap("OidcProviderConfig")
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig oidcProviderConfig;

        /**
         * <p>The PKCS#7 configuration.</p>
         */
        @NameInMap("Pkcs7ProviderConfig")
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig pkcs7ProviderConfig;

        /**
         * <p>The private certificate authority (CA) configuration.</p>
         */
        @NameInMap("PrivateCaProviderConfig")
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig privateCaProviderConfig;

        /**
         * <p>The status of the federated credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the provider was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider self = new GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider();
            return TeaModel.build(map, self);
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setCloudIdPProviderConfig(GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig cloudIdPProviderConfig) {
            this.cloudIdPProviderConfig = cloudIdPProviderConfig;
            return this;
        }
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderCloudIdPProviderConfig getCloudIdPProviderConfig() {
            return this.cloudIdPProviderConfig;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setFederatedCredentialProviderName(String federatedCredentialProviderName) {
            this.federatedCredentialProviderName = federatedCredentialProviderName;
            return this;
        }
        public String getFederatedCredentialProviderName() {
            return this.federatedCredentialProviderName;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setFederatedCredentialProviderType(String federatedCredentialProviderType) {
            this.federatedCredentialProviderType = federatedCredentialProviderType;
            return this;
        }
        public String getFederatedCredentialProviderType() {
            return this.federatedCredentialProviderType;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setOidcProviderConfig(GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig oidcProviderConfig) {
            this.oidcProviderConfig = oidcProviderConfig;
            return this;
        }
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderOidcProviderConfig getOidcProviderConfig() {
            return this.oidcProviderConfig;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setPkcs7ProviderConfig(GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig pkcs7ProviderConfig) {
            this.pkcs7ProviderConfig = pkcs7ProviderConfig;
            return this;
        }
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPkcs7ProviderConfig getPkcs7ProviderConfig() {
            return this.pkcs7ProviderConfig;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setPrivateCaProviderConfig(GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig privateCaProviderConfig) {
            this.privateCaProviderConfig = privateCaProviderConfig;
            return this;
        }
        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProviderPrivateCaProviderConfig getPrivateCaProviderConfig() {
            return this.privateCaProviderConfig;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFederatedCredentialProviderResponseBodyFederatedCredentialProvider setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
