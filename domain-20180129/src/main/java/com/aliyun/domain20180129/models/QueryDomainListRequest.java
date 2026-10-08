// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainListRequest extends TeaModel {
    @NameInMap("AutoRenewEnabled")
    public Boolean autoRenewEnabled;

    /**
     * <p>The name of the domain owner.</p>
     * 
     * <strong>example:</strong>
     * <p>广州金烨再生资源回收有限公司</p>
     */
    @NameInMap("Ccompany")
    public String ccompany;

    @NameInMap("Dns")
    public String dns;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the domain group. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation.
     * &lt;props=&quot;intl&quot;&gt;The ID of the domain group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public String domainGroupId;

    /**
     * <p>The domain name to query.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the expiration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    /**
     * <p>The end of the registration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    /**
     * <p>The language for API error messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort order for the results. Valid values:</p>
     * <ul>
     * <li><p><strong>ASC</strong>: Ascending.</p>
     * </li>
     * <li><p><strong>DESC</strong>: Descending.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>DESC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderByType")
    public String orderByType;

    /**
     * <p>The field to use for sorting. Valid values:</p>
     * <ul>
     * <li><p><strong>RegistrationDate</strong>: Sorts by registration date.</p>
     * </li>
     * <li><p><strong>ExpirationDate</strong>: Sorts by expiration date.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>By default, the results are sorted by the time they were added to the system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RegistrationDate</p>
     */
    @NameInMap("OrderKeyType")
    public String orderKeyType;

    /**
     * <p>The page number for the paginated results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The domain type. Valid values:</p>
     * <ul>
     * <li><p><strong>New gTLD</strong>: new generic top-level domain.</p>
     * </li>
     * <li><p><strong>gTLD</strong>: generic top-level domain.</p>
     * </li>
     * <li><p><strong>ccTLD</strong>: country-code top-level domain.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>New gTLD</p>
     */
    @NameInMap("ProductDomainType")
    public String productDomainType;

    /**
     * <p>The type of list to return. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Domain names that require urgent renewal.</p>
     * </li>
     * <li><p><strong>2</strong>: Domain names that require urgent redemption.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("Registrar")
    public String registrar;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2indvyxgpfti</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start of the expiration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    /**
     * <p>The start of the registration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<QueryDomainListRequestTag> tag;

    /**
     * <p>The user\&quot;s client IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListRequest self = new QueryDomainListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainListRequest setAutoRenewEnabled(Boolean autoRenewEnabled) {
        this.autoRenewEnabled = autoRenewEnabled;
        return this;
    }
    public Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    public QueryDomainListRequest setCcompany(String ccompany) {
        this.ccompany = ccompany;
        return this;
    }
    public String getCcompany() {
        return this.ccompany;
    }

    public QueryDomainListRequest setDns(String dns) {
        this.dns = dns;
        return this;
    }
    public String getDns() {
        return this.dns;
    }

    public QueryDomainListRequest setDomainGroupId(String domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public String getDomainGroupId() {
        return this.domainGroupId;
    }

    public QueryDomainListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainListRequest setEndExpirationDate(Long endExpirationDate) {
        this.endExpirationDate = endExpirationDate;
        return this;
    }
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    public QueryDomainListRequest setEndRegistrationDate(Long endRegistrationDate) {
        this.endRegistrationDate = endRegistrationDate;
        return this;
    }
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
    }

    public QueryDomainListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDomainListRequest setOrderByType(String orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public String getOrderByType() {
        return this.orderByType;
    }

    public QueryDomainListRequest setOrderKeyType(String orderKeyType) {
        this.orderKeyType = orderKeyType;
        return this;
    }
    public String getOrderKeyType() {
        return this.orderKeyType;
    }

    public QueryDomainListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDomainListRequest setProductDomainType(String productDomainType) {
        this.productDomainType = productDomainType;
        return this;
    }
    public String getProductDomainType() {
        return this.productDomainType;
    }

    public QueryDomainListRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryDomainListRequest setRegistrar(String registrar) {
        this.registrar = registrar;
        return this;
    }
    public String getRegistrar() {
        return this.registrar;
    }

    public QueryDomainListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public QueryDomainListRequest setStartExpirationDate(Long startExpirationDate) {
        this.startExpirationDate = startExpirationDate;
        return this;
    }
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    public QueryDomainListRequest setStartRegistrationDate(Long startRegistrationDate) {
        this.startRegistrationDate = startRegistrationDate;
        return this;
    }
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    public QueryDomainListRequest setTag(java.util.List<QueryDomainListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryDomainListRequestTag> getTag() {
        return this.tag;
    }

    public QueryDomainListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class QueryDomainListRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>标签1</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryDomainListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainListRequestTag self = new QueryDomainListRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDomainListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
