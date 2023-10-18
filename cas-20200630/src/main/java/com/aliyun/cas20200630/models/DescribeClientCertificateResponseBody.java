// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or the server certificate that you want to query.</p>
     * <br>
     * <p>>  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers of all client certificates and server certificates.</p>
     */
    @NameInMap("Certificate")
    public DescribeClientCertificateResponseBodyCertificate certificate;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateResponseBody self = new DescribeClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateResponseBody setCertificate(DescribeClientCertificateResponseBodyCertificate certificate) {
        this.certificate = certificate;
        return this;
    }
    public DescribeClientCertificateResponseBodyCertificate getCertificate() {
        return this.certificate;
    }

    public DescribeClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientCertificateResponseBodyCertificate extends TeaModel {
        /**
         * <p>The name of the department in the organization. The organization is associated with the intermediate certificate authority (CA) certificate from which the certificate is issued.</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The common name of the certificate.</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The expiration date of the certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>C=CN,O=Alibaba Cloud Computing Co., Ltd.,OU=Security,L=Hangzhou,ST=Zhejiang,CN=Aliyun</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <br>
         * <p>*   **CLIENT**: client certificate</p>
         * <p>*   **SERVER**: server certificate</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("Days")
        public Integer days;

        /**
         * <p>The type of the encryption algorithm of the certificate. Valid values:</p>
         * <br>
         * <p>*   **RSA**: the Rivest-Shamir-Adleman (RSA) algorithm.</p>
         * <p>*   **ECC**: the elliptic curve cryptography (ECC) algorithm.</p>
         * <p>*   **SM2**: the SM2 algorithm, which is developed and approved by the State Cryptography Administration of China.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The name of the province, municipality, or autonomous region in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The details about the client certificate or the server certificate.</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>WB943639</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The key length of the certificate.</p>
         */
        @NameInMap("Organization")
        public String organization;

        /**
         * <p>The signature algorithm of the certificate.</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        /**
         * <p>All Alibaba Cloud API requests must include common request parameters.</p>
         * <br>
         * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
         */
        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <p>The content of the certificate.</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The name of the city in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>Queries the details about a client certificate or a server certificate by using the unique identifier of the certificate.</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <p>The validity period of the certificate. Unit: days.</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The serial number of the certificate.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The code of the country in which the organization is located. The organization is associated with the intermediate certificate from which the certificate is issued.</p>
         * <br>
         * <p>For more information about country codes, see the **"Country codes"** section of the [Manage company profiles](~~198289~~) topic.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The distinguished name (DN) extension of the certificate, which indicates the user of the certificate. The DN extension includes the following information:</p>
         * <br>
         * <p>*   **C**: the country</p>
         * <p>*   **O**: the organization</p>
         * <p>*   **OU**: the department</p>
         * <p>*   **L**: the city</p>
         * <p>*   **ST**: the province, municipality, or autonomous region</p>
         * <p>*   **CN**: the common name</p>
         */
        @NameInMap("SubjectDN")
        public String subjectDN;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   **ISSUE**: issued</p>
         * <p>*   **REVOKE**: revoked</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static DescribeClientCertificateResponseBodyCertificate build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientCertificateResponseBodyCertificate self = new DescribeClientCertificateResponseBodyCertificate();
            return TeaModel.build(map, self);
        }

        public DescribeClientCertificateResponseBodyCertificate setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeClientCertificateResponseBodyCertificate setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeClientCertificateResponseBodyCertificate setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeClientCertificateResponseBodyCertificate setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeClientCertificateResponseBodyCertificate setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeClientCertificateResponseBodyCertificate setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeClientCertificateResponseBodyCertificate setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public DescribeClientCertificateResponseBodyCertificate setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeClientCertificateResponseBodyCertificate setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeClientCertificateResponseBodyCertificate setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribeClientCertificateResponseBodyCertificate setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeClientCertificateResponseBodyCertificate setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeClientCertificateResponseBodyCertificate setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribeClientCertificateResponseBodyCertificate setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public DescribeClientCertificateResponseBodyCertificate setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeClientCertificateResponseBodyCertificate setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeClientCertificateResponseBodyCertificate setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeClientCertificateResponseBodyCertificate setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribeClientCertificateResponseBodyCertificate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClientCertificateResponseBodyCertificate setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClientCertificateResponseBodyCertificate setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribeClientCertificateResponseBodyCertificate setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

}
