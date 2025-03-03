// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetJob extends TeaModel {
    @NameInMap("CompletedFileCount")
    public Long completedFileCount;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetJobId")
    public String datasetJobId;

    @NameInMap("DatasetVersion")
    public String datasetVersion;

    @NameInMap("Description")
    public String description;

    @NameInMap("FailedFileCount")
    public Long failedFileCount;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("JobAction")
    public String jobAction;

    @NameInMap("JobMode")
    public String jobMode;

    @NameInMap("JobSpec")
    public String jobSpec;

    @NameInMap("Logs")
    public java.util.List<String> logs;

    @NameInMap("Status")
    public String status;

    @NameInMap("TotalFileCount")
    public Long totalFileCount;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DatasetJob build(java.util.Map<String, ?> map) throws Exception {
        DatasetJob self = new DatasetJob();
        return TeaModel.build(map, self);
    }

    public DatasetJob setCompletedFileCount(Long completedFileCount) {
        this.completedFileCount = completedFileCount;
        return this;
    }
    public Long getCompletedFileCount() {
        return this.completedFileCount;
    }

    public DatasetJob setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DatasetJob setDatasetJobId(String datasetJobId) {
        this.datasetJobId = datasetJobId;
        return this;
    }
    public String getDatasetJobId() {
        return this.datasetJobId;
    }

    public DatasetJob setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public DatasetJob setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatasetJob setFailedFileCount(Long failedFileCount) {
        this.failedFileCount = failedFileCount;
        return this;
    }
    public Long getFailedFileCount() {
        return this.failedFileCount;
    }

    public DatasetJob setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public DatasetJob setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public DatasetJob setJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }
    public String getJobMode() {
        return this.jobMode;
    }

    public DatasetJob setJobSpec(String jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }
    public String getJobSpec() {
        return this.jobSpec;
    }

    public DatasetJob setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public DatasetJob setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetJob setTotalFileCount(Long totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

    public DatasetJob setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
