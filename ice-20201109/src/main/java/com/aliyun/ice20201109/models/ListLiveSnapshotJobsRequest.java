// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotJobsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>. The time must be in UTC.</p>
     * <ul>
     * <li><p>If this parameter is not specified, the default is the current time.</p>
     * </li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number to return. The value must be an integer greater than or equal to 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of jobs to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword. You can search by Job ID or Job Name. Fuzzy search is supported for Job Name.</p>
     * <ul>
     * <li>The maximum length is 128 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    /**
     * <p>The sort order. The results are sorted by <code>CreateTime</code>. Default: <code>desc</code> (Descending).</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start of the time range to query. Specify the time in the ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>. The time must be in UTC.</p>
     * <ul>
     * <li><p>If this parameter is not specified, the default is 7 days ago.</p>
     * </li>
     * <li><p>The interval between <code>StartTime</code> and <code>EndTime</code> cannot exceed 30 days.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job status to filter by. If omitted, jobs of all statuses are returned.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListLiveSnapshotJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotJobsRequest self = new ListLiveSnapshotJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLiveSnapshotJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveSnapshotJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveSnapshotJobsRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public ListLiveSnapshotJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveSnapshotJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListLiveSnapshotJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
