// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaConvertJobsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-15T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82dfa8e8</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The sorting order. Valid values: CreateTimeDesc: sorts by create time in descending order. CreateTimeAsc: sorts by create time in ascending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries per page. Valid values: 0 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-01T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The task status.</p>
     * <ul>
     * <li>Inited: submitted</li>
     * <li>Running</li>
     * <li>Complete</li>
     * <li>Error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListMediaConvertJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaConvertJobsRequest self = new ListMediaConvertJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaConvertJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListMediaConvertJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListMediaConvertJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaConvertJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMediaConvertJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaConvertJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListMediaConvertJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
