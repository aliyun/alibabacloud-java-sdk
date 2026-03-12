// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryDomainListRequest extends TeaModel {
    /**
     * <p>The end of the time range to query based on the time when domain names expire.</p>
     * 
     * <strong>example:</strong>
     * <p>1696435200000</p>
     */
    @NameInMap("DeadEndDate")
    public Long deadEndDate;

    /**
     * <p>The beginning of the time range to query based on the time when domain names expire.</p>
     * 
     * <strong>example:</strong>
     * <p>1694016000000</p>
     */
    @NameInMap("DeadStartDate")
    public Long deadStartDate;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test003.cn</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <p>GUOJI, TONGYONG, GUONEI, NAME, and WEIBO.</p>
     * 
     * <strong>example:</strong>
     * <p>GUONEI</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end of the time range to query based on the time when domain names expire.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-11 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
     * <p>zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The order in which you want to sort the queried domain names. Valid values:</p>
     * <p>ASC: ascending order. DESC: descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("OrderByType")
    public String orderByType;

    /**
     * <p>The field by which domain names to be queried are sorted. Valid values:</p>
     * <p>REGDATE: registration time. DEADDATE: expiration time. CREATEDATE: creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>REGDATE</p>
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
     * <p>The product type of the domain name. Valid values:</p>
     * <p>New gTLD, gTLD, ccTLD, and other.</p>
     * 
     * <strong>example:</strong>
     * <p>ccTLD</p>
     */
    @NameInMap("ProductDomainType")
    public String productDomainType;

    /**
     * <p>The type of the query. Valid values:</p>
     * <p>1: renewal. 2: redemption. 4: transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The end of the time range to query based on the time when domain names were registered.</p>
     * 
     * <strong>example:</strong>
     * <p>1696435200000</p>
     */
    @NameInMap("RegEndDate")
    public Long regEndDate;

    /**
     * <p>The beginning of the time range to query based on the time when domain names were registered.</p>
     * 
     * <strong>example:</strong>
     * <p>1694016000000</p>
     */
    @NameInMap("RegStartDate")
    public Long regStartDate;

    /**
     * <p>The beginning of the time range to query based on the time when domain names expire.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The IP address of the client. Set the value to 127.0.0.1.</p>
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

    public QueryDomainListRequest setDeadEndDate(Long deadEndDate) {
        this.deadEndDate = deadEndDate;
        return this;
    }
    public Long getDeadEndDate() {
        return this.deadEndDate;
    }

    public QueryDomainListRequest setDeadStartDate(Long deadStartDate) {
        this.deadStartDate = deadStartDate;
        return this;
    }
    public Long getDeadStartDate() {
        return this.deadStartDate;
    }

    public QueryDomainListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainListRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public QueryDomainListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryDomainListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public QueryDomainListRequest setRegEndDate(Long regEndDate) {
        this.regEndDate = regEndDate;
        return this;
    }
    public Long getRegEndDate() {
        return this.regEndDate;
    }

    public QueryDomainListRequest setRegStartDate(Long regStartDate) {
        this.regStartDate = regStartDate;
        return this;
    }
    public Long getRegStartDate() {
        return this.regStartDate;
    }

    public QueryDomainListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryDomainListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
