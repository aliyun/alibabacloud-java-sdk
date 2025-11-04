// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListHotwordLibrariesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-26T04:11:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries to return.</p>
     * <p>Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the hotword library.</p>
     * 
     * <strong>example:</strong>
     * <p>热词库使用名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>73f33c91-d59383e8280b</strong></strong></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-26T04:11:10Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The usage scenario of the hotword library. Valid values:</p>
     * <ul>
     * <li>ASR: Automatic Speech Recognition</li>
     * <li>StructuredMediaAssets: structured media analysis</li>
     * <li>VideoTranslation: Video translation. This field cannot be modified after the hotword library is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASR</p>
     */
    @NameInMap("UsageScenario")
    public String usageScenario;

    public static ListHotwordLibrariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotwordLibrariesRequest self = new ListHotwordLibrariesRequest();
        return TeaModel.build(map, self);
    }

    public ListHotwordLibrariesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListHotwordLibrariesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotwordLibrariesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHotwordLibrariesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotwordLibrariesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListHotwordLibrariesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListHotwordLibrariesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListHotwordLibrariesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListHotwordLibrariesRequest setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

}
