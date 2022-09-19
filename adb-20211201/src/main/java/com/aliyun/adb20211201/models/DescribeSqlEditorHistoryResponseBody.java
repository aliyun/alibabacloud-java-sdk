// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlEditorHistoryResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlHistorys")
    public java.util.List<DescribeSqlEditorHistoryResponseBodySqlHistorys> sqlHistorys;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSqlEditorHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlEditorHistoryResponseBody self = new DescribeSqlEditorHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlEditorHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlEditorHistoryResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlEditorHistoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlEditorHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlEditorHistoryResponseBody setSqlHistorys(java.util.List<DescribeSqlEditorHistoryResponseBodySqlHistorys> sqlHistorys) {
        this.sqlHistorys = sqlHistorys;
        return this;
    }
    public java.util.List<DescribeSqlEditorHistoryResponseBodySqlHistorys> getSqlHistorys() {
        return this.sqlHistorys;
    }

    public DescribeSqlEditorHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSqlEditorHistoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSqlEditorHistoryResponseBodySqlHistorys extends TeaModel {
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("AliyunUserId")
        public String aliyunUserId;

        @NameInMap("Async")
        public Boolean async;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DatabaseUser")
        public String databaseUser;

        @NameInMap("Diagnosis")
        public Boolean diagnosis;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Readable")
        public Boolean readable;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceAllocated")
        public Long resourceAllocated;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeCost")
        public Long timeCost;

        @NameInMap("Url")
        public String url;

        public static DescribeSqlEditorHistoryResponseBodySqlHistorys build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlEditorHistoryResponseBodySqlHistorys self = new DescribeSqlEditorHistoryResponseBodySqlHistorys();
            return TeaModel.build(map, self);
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setAliyunUserId(String aliyunUserId) {
            this.aliyunUserId = aliyunUserId;
            return this;
        }
        public String getAliyunUserId() {
            return this.aliyunUserId;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setDatabaseUser(String databaseUser) {
            this.databaseUser = databaseUser;
            return this;
        }
        public String getDatabaseUser() {
            return this.databaseUser;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setDiagnosis(Boolean diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }
        public Boolean getDiagnosis() {
            return this.diagnosis;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setReadable(Boolean readable) {
            this.readable = readable;
            return this;
        }
        public Boolean getReadable() {
            return this.readable;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setResourceAllocated(Long resourceAllocated) {
            this.resourceAllocated = resourceAllocated;
            return this;
        }
        public Long getResourceAllocated() {
            return this.resourceAllocated;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setTimeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public Long getTimeCost() {
            return this.timeCost;
        }

        public DescribeSqlEditorHistoryResponseBodySqlHistorys setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
