// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetJobResponseBody extends TeaModel {
    /**
     * <p>The total number of completed files.</p>
     * 
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("CompletedFileCount")
    public Long completedFileCount;

    /**
     * <p>The time when the job is started.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-15T07:06:42Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The job description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The total number of failed files.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailedFileCount")
    public Long failedFileCount;

    /**
     * <p>The time when the job ends.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-16T02:03:23Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The action that is performed on the job.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SemanticIndex: semantic indexing</li>
     * <li>IntelligentTag: smart labeling</li>
     * <li>FileMetaExport: metadata export</li>
     * </ul>
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
     * <li>Full: full data mode.</li>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64B50C1D-D4C2-560C-86A3-A6ED****16D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The job state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Succeeded</li>
     * <li>Failed</li>
     * <li>Running</li>
     * <li>Pending</li>
     * <li>PartialFailed</li>
     * <li>Deleting</li>
     * <li>ManuallyStop</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of job files.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalFileCount")
    public Long totalFileCount;

    public static GetDatasetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetJobResponseBody self = new GetDatasetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetJobResponseBody setCompletedFileCount(Long completedFileCount) {
        this.completedFileCount = completedFileCount;
        return this;
    }
    public Long getCompletedFileCount() {
        return this.completedFileCount;
    }

    public GetDatasetJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDatasetJobResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDatasetJobResponseBody setFailedFileCount(Long failedFileCount) {
        this.failedFileCount = failedFileCount;
        return this;
    }
    public Long getFailedFileCount() {
        return this.failedFileCount;
    }

    public GetDatasetJobResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetDatasetJobResponseBody setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public GetDatasetJobResponseBody setJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }
    public String getJobMode() {
        return this.jobMode;
    }

    public GetDatasetJobResponseBody setJobSpec(String jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }
    public String getJobSpec() {
        return this.jobSpec;
    }

    public GetDatasetJobResponseBody setLogs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<String> getLogs() {
        return this.logs;
    }

    public GetDatasetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDatasetJobResponseBody setTotalFileCount(Long totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

}
