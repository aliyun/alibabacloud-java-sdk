// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordFilesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The maximum time range to query is four days. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of job IDs.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Valid values: 5 to 30. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The format of the recording file. Valid values:</p>
     * <p>M3U8, FLV, and MP4</p>
     * 
     * <strong>example:</strong>
     * <p>m3u8</p>
     */
    @NameInMap("RecordFormat")
    public String recordFormat;

    /**
     * <p>The sorting order of the index files by creation time. Valid values:</p>
     * <p>asc: The query results are displayed in ascending order. This is the default value.</p>
     * <p>desc: The query results are displayed in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListLiveRecordFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordFilesRequest self = new ListLiveRecordFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLiveRecordFilesRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public ListLiveRecordFilesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordFilesRequest setRecordFormat(String recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public String getRecordFormat() {
        return this.recordFormat;
    }

    public ListLiveRecordFilesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
