// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInternetDnsLogsRequest extends TeaModel {
    /**
     * <p>The ID of the Public DNS configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>51**4</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. This is a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <p>Warning: If you specify a wide time range, many logs may be returned. This can cause a query timeout or inaccurate results.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1741526400000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The module type.</p>
     * <ul>
     * <li><p>AUTHORITY (default): public authoritative DNS</p>
     * </li>
     * <li><p>RECURSION: public recursive DNS</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTHORITY</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PreciseSort")
    public Boolean preciseSort;

    /**
     * <p>The query parameters.</p>
     * <ul>
     * <li><p>sourceIp: the source IP address</p>
     * </li>
     * <li><p>queryNameFuzzy: the domain name (fuzzy match)</p>
     * </li>
     * <li><p>queryType: the record type</p>
     * </li>
     * <li><p>value: the resolution result</p>
     * </li>
     * <li><p>status: the status</p>
     * </li>
     * <li><p>serverIp: the IP address of the resolution server</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sourceIp&quot;:&quot;59.82.XX.XX&quot;,&quot;queryType&quot;:&quot;A&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    @NameInMap("RecursionProtocolType")
    public String recursionProtocolType;

    /**
     * <p>The start of the time range to query. This is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1738848000000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DescribeInternetDnsLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetDnsLogsRequest self = new DescribeInternetDnsLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInternetDnsLogsRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public DescribeInternetDnsLogsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeInternetDnsLogsRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeInternetDnsLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInternetDnsLogsRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeInternetDnsLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInternetDnsLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInternetDnsLogsRequest setPreciseSort(Boolean preciseSort) {
        this.preciseSort = preciseSort;
        return this;
    }
    public Boolean getPreciseSort() {
        return this.preciseSort;
    }

    public DescribeInternetDnsLogsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DescribeInternetDnsLogsRequest setRecursionProtocolType(String recursionProtocolType) {
        this.recursionProtocolType = recursionProtocolType;
        return this;
    }
    public String getRecursionProtocolType() {
        return this.recursionProtocolType;
    }

    public DescribeInternetDnsLogsRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
