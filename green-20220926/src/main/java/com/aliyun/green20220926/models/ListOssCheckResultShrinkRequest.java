// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListOssCheckResultShrinkRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
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
     * <p>Number of completed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FinishNum")
    public Long finishNum;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Search condition.</p>
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
     * <p>Start date.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-11 09:00:19</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>Task status.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ListOssCheckResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssCheckResultShrinkRequest self = new ListOssCheckResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOssCheckResultShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOssCheckResultShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListOssCheckResultShrinkRequest setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
        return this;
    }
    public Long getFinishNum() {
        return this.finishNum;
    }

    public ListOssCheckResultShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOssCheckResultShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListOssCheckResultShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOssCheckResultShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public ListOssCheckResultShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListOssCheckResultShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
