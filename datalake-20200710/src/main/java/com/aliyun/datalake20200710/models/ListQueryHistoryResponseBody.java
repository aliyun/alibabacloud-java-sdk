// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListQueryHistoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListQueryHistoryResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQueryHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryHistoryResponseBody self = new ListQueryHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryHistoryResponseBody setData(java.util.List<ListQueryHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListQueryHistoryResponseBodyData> getData() {
        return this.data;
    }

    public ListQueryHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListQueryHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQueryHistoryResponseBodyData extends TeaModel {
        @NameInMap("Creator")
        public Long creator;

        @NameInMap("CreatorLoginName")
        public String creatorLoginName;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("JobCompleted")
        public Boolean jobCompleted;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResultOssPath")
        public String resultOssPath;

        @NameInMap("ResultTmpDb")
        public String resultTmpDb;

        @NameInMap("ResultTmpTable")
        public String resultTmpTable;

        @NameInMap("RowCount")
        public Integer rowCount;

        @NameInMap("RowCountOverLimit")
        public String rowCountOverLimit;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        public static ListQueryHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueryHistoryResponseBodyData self = new ListQueryHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueryHistoryResponseBodyData setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public ListQueryHistoryResponseBodyData setCreatorLoginName(String creatorLoginName) {
            this.creatorLoginName = creatorLoginName;
            return this;
        }
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        public ListQueryHistoryResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListQueryHistoryResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListQueryHistoryResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListQueryHistoryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListQueryHistoryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListQueryHistoryResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQueryHistoryResponseBodyData setJobCompleted(Boolean jobCompleted) {
            this.jobCompleted = jobCompleted;
            return this;
        }
        public Boolean getJobCompleted() {
            return this.jobCompleted;
        }

        public ListQueryHistoryResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListQueryHistoryResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListQueryHistoryResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQueryHistoryResponseBodyData setResultOssPath(String resultOssPath) {
            this.resultOssPath = resultOssPath;
            return this;
        }
        public String getResultOssPath() {
            return this.resultOssPath;
        }

        public ListQueryHistoryResponseBodyData setResultTmpDb(String resultTmpDb) {
            this.resultTmpDb = resultTmpDb;
            return this;
        }
        public String getResultTmpDb() {
            return this.resultTmpDb;
        }

        public ListQueryHistoryResponseBodyData setResultTmpTable(String resultTmpTable) {
            this.resultTmpTable = resultTmpTable;
            return this;
        }
        public String getResultTmpTable() {
            return this.resultTmpTable;
        }

        public ListQueryHistoryResponseBodyData setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public ListQueryHistoryResponseBodyData setRowCountOverLimit(String rowCountOverLimit) {
            this.rowCountOverLimit = rowCountOverLimit;
            return this;
        }
        public String getRowCountOverLimit() {
            return this.rowCountOverLimit;
        }

        public ListQueryHistoryResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public ListQueryHistoryResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListQueryHistoryResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQueryHistoryResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
