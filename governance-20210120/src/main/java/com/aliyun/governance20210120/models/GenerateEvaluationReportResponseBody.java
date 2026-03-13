// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GenerateEvaluationReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>103144549568****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <strong>example:</strong>
     * <p>0.7684</p>
     */
    @NameInMap("EvaluationScore")
    public Double evaluationScore;

    /**
     * <strong>example:</strong>
     * <p>2026-01-12T07:25:33Z</p>
     */
    @NameInMap("EvaluationTime")
    public String evaluationTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Finished")
    public String finished;

    /**
     * <strong>example:</strong>
     * <p>EvaluationAccountExcelReport</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://governance-prod-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/reports-html/">https://governance-prod-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/reports-html/</a>*****</p>
     */
    @NameInMap("ReportUrl")
    public String reportUrl;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7DCF863F-CBBB-57C4-8AF2-5D4EE35D1EB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateEvaluationReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateEvaluationReportResponseBody self = new GenerateEvaluationReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateEvaluationReportResponseBody setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GenerateEvaluationReportResponseBody setEvaluationScore(Double evaluationScore) {
        this.evaluationScore = evaluationScore;
        return this;
    }
    public Double getEvaluationScore() {
        return this.evaluationScore;
    }

    public GenerateEvaluationReportResponseBody setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
        return this;
    }
    public String getEvaluationTime() {
        return this.evaluationTime;
    }

    public GenerateEvaluationReportResponseBody setFinished(String finished) {
        this.finished = finished;
        return this;
    }
    public String getFinished() {
        return this.finished;
    }

    public GenerateEvaluationReportResponseBody setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GenerateEvaluationReportResponseBody setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

    public GenerateEvaluationReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
