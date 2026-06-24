// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GenerateEvaluationReportShrinkRequest extends TeaModel {
    /**
     * <p>The account ID. If this parameter is not specified, the report is generated for the current account by default. A management account (MA) can pass in a member account ID to generate a report for the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>103144549568****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The list of member account IDs for which to generate reports.
     * Note: This parameter is required only when you generate a multi-account report and want to specify the scope of accounts.</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    @NameInMap("EvaluationDomain")
    public String evaluationDomain;

    /**
     * <p>RegionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public static GenerateEvaluationReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateEvaluationReportShrinkRequest self = new GenerateEvaluationReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateEvaluationReportShrinkRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GenerateEvaluationReportShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public GenerateEvaluationReportShrinkRequest setEvaluationDomain(String evaluationDomain) {
        this.evaluationDomain = evaluationDomain;
        return this;
    }
    public String getEvaluationDomain() {
        return this.evaluationDomain;
    }

    public GenerateEvaluationReportShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateEvaluationReportShrinkRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
