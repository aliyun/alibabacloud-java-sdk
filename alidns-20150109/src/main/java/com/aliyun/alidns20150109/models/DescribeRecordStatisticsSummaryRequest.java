// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The type of the domain name. This parameter is not case-sensitive. Valid values:</p>
     * <ul>
     * <li><p>PUBLIC: authoritative domain name (default)</p>
     * </li>
     * <li><p>CACHE: proxy domain name</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end date of the query. The format is <strong>YYYY-MM-DD</strong>.</p>
     * <p>The default value is the current day.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword. The search is performed in the %KeyWord% format and is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>The default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is <strong>100</strong>, the minimum value is <strong>1</strong>, and the default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The search mode for the keyword. Valid values:</p>
     * <ul>
     * <li><p><strong>LIKE</strong>: fuzzy search (default)</p>
     * </li>
     * <li><p><strong>EXACT</strong>: exact match</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EXACT</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start date of the query. The format is <strong>YYYY-MM-DD</strong>.</p>
     * <p>You can query data only from the last 90 days. The value of <code>StartDate</code> must be greater than or equal to the current date minus 90 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The threshold for the number of DNS requests. This operation returns data for subdomains whose request count is less than or equal to this value.</p>
     * <ul>
     * <li><p>If you set this parameter to 100, subdomains with a request count from 1 to 100 are returned.</p>
     * </li>
     * <li><p>If you leave this parameter empty, all subdomains that have DNS requests are returned.</p>
     * </li>
     * <li><p>If you set this parameter to 0, subdomains with no DNS requests are returned. If a domain name is added on the current day and has no requests, you can query its data on the next day.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Threshold")
    public Long threshold;

    public static DescribeRecordStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsSummaryRequest self = new DescribeRecordStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsSummaryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRecordStatisticsSummaryRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeRecordStatisticsSummaryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeRecordStatisticsSummaryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeRecordStatisticsSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecordStatisticsSummaryRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecordStatisticsSummaryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordStatisticsSummaryRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeRecordStatisticsSummaryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeRecordStatisticsSummaryRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

}
