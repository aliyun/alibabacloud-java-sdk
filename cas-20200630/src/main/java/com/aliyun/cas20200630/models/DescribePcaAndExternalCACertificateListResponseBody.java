// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribePcaAndExternalCACertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    public java.util.List<DescribePcaAndExternalCACertificateListResponseBodyCertificateList> certificateList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePcaAndExternalCACertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePcaAndExternalCACertificateListResponseBody self = new DescribePcaAndExternalCACertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePcaAndExternalCACertificateListResponseBody setCertificateList(java.util.List<DescribePcaAndExternalCACertificateListResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<DescribePcaAndExternalCACertificateListResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public DescribePcaAndExternalCACertificateListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePcaAndExternalCACertificateListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribePcaAndExternalCACertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePcaAndExternalCACertificateListResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public DescribePcaAndExternalCACertificateListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePcaAndExternalCACertificateListResponseBodyCertificateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-08-23T16:15Z</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <strong>example:</strong>
         * <p>2021-01-01T00:00Z</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <strong>example:</strong>
         * <p>SUB_ROOT</p>
         */
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
         * <p>05e148d8d3ecc9976d9ecd2b2f25****</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
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
         * <p>05e148d8d3ecc9976d9ecd2b2f25****</p>
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

        /**
         * <strong>example:</strong>
         * <p>1a83bcbb89e562885e40aa0108f5****</p>
         */
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
         * <p>62b2b943a32d96883a6650e672ea0276****</p>
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
         * <p>-----BEGIN CERTIFICATE----- …… -----END CERTIFICATE-----</p>
         */
        @NameInMap("X509Certificate")
        public String x509Certificate;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Years")
        public Integer years;

        public static DescribePcaAndExternalCACertificateListResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            DescribePcaAndExternalCACertificateListResponseBodyCertificateList self = new DescribePcaAndExternalCACertificateListResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

        public DescribePcaAndExternalCACertificateListResponseBodyCertificateList setYears(Integer years) {
            this.years = years;
            return this;
        }
        public Integer getYears() {
            return this.years;
        }

    }

}
