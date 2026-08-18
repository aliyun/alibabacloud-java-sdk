// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificateDetailResponseBody extends TeaModel {
    /**
     * <p>The certificate algorithm. Valid values:</p>
     * <ul>
     * <li><strong>RSA</strong>: RSA algorithm.</li>
     * <li><strong>ECC</strong>: ECC algorithm.</li>
     * <li><strong>SM2</strong>: SM2 encryption algorithm.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The global certificate ID in the format of certificate ID + &quot;-&quot; + site region ID. This is commonly used across Alibaba Cloud services.
     *   --For the China site, the format is certificate ID + &quot;-cn-hangzhou&quot;.
     * For the China site, the format is certificate ID + &quot;-ap-southeast-1&quot;.
     * For example, if the certificate ID is 123, the CertIdentifier on the China site is &quot;123-cn-hangzhou&quot;, and the CertIdentifier on the China site is &quot;123-ap-southeast-1&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>21912069-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The certificate chain information list.</p>
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
     * <p>The certificate source. Valid values:</p>
     * <ul>
     * <li>BUY: purchased certificate.</li>
     * <li>TEST: test certificate.</li>
     * <li>UPLOAD: uploaded certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("CertificateSource")
    public String certificateSource;

    /**
     * <p>The certificate status. Valid values:</p>
     * <ul>
     * <li><strong>issued</strong>: issued.</li>
     * <li><strong>revoked</strong>: revoked.</li>
     * <li><strong>willExpire</strong>: about to expire.</li>
     * <li><strong>expired</strong>: expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertificateStatus")
    public String certificateStatus;

    /**
     * <p>The common domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The company information ID associated with the certificate application. This field is empty for DV certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>44211</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>304066</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The certificate signing request (CSR) used to issue the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>All domain names contained in the certificate. Multiple domain names are separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com,example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Indicates whether a private key exists on the backend for the current certificate. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExistPrivateKey")
    public Boolean existPrivateKey;

    /**
     * <p>The public key fingerprint.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FingerPrint")
    public String fingerPrint;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_dv-cn-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The entity that issued the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>Digicert</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The key algorithm length.</p>
     * <ul>
     * <li>The RSA algorithm length is typically 2048, 3072, or 4096.</li>
     * <li>The ECC and SM2 algorithm length is typically 256.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("KeySize")
    public Integer keySize;

    /**
     * <p>The end time of the certificate validity period.</p>
     * 
     * <strong>example:</strong>
     * <p>17326613180000</p>
     */
    @NameInMap("NotAfter")
    public Long notAfter;

    /**
     * <p>The start time of the certificate validity period.</p>
     * 
     * <strong>example:</strong>
     * <p>17321613180000</p>
     */
    @NameInMap("NotBefore")
    public Long notBefore;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The certificate serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Serial")
    public String serial;

    /**
     * <p>The list of Subject Alternative Names (SANs) of the certificate, returned in array format. This corresponds to the <code>Subject Alternative Name</code> field of the certificate.</p>
     */
    @NameInMap("SubjectAlternativeNames")
    public java.util.List<String> subjectAlternativeNames;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetCertificateDetailResponseBodyTags> tags;

    /**
     * <p>The list of cloud services to which the current certificate is deployed.</p>
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
         * <p>The issuer name in the certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The end time of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>17326613180000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The start time of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>17321613180000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <p>The remaining days of the certificate chain validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainDay")
        public Integer remainDay;

        /**
         * <p>The common name in the certificate chain.</p>
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
         * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
