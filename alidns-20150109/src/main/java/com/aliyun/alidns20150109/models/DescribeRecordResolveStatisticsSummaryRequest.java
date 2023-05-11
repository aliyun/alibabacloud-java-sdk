// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordResolveStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the query results. Valid values: DESC and ASC. DESC is the default value and indicates that the query results are sorted in descending order. ASC indicates that the query results are sorted in ascending order.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
     * <br>
     * <p>PUBLIC and CACHE. PUBLIC is the default value and indicates an authoritative domain name. CACHE indicates a cache-accelerated domain name.</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end time in the yyyy-MM-dd format, for example, 2023-03-13.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword. The Keyword parameter is used together with the SearchMode parameter.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language used. Valid values: zh, en, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 1000.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search mode of the keyword. Valid values:</p>
     * <br>
     * <p>LIKE (default): fuzzy search. EXACT: exact match.</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start time in the yyyy-MM-dd format, for example, 2023-03-01.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The threshold for the number of resolution requests. You can query the subdomain names at the specified quantity level of resolution requests and query the number of resolution requests for each subdomain name. For example, if you set this parameter to 100, you can obtain data about the subdomain names with less than 100 resolution requests.</p>
     * <br>
     * <p>If you do not specify this parameter, the data about the subdomain names that have resolution requests is obtained.</p>
     * <br>
     * <p>If you set this parameter to a value less than 0, the data about all subdomain names is obtained.</p>
     * <br>
     * <p>If you set this parameter to 0, the data about the subdomain names that do not have resolution requests is obtained.</p>
     * <br>
     * <p>If you set this parameter to a value greater than 0, the data about the subdomain names whose number of resolution requests is less than or equal to the value of this parameter is obtained.</p>
     */
    @NameInMap("Threshold")
    public Long threshold;

    public static DescribeRecordResolveStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordResolveStatisticsSummaryRequest self = new DescribeRecordResolveStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordResolveStatisticsSummaryRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeRecordResolveStatisticsSummaryRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

}
