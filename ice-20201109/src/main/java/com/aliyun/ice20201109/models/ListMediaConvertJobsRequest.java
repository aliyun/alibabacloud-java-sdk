// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaConvertJobsRequest extends TeaModel {
    /**
     * <p>The end time of the creation time filter. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-15T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>Filters the results by job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The paging token for the next page in a continuous paged query (not present for the first page).</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82dfa8e8</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>CreateTimeDesc: Descending order by creation time.</li>
     * <li>CreateTimeAsc: Ascending order by creation time.</li>
     * </ul>
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
     * <p>The start time of the creation time filter. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-01T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The job status. Valid values: </p>
     * <ul>
     * <li>Inited: Submitted. </li>
     * <li>Running: Running.</li>
     * <li>Complete: Completed. </li>
     * <li>Error: Error.</li>
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
