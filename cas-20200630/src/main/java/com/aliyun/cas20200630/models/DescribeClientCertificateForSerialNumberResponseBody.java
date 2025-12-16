// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateForSerialNumberResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    public java.util.List<DescribeClientCertificateForSerialNumberResponseBodyCertificateList> certificateList;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2022-08-23T16:15Z</p>
         */
        @NameInMap("AfterDate")
        public String afterDate;

        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <strong>example:</strong>
         * <p>2021-10-28T16:15Z</p>
         */
        @NameInMap("BeforeDate")
        public String beforeDate;

        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <strong>example:</strong>
         * <p>d3b95700998e47afc4d95f886579****</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <strong>example:</strong>
         * <p>d3b95700998e47afc4d95f886579****</p>
         */
        @NameInMap("Md5")
        public String md5;

        @NameInMap("Organization")
        public String organization;

        /**
         * <strong>example:</strong>
         * <p>Security</p>
         */
        @NameInMap("OrganizationUnit")
        public String organizationUnit;

        @NameInMap("ParentIdentifier")
        public String parentIdentifier;

        /**
         * <strong>example:</strong>
         * <p>[ {&quot;Type&quot;: 7, &quot;Value&quot;: &quot;192.0.XX.XX&quot;}, {&quot;Type&quot;: 2, &quot;Value&quot;: &quot;<a href="http://www.aliyundoc.com%22%7D">www.aliyundoc.com&quot;}</a>, ]</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <strong>example:</strong>
         * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1fcec36d658f7e20de18f6957bbac42b373a66bc9de4e9****</p>
         */
        @NameInMap("Sha2")
        public String sha2;

        /**
         * <strong>example:</strong>
         * <p>SHA256WITHRSA</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubjectDN")
        public String subjectDN;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----  ...... -----END CERTIFICATE-----</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
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

        public DescribeClientCertificateForSerialNumberResponseBodyCertificateList setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
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
