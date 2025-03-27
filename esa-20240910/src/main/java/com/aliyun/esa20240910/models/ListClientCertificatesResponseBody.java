// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListClientCertificatesResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The client certificates.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListClientCertificatesResponseBodyResult> result;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The website name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListClientCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientCertificatesResponseBody self = new ListClientCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientCertificatesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClientCertificatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClientCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientCertificatesResponseBody setResult(java.util.List<ListClientCertificatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListClientCertificatesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListClientCertificatesResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListClientCertificatesResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ListClientCertificatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListClientCertificatesResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>baba39055622c008b90285a8838ed09a</p>
         */
        @NameInMap("CACertificateId")
        public String CACertificateId;

        /**
         * <p>The Common Name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The time when the certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-24 07:48:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FingerprintSha256")
        public String fingerprintSha256;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>babab9db65ee5efcca9f3d41d4b50d66</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>GlobalSign nv-sa</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-31 02:08:00</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <p>The time when the certificate takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-31 02:08:00</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>The public key algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("PubkeyAlgorithm")
        public String pubkeyAlgorithm;

        /**
         * <p>The Subject Alternative Name (SAN) of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,*.example.com">www.example.com,*.example.com</a></p>
         */
        @NameInMap("SAN")
        public String SAN;

        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The signature algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256-RSA</p>
         */
        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        /**
         * <p>The certificate status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The certificate type.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the certificate was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-20 06:18:42</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListClientCertificatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListClientCertificatesResponseBodyResult self = new ListClientCertificatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListClientCertificatesResponseBodyResult setCACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }
        public String getCACertificateId() {
            return this.CACertificateId;
        }

        public ListClientCertificatesResponseBodyResult setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListClientCertificatesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClientCertificatesResponseBodyResult setFingerprintSha256(String fingerprintSha256) {
            this.fingerprintSha256 = fingerprintSha256;
            return this;
        }
        public String getFingerprintSha256() {
            return this.fingerprintSha256;
        }

        public ListClientCertificatesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClientCertificatesResponseBodyResult setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListClientCertificatesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClientCertificatesResponseBodyResult setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListClientCertificatesResponseBodyResult setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public ListClientCertificatesResponseBodyResult setPubkeyAlgorithm(String pubkeyAlgorithm) {
            this.pubkeyAlgorithm = pubkeyAlgorithm;
            return this;
        }
        public String getPubkeyAlgorithm() {
            return this.pubkeyAlgorithm;
        }

        public ListClientCertificatesResponseBodyResult setSAN(String SAN) {
            this.SAN = SAN;
            return this;
        }
        public String getSAN() {
            return this.SAN;
        }

        public ListClientCertificatesResponseBodyResult setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListClientCertificatesResponseBodyResult setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        public ListClientCertificatesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClientCertificatesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClientCertificatesResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
