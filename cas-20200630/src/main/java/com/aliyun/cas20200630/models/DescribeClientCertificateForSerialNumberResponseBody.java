// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateForSerialNumberResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    public java.util.List<DescribeClientCertificateForSerialNumberResponseBodyCertificateList> certificateList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClientCertificateForSerialNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateForSerialNumberResponseBody self = new DescribeClientCertificateForSerialNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateForSerialNumberResponseBody setCertificateList(java.util.List<DescribeClientCertificateForSerialNumberResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<DescribeClientCertificateForSerialNumberResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public DescribeClientCertificateForSerialNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClientCertificateForSerialNumberResponseBodyCertificateList extends TeaModel {
        @NameInMap("AfterDate")
        public String afterDate;

        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("BeforeDate")
        public String beforeDate;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("CountryCode")
        public String countryCode;

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

        @NameInMap("Years")
        public Integer years;

        public static DescribeClientCertificateForSerialNumberResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientCertificateForSerialNumberResponseBodyCertificateList self = new DescribeClientCertificateForSerialNumberResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setAfterDate(String afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public String getAfterDate() {
            return this.afterDate;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setBeforeDate(String beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public String getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setYears(Integer years) {
            this.years = years;
            return this;
        }
        public Integer getYears() {
            return this.years;
        }

    }

}
