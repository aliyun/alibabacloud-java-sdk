// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateBudgetShrinkRequest extends TeaModel {
    /**
     * <p>The budget name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Department_dev_budget</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>The budget type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSUME</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The end cycle.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12</p>
     */
    @NameInMap("CycleEndPeriod")
    public String cycleEndPeriod;

    /**
     * <p>The per-cycle specified quota. This parameter is required when QuotaType is set to <code>SPECIFY</code>.</p>
     */
    @NameInMap("CycleQuota")
    public String cycleQuotaShrink;

    /**
     * <p>The start cycle.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01</p>
     */
    @NameInMap("CycleStartPeriod")
    public String cycleStartPeriod;

    /**
     * <p>The cycle type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The list of enterprises and accounts. An empty value indicates the current account.</p>
     */
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>The budget metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REQUIRE_AMOUNT</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The level-1 marketplace ID. If empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("QueryFilter")
    public String queryFilterShrink;

    /**
     * <p>The fixed quota value. If the type is quota, the unit is percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Quota")
    public String quota;

    /**
     * <p>The quota type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FIXED</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    /**
     * <p>The alert configurations.</p>
     */
    @NameInMap("WarnConfs")
    public String warnConfsShrink;

    public static CreateBudgetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetShrinkRequest self = new CreateBudgetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBudgetShrinkRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public CreateBudgetShrinkRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public CreateBudgetShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateBudgetShrinkRequest setCycleEndPeriod(String cycleEndPeriod) {
        this.cycleEndPeriod = cycleEndPeriod;
        return this;
    }
    public String getCycleEndPeriod() {
        return this.cycleEndPeriod;
    }

    public CreateBudgetShrinkRequest setCycleQuotaShrink(String cycleQuotaShrink) {
        this.cycleQuotaShrink = cycleQuotaShrink;
        return this;
    }
    public String getCycleQuotaShrink() {
        return this.cycleQuotaShrink;
    }

    public CreateBudgetShrinkRequest setCycleStartPeriod(String cycleStartPeriod) {
        this.cycleStartPeriod = cycleStartPeriod;
        return this;
    }
    public String getCycleStartPeriod() {
        return this.cycleStartPeriod;
    }

    public CreateBudgetShrinkRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public CreateBudgetShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public CreateBudgetShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public CreateBudgetShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CreateBudgetShrinkRequest setQueryFilterShrink(String queryFilterShrink) {
        this.queryFilterShrink = queryFilterShrink;
        return this;
    }
    public String getQueryFilterShrink() {
        return this.queryFilterShrink;
    }

    public CreateBudgetShrinkRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public CreateBudgetShrinkRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public CreateBudgetShrinkRequest setWarnConfsShrink(String warnConfsShrink) {
        this.warnConfsShrink = warnConfsShrink;
        return this;
    }
    public String getWarnConfsShrink() {
        return this.warnConfsShrink;
    }

}
