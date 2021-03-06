// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeLibraryInstallTaskDetailResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskGroupId")
    public String taskGroupId;

    @NameInMap("ExecuteTime")
    public Long executeTime;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("LibraryBizId")
    public String libraryBizId;

    @NameInMap("TaskProcess")
    public Integer taskProcess;

    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("Detail")
    public String detail;

    public static DescribeLibraryInstallTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryInstallTaskDetailResponseBody self = new DescribeLibraryInstallTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskGroupId(String taskGroupId) {
        this.taskGroupId = taskGroupId;
        return this;
    }
    public String getTaskGroupId() {
        return this.taskGroupId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public Long getExecuteTime() {
        return this.executeTime;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setLibraryBizId(String libraryBizId) {
        this.libraryBizId = libraryBizId;
        return this;
    }
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskProcess(Integer taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

}
