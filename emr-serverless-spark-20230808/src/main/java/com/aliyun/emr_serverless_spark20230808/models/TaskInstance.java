// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TaskInstance extends TeaModel {
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("creator")
    public Long creator;

    @NameInMap("fenixRunId")
    public String fenixRunId;

    @NameInMap("gmtCreated")
    public String gmtCreated;

    @NameInMap("taskBizId")
    public String taskBizId;

    @NameInMap("taskInfo")
    public Task taskInfo;

    @NameInMap("taskStatus")
    public String taskStatus;

    @NameInMap("workspaceBizId")
    public String workspaceBizId;

    public static TaskInstance build(java.util.Map<String, ?> map) throws Exception {
        TaskInstance self = new TaskInstance();
        return TeaModel.build(map, self);
    }

    public TaskInstance setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TaskInstance setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public TaskInstance setFenixRunId(String fenixRunId) {
        this.fenixRunId = fenixRunId;
        return this;
    }
    public String getFenixRunId() {
        return this.fenixRunId;
    }

    public TaskInstance setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public TaskInstance setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public TaskInstance setTaskInfo(Task taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public Task getTaskInfo() {
        return this.taskInfo;
    }

    public TaskInstance setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public TaskInstance setWorkspaceBizId(String workspaceBizId) {
        this.workspaceBizId = workspaceBizId;
        return this;
    }
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

}
