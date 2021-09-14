// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DbfsRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Records")
    public java.util.List<DbfsRecordResponseBodyRecords> records;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Total")
    public Long total;

    public static DbfsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DbfsRecordResponseBody self = new DbfsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DbfsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DbfsRecordResponseBody setRecords(java.util.List<DbfsRecordResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DbfsRecordResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DbfsRecordResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DbfsRecordResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DbfsRecordResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DbfsRecordResponseBodyRecords extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("BatchStrategyNo")
        public String batchStrategyNo;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("DbfsId")
        public String dbfsId;

        @NameInMap("EcsId")
        public String ecsId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("State")
        public String state;

        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("TargetVersion")
        public String targetVersion;

        @NameInMap("UpgradeStartTime")
        public Long upgradeStartTime;

        @NameInMap("UpgradeEndTime")
        public Long upgradeEndTime;

        @NameInMap("TaskExecutionCounts")
        public Integer taskExecutionCounts;

        @NameInMap("TaskErrorReason")
        public String taskErrorReason;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("IsDel")
        public String isDel;

        public static DbfsRecordResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DbfsRecordResponseBodyRecords self = new DbfsRecordResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DbfsRecordResponseBodyRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DbfsRecordResponseBodyRecords setBatchStrategyNo(String batchStrategyNo) {
            this.batchStrategyNo = batchStrategyNo;
            return this;
        }
        public String getBatchStrategyNo() {
            return this.batchStrategyNo;
        }

        public DbfsRecordResponseBodyRecords setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DbfsRecordResponseBodyRecords setDbfsId(String dbfsId) {
            this.dbfsId = dbfsId;
            return this;
        }
        public String getDbfsId() {
            return this.dbfsId;
        }

        public DbfsRecordResponseBodyRecords setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DbfsRecordResponseBodyRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DbfsRecordResponseBodyRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DbfsRecordResponseBodyRecords setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DbfsRecordResponseBodyRecords setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DbfsRecordResponseBodyRecords setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DbfsRecordResponseBodyRecords setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public DbfsRecordResponseBodyRecords setUpgradeStartTime(Long upgradeStartTime) {
            this.upgradeStartTime = upgradeStartTime;
            return this;
        }
        public Long getUpgradeStartTime() {
            return this.upgradeStartTime;
        }

        public DbfsRecordResponseBodyRecords setUpgradeEndTime(Long upgradeEndTime) {
            this.upgradeEndTime = upgradeEndTime;
            return this;
        }
        public Long getUpgradeEndTime() {
            return this.upgradeEndTime;
        }

        public DbfsRecordResponseBodyRecords setTaskExecutionCounts(Integer taskExecutionCounts) {
            this.taskExecutionCounts = taskExecutionCounts;
            return this;
        }
        public Integer getTaskExecutionCounts() {
            return this.taskExecutionCounts;
        }

        public DbfsRecordResponseBodyRecords setTaskErrorReason(String taskErrorReason) {
            this.taskErrorReason = taskErrorReason;
            return this;
        }
        public String getTaskErrorReason() {
            return this.taskErrorReason;
        }

        public DbfsRecordResponseBodyRecords setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DbfsRecordResponseBodyRecords setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DbfsRecordResponseBodyRecords setIsDel(String isDel) {
            this.isDel = isDel;
            return this;
        }
        public String getIsDel() {
            return this.isDel;
        }

    }

}
