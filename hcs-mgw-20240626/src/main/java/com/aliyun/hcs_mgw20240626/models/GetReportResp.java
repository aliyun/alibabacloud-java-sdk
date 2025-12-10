// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetReportResp extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CopiedCount")
    public Long copiedCount;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    @NameInMap("FailedListPrefix")
    public String failedListPrefix;

    /**
     * <strong>example:</strong>
     * <p>1754445355</p>
     */
    @NameInMap("JobCreateTime")
    public String jobCreateTime;

    /**
     * <strong>example:</strong>
     * <p>1754445355</p>
     */
    @NameInMap("JobEndTime")
    public String jobEndTime;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("JobExecuteTime")
    public String jobExecuteTime;

    /**
     * <strong>example:</strong>
     * <p>1748232558</p>
     */
    @NameInMap("ReportCreateTime")
    public String reportCreateTime;

    /**
     * <strong>example:</strong>
     * <p>1748232845</p>
     */
    @NameInMap("ReportEndTime")
    public String reportEndTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SkippedCount")
    public Long skippedCount;

    @NameInMap("SkippedListPrefix")
    public String skippedListPrefix;

    /**
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

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
