// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCasCertificatesResponseBody extends TeaModel {
    /**
     * <p>The certificate list.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<ListCasCertificatesResponseBodyCertificates> certificates;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCasCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCasCertificatesResponseBody self = new ListCasCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCasCertificatesResponseBody setCertificates(java.util.List<ListCasCertificatesResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<ListCasCertificatesResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public ListCasCertificatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCasCertificatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCasCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCasCertificatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCasCertificatesResponseBodyCertificates extends TeaModel {
        /**
         * <p>The common name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The certificate fingerprint.</p>
         * 
         * <strong>example:</strong>
         * <p>0151xxxx</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000145</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The certificate issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The expiration time of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1708423200000</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <p>The region where the certificate resides. Supported values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("Region")
        public String region;

        public static ListCasCertificatesResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListCasCertificatesResponseBodyCertificates self = new ListCasCertificatesResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public ListCasCertificatesResponseBodyCertificates setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCasCertificatesResponseBodyCertificates setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public ListCasCertificatesResponseBodyCertificates setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCasCertificatesResponseBodyCertificates setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCasCertificatesResponseBodyCertificates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCasCertificatesResponseBodyCertificates setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListCasCertificatesResponseBodyCertificates setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
