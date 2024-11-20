// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDynamicImageJobsRequest extends TeaModel {
    /**
     * <p>The end of the time range during which the jobs to be queried were created.</p>
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
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>cdb3e74639973036bc84</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The order that you use to sort the query results. Valid values:</p>
     * <ol>
     * <li>CreateTimeAsc: sorts the jobs by creation time in ascending order.</li>
     * <li>CreateTimeDesc: sorts the jobs by creation time in descending order.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range during which the jobs to be queried were created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-12T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The state of the job.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Init: The job is submitted.</li>
     * <li>Success: The job is successful.</li>
     * <li>Fail: The job failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDynamicImageJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageJobsRequest self = new ListDynamicImageJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListDynamicImageJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListDynamicImageJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDynamicImageJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDynamicImageJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDynamicImageJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListDynamicImageJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
