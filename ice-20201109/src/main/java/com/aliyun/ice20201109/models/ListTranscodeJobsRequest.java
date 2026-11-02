// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTranscodeJobsRequest extends TeaModel {
    /**
     * <p>The end time for filtering jobs by creation time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-15T00:00:00Z</p>
     */
    @NameInMap("EndOfCreateTime")
    public String endOfCreateTime;

    /**
     * <p>The mark for the next page during continuous paging in a paged query. This parameter is not required for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82df****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>CreateTimeDesc: Sorts by creation time in descending order.</li>
     * <li>CreateTimeAsc: Sorts by creation time in ascending order.</li>
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
     * <p>The ID of the parent job used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>7b38a5d86f1e47838927b6e7ccb1****</p>
     */
    @NameInMap("ParentJobId")
    public String parentJobId;

    /**
     * <p>The start time for filtering jobs by creation time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-01T00:00:00Z</p>
     */
    @NameInMap("StartOfCreateTime")
    public String startOfCreateTime;

    /**
     * <p>The job status. Valid values: </p>
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

    public static ListTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeJobsRequest self = new ListTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListTranscodeJobsRequest setEndOfCreateTime(String endOfCreateTime) {
        this.endOfCreateTime = endOfCreateTime;
        return this;
    }
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    public ListTranscodeJobsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListTranscodeJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListTranscodeJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTranscodeJobsRequest setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
        return this;
    }
    public String getParentJobId() {
        return this.parentJobId;
    }

    public ListTranscodeJobsRequest setStartOfCreateTime(String startOfCreateTime) {
        this.startOfCreateTime = startOfCreateTime;
        return this;
    }
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    public ListTranscodeJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
