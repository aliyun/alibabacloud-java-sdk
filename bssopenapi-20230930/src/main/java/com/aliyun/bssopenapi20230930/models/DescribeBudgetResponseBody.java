// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeBudgetResponseBody extends TeaModel {
    /**
     * <p>Budget name.</p>
     * 
     * <strong>example:</strong>
     * <p>department1</p>
     */
    @NameInMap("BudgetName")
    public String budgetName;

    /**
     * <p>Budget type.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSUME</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>End cycle period.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12</p>
     */
    @NameInMap("CycleEndPeriod")
    public String cycleEndPeriod;

    /**
     * <p>Quota specified per cycle.</p>
     */
    @NameInMap("CycleQuota")
    public java.util.List<DescribeBudgetResponseBodyCycleQuota> cycleQuota;

    /**
     * <p>Start cycle period.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10</p>
     */
    @NameInMap("CycleStartPeriod")
    public String cycleStartPeriod;

    /**
     * <p>Cycle type.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>Enterprise multi-account filter conditions.</p>
     */
    @NameInMap("EcIdAccountIdsFilter")
    public DescribeBudgetResponseBodyEcIdAccountIdsFilter ecIdAccountIdsFilter;

    /**
     * <p>Response structure metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Budget metric.</p>
     * 
     * <strong>example:</strong>
     * <p>REQUIRE_AMOUNT</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>Filter conditions.</p>
     */
    @NameInMap("QueryFilter")
    public java.util.List<DescribeBudgetResponseBodyQueryFilter> queryFilter;

    /**
     * <p>Fixed quota value.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Quota")
    public String quota;

    /**
     * <p>Quota type.</p>
     * 
     * <strong>example:</strong>
     * <p>FIXED</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Alert configurations.</p>
     */
    @NameInMap("WarnConfs")
    public java.util.List<DescribeBudgetResponseBodyWarnConfs> warnConfs;

    public static DescribeBudgetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetResponseBody self = new DescribeBudgetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetResponseBody setBudgetName(String budgetName) {
        this.budgetName = budgetName;
        return this;
    }
    public String getBudgetName() {
        return this.budgetName;
    }

    public DescribeBudgetResponseBody setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public DescribeBudgetResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DescribeBudgetResponseBody setCycleEndPeriod(String cycleEndPeriod) {
        this.cycleEndPeriod = cycleEndPeriod;
        return this;
    }
    public String getCycleEndPeriod() {
        return this.cycleEndPeriod;
    }

    public DescribeBudgetResponseBody setCycleQuota(java.util.List<DescribeBudgetResponseBodyCycleQuota> cycleQuota) {
        this.cycleQuota = cycleQuota;
        return this;
    }
    public java.util.List<DescribeBudgetResponseBodyCycleQuota> getCycleQuota() {
        return this.cycleQuota;
    }

    public DescribeBudgetResponseBody setCycleStartPeriod(String cycleStartPeriod) {
        this.cycleStartPeriod = cycleStartPeriod;
        return this;
    }
    public String getCycleStartPeriod() {
        return this.cycleStartPeriod;
    }

    public DescribeBudgetResponseBody setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public DescribeBudgetResponseBody setEcIdAccountIdsFilter(DescribeBudgetResponseBodyEcIdAccountIdsFilter ecIdAccountIdsFilter) {
        this.ecIdAccountIdsFilter = ecIdAccountIdsFilter;
        return this;
    }
    public DescribeBudgetResponseBodyEcIdAccountIdsFilter getEcIdAccountIdsFilter() {
        return this.ecIdAccountIdsFilter;
    }

    public DescribeBudgetResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public DescribeBudgetResponseBody setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeBudgetResponseBody setQueryFilter(java.util.List<DescribeBudgetResponseBodyQueryFilter> queryFilter) {
        this.queryFilter = queryFilter;
        return this;
    }
    public java.util.List<DescribeBudgetResponseBodyQueryFilter> getQueryFilter() {
        return this.queryFilter;
    }

    public DescribeBudgetResponseBody setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public DescribeBudgetResponseBody setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public DescribeBudgetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBudgetResponseBody setWarnConfs(java.util.List<DescribeBudgetResponseBodyWarnConfs> warnConfs) {
        this.warnConfs = warnConfs;
        return this;
    }
    public java.util.List<DescribeBudgetResponseBodyWarnConfs> getWarnConfs() {
        return this.warnConfs;
    }

    public static class DescribeBudgetResponseBodyCycleQuota extends TeaModel {
        /**
         * <p>Cycle period.</p>
         * 
         * <strong>example:</strong>
         * <p>202601</p>
         */
        @NameInMap("CyclePeriod")
        public String cyclePeriod;

        /**
         * <p>Quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Quota")
        public String quota;

        public static DescribeBudgetResponseBodyCycleQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetResponseBodyCycleQuota self = new DescribeBudgetResponseBodyCycleQuota();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetResponseBodyCycleQuota setCyclePeriod(String cyclePeriod) {
            this.cyclePeriod = cyclePeriod;
            return this;
        }
        public String getCyclePeriod() {
            return this.cyclePeriod;
        }

        public DescribeBudgetResponseBodyCycleQuota setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

    }

    public static class DescribeBudgetResponseBodyEcIdAccountIdsFilter extends TeaModel {
        /**
         * <p>Member account IDs.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>Enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E2024112210463400001</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DescribeBudgetResponseBodyEcIdAccountIdsFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetResponseBodyEcIdAccountIdsFilter self = new DescribeBudgetResponseBodyEcIdAccountIdsFilter();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetResponseBodyEcIdAccountIdsFilter setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeBudgetResponseBodyEcIdAccountIdsFilter setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

    public static class DescribeBudgetResponseBodyQueryFilter extends TeaModel {
        /**
         * <p>Parameter code.</p>
         * 
         * <strong>example:</strong>
         * <p>RESOURCE_OWNER_ACCOUNT</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Selection mode.</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>Filter value list.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeBudgetResponseBodyQueryFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetResponseBodyQueryFilter self = new DescribeBudgetResponseBodyQueryFilter();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetResponseBodyQueryFilter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBudgetResponseBodyQueryFilter setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeBudgetResponseBodyQueryFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeBudgetResponseBodyWarnConfs extends TeaModel {
        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Specifies whether to enable EventBridge.</p>
         */
        @NameInMap("EventBridge")
        public Boolean eventBridge;

        /**
         * <p>Message center notification channel list.</p>
         */
        @NameInMap("MscChannels")
        public java.util.List<String> mscChannels;

        /**
         * <p>Message center contact list.</p>
         */
        @NameInMap("MscContacts")
        public java.util.List<String> mscContacts;

        /**
         * <p>Alert name. User-defined and optional. If not specified, the backend automatically generates a name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alter-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Sequence number. Only present in responses. Alerts are numbered in ascending order of alert ID, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Threshold type.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXED</p>
         */
        @NameInMap("ThresholdType")
        public String thresholdType;

        /**
         * <p>Threshold value.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ThresholdValue")
        public String thresholdValue;

        /**
         * <p>Alert target.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTUAL</p>
         */
        @NameInMap("WarnTarget")
        public String warnTarget;

        public static DescribeBudgetResponseBodyWarnConfs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetResponseBodyWarnConfs self = new DescribeBudgetResponseBodyWarnConfs();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetResponseBodyWarnConfs setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeBudgetResponseBodyWarnConfs setEventBridge(Boolean eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }
        public Boolean getEventBridge() {
            return this.eventBridge;
        }

        public DescribeBudgetResponseBodyWarnConfs setMscChannels(java.util.List<String> mscChannels) {
            this.mscChannels = mscChannels;
            return this;
        }
        public java.util.List<String> getMscChannels() {
            return this.mscChannels;
        }

        public DescribeBudgetResponseBodyWarnConfs setMscContacts(java.util.List<String> mscContacts) {
            this.mscContacts = mscContacts;
            return this;
        }
        public java.util.List<String> getMscContacts() {
            return this.mscContacts;
        }

        public DescribeBudgetResponseBodyWarnConfs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBudgetResponseBodyWarnConfs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public DescribeBudgetResponseBodyWarnConfs setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public DescribeBudgetResponseBodyWarnConfs setThresholdValue(String thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public String getThresholdValue() {
            return this.thresholdValue;
        }

        public DescribeBudgetResponseBodyWarnConfs setWarnTarget(String warnTarget) {
            this.warnTarget = warnTarget;
            return this;
        }
        public String getWarnTarget() {
            return this.warnTarget;
        }

    }

}
