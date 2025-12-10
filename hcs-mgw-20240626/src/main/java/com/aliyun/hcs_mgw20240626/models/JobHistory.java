// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class JobHistory extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CommitId")
    public String commitId;

    /**
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("CopiedCount")
    public Long copiedCount;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CopiedSize")
    public Long copiedSize;

    /**
     * <strong>example:</strong>
     * <p>2025-07-04T08:09:26.000Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <strong>example:</strong>
     * <p><em><em><strong>-188f-</strong></em>-b266-</em>***</p>
     */
    @NameInMap("JobVersion")
    public String jobVersion;

    /**
     * <strong>example:</strong>
     * <p>Listing</p>
     */
    @NameInMap("ListStatus")
    public String listStatus;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <your-job-name>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RuntimeState")
    public String runtimeState;

    /**
     * <strong>example:</strong>
     * <p>2025-07-04T07:09:26.000Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>IMPORT_JOB_DOING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
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
