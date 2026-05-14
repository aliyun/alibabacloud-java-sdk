// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpdateBudgetShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NewBudgetName</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSUME</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12</p>
     */
    @NameInMap("CycleEndPeriod")
    public String cycleEndPeriod;

    @NameInMap("CycleQuota")
    public String cycleQuotaShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01</p>
     */
    @NameInMap("CycleStartPeriod")
    public String cycleStartPeriod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REQUIRE_AMOUNT</p>
     */
    @NameInMap("Metric")
    public String metric;

    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OriginalBudgetName</p>
     */
    @NameInMap("OriginalBudgetName")
    public String originalBudgetName;

    @NameInMap("QueryFilter")
    public String queryFilterShrink;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Quota")
    public String quota;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FIXED</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    @NameInMap("WarnConfs")
    public String warnConfsShrink;

    public static UpdateBudgetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBudgetShrinkRequest self = new UpdateBudgetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBudgetShrinkRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public UpdateBudgetShrinkRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public UpdateBudgetShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateBudgetShrinkRequest setCycleEndPeriod(String cycleEndPeriod) {
        this.cycleEndPeriod = cycleEndPeriod;
        return this;
    }
    public String getCycleEndPeriod() {
        return this.cycleEndPeriod;
    }

    public UpdateBudgetShrinkRequest setCycleQuotaShrink(String cycleQuotaShrink) {
        this.cycleQuotaShrink = cycleQuotaShrink;
        return this;
    }
    public String getCycleQuotaShrink() {
        return this.cycleQuotaShrink;
    }

    public UpdateBudgetShrinkRequest setCycleStartPeriod(String cycleStartPeriod) {
        this.cycleStartPeriod = cycleStartPeriod;
        return this;
    }
    public String getCycleStartPeriod() {
        return this.cycleStartPeriod;
    }

    public UpdateBudgetShrinkRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public UpdateBudgetShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public UpdateBudgetShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public UpdateBudgetShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public UpdateBudgetShrinkRequest setOriginalBudgetName(String originalBudgetName) {
        this.originalBudgetName = originalBudgetName;
        return this;
    }
    public String getOriginalBudgetName() {
        return this.originalBudgetName;
    }

    public UpdateBudgetShrinkRequest setQueryFilterShrink(String queryFilterShrink) {
        this.queryFilterShrink = queryFilterShrink;
        return this;
    }
    public String getQueryFilterShrink() {
        return this.queryFilterShrink;
    }

    public UpdateBudgetShrinkRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public UpdateBudgetShrinkRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public UpdateBudgetShrinkRequest setWarnConfsShrink(String warnConfsShrink) {
        this.warnConfsShrink = warnConfsShrink;
        return this;
    }
    public String getWarnConfsShrink() {
        return this.warnConfsShrink;
    }

}
