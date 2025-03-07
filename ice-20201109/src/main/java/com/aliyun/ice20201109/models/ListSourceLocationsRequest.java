// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSourceLocationsRequest extends TeaModel {
    /**
     * <p>Specifies whether to ignore source locations marked as deleted. A value of true means ignoring source locations marked as deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FilterState")
    public Boolean filterState;

    /**
     * <ul>
     * <li>The page number.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sorting order of the source locations based on the time when they were last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortByModifiedTime")
    public String sortByModifiedTime;

    /**
     * <p>The name of the source location.</p>
     * 
     * <strong>example:</strong>
     * <p>MySourceLocation</p>
     */
    @NameInMap("SourceLocationName")
    public String sourceLocationName;

    public static ListSourceLocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceLocationsRequest self = new ListSourceLocationsRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceLocationsRequest setFilterState(Boolean filterState) {
        this.filterState = filterState;
        return this;
    }
    public Boolean getFilterState() {
        return this.filterState;
    }

    public ListSourceLocationsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSourceLocationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSourceLocationsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSourceLocationsRequest setSortByModifiedTime(String sortByModifiedTime) {
        this.sortByModifiedTime = sortByModifiedTime;
        return this;
    }
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

    public ListSourceLocationsRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

}
