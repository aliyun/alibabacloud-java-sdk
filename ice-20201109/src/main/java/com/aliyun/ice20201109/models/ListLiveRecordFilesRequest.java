// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordFilesRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecordFormat")
    public String recordFormat;

    @NameInMap("SortBy")
    public String sortBy;

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
