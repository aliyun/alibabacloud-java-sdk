// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-example.com</p>
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
     * <p>The end date of the query. Specify the start date in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>The default value is the day when you query the data.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword for searches in %KeyWord% mode. The value is not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The search mode of the keyword. Valid values:</p>
     * <ul>
     * <li><strong>LIKE</strong> (default): fuzzy search</li>
     * <li><strong>EXACT</strong>: exact search</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EXACT</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start date of the query. Specify the start date in the <strong>YYYY-MM-DD</strong> format.</p>
     * <p>You can only query the DNS records within the last 90 days.``</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The maximum number of DNS requests that you can obtain. You can obtain data about a domain name with DNS request volume less than or equal to the maximum number. For example, if you set this parameter to 100, you can query domain names with less than 100 DNS requests.</p>
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
