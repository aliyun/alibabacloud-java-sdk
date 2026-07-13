// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordResolveStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The sorting direction. Valid values:</p>
     * <ul>
     * <li><p>DESC: descending order (default)</p>
     * </li>
     * <li><p>ASC: ascending order</p>
     * </li>
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
     * <p>The type of the domain name. This parameter is not case-sensitive. Valid values:</p>
     * <ul>
     * <li><p>PUBLIC: an authoritative domain name (default)</p>
     * </li>
     * <li><p>CACHE: an authoritative proxy domain name</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end date. Specify the date in the YYYY-MM-DD format. For example: 2023-03-13.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-29</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword. This parameter is used with SearchMode.</p>
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
     * <p>The page number. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 1000 and the minimum value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search mode of the keyword. Valid values:</p>
     * <ul>
     * <li><p>LIKE: fuzzy search (default)</p>
     * </li>
     * <li><p>EXACT: exact match</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIKE</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start date. Specify the date in the YYYY-MM-DD format. For example: 2023-03-01.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-29</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The resolution count threshold. This parameter lets you query subdomains based on their resolution counts.</p>
     * <p>If you do not specify this parameter, data for subdomains with a resolution count greater than 0 is returned.</p>
     * <p>If you specify a value less than 0, all data is returned.</p>
     * <p>If you specify 0, data for subdomains with a resolution count of 0 is returned.</p>
     * <p>If you specify a value greater than 0, data for subdomains with a resolution count less than or equal to the specified value is returned.</p>
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
