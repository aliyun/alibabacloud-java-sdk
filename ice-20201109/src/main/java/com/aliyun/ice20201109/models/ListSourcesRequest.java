// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to ignore sources marked as deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FilterState")
    public Boolean filterState;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order. Valid values: asc and desc.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sorting order by modification time. Valid values: asc and desc.</p>
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

    /**
     * <p>The name of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVodSource</p>
     */
    @NameInMap("SourceName")
    public String sourceName;

    /**
     * <p>The source type. Valid values: vodSource and liveSource.</p>
     * 
     * <strong>example:</strong>
     * <p>vodSource</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourcesRequest self = new ListSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListSourcesRequest setFilterState(Boolean filterState) {
        this.filterState = filterState;
        return this;
    }
    public Boolean getFilterState() {
        return this.filterState;
    }

    public ListSourcesRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public ListSourcesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListSourcesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSourcesRequest setSortByModifiedTime(String sortByModifiedTime) {
        this.sortByModifiedTime = sortByModifiedTime;
        return this;
    }
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

    public ListSourcesRequest setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
        return this;
    }
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public ListSourcesRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public ListSourcesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
