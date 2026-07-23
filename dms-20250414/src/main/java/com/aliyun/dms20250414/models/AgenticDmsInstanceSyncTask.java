// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDmsInstanceSyncTask extends TeaModel {
    @NameInMap("ActorId")
    public String actorId;

    @NameInMap("ActorName")
    public String actorName;

    @NameInMap("ActorType")
    public String actorType;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorSummary")
    public String errorSummary;

    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("SkippedCount")
    public Integer skippedCount;

    @NameInMap("Status")
    public String status;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("SyncUserDataPermission")
    public Boolean syncUserDataPermission;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static AgenticDmsInstanceSyncTask build(java.util.Map<String, ?> map) throws Exception {
        AgenticDmsInstanceSyncTask self = new AgenticDmsInstanceSyncTask();
        return TeaModel.build(map, self);
    }

    public AgenticDmsInstanceSyncTask setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public AgenticDmsInstanceSyncTask setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

    public AgenticDmsInstanceSyncTask setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public AgenticDmsInstanceSyncTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AgenticDmsInstanceSyncTask setErrorSummary(String errorSummary) {
        this.errorSummary = errorSummary;
        return this;
    }
    public String getErrorSummary() {
        return this.errorSummary;
    }

    public AgenticDmsInstanceSyncTask setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public AgenticDmsInstanceSyncTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgenticDmsInstanceSyncTask setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AgenticDmsInstanceSyncTask setSkippedCount(Integer skippedCount) {
        this.skippedCount = skippedCount;
        return this;
    }
    public Integer getSkippedCount() {
        return this.skippedCount;
    }

    public AgenticDmsInstanceSyncTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgenticDmsInstanceSyncTask setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public AgenticDmsInstanceSyncTask setSyncUserDataPermission(Boolean syncUserDataPermission) {
        this.syncUserDataPermission = syncUserDataPermission;
        return this;
    }
    public Boolean getSyncUserDataPermission() {
        return this.syncUserDataPermission;
    }

    public AgenticDmsInstanceSyncTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AgenticDmsInstanceSyncTask setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
