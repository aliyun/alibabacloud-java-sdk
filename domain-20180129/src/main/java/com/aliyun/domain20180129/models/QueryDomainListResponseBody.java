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

    /**
     * <p>The domain names.</p>
     */
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
        /**
         * <p>The key of the tag added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
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
        /**
         * <p>The name of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>Guangzhou Forest Advertising Decoration Co., LTD</p>
         */
        @NameInMap("Ccompany")
        public String ccompany;

        /**
         * <p>domain transfer status. value:</p>
         * <ul>
         * <li>0: domain status normal.</li>
         * <li>1: domain is pending change holder.</li>
         * <li>2: change holder failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChgholderStatus")
        public String chgholderStatus;

        @NameInMap("DnsList")
        public QueryDomainListResponseBodyDataDomainDnsList dnsList;

        /**
         * <p>The state of real-name verification for the domain name. Valid values:</p>
         * <ul>
         * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
         * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
         * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
         * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("DomainAuditStatus")
        public String domainAuditStatus;

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("DomainGroupId")
        public String domainGroupId;

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>test group</p>
         */
        @NameInMap("DomainGroupName")
        public String domainGroupName;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The state of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The domain name needs to be renewed.</li>
         * <li><strong>2</strong>: The domain name needs to be redeemed.</li>
         * <li><strong>3</strong>: The domain name is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>New gTLD</strong></li>
         * <li><strong>gTLD</strong></li>
         * <li><strong>ccTLD</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gTLD</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The number of days from the expiration date of the domain name to the current date.</p>
         * 
         * <strong>example:</strong>
         * <p>-30</p>
         */
        @NameInMap("ExpirationCurrDateDiff")
        public Integer expirationCurrDateDiff;

        /**
         * <p>The time when the domain name expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-02 04:00:45</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <p>The validity period of the domain name. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        /**
         * <p>Indicates whether the domain name expires. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The domain name does not expire.</li>
         * <li><strong>2</strong>: The domain name expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExpirationDateStatus")
        public String expirationDateStatus;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ST20151102120031118</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the domain name is a premium domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Premium")
        public Boolean premium;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2a</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The registration type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: individual</li>
         * <li><strong>2</strong>: enterprise</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("Registrar")
        public String registrar;

        /**
         * <p>The time when the domain name was registered.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-02 04:00:45</p>
         */
        @NameInMap("RegistrationDate")
        public String registrationDate;

        /**
         * <p>Indicates how long the domain name has been registered. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("RegistrationDateLong")
        public Long registrationDateLong;

        /**
         * <p>The remarks of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the resource group to which the domain name belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2yyciz557g3q</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags added to the resource.</p>
         */
        @NameInMap("Tag")
        public QueryDomainListResponseBodyDataDomainTag tag;

        public static QueryDomainListResponseBodyDataDomain build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListResponseBodyDataDomain self = new QueryDomainListResponseBodyDataDomain();
            return TeaModel.build(map, self);
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
