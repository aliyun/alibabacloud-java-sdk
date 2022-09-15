// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertResponseBody extends TeaModel {
    @NameInMap("CertList")
    public java.util.List<ListCertResponseBodyCertList> certList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Long showSize;

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
        @NameInMap("AfterDate")
        public Long afterDate;

        @NameInMap("BeforeDate")
        public Long beforeDate;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("ExistPrivateKey")
        public Boolean existPrivateKey;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("Sans")
        public String sans;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("WhId")
        public Long whId;

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
