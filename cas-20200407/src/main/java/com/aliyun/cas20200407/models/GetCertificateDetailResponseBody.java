// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificateDetailResponseBody extends TeaModel {
    /**
     * <p>The certificate algorithm. Valid values:</p>
     * <ul>
     * <li><p><strong>RSA</strong>: The RSA algorithm.</p>
     * </li>
     * <li><p><strong>ECC</strong>: The ECC algorithm.</p>
     * </li>
     * <li><p><strong>SM2</strong>: The SM2 algorithm.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The global ID of the certificate, which is used in various Alibaba Cloud services. The format of the ID is <code>&lt;Certificate ID&gt;-&lt;Region ID&gt;</code>. The region ID is <code>cn-hangzhou</code> for the China site and <code>ap-southeast-1</code> for the International site. For example, if a certificate ID is <code>123</code>, its <code>CertIdentifier</code> is <code>123-cn-hangzhou</code> for the China site and <code>123-ap-southeast-1</code> for the International site.</p>
     * 
     * <strong>example:</strong>
     * <p>21912069-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The information about the certificate chain.</p>
     */
    @NameInMap("CertificateChainList")
    public java.util.List<GetCertificateDetailResponseBodyCertificateChainList> certificateChainList;

    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22559621</p>
     */
    @NameInMap("CertificateId")
    public Integer certificateId;

    /**
     * <p>The certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <p>The source of the certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>BUY</strong>: a purchased certificate.</p>
     * </li>
     * <li><p><strong>TEST</strong>: a test certificate.</p>
     * </li>
     * <li><p>Upload the certificate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("CertificateSource")
    public String certificateSource;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>issued</strong>: The certificate is issued.</p>
     * </li>
     * <li><p><strong>revoked</strong>: The certificate is revoked.</p>
     * </li>
     * <li><p><strong>willExpire</strong>: The certificate is about to expire.</p>
     * </li>
     * <li><p><strong>expired</strong>: The certificate has expired.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertificateStatus")
    public String certificateStatus;

    /**
     * <p>The common name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The ID of the company profile that is associated with the certificate application. This parameter is empty for DV certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>44211</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>304066</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The domain names that are bound to the certificate. Multiple domain names are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com,example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Indicates whether a private key is available. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExistPrivateKey")
    public Boolean existPrivateKey;

    /**
     * <p>The fingerprint of the public key.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FingerPrint")
    public String fingerPrint;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_dv-cn-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The issuer of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>Digicert</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The key size.</p>
     * <ul>
     * <li><p>For RSA algorithms, the key size is typically 2,048, 3,072, or 4,096 bits.</p>
     * </li>
     * <li><p>For ECC and SM2 algorithms, the key size is typically 256 bits.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("KeySize")
    public Integer keySize;

    /**
     * <p>The end of the validity period of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>17326613180000</p>
     */
    @NameInMap("NotAfter")
    public Long notAfter;

    /**
     * <p>The beginning of the validity period of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>17321613180000</p>
     */
    @NameInMap("NotBefore")
    public Long notBefore;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Serial")
    public String serial;

    /**
     * <p>The subject alternative names (SANs) of the certificate.</p>
     */
    @NameInMap("SubjectAlternativeNames")
    public java.util.List<String> subjectAlternativeNames;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetCertificateDetailResponseBodyTags> tags;

    /**
     * <p>The list of cloud services in which the certificate is deployed.</p>
     */
    @NameInMap("UsingProductList")
    public java.util.List<String> usingProductList;

    public static GetCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateDetailResponseBody self = new GetCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateDetailResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public GetCertificateDetailResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public GetCertificateDetailResponseBody setCertificateChainList(java.util.List<GetCertificateDetailResponseBodyCertificateChainList> certificateChainList) {
        this.certificateChainList = certificateChainList;
        return this;
    }
    public java.util.List<GetCertificateDetailResponseBodyCertificateChainList> getCertificateChainList() {
        return this.certificateChainList;
    }

    public GetCertificateDetailResponseBody setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Integer getCertificateId() {
        return this.certificateId;
    }

    public GetCertificateDetailResponseBody setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public GetCertificateDetailResponseBody setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }
    public String getCertificateSource() {
        return this.certificateSource;
    }

    public GetCertificateDetailResponseBody setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    public GetCertificateDetailResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public GetCertificateDetailResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public GetCertificateDetailResponseBody setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public GetCertificateDetailResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public GetCertificateDetailResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetCertificateDetailResponseBody setExistPrivateKey(Boolean existPrivateKey) {
        this.existPrivateKey = existPrivateKey;
        return this;
    }
    public Boolean getExistPrivateKey() {
        return this.existPrivateKey;
    }

    public GetCertificateDetailResponseBody setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }
    public String getFingerPrint() {
        return this.fingerPrint;
    }

    public GetCertificateDetailResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCertificateDetailResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public GetCertificateDetailResponseBody setKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }
    public Integer getKeySize() {
        return this.keySize;
    }

    public GetCertificateDetailResponseBody setNotAfter(Long notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public Long getNotAfter() {
        return this.notAfter;
    }

    public GetCertificateDetailResponseBody setNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public Long getNotBefore() {
        return this.notBefore;
    }

    public GetCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertificateDetailResponseBody setSerial(String serial) {
        this.serial = serial;
        return this;
    }
    public String getSerial() {
        return this.serial;
    }

    public GetCertificateDetailResponseBody setSubjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }
    public java.util.List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public GetCertificateDetailResponseBody setTags(java.util.List<GetCertificateDetailResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetCertificateDetailResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetCertificateDetailResponseBody setUsingProductList(java.util.List<String> usingProductList) {
        this.usingProductList = usingProductList;
        return this;
    }
    public java.util.List<String> getUsingProductList() {
        return this.usingProductList;
    }

    public static class GetCertificateDetailResponseBodyCertificateChainList extends TeaModel {
        /**
         * <p>The issuer of the certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The end of the validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>17326613180000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The beginning of the validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>17321613180000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <p>The remaining validity period of the certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainDay")
        public Integer remainDay;

        /**
         * <p>The common name of the certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        @NameInMap("Subject")
        public String subject;

        public static GetCertificateDetailResponseBodyCertificateChainList build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateDetailResponseBodyCertificateChainList self = new GetCertificateDetailResponseBodyCertificateChainList();
            return TeaModel.build(map, self);
        }

        public GetCertificateDetailResponseBodyCertificateChainList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class GetCertificateDetailResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key of the instance. You can specify 1 to 20 tag keys. The value cannot be an empty string.</p>
         * <p>The value can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetCertificateDetailResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateDetailResponseBodyTags self = new GetCertificateDetailResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetCertificateDetailResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetCertificateDetailResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
