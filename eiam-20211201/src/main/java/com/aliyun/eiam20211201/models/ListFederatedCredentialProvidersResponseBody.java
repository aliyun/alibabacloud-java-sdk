// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListFederatedCredentialProvidersResponseBody extends TeaModel {
    @NameInMap("FederatedCredentialProviders")
    public java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders> federatedCredentialProviders;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFederatedCredentialProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFederatedCredentialProvidersResponseBody self = new ListFederatedCredentialProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFederatedCredentialProvidersResponseBody setFederatedCredentialProviders(java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders> federatedCredentialProviders) {
        this.federatedCredentialProviders = federatedCredentialProviders;
        return this;
    }
    public java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders> getFederatedCredentialProviders() {
        return this.federatedCredentialProviders;
    }

    public ListFederatedCredentialProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFederatedCredentialProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFederatedCredentialProvidersResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListFederatedCredentialProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFederatedCredentialProvidersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig extends TeaModel {
        /**
         * <p>oidc凭证的受众列表</p>
         */
        @NameInMap("Audiences")
        public java.util.List<String> audiences;

        /**
         * <p>动态获取的jwks</p>
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
        @NameInMap("DynamicJwks")
        public String dynamicJwks;

        /**
         * <p>Issuer</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("JwksLastObtainedTime")
        public Long jwksLastObtainedTime;

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
         * <p><a href="https://example.com">https://example.com</a></p>
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
         *       &quot;n&quot;: &quot;qrsfFfSZngqKOxVE29ZIR4SXkwKq029B3HLDAZui_Pwaxwn8FssR9QdwsljZS06BTDp10vhPgqMB7s7TmHulL3I4WuSB-l4uXTXXXX&quot;
         *     }
         *   ]
         * }</p>
         */
        @NameInMap("StaticJwks")
        public String staticJwks;

        /**
         * <p>默认条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setAudiences(java.util.List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public java.util.List<String> getAudiences() {
            return this.audiences;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setDynamicJwks(String dynamicJwks) {
            this.dynamicJwks = dynamicJwks;
            return this;
        }
        public String getDynamicJwks() {
            return this.dynamicJwks;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setJwksLastObtainedTime(Long jwksLastObtainedTime) {
            this.jwksLastObtainedTime = jwksLastObtainedTime;
            return this;
        }
        public Long getJwksLastObtainedTime() {
            return this.jwksLastObtainedTime;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setJwksSource(String jwksSource) {
            this.jwksSource = jwksSource;
            return this;
        }
        public String getJwksSource() {
            return this.jwksSource;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setStaticJwks(String staticJwks) {
            this.staticJwks = staticJwks;
            return this;
        }
        public String getStaticJwks() {
            return this.staticJwks;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata extends TeaModel {
        /**
         * <p>证书过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>证书生效时间</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates extends TeaModel {
        /**
         * <p>证书元数据</p>
         */
        @NameInMap("CertificateMetadata")
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata certificateMetadata;

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

        /**
         * <p>Root证书指纹</p>
         * 
         * <strong>example:</strong>
         * <p>2b18947a6a9fc7764fd8b5fb18a863b0c6daxxx</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates setCertificateMetadata(ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata certificateMetadata) {
            this.certificateMetadata = certificateMetadata;
            return this;
        }
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificatesCertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig extends TeaModel {
        /**
         * <p>pkcs7证书列表</p>
         */
        @NameInMap("Certificates")
        public java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates> certificates;

        /**
         * <p>CMS验证模式</p>
         * 
         * <strong>example:</strong>
         * <p>cert</p>
         */
        @NameInMap("CmsVerificationMode")
        public String cmsVerificationMode;

        /**
         * <p>签名有效时间</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("SignatureEffectiveTime")
        public Long signatureEffectiveTime;

        /**
         * <p>签名时间</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7.payload.jsonData.audience.signingTime</p>
         */
        @NameInMap("SigningTimeValueExpression")
        public String signingTimeValueExpression;

        /**
         * <p>证书信任锚点来源</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>信任条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;certNo&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig setCertificates(java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig setCmsVerificationMode(String cmsVerificationMode) {
            this.cmsVerificationMode = cmsVerificationMode;
            return this;
        }
        public String getCmsVerificationMode() {
            return this.cmsVerificationMode;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig setSignatureEffectiveTime(Long signatureEffectiveTime) {
            this.signatureEffectiveTime = signatureEffectiveTime;
            return this;
        }
        public Long getSignatureEffectiveTime() {
            return this.signatureEffectiveTime;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig setSigningTimeValueExpression(String signingTimeValueExpression) {
            this.signingTimeValueExpression = signingTimeValueExpression;
            return this;
        }
        public String getSigningTimeValueExpression() {
            return this.signingTimeValueExpression;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata extends TeaModel {
        /**
         * <p>证书过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>证书生效时间</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates extends TeaModel {
        /**
         * <p>证书元数据</p>
         */
        @NameInMap("CertificateMetadata")
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata certificateMetadata;

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

        /**
         * <p>Root证书指纹</p>
         * 
         * <strong>example:</strong>
         * <p>2b18947a6a9fc7764fd8b5fb18a863b0c6daxxx</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates setCertificateMetadata(ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata certificateMetadata) {
            this.certificateMetadata = certificateMetadata;
            return this;
        }
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificatesCertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig extends TeaModel {
        /**
         * <p>Root证书</p>
         */
        @NameInMap("Certificates")
        public java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates> certificates;

        /**
         * <p>Root证书获取方式</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("TrustAnchorSource")
        public String trustAnchorSource;

        /**
         * <p>Root证书的默认条件</p>
         * 
         * <strong>example:</strong>
         * <p>IsNullOrEmpty(&quot;certNo&quot;)</p>
         */
        @NameInMap("TrustCondition")
        public String trustCondition;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig setCertificates(java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig setTrustAnchorSource(String trustAnchorSource) {
            this.trustAnchorSource = trustAnchorSource;
            return this;
        }
        public String getTrustAnchorSource() {
            return this.trustAnchorSource;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig setTrustCondition(String trustCondition) {
            this.trustCondition = trustCondition;
            return this;
        }
        public String getTrustCondition() {
            return this.trustCondition;
        }

    }

    public static class ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders extends TeaModel {
        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Federated Credential Provider ID</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_asda123XXX</p>
         */
        @NameInMap("FederatedCredentialProviderId")
        public String federatedCredentialProviderId;

        /**
         * <p>联邦凭证提供方名称</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7test</p>
         */
        @NameInMap("FederatedCredentialProviderName")
        public String federatedCredentialProviderName;

        /**
         * <p>联邦凭证提供方类型</p>
         * 
         * <strong>example:</strong>
         * <p>pkcs7</p>
         */
        @NameInMap("FederatedCredentialProviderType")
        public String federatedCredentialProviderType;

        /**
         * <p>EIAM 实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_dd4n3rnknybjjxuu5gq6ovqxXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>网络访问端点ID</p>
         * 
         * <strong>example:</strong>
         * <p>inae_public</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>OIDC配置</p>
         */
        @NameInMap("OidcProviderConfig")
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig oidcProviderConfig;

        /**
         * <p>PKCS7配置</p>
         */
        @NameInMap("Pkcs7ProviderConfig")
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig pkcs7ProviderConfig;

        /**
         * <p>私有CA配置</p>
         */
        @NameInMap("PrivateCaProviderConfig")
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig privateCaProviderConfig;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1729061324000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders build(java.util.Map<String, ?> map) throws Exception {
            ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders self = new ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders();
            return TeaModel.build(map, self);
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setFederatedCredentialProviderName(String federatedCredentialProviderName) {
            this.federatedCredentialProviderName = federatedCredentialProviderName;
            return this;
        }
        public String getFederatedCredentialProviderName() {
            return this.federatedCredentialProviderName;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setFederatedCredentialProviderType(String federatedCredentialProviderType) {
            this.federatedCredentialProviderType = federatedCredentialProviderType;
            return this;
        }
        public String getFederatedCredentialProviderType() {
            return this.federatedCredentialProviderType;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setOidcProviderConfig(ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig oidcProviderConfig) {
            this.oidcProviderConfig = oidcProviderConfig;
            return this;
        }
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersOidcProviderConfig getOidcProviderConfig() {
            return this.oidcProviderConfig;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setPkcs7ProviderConfig(ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig pkcs7ProviderConfig) {
            this.pkcs7ProviderConfig = pkcs7ProviderConfig;
            return this;
        }
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPkcs7ProviderConfig getPkcs7ProviderConfig() {
            return this.pkcs7ProviderConfig;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setPrivateCaProviderConfig(ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig privateCaProviderConfig) {
            this.privateCaProviderConfig = privateCaProviderConfig;
            return this;
        }
        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProvidersPrivateCaProviderConfig getPrivateCaProviderConfig() {
            return this.privateCaProviderConfig;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFederatedCredentialProvidersResponseBodyFederatedCredentialProviders setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
