// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotFilesRequest extends TeaModel {
    /**
     * <p>The end time in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * <ul>
     * <li>The time interval between the end time and the start time cannot exceed one day.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T23:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the snapshot job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The sort order. Default value: asc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListLiveSnapshotFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotFilesRequest self = new ListLiveSnapshotFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLiveSnapshotFilesRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListLiveSnapshotFilesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListLiveSnapshotFilesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveSnapshotFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
