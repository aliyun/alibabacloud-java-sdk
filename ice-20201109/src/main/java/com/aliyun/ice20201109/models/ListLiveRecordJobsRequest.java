// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordJobsRequest extends TeaModel {
    /**
     * <p>The end time of the query. The interval between the end time and the start time cannot exceed 30 days. The time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The search keyword. You can search by job ID or job name.</p>
     * 
     * <strong>example:</strong>
     * <p>ab0e3e76-1e9d-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The sorting parameter. By default, jobs are sorted in descending order of creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the query. The time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-15T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the job. By default, no status filter is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>started</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListLiveRecordJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordJobsRequest self = new ListLiveRecordJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLiveRecordJobsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLiveRecordJobsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListLiveRecordJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
