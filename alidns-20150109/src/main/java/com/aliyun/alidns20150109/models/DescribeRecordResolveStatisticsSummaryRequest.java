// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordResolveStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The order in which the returned entries are sorted. Valid values:</p>
     * <ul>
     * <li>DESC (default): descending order</li>
     * <li>ASC: ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. The parameter value is not case-sensitive. Valid values:</p>
     * <ul>
     * <li>PUBLIC (default): hosted public domain name</li>
     * <li>CACHE: cache-accelerated domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end date of the time range to be queried. Specify the time in the yyyy-MM-dd format, such as 2023-03-13.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-29</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword. Keyword is used together with SearchMode.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language. Valid values: zh, en, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search mode of the keyword. Valid values:</p>
     * <ul>
     * <li>LIKE (default): fuzzy search</li>
     * <li>EXACT: exact search</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIKE</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start date of the time range to be queried. Specify the time in the yyyy-MM-dd format, such as 2023-03-01.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-29</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The threshold for the number of Domain Name System (DNS) requests. You can query the subdomain names at the specified quantity level of DNS requests and query the number of DNS requests for each subdomain name.</p>
     * <p>If you do not specify this parameter, the data about the subdomain names that have DNS requests is obtained.</p>
     * <p>If you set this parameter to a value less than 0, the data about all subdomain names is obtained.</p>
     * <p>If you set this parameter to 0, the data about the subdomain names that do not have DNS requests is obtained.</p>
     * <p>If you set this parameter to a value greater than 0, the data about the subdomain names whose number of DNS requests is less than or equal to the value of this parameter is obtained.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
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
