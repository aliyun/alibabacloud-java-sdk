// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetReportResp extends TeaModel {
    /**
     * <p>The number of files that are migrated.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CopiedCount")
    public Long copiedCount;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>test error msg.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The number of files that failed to be migrated.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The path of files that failed to be migrated.</p>
     * 
     * <strong>example:</strong>
     * <p>test_failed_prefix/</p>
     */
    @NameInMap("FailedListPrefix")
    public String failedListPrefix;

    /**
     * <p>The time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("JobCreateTime")
    public String jobCreateTime;

    /**
     * <p>The time when the task ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("JobEndTime")
    public String jobEndTime;

    /**
     * <p>The task duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("JobExecuteTime")
    public String jobExecuteTime;

    /**
     * <p>The time when the migration report was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("ReportCreateTime")
    public String reportCreateTime;

    /**
     * <p>The time when the migration report was generated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("ReportEndTime")
    public String reportEndTime;

    /**
     * <p>The number of files that are skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SkippedCount")
    public Long skippedCount;

    /**
     * <p>The path of files that are skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>test_skipped_prefix/</p>
     */
    @NameInMap("SkippedListPrefix")
    public String skippedListPrefix;

    /**
     * <p>The state of the migration report.\
     * Valid values: Running, NotExist, Finished, and Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
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
     * <p>The path of files.</p>
     * 
     * <strong>example:</strong>
     * <p>test_total_prefix/</p>
     */
    @NameInMap("TotalListPrefix")
    public String totalListPrefix;

    public static GetReportResp build(java.util.Map<String, ?> map) throws Exception {
        GetReportResp self = new GetReportResp();
        return TeaModel.build(map, self);
    }

    public GetReportResp setCopiedCount(Long copiedCount) {
        this.copiedCount = copiedCount;
        return this;
    }
    public Long getCopiedCount() {
        return this.copiedCount;
    }

    public GetReportResp setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetReportResp setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public GetReportResp setFailedListPrefix(String failedListPrefix) {
        this.failedListPrefix = failedListPrefix;
        return this;
    }
    public String getFailedListPrefix() {
        return this.failedListPrefix;
    }

    public GetReportResp setJobCreateTime(String jobCreateTime) {
        this.jobCreateTime = jobCreateTime;
        return this;
    }
    public String getJobCreateTime() {
        return this.jobCreateTime;
    }

    public GetReportResp setJobEndTime(String jobEndTime) {
        this.jobEndTime = jobEndTime;
        return this;
    }
    public String getJobEndTime() {
        return this.jobEndTime;
    }

    public GetReportResp setJobExecuteTime(String jobExecuteTime) {
        this.jobExecuteTime = jobExecuteTime;
        return this;
    }
    public String getJobExecuteTime() {
        return this.jobExecuteTime;
    }

    public GetReportResp setReportCreateTime(String reportCreateTime) {
        this.reportCreateTime = reportCreateTime;
        return this;
    }
    public String getReportCreateTime() {
        return this.reportCreateTime;
    }

    public GetReportResp setReportEndTime(String reportEndTime) {
        this.reportEndTime = reportEndTime;
        return this;
    }
    public String getReportEndTime() {
        return this.reportEndTime;
    }

    public GetReportResp setSkippedCount(Long skippedCount) {
        this.skippedCount = skippedCount;
        return this;
    }
    public Long getSkippedCount() {
        return this.skippedCount;
    }

    public GetReportResp setSkippedListPrefix(String skippedListPrefix) {
        this.skippedListPrefix = skippedListPrefix;
        return this;
    }
    public String getSkippedListPrefix() {
        return this.skippedListPrefix;
    }

    public GetReportResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetReportResp setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetReportResp setTotalListPrefix(String totalListPrefix) {
        this.totalListPrefix = totalListPrefix;
        return this;
    }
    public String getTotalListPrefix() {
        return this.totalListPrefix;
    }

}
