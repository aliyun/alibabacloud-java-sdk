// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RestoreBackupResponseBody extends TeaModel {
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

    public static RestoreBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreBackupResponseBody self = new RestoreBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreBackupResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public RestoreBackupResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public RestoreBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreBackupResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public RestoreBackupResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public RestoreBackupResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public RestoreBackupResponseBody setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public String getTaskDetail() {
        return this.taskDetail;
    }

    public RestoreBackupResponseBody setTriggerUser(String triggerUser) {
        this.triggerUser = triggerUser;
        return this;
    }
    public String getTriggerUser() {
        return this.triggerUser;
    }

    public RestoreBackupResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public RestoreBackupResponseBody setTaskProcess(Integer taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    public RestoreBackupResponseBody setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public RestoreBackupResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public RestoreBackupResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RestoreBackupResponseBody setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public RestoreBackupResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RestoreBackupResponseBody setEcmTaskId(Long ecmTaskId) {
        this.ecmTaskId = ecmTaskId;
        return this;
    }
    public Long getEcmTaskId() {
        return this.ecmTaskId;
    }

    public RestoreBackupResponseBody setTaskResultDetail(String taskResultDetail) {
        this.taskResultDetail = taskResultDetail;
        return this;
    }
    public String getTaskResultDetail() {
        return this.taskResultDetail;
    }

}
