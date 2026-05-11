// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class JobHistory extends TeaModel {
    /**
     * <p>The ID of the task status change.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CommitId")
    public String commitId;

    /**
     * <p>The number of files that are migrated. The number includes the number of files that are successfully migrated and the number of files that are skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("CopiedCount")
    public Long copiedCount;

    /**
     * <p>The data size of files that are migrated. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CopiedSize")
    public Long copiedSize;

    /**
     * <p>The time when the current state ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of files that failed to be migrated.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test_id</p>
     */
    @NameInMap("JobVersion")
    public String jobVersion;

    /**
     * <p>The state of data listing.\
     * Valid values: Listing and Finished.</p>
     * 
     * <strong>example:</strong>
     * <p>Listing</p>
     */
    @NameInMap("ListStatus")
    public String listStatus;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>test error msg.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operator.\
     * Valid values: user and system.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The execution ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <p>The runtime state.\
     * Valid values: Normal and Interrupt.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RuntimeState")
    public String runtimeState;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SkippedCount")
    public Long skippedCount;

    /**
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("SkippedSize")
    public Long skippedSize;

    /**
     * <p>The time when the current state started.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task state.</p>
     * 
     * <strong>example:</strong>
     * <p>IMPORT_JOB_DOING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of files.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total data size of files. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalSize")
    public Long totalSize;

    public static JobHistory build(java.util.Map<String, ?> map) throws Exception {
        JobHistory self = new JobHistory();
        return TeaModel.build(map, self);
    }

    public JobHistory setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public JobHistory setCopiedCount(Long copiedCount) {
        this.copiedCount = copiedCount;
        return this;
    }
    public Long getCopiedCount() {
        return this.copiedCount;
    }

    public JobHistory setCopiedSize(Long copiedSize) {
        this.copiedSize = copiedSize;
        return this;
    }
    public Long getCopiedSize() {
        return this.copiedSize;
    }

    public JobHistory setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public JobHistory setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public JobHistory setJobVersion(String jobVersion) {
        this.jobVersion = jobVersion;
        return this;
    }
    public String getJobVersion() {
        return this.jobVersion;
    }

    public JobHistory setListStatus(String listStatus) {
        this.listStatus = listStatus;
        return this;
    }
    public String getListStatus() {
        return this.listStatus;
    }

    public JobHistory setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JobHistory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public JobHistory setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public JobHistory setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public JobHistory setRuntimeState(String runtimeState) {
        this.runtimeState = runtimeState;
        return this;
    }
    public String getRuntimeState() {
        return this.runtimeState;
    }

    public JobHistory setSkippedCount(Long skippedCount) {
        this.skippedCount = skippedCount;
        return this;
    }
    public Long getSkippedCount() {
        return this.skippedCount;
    }

    public JobHistory setSkippedSize(Long skippedSize) {
        this.skippedSize = skippedSize;
        return this;
    }
    public Long getSkippedSize() {
        return this.skippedSize;
    }

    public JobHistory setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public JobHistory setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public JobHistory setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public JobHistory setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
