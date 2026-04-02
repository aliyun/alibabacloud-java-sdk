// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetJob extends TeaModel {
    /**
     * <p>The number of completed files.</p>
     * 
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("CompletedFileCount")
    public Long completedFileCount;

    /**
     * <p>The job creation time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-20T04:05:59Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjob-9jx1*****uj9e</p>
     */
    @NameInMap("DatasetJobId")
    public String datasetJobId;

    /**
     * <p>The dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The job description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of failed files.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailedFileCount")
    public Long failedFileCount;

    /**
     * <p>The job finish time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-20T06:03:48Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The job action.</p>
     * 
     * <strong>example:</strong>
     * <p>SemanticIndex</p>
     */
    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <p>The job mode.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Full</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Full</p>
     */
    @NameInMap("JobMode")
    public String jobMode;

    /**
     * <p>The job details.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;modelId\&quot;:\&quot;xxx\&quot;}</p>
     */
    @NameInMap("JobSpec")
    public String jobSpec;

    /**
     * <p>The job logs.</p>
     */
    @NameInMap("Logs")
    public java.util.List<String> logs;

    /**
     * <p>The job status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of job files.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalFileCount")
    public Long totalFileCount;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>145883</p>
     */
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
