// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSnapshotJobsRequest extends TeaModel {
    /**
     * <p>The end time for filtering jobs by creation time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-14T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The mark for the next page during continuous paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ol>
     * <li>CreateTimeAsc</li>
     * <li>CreateTimeDesc</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time for filtering jobs by creation time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The job status.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListSnapshotJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotJobsRequest self = new ListSnapshotJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSnapshotJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListSnapshotJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListSnapshotJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListSnapshotJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSnapshotJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListSnapshotJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
