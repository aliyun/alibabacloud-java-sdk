// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateBudgetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Department_dev_budget</p>
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
    public java.util.List<CreateBudgetRequestCycleQuota> cycleQuota;

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
    public java.util.List<CreateBudgetRequestEcIdAccountIds> ecIdAccountIds;

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

    @NameInMap("QueryFilter")
    public java.util.List<CreateBudgetRequestQueryFilter> queryFilter;

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
    public java.util.List<CreateBudgetRequestWarnConfs> warnConfs;

    public static CreateBudgetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetRequest self = new CreateBudgetRequest();
        return TeaModel.build(map, self);
    }

    public CreateBudgetRequest setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public CreateBudgetRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public CreateBudgetRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateBudgetRequest setCycleEndPeriod(String cycleEndPeriod) {
        this.cycleEndPeriod = cycleEndPeriod;
        return this;
    }
    public String getCycleEndPeriod() {
        return this.cycleEndPeriod;
    }

    public CreateBudgetRequest setCycleQuota(java.util.List<CreateBudgetRequestCycleQuota> cycleQuota) {
        this.cycleQuota = cycleQuota;
        return this;
    }
    public java.util.List<CreateBudgetRequestCycleQuota> getCycleQuota() {
        return this.cycleQuota;
    }

    public CreateBudgetRequest setCycleStartPeriod(String cycleStartPeriod) {
        this.cycleStartPeriod = cycleStartPeriod;
        return this;
    }
    public String getCycleStartPeriod() {
        return this.cycleStartPeriod;
    }

    public CreateBudgetRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public CreateBudgetRequest setEcIdAccountIds(java.util.List<CreateBudgetRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<CreateBudgetRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public CreateBudgetRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public CreateBudgetRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CreateBudgetRequest setQueryFilter(java.util.List<CreateBudgetRequestQueryFilter> queryFilter) {
        this.queryFilter = queryFilter;
        return this;
    }
    public java.util.List<CreateBudgetRequestQueryFilter> getQueryFilter() {
        return this.queryFilter;
    }

    public CreateBudgetRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public CreateBudgetRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public CreateBudgetRequest setWarnConfs(java.util.List<CreateBudgetRequestWarnConfs> warnConfs) {
        this.warnConfs = warnConfs;
        return this;
    }
    public java.util.List<CreateBudgetRequestWarnConfs> getWarnConfs() {
        return this.warnConfs;
    }

    public static class CreateBudgetRequestCycleQuota extends TeaModel {
        @NameInMap("CyclePeriod")
        public String cyclePeriod;

        @NameInMap("Quota")
        public String quota;

        public static CreateBudgetRequestCycleQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateBudgetRequestCycleQuota self = new CreateBudgetRequestCycleQuota();
            return TeaModel.build(map, self);
        }

        public CreateBudgetRequestCycleQuota setCyclePeriod(String cyclePeriod) {
            this.cyclePeriod = cyclePeriod;
            return this;
        }
        public String getCyclePeriod() {
            return this.cyclePeriod;
        }

        public CreateBudgetRequestCycleQuota setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

    }

    public static class CreateBudgetRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        @NameInMap("EcId")
        public String ecId;

        public static CreateBudgetRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            CreateBudgetRequestEcIdAccountIds self = new CreateBudgetRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public CreateBudgetRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public CreateBudgetRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

    public static class CreateBudgetRequestQueryFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RESOURCE_OWNER_ACCOUNT</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static CreateBudgetRequestQueryFilter build(java.util.Map<String, ?> map) throws Exception {
            CreateBudgetRequestQueryFilter self = new CreateBudgetRequestQueryFilter();
            return TeaModel.build(map, self);
        }

        public CreateBudgetRequestQueryFilter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateBudgetRequestQueryFilter setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public CreateBudgetRequestQueryFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class CreateBudgetRequestWarnConfs extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EventBridge")
        public Boolean eventBridge;

        @NameInMap("MscChannels")
        public java.util.List<String> mscChannels;

        @NameInMap("MscContacts")
        public java.util.List<String> mscContacts;

        /**
         * <strong>example:</strong>
         * <p>Alter-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>FIXED</p>
         */
        @NameInMap("ThresholdType")
        public String thresholdType;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ThresholdValue")
        public String thresholdValue;

        /**
         * <strong>example:</strong>
         * <p>FORECAST</p>
         */
        @NameInMap("WarnTarget")
        public String warnTarget;

        public static CreateBudgetRequestWarnConfs build(java.util.Map<String, ?> map) throws Exception {
            CreateBudgetRequestWarnConfs self = new CreateBudgetRequestWarnConfs();
            return TeaModel.build(map, self);
        }

        public CreateBudgetRequestWarnConfs setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateBudgetRequestWarnConfs setEventBridge(Boolean eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }
        public Boolean getEventBridge() {
            return this.eventBridge;
        }

        public CreateBudgetRequestWarnConfs setMscChannels(java.util.List<String> mscChannels) {
            this.mscChannels = mscChannels;
            return this;
        }
        public java.util.List<String> getMscChannels() {
            return this.mscChannels;
        }

        public CreateBudgetRequestWarnConfs setMscContacts(java.util.List<String> mscContacts) {
            this.mscContacts = mscContacts;
            return this;
        }
        public java.util.List<String> getMscContacts() {
            return this.mscContacts;
        }

        public CreateBudgetRequestWarnConfs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBudgetRequestWarnConfs setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public CreateBudgetRequestWarnConfs setThresholdValue(String thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public String getThresholdValue() {
            return this.thresholdValue;
        }

        public CreateBudgetRequestWarnConfs setWarnTarget(String warnTarget) {
            this.warnTarget = warnTarget;
            return this;
        }
        public String getWarnTarget() {
            return this.warnTarget;
        }

    }

}
