// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainRequest extends TeaModel {
    // 分类, 枚举值.
    // 默认值: 空
    // 可选值: 
    // All (全部分类)
    // RiskDomain (风险域名分类)
    // RiskIP (风险IP分类)
    // AliYun (云产品分类)
    // NotAliYun (非云产品分类)
    @NameInMap("CategoryId")
    public String categoryId;

    // 当前页
    @NameInMap("CurrentPage")
    public String currentPage;

    // 域名
    @NameInMap("Domain")
    public String domain;

    // 结束时间,Unix timestamp, 精确到秒
    @NameInMap("EndTime")
    public String endTime;

    // 语言, 枚举值.
    // 默认值: zh
    // 可选值: en
    @NameInMap("Lang")
    public String lang;

    // 排序字段, 枚举值.
    // 默认值: SessionCount
    // 可选值: InBytes, OutBytes,TotalBytes,SessionCount
    @NameInMap("Order")
    public String order;

    // 每页条数, 不得超过100, 超过100会设置为100
    @NameInMap("PageSize")
    public String pageSize;

    // 公网IP
    @NameInMap("PublicIP")
    public String publicIP;

    // 顺序, 枚举值, 可选:asc, desc
    @NameInMap("Sort")
    public String sort;

    // 开始时间,Unix timestamp, 精确到秒
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOutgoingDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainRequest self = new DescribeOutgoingDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDomainRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeOutgoingDomainRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDomainRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDomainRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDomainRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDomainRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDomainRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
