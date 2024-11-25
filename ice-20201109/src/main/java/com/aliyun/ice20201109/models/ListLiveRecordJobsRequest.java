// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordJobsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The maximum time range between EndTime and StartTime cannot exceed 30 days. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-11T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The search keyword. You can use the job ID or name as the keyword to search for jobs.</p>
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
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>asc: sorts the query results in ascending order.</li>
     * <li>desc: sorts the query results in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-15T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The state of the job. By default, the state is not filtered.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>paused: The job is paused.</li>
     * <li>initial: The job is not started.</li>
     * <li>started: The job is in progress.</li>
     * </ul>
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
