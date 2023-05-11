// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The order in which you want to sort the query results. Valid values: DESC and ASC. DESC indicates that the query results are sorted in descending order. ASC indicates that the query results are sorted in ascending order.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end time in the yyyy-MM-dd format, for example, 2023-03-13.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The keyword. The Keyword parameter must be used together with the SearchMode parameter.</p>
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
     * <p>LIKE and EXACT. LIKE is the default value and indicates the fuzzy search mode. EXACT indicates the exact match mode.</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start time in the yyyy-MM-dd format, for example, 2023-03-01.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The threshold for the number of resolution requests. You can query the paid domain names at the specified quantity level of resolution requests and query the number of resolution requests. For example, if you set this parameter to 100, you can obtain data about the paid domain names with less than 100 resolution requests. If you do not specify this parameter, the data about the paid domain names that have resolution requests is obtained. If you set this parameter to a value less than 0, the data about all paid domain names is obtained. If you set this parameter to 0, the data about the paid domain names that do not have resolution requests is obtained. If you set this parameter to a value greater than 0, the data about the paid domain names whose number of resolution requests is less than or equal to the value of this parameter is obtained.</p>
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
