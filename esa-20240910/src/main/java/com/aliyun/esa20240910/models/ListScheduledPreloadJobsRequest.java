// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadJobsRequest extends TeaModel {
    /**
     * <p>The end time for querying the task creation time range. Specify the timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717225277000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The website ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ListScheduledPreloadJobs</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The beginning of the task creation time range to query. Specify the timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717225276000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListScheduledPreloadJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadJobsRequest self = new ListScheduledPreloadJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadJobsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListScheduledPreloadJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScheduledPreloadJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScheduledPreloadJobsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListScheduledPreloadJobsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
