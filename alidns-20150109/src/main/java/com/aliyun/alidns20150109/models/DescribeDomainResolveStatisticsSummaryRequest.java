// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li><p>DESC: descending</p>
     * </li>
     * <li><p>ASC: ascending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end date. The format is yyyy-MM-dd. For example, 2023-03-13.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-01</p>
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
     * <p>The number of entries to return on each page for a paged query. The maximum value is 1000. The minimum value is 1.</p>
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
     * <p>EXACT</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start date. The format is yyyy-MM-dd. For example, 2023-03-01.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The threshold for the number of DNS queries. This parameter filters domain names by query volume.</p>
     * <p>If you do not specify this parameter, the operation returns domain names with more than zero queries.</p>
     * <p>If you specify a value less than 0, the operation returns all domain names.</p>
     * <p>If you specify 0, the operation returns domain names with zero queries.</p>
     * <p>If you specify a value greater than 0, the operation returns domain names with a query volume up to this value.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Threshold")
    public Long threshold;

    public static DescribeDomainResolveStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveStatisticsSummaryRequest self = new DescribeDomainResolveStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveStatisticsSummaryRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDomainResolveStatisticsSummaryRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

}
