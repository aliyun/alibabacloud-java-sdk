// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryAdvancedDomainListResponseBodyData data;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryAdvancedDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvancedDomainListResponseBody self = new QueryAdvancedDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAdvancedDomainListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryAdvancedDomainListResponseBody setData(QueryAdvancedDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAdvancedDomainListResponseBodyData getData() {
        return this.data;
    }

    public QueryAdvancedDomainListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryAdvancedDomainListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAdvancedDomainListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryAdvancedDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAdvancedDomainListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryAdvancedDomainListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
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

    public static class QueryAdvancedDomainListResponseBodyDataDomainTagTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryAdvancedDomainListResponseBodyDataDomainTagTag build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListResponseBodyDataDomainTagTag self = new QueryAdvancedDomainListResponseBodyDataDomainTagTag();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListResponseBodyDataDomainTagTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryAdvancedDomainListResponseBodyDataDomainTagTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAdvancedDomainListResponseBodyDataDomainTag extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryAdvancedDomainListResponseBodyDataDomainTagTag> tag;

        public static QueryAdvancedDomainListResponseBodyDataDomainTag build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListResponseBodyDataDomainTag self = new QueryAdvancedDomainListResponseBodyDataDomainTag();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListResponseBodyDataDomainTag setTag(java.util.List<QueryAdvancedDomainListResponseBodyDataDomainTagTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryAdvancedDomainListResponseBodyDataDomainTagTag> getTag() {
            return this.tag;
        }

    }

    public static class QueryAdvancedDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("DnsList")
        public QueryAdvancedDomainListResponseBodyDataDomainDnsList dnsList;

        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        @NameInMap("DomainGroupId")
        public String domainGroupId;

        @NameInMap("DomainGroupName")
        public String domainGroupName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Premium")
        public Boolean premium;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("RegistrationDate")
        public String registrationDate;

        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tag")
        public QueryAdvancedDomainListResponseBodyDataDomainTag tag;

        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        public static QueryAdvancedDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryAdvancedDomainListResponseBodyDataDomain self = new QueryAdvancedDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDnsList(QueryAdvancedDomainListResponseBodyDataDomainDnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public QueryAdvancedDomainListResponseBodyDataDomainDnsList getDnsList() {
            return this.dnsList;
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

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
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

        public QueryAdvancedDomainListResponseBodyDataDomain setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
            this.expirationCurrDateDiff = expirationCurrDateDiff;
            return this;
        }
        public Integer getExpirationCurrDateDiff() {
            return this.expirationCurrDateDiff;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setExpirationDateStatus(String expirationDateStatus) {
            this.expirationDateStatus = expirationDateStatus;
            return this;
        }
        public String getExpirationDateStatus() {
            return this.expirationDateStatus;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRegistrationDateLong(Long registrationDateLong) {
            this.registrationDateLong = registrationDateLong;
            return this;
        }
        public Long getRegistrationDateLong() {
            return this.registrationDateLong;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setTag(QueryAdvancedDomainListResponseBodyDataDomainTag tag) {
            this.tag = tag;
            return this;
        }
        public QueryAdvancedDomainListResponseBodyDataDomainTag getTag() {
            return this.tag;
        }

        public QueryAdvancedDomainListResponseBodyDataDomain setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
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
