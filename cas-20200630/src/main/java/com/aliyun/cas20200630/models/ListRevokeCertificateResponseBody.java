// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListRevokeCertificateResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    public java.util.List<ListRevokeCertificateResponseBodyCertificateList> certificateList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRevokeCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRevokeCertificateResponseBody self = new ListRevokeCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRevokeCertificateResponseBody setCertificateList(java.util.List<ListRevokeCertificateResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<ListRevokeCertificateResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public ListRevokeCertificateResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRevokeCertificateResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListRevokeCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRevokeCertificateResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListRevokeCertificateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRevokeCertificateResponseBodyCertificateList extends TeaModel {
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

        @NameInMap("RevokeDate")
        public String revokeDate;

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

        @NameInMap("SubjectDN")
        public String subjectDN;

        public static ListRevokeCertificateResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            ListRevokeCertificateResponseBodyCertificateList self = new ListRevokeCertificateResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public ListRevokeCertificateResponseBodyCertificateList setAfterDate(String afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public String getAfterDate() {
            return this.afterDate;
        }

        public ListRevokeCertificateResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListRevokeCertificateResponseBodyCertificateList setBeforeDate(String beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public String getBeforeDate() {
            return this.beforeDate;
        }

        public ListRevokeCertificateResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListRevokeCertificateResponseBodyCertificateList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListRevokeCertificateResponseBodyCertificateList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListRevokeCertificateResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public ListRevokeCertificateResponseBodyCertificateList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public ListRevokeCertificateResponseBodyCertificateList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListRevokeCertificateResponseBodyCertificateList setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

        public ListRevokeCertificateResponseBodyCertificateList setOrganizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            return this;
        }
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        public ListRevokeCertificateResponseBodyCertificateList setRevokeDate(String revokeDate) {
            this.revokeDate = revokeDate;
            return this;
        }
        public String getRevokeDate() {
            return this.revokeDate;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public ListRevokeCertificateResponseBodyCertificateList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRevokeCertificateResponseBodyCertificateList setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
            return this;
        }
        public String getSubjectDN() {
            return this.subjectDN;
        }

    }

}
