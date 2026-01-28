// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainListRequest extends TeaModel {
    /**
     * <p>The name of the domain name registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>Guangzhou Jinye Renewable Resources Recycling Co., Ltd</p>
     */
    @NameInMap("Ccompany")
    public String ccompany;

    @NameInMap("Dns")
    public String dns;

    /**
     * <p>The ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public String domainGroupId;

    /**
     * <p>The domain name. You can search for the domain name in the domain name list.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query domain names based on expiration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed from January 1, 1970, 00:00:00 UTC to the time you perform the query. Only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    /**
     * <p>The end of the time range to query domain names based on registration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The order of the information based on which the domain names are sorted, such as the registration date and expiration date. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: ascending order</li>
     * <li><strong>DESC</strong>: descending order</li>
     * </ul>
     * <blockquote>
     * <p> If this parameter is not specified, the default value <strong>DESC</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderByType")
    public String orderByType;

    /**
     * <p>The field that you use to sort the domain names. Valid values:</p>
     * <ul>
     * <li><strong>RegistrationDate</strong>: registration date</li>
     * <li><strong>ExpirationDate</strong>: expiration date</li>
     * </ul>
     * <blockquote>
     * <p> If this parameter is not specified, the domain names are sorted by the time when they were added to the database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RegistrationDate</p>
     */
    @NameInMap("OrderKeyType")
    public String orderKeyType;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>New gTLD</strong>: new generic top-level domain names</li>
     * <li><strong>gTLD</strong>: generic top-level domain names</li>
     * <li><strong>ccTLD</strong>: country code top-level domain names</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>New gTLD</p>
     */
    @NameInMap("ProductDomainType")
    public String productDomainType;

    /**
     * <p>The category of the domain names that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: the domain names that need to be renewed</li>
     * <li><strong>2</strong>: the domain names that need to be redeemed</li>
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
     * <p>The beginning of the time range to query domain names based on expiration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed from January 1, 1970, 00:00:00 UTC to the time you perform the query. Only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    /**
     * <p>The beginning of the time range to query domain names based on registration dates. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Only queries by day are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1522080000000</p>
     */
    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    /**
     * <p>The tags to add to the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<QueryDomainListRequestTag> tag;

    /**
     * <p>The IP address of the client. Set the value to <strong>127.0.0.1</strong>.</p>
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
         * <p>The key of the tag to add to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to add to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
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
