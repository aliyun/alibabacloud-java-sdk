// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCertificatesByRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListCertificatesByRecordResponseBodyResult> result;

    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SiteName")
    public String siteName;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCertificatesByRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesByRecordResponseBody self = new ListCertificatesByRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertificatesByRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertificatesByRecordResponseBody setResult(java.util.List<ListCertificatesByRecordResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCertificatesByRecordResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCertificatesByRecordResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListCertificatesByRecordResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ListCertificatesByRecordResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertificatesByRecordResponseBodyResultCertificates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30000137</p>
         */
        @NameInMap("CasId")
        public String casId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>2023-02-28 06:17:11</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456aca66</p>
         */
        @NameInMap("FingerprintSha256")
        public String fingerprintSha256;

        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>GlobalSign nv-sa</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>GlobalSign Organization Validation CA - SHA256 - G3</p>
         */
        @NameInMap("IssuerCN")
        public String issuerCN;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2024-02-28 06:17:11</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <strong>example:</strong>
         * <p>2023-02-28 06:17:11</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("PubAlg")
        public String pubAlg;

        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,*.example.com">www.example.com,*.example.com</a></p>
         */
        @NameInMap("SAN")
        public String SAN;

        /**
         * <strong>example:</strong>
         * <p>baba39055622c008b90285a8838ed09a</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <strong>example:</strong>
         * <p>SHA256-RSA</p>
         */
        @NameInMap("SigAlg")
        public String sigAlg;

        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2023-02-28 06:17:11</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListCertificatesByRecordResponseBodyResultCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesByRecordResponseBodyResultCertificates self = new ListCertificatesByRecordResponseBodyResultCertificates();
            return TeaModel.build(map, self);
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setCasId(String casId) {
            this.casId = casId;
            return this;
        }
        public String getCasId() {
            return this.casId;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setFingerprintSha256(String fingerprintSha256) {
            this.fingerprintSha256 = fingerprintSha256;
            return this;
        }
        public String getFingerprintSha256() {
            return this.fingerprintSha256;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setIssuerCN(String issuerCN) {
            this.issuerCN = issuerCN;
            return this;
        }
        public String getIssuerCN() {
            return this.issuerCN;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setPubAlg(String pubAlg) {
            this.pubAlg = pubAlg;
            return this;
        }
        public String getPubAlg() {
            return this.pubAlg;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setSAN(String SAN) {
            this.SAN = SAN;
            return this;
        }
        public String getSAN() {
            return this.SAN;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setSigAlg(String sigAlg) {
            this.sigAlg = sigAlg;
            return this;
        }
        public String getSigAlg() {
            return this.sigAlg;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCertificatesByRecordResponseBodyResultCertificates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListCertificatesByRecordResponseBodyResult extends TeaModel {
        @NameInMap("ApplylingCount")
        public Long applylingCount;

        @NameInMap("Certificates")
        public java.util.List<ListCertificatesByRecordResponseBodyResultCertificates> certificates;

        @NameInMap("Count")
        public Long count;

        @NameInMap("RecordName")
        public String recordName;

        @NameInMap("Status")
        public String status;

        public static ListCertificatesByRecordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesByRecordResponseBodyResult self = new ListCertificatesByRecordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCertificatesByRecordResponseBodyResult setApplylingCount(Long applylingCount) {
            this.applylingCount = applylingCount;
            return this;
        }
        public Long getApplylingCount() {
            return this.applylingCount;
        }

        public ListCertificatesByRecordResponseBodyResult setCertificates(java.util.List<ListCertificatesByRecordResponseBodyResultCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ListCertificatesByRecordResponseBodyResultCertificates> getCertificates() {
            return this.certificates;
        }

        public ListCertificatesByRecordResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListCertificatesByRecordResponseBodyResult setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListCertificatesByRecordResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
