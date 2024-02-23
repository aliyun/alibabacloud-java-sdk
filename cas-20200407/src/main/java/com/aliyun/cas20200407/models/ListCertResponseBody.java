// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertResponseBody extends TeaModel {
    /**
     * <p>The certificates.</p>
     */
    @NameInMap("CertList")
    public java.util.List<ListCertResponseBodyCertList> certList;

    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned per page. Default value: 50.</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The issuance time of the certificate. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

        /**
         * <p>The type of the certificate.</p>
         * <br>
         * <p>*   **CA**: the CA certificate.</p>
         * <p>*   **CERT**: a issued certificate.</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>Indicates whether the certificate contains a private key. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ExistPrivateKey")
        public Boolean existPrivateKey;

        /**
         * <p>The unique identifier of the certificate.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The issuer of the certificate.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>All domain names that are bound to the certificate. Multiple domain names are separated by commas (,).</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>The source of the certificate. Valid values:</p>
         * <br>
         * <p>*   **upload**: uploaded certificate</p>
         * <p>*   **aliyun**: Alibaba Cloud certificate</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   **ISSUE**: issued</p>
         * <p>*   **REVOKE**: revoked</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the certificate application repository.</p>
         */
        @NameInMap("WhId")
        public Long whId;

        /**
         * <p>The instance ID of the certificate application repository.</p>
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
