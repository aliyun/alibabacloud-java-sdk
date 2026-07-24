// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class OssCheckResultListShrinkRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-21 16:08:38</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The number of completed items.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
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
     * <p>The query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
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
     */
    @NameInMap("Sort")
    public String sortShrink;

    /**
     * <p>The start time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-21 16:08:38</p>
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

    public static OssCheckResultListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OssCheckResultListShrinkRequest self = new OssCheckResultListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OssCheckResultListShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public OssCheckResultListShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public OssCheckResultListShrinkRequest setFinishNum(Long finishNum) {
        this.finishNum = finishNum;
        return this;
    }
    public Long getFinishNum() {
        return this.finishNum;
    }

    public OssCheckResultListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OssCheckResultListShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public OssCheckResultListShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OssCheckResultListShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public OssCheckResultListShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public OssCheckResultListShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
