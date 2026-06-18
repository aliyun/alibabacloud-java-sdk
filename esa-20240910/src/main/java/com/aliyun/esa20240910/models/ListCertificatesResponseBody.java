// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCertificatesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
     * <p>A list of certificate details.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListCertificatesResponseBodyResult> result;

    /**
     * <p>The ID of the site.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The name of the site.</p>
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
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesResponseBody self = new ListCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertificatesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCertificatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertificatesResponseBody setResult(java.util.List<ListCertificatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCertificatesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCertificatesResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListCertificatesResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ListCertificatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertificatesResponseBodyResultDCV extends TeaModel {
        /**
         * <p>The ID of the DCV record.</p>
         * 
         * <strong>example:</strong>
         * <p>bababf7cdd1546a2ad04c0def1f4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The DCV key. For the <code>DNS</code> method, this is the name of the TXT record. For the <code>HTTP</code> method, this is the URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/.well-known/acme-challenge/pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow">http://www.example.com/.well-known/acme-challenge/pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow</a></p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The validation status.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The DCV method. Valid values: <code>DNS</code> and <code>HTTP</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The DCV value.</p>
         * 
         * <strong>example:</strong>
         * <p>pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow.KfzYo4LH3EgOt7a73G-RqZkbR0eYtLfEUmtmqGmr4FQ</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCertificatesResponseBodyResultDCV build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyResultDCV self = new ListCertificatesResponseBodyResultDCV();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyResultDCV setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCertificatesResponseBodyResultDCV setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCertificatesResponseBodyResultDCV setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCertificatesResponseBodyResultDCV setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCertificatesResponseBodyResultDCV setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCertificatesResponseBodyResult extends TeaModel {
        /**
         * <p>The error code returned when a certificate application fails.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ApplyCode")
        public Long applyCode;

        /**
         * <p>The error message returned when a certificate application fails.</p>
         * 
         * <strong>example:</strong>
         * <p>canceled</p>
         */
        @NameInMap("ApplyMessage")
        public String applyMessage;

        /**
         * <p>The ID of the cloud certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>30000569</p>
         */
        @NameInMap("CasId")
        public String casId;

        /**
         * <p>The common name of the certificate.</p>
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
         * <p>2022-06-24 07:48:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain control validation (DCV) information.</p>
         */
        @NameInMap("DCV")
        public java.util.List<ListCertificatesResponseBodyResultDCV> DCV;

        /**
         * <p>The SHA-256 fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456a****</p>
         */
        @NameInMap("FingerprintSha256")
        public String fingerprintSha256;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>baba39055622c008b90285a8838e****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The issuer of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>GlobalSign nv-sa</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The common name of the certificate issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>GlobalSign Organization Validation CA - SHA256 - G3</p>
         */
        @NameInMap("IssuerCN")
        public String issuerCN;

        /**
         * <p>The ID of the keyless server. This parameter is valid only when <code>Type</code> is set to <code>keyless</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>baba39055622c008b90285a8838e****</p>
         */
        @NameInMap("KeyServerId")
        public String keyServerId;

        /**
         * <p>The name of the certificate.</p>
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
         * <p>The time when the certificate becomes valid.</p>
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
        @NameInMap("PubAlg")
        public String pubAlg;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The subject alternative name (SAN) of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,*.example.com">www.example.com,*.example.com</a></p>
         */
        @NameInMap("SAN")
        public String SAN;

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>babab022c5e9b27bf9c64d7f4b16****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The signature algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256-RSA</p>
         */
        @NameInMap("SigAlg")
        public String sigAlg;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><p><code>OK</code>: The certificate is valid.</p>
         * </li>
         * <li><p><code>Expired</code>: The certificate has expired.</p>
         * </li>
         * <li><p><code>Expiring</code>: The certificate is due to expire within 30 days.</p>
         * </li>
         * <li><p><code>Issued</code>: The free certificate has been issued.</p>
         * </li>
         * <li><p><code>Applying</code>: The free certificate application is in progress.</p>
         * </li>
         * <li><p><code>ApplyFailed</code>: The free certificate application has failed.</p>
         * </li>
         * <li><p><code>Canceled</code>: The free certificate application has been canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><p><code>cas</code>: An Alibaba Cloud certificate.</p>
         * </li>
         * <li><p><code>upload</code>: A user-uploaded certificate.</p>
         * </li>
         * <li><p><code>free</code>: A free certificate.</p>
         * </li>
         * <li><p><code>keyless</code>: A keyless certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the certificate was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-20 06:18:42</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListCertificatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyResult self = new ListCertificatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyResult setApplyCode(Long applyCode) {
            this.applyCode = applyCode;
            return this;
        }
        public Long getApplyCode() {
            return this.applyCode;
        }

        public ListCertificatesResponseBodyResult setApplyMessage(String applyMessage) {
            this.applyMessage = applyMessage;
            return this;
        }
        public String getApplyMessage() {
            return this.applyMessage;
        }

        public ListCertificatesResponseBodyResult setCasId(String casId) {
            this.casId = casId;
            return this;
        }
        public String getCasId() {
            return this.casId;
        }

        public ListCertificatesResponseBodyResult setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCertificatesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCertificatesResponseBodyResult setDCV(java.util.List<ListCertificatesResponseBodyResultDCV> DCV) {
            this.DCV = DCV;
            return this;
        }
        public java.util.List<ListCertificatesResponseBodyResultDCV> getDCV() {
            return this.DCV;
        }

        public ListCertificatesResponseBodyResult setFingerprintSha256(String fingerprintSha256) {
            this.fingerprintSha256 = fingerprintSha256;
            return this;
        }
        public String getFingerprintSha256() {
            return this.fingerprintSha256;
        }

        public ListCertificatesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCertificatesResponseBodyResult setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCertificatesResponseBodyResult setIssuerCN(String issuerCN) {
            this.issuerCN = issuerCN;
            return this;
        }
        public String getIssuerCN() {
            return this.issuerCN;
        }

        public ListCertificatesResponseBodyResult setKeyServerId(String keyServerId) {
            this.keyServerId = keyServerId;
            return this;
        }
        public String getKeyServerId() {
            return this.keyServerId;
        }

        public ListCertificatesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCertificatesResponseBodyResult setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public ListCertificatesResponseBodyResult setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public ListCertificatesResponseBodyResult setPubAlg(String pubAlg) {
            this.pubAlg = pubAlg;
            return this;
        }
        public String getPubAlg() {
            return this.pubAlg;
        }

        public ListCertificatesResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCertificatesResponseBodyResult setSAN(String SAN) {
            this.SAN = SAN;
            return this;
        }
        public String getSAN() {
            return this.SAN;
        }

        public ListCertificatesResponseBodyResult setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListCertificatesResponseBodyResult setSigAlg(String sigAlg) {
            this.sigAlg = sigAlg;
            return this;
        }
        public String getSigAlg() {
            return this.sigAlg;
        }

        public ListCertificatesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCertificatesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCertificatesResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
