// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryDomainListResponseBodyData data;

    /**
     * <p>Indicates whether the current page is followed by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the current page is preceded by a page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B7AB5469-5E38-4AA9-A920-C65B7A9C8E6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public static class QueryDomainListResponseBodyDataDomainDnsList extends TeaModel {
        @NameInMap("DnsList")
        public java.util.List<String> dnsList;

        public static QueryDomainListResponseBodyDataDomainDnsList build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomainDnsList self = new QueryDomainListResponseBodyDataDomainDnsList();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyDataDomainDnsList setDnsList(java.util.List<String> dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public java.util.List<String> getDnsList() {
            return this.dnsList;
        }

    }

    public static class QueryDomainListResponseBodyDataDomainTagTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryDomainListResponseBodyDataDomainTagTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomainTagTag self = new QueryDomainListResponseBodyDataDomainTagTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyDataDomainTagTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDomainListResponseBodyDataDomainTagTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDomainListResponseBodyDataDomainTag extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryDomainListResponseBodyDataDomainTagTag> tag;

        public static QueryDomainListResponseBodyDataDomainTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomainTag self = new QueryDomainListResponseBodyDataDomainTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyDataDomainTag setTag(java.util.List<QueryDomainListResponseBodyDataDomainTagTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryDomainListResponseBodyDataDomainTagTag> getTag() {
            return this.tag;
        }

    }

    public static class QueryDomainListResponseBodyDataDomain extends TeaModel {
        @NameInMap("AutoRenewEnabled")
        public Boolean autoRenewEnabled;

        @NameInMap("Ccompany")
        public String ccompany;

        @NameInMap("ChgholderStatus")
        public String chgholderStatus;

        @NameInMap("DnsList")
        public QueryDomainListResponseBodyDataDomainDnsList dnsList;

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

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("Registrar")
        public String registrar;

        @NameInMap("RegistrationDate")
        public String registrationDate;

        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tag")
        public QueryDomainListResponseBodyDataDomainTag tag;

        public static QueryDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomain self = new QueryDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
        }

        public QueryDomainListResponseBodyDataDomain setAutoRenewEnabled(Boolean autoRenewEnabled) {
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }
        public Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public QueryDomainListResponseBodyDataDomain setCcompany(String ccompany) {
            this.ccompany = ccompany;
            return this;
        }
        public String getCcompany() {
            return this.ccompany;
        }

        public QueryDomainListResponseBodyDataDomain setChgholderStatus(String chgholderStatus) {
            this.chgholderStatus = chgholderStatus;
            return this;
        }
        public String getChgholderStatus() {
            return this.chgholderStatus;
        }

        public QueryDomainListResponseBodyDataDomain setDnsList(QueryDomainListResponseBodyDataDomainDnsList dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public QueryDomainListResponseBodyDataDomainDnsList getDnsList() {
            return this.dnsList;
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

        public QueryDomainListResponseBodyDataDomain setDomainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }
        public String getDomainGroupName() {
            return this.domainGroupName;
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

        public QueryDomainListResponseBodyDataDomain setRegistrar(String registrar) {
            this.registrar = registrar;
            return this;
        }
        public String getRegistrar() {
            return this.registrar;
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

        public QueryDomainListResponseBodyDataDomain setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public QueryDomainListResponseBodyDataDomain setTag(QueryDomainListResponseBodyDataDomainTag tag) {
            this.tag = tag;
            return this;
        }
        public QueryDomainListResponseBodyDataDomainTag getTag() {
            return this.tag;
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
