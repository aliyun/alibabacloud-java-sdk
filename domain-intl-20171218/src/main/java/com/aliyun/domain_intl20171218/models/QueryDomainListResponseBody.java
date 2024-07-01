// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryDomainListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryDomainListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListResponseBody self = new QueryDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryDomainListResponseBody setData(QueryDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDomainListResponseBodyData getData() {
        return this.data;
    }

    public QueryDomainListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDomainListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryDomainListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryDomainListResponseBodyDataDomain extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        /**
         * <strong>example:</strong>
         * <p>jwssc8.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <strong>example:</strong>
         * <p>New gTLD</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <strong>example:</strong>
         * <p>-30</p>
         */
        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        /**
         * <strong>example:</strong>
         * <p>Nov 02,2019 04:00:45</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        /**
         * <strong>example:</strong>
         * <p>ST49P7TZLDAWSH2</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Premium")
        public Boolean premium;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegistrantType")
        public String registrantType;

        /**
         * <strong>example:</strong>
         * <p>Nov 02,2017 04:00:45</p>
         */
        @NameInMap("RegistrationDate")
        public String registrationDate;

        /**
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        @NameInMap("Remark")
        public String remark;

        public static QueryDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomain self = new QueryDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyDataDomain setDomainAuditStatus(String domainAuditStatus) {
            this.domainAuditStatus = domainAuditStatus;
            return this;
        }
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        public QueryDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainListResponseBodyDataDomain setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public QueryDomainListResponseBodyDataDomain setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        public QueryDomainListResponseBodyDataDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public QueryDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryDomainListResponseBodyDataDomain setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public QueryDomainListResponseBodyDataDomain setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public QueryDomainListResponseBodyDataDomain setRegistrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        public QueryDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class QueryDomainListResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<QueryDomainListResponseBodyDataDomain> domain;

        public static QueryDomainListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyData self = new QueryDomainListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyData setDomain(java.util.List<QueryDomainListResponseBodyDataDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<QueryDomainListResponseBodyDataDomain> getDomain() {
            return this.domain;
        }

    }

}
