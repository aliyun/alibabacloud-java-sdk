// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TaskInstance extends TeaModel {
    /**
     * <p>The ID of the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>w-d8********</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>The ID of the user who creates the job.</p>
     * 
     * <strong>example:</strong>
     * <p>150978934701****</p>
     */
    @NameInMap("creator")
    public Long creator;

    /**
     * <p>The job run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jr-93d98d2f7061****</p>
     */
    @NameInMap("fenixRunId")
    public String fenixRunId;

    /**
     * <p>The time when the job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-05T02:03:19Z</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>The ID of the data development job.</p>
     * 
     * <strong>example:</strong>
     * <p>TSK-d87******************</p>
     */
    @NameInMap("taskBizId")
    public String taskBizId;

    /**
     * <p>The details of the job.</p>
     */
    @NameInMap("taskInfo")
    public Task taskInfo;

    /**
     * <p>The job run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("taskStatus")
    public String taskStatus;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-d2d82aa09151****</p>
     */
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
