// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportResultShrinkRequest extends TeaModel {
    /**
     * <p>Page number of the query result. Default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>End date.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-24 10:01:55</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Number of items per page in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TaskId&quot;:&quot;P_11TL5T&quot;}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Sort field.</p>
     */
    @NameInMap("Sort")
    public String sortShrink;

    /**
     * <p>Operation source.</p>
     * 
     * <strong>example:</strong>
     * <p>disposal</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Start date.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-11 09:00:19</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ExportResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportResultShrinkRequest self = new ExportResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportResultShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ExportResultShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportResultShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExportResultShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ExportResultShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportResultShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public ExportResultShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ExportResultShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
