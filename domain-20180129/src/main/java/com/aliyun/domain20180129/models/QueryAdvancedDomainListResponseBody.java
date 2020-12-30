// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListResponseBody extends TeaModel {
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
    public QueryAdvancedDomainListResponseBodyData data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static QueryAdvancedDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvancedDomainListResponseBody self = new QueryAdvancedDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAdvancedDomainListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryAdvancedDomainListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryAdvancedDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAdvancedDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAdvancedDomainListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryAdvancedDomainListResponseBody setData(QueryAdvancedDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAdvancedDomainListResponseBodyData getData() {
        return this.data;
    }

    public QueryAdvancedDomainListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryAdvancedDomainListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class QueryAdvancedDomainListResponseBodyDataDomainDnsList extends TeaModel {
        @NameInMap("Dns")
        public java.util.List<String> dns;

        public static QueryAdvancedDomainListResponseBodyDataDomainDnsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListResponseBodyDataDomainDnsList self = new QueryAdvancedDomainListResponseBodyDataDomainDnsList();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListResponseBodyDataDomainDnsList setDns(java.util.List<String> dns) {
            this.dns = dns;
            return this;
        }
        public java.util.List<String> getDns() {
            return this.dns;
        }

    }

    public static class QueryAdvancedDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        @NameInMap("DomainGroupId")
        public String domainGroupId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("DomainGroupName")
        public String domainGroupName;

        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

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

        @NameInMap("DnsList")
        public QueryAdvancedDomainListResponseBodyDataDomainDnsList dnsList;

        @NameInMap("Email")
        public String email;

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

        public static QueryAdvancedDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListResponseBodyDataDomain self = new QueryAdvancedDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainAuditStatus(String domainAuditStatus) {
            this.domainAuditStatus = domainAuditStatus;
            return this;
        }
        public String getDomainAuditStatus() {
            return this.domainAuditStatus;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainGroupId(String domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDnsList(QueryAdvancedDomainListResponseBodyDataDomainDnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public QueryAdvancedDomainListResponseBodyDataDomainDnsList getDnsList() {
            return this.dnsList;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

    public static class QueryAdvancedDomainListResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<QueryAdvancedDomainListResponseBodyDataDomain> domain;

        public static QueryAdvancedDomainListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListResponseBodyData self = new QueryAdvancedDomainListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListResponseBodyData setDomain(java.util.List<QueryAdvancedDomainListResponseBodyDataDomain> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<QueryAdvancedDomainListResponseBodyDataDomain> getDomain() {
            return this.domain;
        }

    }

}
