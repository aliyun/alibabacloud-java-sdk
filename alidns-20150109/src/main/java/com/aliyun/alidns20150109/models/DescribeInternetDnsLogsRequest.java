// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInternetDnsLogsRequest extends TeaModel {
    /**
     * <p>The account ID displayed on the Recursive Resolution (Public DNS) page after you activate Alibaba Cloud Public DNS.</p>
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
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the query (timestamp, unit: milliseconds). &gt;Warning: If the query time span is too large and the amount of resolution logs for the queried domain is excessive, it may lead to a query timeout or inaccurate query results.</p>
     * 
     * <strong>example:</strong>
     * <p>1709196299999</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Return value language, options: </p>
     * <ul>
     * <li>zh: Chinese </li>
     * <li>en: English</li>
     * </ul>
     * <p>Default: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Module type </p>
     * <ul>
     * <li>AUTHORITY (default): Public Authoritative DNS </li>
     * <li>RECURSION: Public Recursive DNS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTHORITY</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>Page number, default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size for query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PreciseSort")
    public Boolean preciseSort;

    /**
     * <p>Query parameters </p>
     * <ul>
     * <li>sourceIp: Source IP address </li>
     * <li>queryNameFuzzy: Domain name (fuzzy value) </li>
     * <li>queryType: Record type </li>
     * <li>value: Resolution result </li>
     * <li>status: Status </li>
     * <li>serverIp: Resolution server IP</li>
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
     * <p>The start time of the query (timestamp, unit: milliseconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1709192640000</p>
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
