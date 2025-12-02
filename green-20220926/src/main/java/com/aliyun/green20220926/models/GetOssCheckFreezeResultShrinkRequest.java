// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckFreezeResultShrinkRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-19 10:05:11</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Number of completed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * <p>Query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TaskId\&quot;:\&quot;P_O3SI0I\&quot;}</p>
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
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-09 10:28:54</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>Task status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetOssCheckFreezeResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckFreezeResultShrinkRequest self = new GetOssCheckFreezeResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCheckFreezeResultShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOssCheckFreezeResultShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetOssCheckFreezeResultShrinkRequest setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
        return this;
    }
    public Long getFinishNum() {
        return this.finishNum;
    }

    public GetOssCheckFreezeResultShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOssCheckFreezeResultShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetOssCheckFreezeResultShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOssCheckFreezeResultShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public GetOssCheckFreezeResultShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetOssCheckFreezeResultShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
