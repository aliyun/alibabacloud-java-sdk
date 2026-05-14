// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpdateBudgetRequest extends TeaModel {
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
    public java.util.List<UpdateBudgetRequestCycleQuota> cycleQuota;

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
    public java.util.List<UpdateBudgetRequestEcIdAccountIds> ecIdAccountIds;

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
    public java.util.List<UpdateBudgetRequestQueryFilter> queryFilter;

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
    public java.util.List<UpdateBudgetRequestWarnConfs> warnConfs;

    public static UpdateBudgetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBudgetRequest self = new UpdateBudgetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBudgetRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public UpdateBudgetRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public UpdateBudgetRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateBudgetRequest setCycleEndPeriod(String cycleEndPeriod) {
        this.cycleEndPeriod = cycleEndPeriod;
        return this;
    }
    public String getCycleEndPeriod() {
        return this.cycleEndPeriod;
    }

    public UpdateBudgetRequest setCycleQuota(java.util.List<UpdateBudgetRequestCycleQuota> cycleQuota) {
        this.cycleQuota = cycleQuota;
        return this;
    }
    public java.util.List<UpdateBudgetRequestCycleQuota> getCycleQuota() {
        return this.cycleQuota;
    }

    public UpdateBudgetRequest setCycleStartPeriod(String cycleStartPeriod) {
        this.cycleStartPeriod = cycleStartPeriod;
        return this;
    }
    public String getCycleStartPeriod() {
        return this.cycleStartPeriod;
    }

    public UpdateBudgetRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public UpdateBudgetRequest setEcIdAccountIds(java.util.List<UpdateBudgetRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<UpdateBudgetRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public UpdateBudgetRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public UpdateBudgetRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public UpdateBudgetRequest setOriginalBudgetName(String originalBudgetName) {
        this.originalBudgetName = originalBudgetName;
        return this;
    }
    public String getOriginalBudgetName() {
        return this.originalBudgetName;
    }

    public UpdateBudgetRequest setQueryFilter(java.util.List<UpdateBudgetRequestQueryFilter> queryFilter) {
        this.queryFilter = queryFilter;
        return this;
    }
    public java.util.List<UpdateBudgetRequestQueryFilter> getQueryFilter() {
        return this.queryFilter;
    }

    public UpdateBudgetRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public UpdateBudgetRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public UpdateBudgetRequest setWarnConfs(java.util.List<UpdateBudgetRequestWarnConfs> warnConfs) {
        this.warnConfs = warnConfs;
        return this;
    }
    public java.util.List<UpdateBudgetRequestWarnConfs> getWarnConfs() {
        return this.warnConfs;
    }

    public static class UpdateBudgetRequestCycleQuota extends TeaModel {
        @NameInMap("CyclePeriod")
        public String cyclePeriod;

        @NameInMap("Quota")
        public String quota;

        public static UpdateBudgetRequestCycleQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateBudgetRequestCycleQuota self = new UpdateBudgetRequestCycleQuota();
            return TeaModel.build(map, self);
        }

        public UpdateBudgetRequestCycleQuota setCyclePeriod(String cyclePeriod) {
            this.cyclePeriod = cyclePeriod;
            return this;
        }
        public String getCyclePeriod() {
            return this.cyclePeriod;
        }

        public UpdateBudgetRequestCycleQuota setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

    }

    public static class UpdateBudgetRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        @NameInMap("EcId")
        public String ecId;

        public static UpdateBudgetRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateBudgetRequestEcIdAccountIds self = new UpdateBudgetRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public UpdateBudgetRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public UpdateBudgetRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

    public static class UpdateBudgetRequestQueryFilter extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("SelectType")
        public String selectType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateBudgetRequestQueryFilter build(java.util.Map<String, ?> map) throws Exception {
            UpdateBudgetRequestQueryFilter self = new UpdateBudgetRequestQueryFilter();
            return TeaModel.build(map, self);
        }

        public UpdateBudgetRequestQueryFilter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateBudgetRequestQueryFilter setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public UpdateBudgetRequestQueryFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateBudgetRequestWarnConfs extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("EventBridge")
        public Boolean eventBridge;

        @NameInMap("MscChannels")
        public java.util.List<String> mscChannels;

        @NameInMap("MscContacts")
        public java.util.List<String> mscContacts;

        @NameInMap("Name")
        public String name;

        @NameInMap("ThresholdType")
        public String thresholdType;

        @NameInMap("ThresholdValue")
        public String thresholdValue;

        @NameInMap("WarnTarget")
        public String warnTarget;

        public static UpdateBudgetRequestWarnConfs build(java.util.Map<String, ?> map) throws Exception {
            UpdateBudgetRequestWarnConfs self = new UpdateBudgetRequestWarnConfs();
            return TeaModel.build(map, self);
        }

        public UpdateBudgetRequestWarnConfs setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateBudgetRequestWarnConfs setEventBridge(Boolean eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }
        public Boolean getEventBridge() {
            return this.eventBridge;
        }

        public UpdateBudgetRequestWarnConfs setMscChannels(java.util.List<String> mscChannels) {
            this.mscChannels = mscChannels;
            return this;
        }
        public java.util.List<String> getMscChannels() {
            return this.mscChannels;
        }

        public UpdateBudgetRequestWarnConfs setMscContacts(java.util.List<String> mscContacts) {
            this.mscContacts = mscContacts;
            return this;
        }
        public java.util.List<String> getMscContacts() {
            return this.mscContacts;
        }

        public UpdateBudgetRequestWarnConfs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBudgetRequestWarnConfs setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public UpdateBudgetRequestWarnConfs setThresholdValue(String thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public String getThresholdValue() {
            return this.thresholdValue;
        }

        public UpdateBudgetRequestWarnConfs setWarnTarget(String warnTarget) {
            this.warnTarget = warnTarget;
            return this;
        }
        public String getWarnTarget() {
            return this.warnTarget;
        }

    }

}
