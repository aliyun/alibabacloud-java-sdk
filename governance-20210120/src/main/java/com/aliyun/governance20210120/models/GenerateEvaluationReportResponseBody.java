// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GenerateEvaluationReportResponseBody extends TeaModel {
    /**
     * <p>The account ID for which the report is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>103144549568****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The governance maturity evaluation score.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7684</p>
     */
    @NameInMap("EvaluationScore")
    public Double evaluationScore;

    /**
     * <p>The evaluation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-12T07:25:33Z</p>
     */
    @NameInMap("EvaluationTime")
    public String evaluationTime;

    /**
     * <p>Indicates whether the report generation is complete.</p>
     * <blockquote>
     * <ul>
     * <li>true: The report generation is complete.</li>
     * <li>false: The report generation is not complete.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Finished")
    public String finished;

    /**
     * <p>The report type. Valid values:</p>
     * <ul>
     * <li>EvaluationAccountHtmlReport: single-account HTML report.</li>
     * <li>EvaluationAccountExcelReport: single-account Excel report.</li>
     * <li>EvaluationMultiAccountExcelReport: multi-account Excel report.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EvaluationAccountExcelReport</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The download URL of the report.</p>
     * 
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
