// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateListResponseBody extends TeaModel {
    @NameInMap("CertMetaList")
    public java.util.List<DescribeSSLCertificateListResponseBodyCertMetaList> certMetaList;

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

    public static DescribeSSLCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateListResponseBody self = new DescribeSSLCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateListResponseBody setCertMetaList(java.util.List<DescribeSSLCertificateListResponseBodyCertMetaList> certMetaList) {
        this.certMetaList = certMetaList;
        return this;
    }
    public java.util.List<DescribeSSLCertificateListResponseBodyCertMetaList> getCertMetaList() {
        return this.certMetaList;
    }

    public DescribeSSLCertificateListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSSLCertificateListResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeSSLCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSSLCertificateListResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public DescribeSSLCertificateListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSSLCertificateListResponseBodyCertMetaList extends TeaModel {
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

        public static DescribeSSLCertificateListResponseBodyCertMetaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSSLCertificateListResponseBodyCertMetaList self = new DescribeSSLCertificateListResponseBodyCertMetaList();
            return TeaModel.build(map, self);
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setSha2(String sha2) {
            this.sha2 = sha2;
            return this;
        }
        public String getSha2() {
            return this.sha2;
        }

        public DescribeSSLCertificateListResponseBodyCertMetaList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

    }

}
