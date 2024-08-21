// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the certificates.</p>
     */
    @NameInMap("CertList")
    public java.util.List<ListCertResponseBodyCertList> certList;

    /**
     * <p>The page number of the returned page. Default value: 1.</p>
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
     * <p>The number of entries returned per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The expiration time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634283958000</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The issuance time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>证书的类型 。取值：</p>
         * <ul>
         * <li><strong>CA</strong>：表示CA证书。</li>
         * <li><strong>CERT</strong>：表示签发的证书。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CERT</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.alibaba.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>Indicates whether the certificate contains a private key. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The domain names that are bound to the certificate. Multiple domain names are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>*.alibaba.com,aliyun.alibaba.com</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The source of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>upload</strong>: uploaded certificate</li>
         * <li><strong>aliyun</strong>: Alibaba Cloud certificate</li>
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
         * <li><strong>ISSUE</strong>: issued</li>
         * <li><strong>REVOKE</strong>: revoked</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISSUE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the certificate repository.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WhId")
        public Long whId;

        /**
         * <p>The instance ID of the certificate repository.</p>
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
