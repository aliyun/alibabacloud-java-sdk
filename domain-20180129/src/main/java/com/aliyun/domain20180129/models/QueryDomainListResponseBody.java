// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainListResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public QueryDomainListResponseBodyData data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static QueryDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListResponseBody self = new QueryDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryDomainListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDomainListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryDomainListResponseBody setData(QueryDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDomainListResponseBodyData getData() {
        return this.data;
    }

    public QueryDomainListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryDomainListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class QueryDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        @NameInMap("DomainGroupId")
        public String domainGroupId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("DomainGroupName")
        public String domainGroupName;

        @NameInMap("RegistrationDate")
        public String registrationDate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        @NameInMap("Premium")
        public Boolean premium;

        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("DomainType")
        public String domainType;

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

        public QueryDomainListResponseBodyDataDomain setDomainGroupId(String domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        public QueryDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryDomainListResponseBodyDataDomain setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        public QueryDomainListResponseBodyDataDomain setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public QueryDomainListResponseBodyDataDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryDomainListResponseBodyDataDomain setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public QueryDomainListResponseBodyDataDomain setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        public QueryDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public QueryDomainListResponseBodyDataDomain setRegistrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        public QueryDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
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
