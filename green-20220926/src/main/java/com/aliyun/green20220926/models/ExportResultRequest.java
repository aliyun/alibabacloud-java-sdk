// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportResultRequest extends TeaModel {
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
    public java.util.Map<String, String> sort;

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

    public static ExportResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportResultRequest self = new ExportResultRequest();
        return TeaModel.build(map, self);
    }

    public ExportResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ExportResultRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExportResultRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ExportResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportResultRequest setSort(java.util.Map<String, String> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    public ExportResultRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ExportResultRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
