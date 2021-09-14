// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GenerateUpgradeRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Records")
    public java.util.List<GenerateUpgradeRecordResponseBodyRecords> records;

    public static GenerateUpgradeRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUpgradeRecordResponseBody self = new GenerateUpgradeRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUpgradeRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUpgradeRecordResponseBody setRecords(java.util.List<GenerateUpgradeRecordResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GenerateUpgradeRecordResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class GenerateUpgradeRecordResponseBodyRecords extends TeaModel {
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

        public static GenerateUpgradeRecordResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            GenerateUpgradeRecordResponseBodyRecords self = new GenerateUpgradeRecordResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public GenerateUpgradeRecordResponseBodyRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GenerateUpgradeRecordResponseBodyRecords setBatchStrategyNo(String batchStrategyNo) {
            this.batchStrategyNo = batchStrategyNo;
            return this;
        }
        public String getBatchStrategyNo() {
            return this.batchStrategyNo;
        }

        public GenerateUpgradeRecordResponseBodyRecords setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GenerateUpgradeRecordResponseBodyRecords setDbfsId(String dbfsId) {
            this.dbfsId = dbfsId;
            return this;
        }
        public String getDbfsId() {
            return this.dbfsId;
        }

        public GenerateUpgradeRecordResponseBodyRecords setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public GenerateUpgradeRecordResponseBodyRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GenerateUpgradeRecordResponseBodyRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GenerateUpgradeRecordResponseBodyRecords setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GenerateUpgradeRecordResponseBodyRecords setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GenerateUpgradeRecordResponseBodyRecords setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public GenerateUpgradeRecordResponseBodyRecords setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public GenerateUpgradeRecordResponseBodyRecords setUpgradeStartTime(Long upgradeStartTime) {
            this.upgradeStartTime = upgradeStartTime;
            return this;
        }
        public Long getUpgradeStartTime() {
            return this.upgradeStartTime;
        }

        public GenerateUpgradeRecordResponseBodyRecords setUpgradeEndTime(Long upgradeEndTime) {
            this.upgradeEndTime = upgradeEndTime;
            return this;
        }
        public Long getUpgradeEndTime() {
            return this.upgradeEndTime;
        }

        public GenerateUpgradeRecordResponseBodyRecords setTaskExecutionCounts(Integer taskExecutionCounts) {
            this.taskExecutionCounts = taskExecutionCounts;
            return this;
        }
        public Integer getTaskExecutionCounts() {
            return this.taskExecutionCounts;
        }

        public GenerateUpgradeRecordResponseBodyRecords setTaskErrorReason(String taskErrorReason) {
            this.taskErrorReason = taskErrorReason;
            return this;
        }
        public String getTaskErrorReason() {
            return this.taskErrorReason;
        }

        public GenerateUpgradeRecordResponseBodyRecords setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GenerateUpgradeRecordResponseBodyRecords setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
