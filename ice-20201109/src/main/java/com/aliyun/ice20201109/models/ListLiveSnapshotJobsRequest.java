// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotJobsRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li>Default value: 7 days after the start time.</li>
     * <li>The interval between StartTime and EndTime cannot exceed 30 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Valid values: [1, n). Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Valid values: [1, 100]. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword. You can search by job ID or job name. Fuzzy match is supported for job names.</p>
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
     * <p>The sort order. Jobs are sorted by creation time. Default value: desc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li>Default value: 7 days ago.</li>
     * <li>The interval between StartTime and EndTime cannot exceed 30 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status used to filter jobs. By default, jobs in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>started</p>
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
