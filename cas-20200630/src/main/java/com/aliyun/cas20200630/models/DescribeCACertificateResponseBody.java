// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateResponseBody extends TeaModel {
    /**
     * <p>The details about the CA certificate.</p>
     */
    @NameInMap("Certificate")
    public DescribeCACertificateResponseBodyCertificate certificate;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The validity period of the CA certificate. Unit: years.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Years")
    public Integer years;

    public static DescribeCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateResponseBody self = new DescribeCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateResponseBody setCertificate(DescribeCACertificateResponseBodyCertificate certificate) {
        this.certificate = certificate;
        return this;
    }
    public DescribeCACertificateResponseBodyCertificate getCertificate() {
        return this.certificate;
    }

    public DescribeCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCACertificateResponseBody setYears(Integer years) {
        this.years = years;
        return this;
    }
    public Integer getYears() {
        return this.years;
    }

    public static class DescribeCACertificateResponseBodyCertificate extends TeaModel {
        /**
         * <p>The expiration date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The encryption algorithm of the CA certificate. Valid values:</p>
         * <ul>
         * <li><strong>RSA</strong>: the Rivest-Shamir-Adleman (RSA) algorithm.</li>
         * <li><strong>ECC</strong>: the elliptic curve cryptography (ECC) algorithm.</li>
         * <li><strong>SM2</strong>: the SM2 algorithm, which is developed and approved by the State Cryptography Administration of China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The issuance date of the CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634283958000</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>CA certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * 用户证书
         * -----END CERTIFICATE-----</p>
         * <p>-----BEGIN CERTIFICATE-----
         * 中间证书
         * -----END CERTIFICATE-----</p>
         * <p>-----BEGIN CERTIFICATE-----
         * 根证书
         * -----END CERTIFICATE-----</p>
         */
        @NameInMap("CaCertChain")
        public String caCertChain;

        /**
         * <p>The number of certificates issued by private CA instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CertIssuedCount")
        public Long certIssuedCount;

        /**
         * <p>The remaining number of assignable certificate quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CertRemainingCount")
        public Long certRemainingCount;

        /**
         * <p>The total number of purchased certificate quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("CertTotalCount")
        public Long certTotalCount;

        /**
         * <p>The type of the CA certificate. Valid values:</p>
         * <ul>
         * <li><strong>ROOT</strong>: root CA certificate</li>
         * <li><strong>SUB_ROOT</strong>: intermediate CA certificate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUB_ROOT</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The common name or abbreviation of the organization that is associated with the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The code of the country in which the organization is located.</p>
         * <p>For more information about country codes, see the <strong>&quot;Country codes&quot;</strong> section of the <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CrlDay")
        public Integer crlDay;

        /**
         * <p>The status of the certificate revocation list (CRL) feature.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("CrlStatus")
        public String crlStatus;

        /**
         * <p>The address of the CRL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://crl-cn-publish.oss-cn-hangzhou.aliyuncs.com/pca/crl/1925647866611395/1ed40789-483f-6023-b6b8-29ddd3bb0a9a.crl">https://crl-cn-publish.oss-cn-hangzhou.aliyuncs.com/pca/crl/1925647866611395/1ed40789-483f-6023-b6b8-29ddd3bb0a9a.crl</a></p>
         */
        @NameInMap("CrlUrl")
        public String crlUrl;

        /**
         * <p>The unique identifier of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The key length of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The name of the city in which the organization is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The MD5 fingerprint of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The name of the organization that is associated with the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Computing Co., Ltd.</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The name of the department or branch in the organization that is associated with the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Security</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>The unique identifier of the root CA certificate from which the CA certificate is issued.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of the <strong>CertificateType</strong> parameter is <strong>SUB_ROOT</strong>. The value SUB_ROOT indicates an intermediate CA certificate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1a83bcbb89e562885e40aa0108f5****</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The serial number of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>70e3b2566d92805173767869727fb92e****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The SHA-256 fingerprint of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1fcec36d658f7e20de18f6957bbac42b373a66bc9de4e9****</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The signature algorithm of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256WITHRSA</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The name of the province, municipality, or autonomous region in which the organization is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The status of the CA certificate. Valid values:</p>
         * <ul>
         * <li><strong>ISSUE</strong>: The CA certificate is issued.</li>
         * <li><strong>REVOKE</strong>: The CA certificate is revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user attribute of the CA certificate, which contains the following information:</p>
         * <ul>
         * <li><strong>C</strong>: the country code in which the organization is located</li>
         * <li><strong>O</strong>: the name of the organization</li>
         * <li><strong>OU</strong>: the name of the department or branch in the organization</li>
         * <li><strong>L</strong>: the name of the city in which the organization is located</li>
         * <li><strong>ST</strong>: the name of the province, municipality, or autonomous region in which the organization is located</li>
         * <li><strong>CN</strong>: the common name or abbreviation of the organization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>C=CN,O=Alibaba Cloud Computing Co., Ltd.,OU=Security,L=Hangzhou,ST=Zhejiang,CN=Aliyun</p>
         */
        @NameInMap("SubjectDN")
        public String subjectDN;

        /**
         * <p>The content of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- …… -----END CERTIFICATE-----</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static DescribeCACertificateResponseBodyCertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeCACertificateResponseBodyCertificate self = new DescribeCACertificateResponseBodyCertificate();
            return TeaModel.build(map, self);
        }

        public DescribeCACertificateResponseBodyCertificate setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeCACertificateResponseBodyCertificate setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeCACertificateResponseBodyCertificate setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeCACertificateResponseBodyCertificate setCaCertChain(String caCertChain) {
            this.caCertChain = caCertChain;
            return this;
        }
        public String getCaCertChain() {
            return this.caCertChain;
        }

        public DescribeCACertificateResponseBodyCertificate setCertIssuedCount(Long certIssuedCount) {
            this.certIssuedCount = certIssuedCount;
            return this;
        }
        public Long getCertIssuedCount() {
            return this.certIssuedCount;
        }

        public DescribeCACertificateResponseBodyCertificate setCertRemainingCount(Long certRemainingCount) {
            this.certRemainingCount = certRemainingCount;
            return this;
        }
        public Long getCertRemainingCount() {
            return this.certRemainingCount;
        }

        public DescribeCACertificateResponseBodyCertificate setCertTotalCount(Long certTotalCount) {
            this.certTotalCount = certTotalCount;
            return this;
        }
        public Long getCertTotalCount() {
            return this.certTotalCount;
        }

        public DescribeCACertificateResponseBodyCertificate setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeCACertificateResponseBodyCertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeCACertificateResponseBodyCertificate setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeCACertificateResponseBodyCertificate setCrlDay(Integer crlDay) {
            this.crlDay = crlDay;
            return this;
        }
        public Integer getCrlDay() {
            return this.crlDay;
        }

        public DescribeCACertificateResponseBodyCertificate setCrlStatus(String crlStatus) {
            this.crlStatus = crlStatus;
            return this;
        }
        public String getCrlStatus() {
            return this.crlStatus;
        }

        public DescribeCACertificateResponseBodyCertificate setCrlUrl(String crlUrl) {
            this.crlUrl = crlUrl;
            return this;
        }
        public String getCrlUrl() {
            return this.crlUrl;
        }

        public DescribeCACertificateResponseBodyCertificate setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeCACertificateResponseBodyCertificate setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeCACertificateResponseBodyCertificate setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribeCACertificateResponseBodyCertificate setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeCACertificateResponseBodyCertificate setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeCACertificateResponseBodyCertificate setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribeCACertificateResponseBodyCertificate setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public DescribeCACertificateResponseBodyCertificate setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeCACertificateResponseBodyCertificate setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeCACertificateResponseBodyCertificate setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeCACertificateResponseBodyCertificate setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribeCACertificateResponseBodyCertificate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeCACertificateResponseBodyCertificate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCACertificateResponseBodyCertificate setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribeCACertificateResponseBodyCertificate setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

}
