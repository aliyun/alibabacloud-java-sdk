// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GenerateEvaluationReportShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>103144549568****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>RegionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
