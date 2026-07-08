// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertResponseBody extends TeaModel {
    /**
     * <p>The list of certificates.</p>
     */
    @NameInMap("CertList")
    public java.util.List<ListCertResponseBodyCertList> certList;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The page size. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertResponseBody self = new ListCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertResponseBody setCertList(java.util.List<ListCertResponseBodyCertList> certList) {
        this.certList = certList;
        return this;
    }
    public java.util.List<ListCertResponseBodyCertList> getCertList() {
        return this.certList;
    }

    public ListCertResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListCertResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertResponseBodyCertList extends TeaModel {
        /**
         * <p>The expiration date of the certificate. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634283958000</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The encryption algorithm of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>RSA</strong>: the RSA algorithm</p>
         * </li>
         * <li><p><strong>ECC</strong>: the ECC algorithm</p>
         * </li>
         * <li><p><strong>SM2</strong>: the SM2 algorithm</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The start date of the certificate\&quot;s validity period. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>CA</strong>: a Certificate Authority (CA) certificate</p>
         * </li>
         * <li><p><strong>CERT</strong>: an issued certificate</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CERT</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The common name of the certificate. This is typically the primary domain name associated with the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.alibaba.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>Indicates whether a private key is available for the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExistPrivateKey")
        public Boolean existPrivateKey;

        /**
         * <p>The unique identifier of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The issuer of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>mySSL</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The Subject Alternative Names (SANs) associated with the certificate. Multiple domain names are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>*.alibaba.com,aliyun.alibaba.com</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The serial number of the certificate. This parameter is returned only if the <code>OrderType</code> request parameter is set to <code>CERT</code> or <code>UPLOAD</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>038abf4c27c33a7c11ad6658124135b52180</p>
         */
        @NameInMap("SerialNo")
        public String serialNo;

        /**
         * <p>The signature algorithm of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256WITHRSA</p>
         */
        @NameInMap("SignAlgorithm")
        public String signAlgorithm;

        /**
         * <p>The source of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>upload</strong>: The certificate is uploaded.</p>
         * </li>
         * <li><p><strong>aliyun</strong>: The certificate is from Alibaba Cloud.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>ISSUE</strong>: The certificate is issued.</p>
         * </li>
         * <li><p><strong>REVOKE</strong>: The certificate is revoked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The warehouse ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WhId")
        public Long whId;

        /**
         * <p>The warehouse instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test_whInstanceId</p>
         */
        @NameInMap("WhInstanceId")
        public String whInstanceId;

        public static ListCertResponseBodyCertList build(java.util.Map<String, ?> map) throws Exception {
            ListCertResponseBodyCertList self = new ListCertResponseBodyCertList();
            return TeaModel.build(map, self);
        }

        public ListCertResponseBodyCertList setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public ListCertResponseBodyCertList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListCertResponseBodyCertList setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public ListCertResponseBodyCertList setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public ListCertResponseBodyCertList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCertResponseBodyCertList setExistPrivateKey(Boolean existPrivateKey) {
            this.existPrivateKey = existPrivateKey;
            return this;
        }
        public Boolean getExistPrivateKey() {
            return this.existPrivateKey;
        }

        public ListCertResponseBodyCertList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListCertResponseBodyCertList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCertResponseBodyCertList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public ListCertResponseBodyCertList setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListCertResponseBodyCertList setSignAlgorithm(String signAlgorithm) {
            this.signAlgorithm = signAlgorithm;
            return this;
        }
        public String getSignAlgorithm() {
            return this.signAlgorithm;
        }

        public ListCertResponseBodyCertList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListCertResponseBodyCertList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCertResponseBodyCertList setWhId(Long whId) {
            this.whId = whId;
            return this;
        }
        public Long getWhId() {
            return this.whId;
        }

        public ListCertResponseBodyCertList setWhInstanceId(String whInstanceId) {
            this.whInstanceId = whInstanceId;
            return this;
        }
        public String getWhInstanceId() {
            return this.whInstanceId;
        }

    }

}
