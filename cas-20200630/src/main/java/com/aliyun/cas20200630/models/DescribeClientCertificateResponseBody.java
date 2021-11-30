// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateResponseBody extends TeaModel {
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
        @NameInMap("AfterDate")
        public Long afterDate;

        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("BeforeDate")
        public Long beforeDate;

        @NameInMap("CertificateType")
        public String certificateType;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("Days")
        public Integer days;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("KeySize")
        public Integer keySize;

        @NameInMap("Locality")
        public String locality;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Organization")
        public String organization;

        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        @NameInMap("Sans")
        public String sans;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Sha2")
        public String sha2;

        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubjectDN")
        public String subjectDN;

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
