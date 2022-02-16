// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateMatchDomainListResponseBody extends TeaModel {
    @NameInMap("CertMetaList")
    public java.util.List<DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList> certMetaList;

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

    public static DescribeSSLCertificateMatchDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateMatchDomainListResponseBody self = new DescribeSSLCertificateMatchDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateMatchDomainListResponseBody setCertMetaList(java.util.List<DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList> certMetaList) {
        this.certMetaList = certMetaList;
        return this;
    }
    public java.util.List<DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList> getCertMetaList() {
        return this.certMetaList;
    }

    public DescribeSSLCertificateMatchDomainListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSSLCertificateMatchDomainListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeSSLCertificateMatchDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSSLCertificateMatchDomainListResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public DescribeSSLCertificateMatchDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList extends TeaModel {
        @NameInMap("AfterDate")
        public Long afterDate;

        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("BeforeDate")
        public Long beforeDate;

        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("DomainMatchCert")
        public Boolean domainMatchCert;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("KeySize")
        public Integer keySize;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Sans")
        public String sans;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("Sha2")
        public String sha2;

        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        public static DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList self = new DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList();
            return TeaModel.build(map, self);
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setDomainMatchCert(Boolean domainMatchCert) {
            this.domainMatchCert = domainMatchCert;
            return this;
        }
        public Boolean getDomainMatchCert() {
            return this.domainMatchCert;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeSSLCertificateMatchDomainListResponseBodyCertMetaList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

    }

}
