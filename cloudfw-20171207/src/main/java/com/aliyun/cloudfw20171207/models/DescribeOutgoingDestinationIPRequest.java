// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPRequest extends TeaModel {
    // ACL覆盖情况, 枚举值.
    // 默认值: 空
    // 可选值: 
    // All (全部情况, 等同于空)
    // FullCoverage ( 已覆盖)
    // Uncovered (未覆盖)
    @NameInMap("AclCoverage")
    public String aclCoverage;

    // 应用名
    @NameInMap("ApplicationName")
    public String applicationName;

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

    // 目的IP
    @NameInMap("DstIP")
    public String dstIP;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 语言
    @NameInMap("Lang")
    public String lang;

    // 排序字段, 枚举值.
    // 默认值: SessionCount
    // 可选值: InBytes, OutBytes,TotalBytes,SessionCount
    @NameInMap("Order")
    public String order;

    // 每页大小
    @NameInMap("PageSize")
    public String pageSize;

    // 端口号
    @NameInMap("Port")
    public String port;

    // 私网IP
    @NameInMap("PrivateIP")
    public String privateIP;

    // 公网IP
    @NameInMap("PublicIP")
    public String publicIP;

    // 安全建议, 枚举值: pass, alert, drop. 默认值为空
    @NameInMap("SecuritySuggest")
    public String securitySuggest;

    // 顺序, 枚举值, 可选:asc, desc
    @NameInMap("Sort")
    public String sort;

    @NameInMap("SourceIp")
    public String sourceIp;

    // 开始时间,Unix timestamp, 精确到秒
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOutgoingDestinationIPRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPRequest self = new DescribeOutgoingDestinationIPRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPRequest setAclCoverage(String aclCoverage) {
        this.aclCoverage = aclCoverage;
        return this;
    }
    public String getAclCoverage() {
        return this.aclCoverage;
    }

    public DescribeOutgoingDestinationIPRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DescribeOutgoingDestinationIPRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDestinationIPRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDestinationIPRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeOutgoingDestinationIPRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDestinationIPRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDestinationIPRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDestinationIPRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDestinationIPRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeOutgoingDestinationIPRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeOutgoingDestinationIPRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDestinationIPRequest setSecuritySuggest(String securitySuggest) {
        this.securitySuggest = securitySuggest;
        return this;
    }
    public String getSecuritySuggest() {
        return this.securitySuggest;
    }

    public DescribeOutgoingDestinationIPRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDestinationIPRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOutgoingDestinationIPRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
