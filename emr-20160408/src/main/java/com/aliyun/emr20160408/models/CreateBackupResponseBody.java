// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    @NameInMap("TriggerType")
    public String triggerType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TaskDetail")
    public String taskDetail;

    @NameInMap("TriggerUser")
    public String triggerUser;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("TaskProcess")
    public Integer taskProcess;

    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("EcmTaskId")
    public Long ecmTaskId;

    @NameInMap("TaskResultDetail")
    public String taskResultDetail;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public CreateBackupResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CreateBackupResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateBackupResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public CreateBackupResponseBody setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public String getTaskDetail() {
        return this.taskDetail;
    }

    public CreateBackupResponseBody setTriggerUser(String triggerUser) {
        this.triggerUser = triggerUser;
        return this;
    }
    public String getTriggerUser() {
        return this.triggerUser;
    }

    public CreateBackupResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateBackupResponseBody setTaskProcess(Integer taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    public CreateBackupResponseBody setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public CreateBackupResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateBackupResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBackupResponseBody setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateBackupResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateBackupResponseBody setEcmTaskId(Long ecmTaskId) {
        this.ecmTaskId = ecmTaskId;
        return this;
    }
    public Long getEcmTaskId() {
        return this.ecmTaskId;
    }

    public CreateBackupResponseBody setTaskResultDetail(String taskResultDetail) {
        this.taskResultDetail = taskResultDetail;
        return this;
    }
    public String getTaskResultDetail() {
        return this.taskResultDetail;
    }

}
