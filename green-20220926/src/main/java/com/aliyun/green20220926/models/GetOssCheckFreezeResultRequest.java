// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckFreezeResultRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-19 10:05:11</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The number of completed items.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FinishNum")
    public Long finishNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query conditions. Note: This parameter is actually required. You must provide a JSON string that contains the TaskId field, such as {&quot;TaskId&quot;:&quot;P_XXX&quot;}. If this parameter is not provided, the API returns a 400 error (oss.check.task.not.exists).</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TaskId\&quot;:\&quot;P_O3SI0I\&quot;}</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;GmtCreate&quot;:&quot;desc&quot;}</p>
     */
    @NameInMap("Sort")
    public java.util.Map<String, String> sort;

    /**
     * <p>The start time. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-09 10:28:54</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetOssCheckFreezeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckFreezeResultRequest self = new GetOssCheckFreezeResultRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCheckFreezeResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOssCheckFreezeResultRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetOssCheckFreezeResultRequest setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
        return this;
    }
    public Long getFinishNum() {
        return this.finishNum;
    }

    public GetOssCheckFreezeResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOssCheckFreezeResultRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetOssCheckFreezeResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOssCheckFreezeResultRequest setSort(java.util.Map<String, String> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    public GetOssCheckFreezeResultRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetOssCheckFreezeResultRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
