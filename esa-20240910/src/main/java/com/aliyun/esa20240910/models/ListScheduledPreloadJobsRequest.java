// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadJobsRequest extends TeaModel {
    /**
     * <p>End of the time range for querying job creation time, in milliseconds since the UNIX epoch.</p>
     * 
     * <strong>example:</strong>
     * <p>1717225277000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Page number to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Site ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>190007158391808</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Start of the time range for querying job creation time, in milliseconds since the UNIX epoch.</p>
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
