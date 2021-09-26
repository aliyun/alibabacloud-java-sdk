// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeLibraryInstallTaskDetailResponseBody extends TeaModel {
    @NameInMap("LibraryBizId")
    public String libraryBizId;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskGroupId")
    public String taskGroupId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TaskProcess")
    public Integer taskProcess;

    @NameInMap("ExecuteTime")
    public Long executeTime;

    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Detail")
    public String detail;

    public static DescribeLibraryInstallTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryInstallTaskDetailResponseBody self = new DescribeLibraryInstallTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryInstallTaskDetailResponseBody setLibraryBizId(String libraryBizId) {
        this.libraryBizId = libraryBizId;
        return this;
    }
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
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

    public DescribeLibraryInstallTaskDetailResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskProcess(Integer taskProcess) {
        this.taskProcess = taskProcess;
        return this;
    }
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public Long getExecuteTime() {
        return this.executeTime;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeLibraryInstallTaskDetailResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

}
