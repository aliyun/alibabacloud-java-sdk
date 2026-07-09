// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateBudgetRequest extends TeaModel {
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
    public java.util.List<CreateBudgetRequestCycleQuota> cycleQuota;

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
    public java.util.List<CreateBudgetRequestEcIdAccountIds> ecIdAccountIds;

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
    public java.util.List<CreateBudgetRequestQueryFilter> queryFilter;

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
        /**
         * <p>The cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01</p>
         */
        @NameInMap("CyclePeriod")
        public String cyclePeriod;

        /**
         * <p>The quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <p>The list of accounts to access. An empty value indicates all accounts under the current entity ID.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
         * <p>The parameter code.</p>
         * 
         * <strong>example:</strong>
         * <p>RESOURCE_OWNER_ACCOUNT</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The selection mode.</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The list of filter values.</p>
         */
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
        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Specifies whether to enable EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EventBridge")
        public Boolean eventBridge;

        /**
         * <p>The list of Message Center notification channels.</p>
         */
        @NameInMap("MscChannels")
        public java.util.List<String> mscChannels;

        /**
         * <p>The list of Message Center contacts.</p>
         */
        @NameInMap("MscContacts")
        public java.util.List<String> mscContacts;

        /**
         * <p>The alert name. This is a user-defined optional field. If not specified, the backend automatically generates a name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alter-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The threshold type.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXED</p>
         */
        @NameInMap("ThresholdType")
        public String thresholdType;

        /**
         * <p>The threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ThresholdValue")
        public String thresholdValue;

        /**
         * <p>The alert target.</p>
         * 
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
