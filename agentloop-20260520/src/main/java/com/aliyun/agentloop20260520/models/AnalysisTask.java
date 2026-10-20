// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class AnalysisTask extends TeaModel {
    /**
     * <p>The task completion time as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1789747260000</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <p>The task creation time as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1789747200000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The error code for the task failure.</p>
     * 
     * <strong>example:</strong>
     * <p>NO_VALID_ATTRIBUTION_LABEL</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message for the task failure.</p>
     * 
     * <strong>example:</strong>
     * <p>No valid attribution label was found</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The generated analysis report. This field is typically not returned by list operations.</p>
     */
    @NameInMap("report")
    public java.util.Map<String, ?> report;

    /**
     * <p>The number of evaluation details selected by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("selectedCount")
    public Integer selectedCount;

    /**
     * <p>The task status. Valid values: PENDING, RUNNING, SUCCEEDED, PARTIAL_SUCCEEDED, and FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The analysis task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>analysis-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The analysis task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Low-score sample attribution analysis</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The analysis task type.</p>
     * 
     * <strong>example:</strong>
     * <p>ATTRIBUTION_SUMMARY</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static AnalysisTask build(java.util.Map<String, ?> map) throws Exception {
        AnalysisTask self = new AnalysisTask();
        return TeaModel.build(map, self);
    }

    public AnalysisTask setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public AnalysisTask setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public AnalysisTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AnalysisTask setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AnalysisTask setReport(java.util.Map<String, ?> report) {
        this.report = report;
        return this;
    }
    public java.util.Map<String, ?> getReport() {
        return this.report;
    }

    public AnalysisTask setSelectedCount(Integer selectedCount) {
        this.selectedCount = selectedCount;
        return this;
    }
    public Integer getSelectedCount() {
        return this.selectedCount;
    }

    public AnalysisTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AnalysisTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AnalysisTask setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public AnalysisTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
