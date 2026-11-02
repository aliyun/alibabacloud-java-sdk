// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPackageJobsRequest extends TeaModel {
    /**
     * <p>The end time for filtering by job creation time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-15T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>Filters by job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7b38a5d86f1e47838927b6e7ccb1****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The token for the next page in continuous paging query. This parameter is not required for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82df****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The sort order. Only two values are supported:</p>
     * <ul>
     * <li>CreateTimeDesc: descending by creation time.</li>
     * <li>CreateTimeAsc: ascending by creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page size. Valid values: 0 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time for filtering by job creation time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-01T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Init: Submitted.</li>
     * <li>Success: Succeeded.</li>
     * <li>Fail: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListPackageJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPackageJobsRequest self = new ListPackageJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListPackageJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListPackageJobsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListPackageJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPackageJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPackageJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPackageJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListPackageJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
