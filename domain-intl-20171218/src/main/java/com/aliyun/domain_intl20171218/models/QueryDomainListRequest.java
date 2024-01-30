// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryDomainListRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndExpirationDate")
    public Long endExpirationDate;

    @NameInMap("EndRegistrationDate")
    public Long endRegistrationDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OrderByType")
    public String orderByType;

    @NameInMap("OrderKeyType")
    public String orderKeyType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductDomainType")
    public String productDomainType;

    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("StartExpirationDate")
    public Long startExpirationDate;

    @NameInMap("StartRegistrationDate")
    public Long startRegistrationDate;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListRequest self = new QueryDomainListRequest();
        return TeaModel.build(map, self);
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

    public QueryDomainListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
