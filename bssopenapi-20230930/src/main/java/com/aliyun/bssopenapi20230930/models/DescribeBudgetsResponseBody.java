// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeBudgetsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeBudgetsResponseBodyData> data;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB2A9097-289C-11CE-AA74-235FCFD39204</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBudgetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetsResponseBody self = new DescribeBudgetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBudgetsResponseBody setData(java.util.List<DescribeBudgetsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBudgetsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBudgetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBudgetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBudgetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBudgetsResponseBodyDataCycleQuota extends TeaModel {
        /**
         * <p>The cycle period.</p>
         * 
         * <strong>example:</strong>
         * <p>202601</p>
         */
        @NameInMap("CyclePeriod")
        public String cyclePeriod;

        /**
         * <p>The quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Quota")
        public String quota;

        public static DescribeBudgetsResponseBodyDataCycleQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetsResponseBodyDataCycleQuota self = new DescribeBudgetsResponseBodyDataCycleQuota();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetsResponseBodyDataCycleQuota setCyclePeriod(String cyclePeriod) {
            this.cyclePeriod = cyclePeriod;
            return this;
        }
        public String getCyclePeriod() {
            return this.cyclePeriod;
        }

        public DescribeBudgetsResponseBodyDataCycleQuota setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

    }

    public static class DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter extends TeaModel {
        /**
         * <p>The member account IDs.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E2024112210463400001</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter self = new DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

    public static class DescribeBudgetsResponseBodyDataQueryFilter extends TeaModel {
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
         * <p>The filter value list.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeBudgetsResponseBodyDataQueryFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetsResponseBodyDataQueryFilter self = new DescribeBudgetsResponseBodyDataQueryFilter();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetsResponseBodyDataQueryFilter setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeBudgetsResponseBodyDataQueryFilter setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeBudgetsResponseBodyDataQueryFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeBudgetsResponseBodyDataWarnConfs extends TeaModel {
        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment1</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether EventBridge is enabled.</p>
         */
        @NameInMap("EventBridge")
        public Boolean eventBridge;

        /**
         * <p>The list of message center notification channels.</p>
         */
        @NameInMap("MscChannels")
        public java.util.List<String> mscChannels;

        /**
         * <p>The list of message center contacts.</p>
         */
        @NameInMap("MscContacts")
        public java.util.List<String> mscContacts;

        /**
         * <p>The alert name. This parameter is user-defined and optional. If not specified, the backend automatically generates a name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sort sequence number. This parameter is present only in responses. Alerts are numbered in ascending order by alert ID, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

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
         * <p>100</p>
         */
        @NameInMap("ThresholdValue")
        public String thresholdValue;

        /**
         * <p>The alert target.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTUAL</p>
         */
        @NameInMap("WarnTarget")
        public String warnTarget;

        public static DescribeBudgetsResponseBodyDataWarnConfs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetsResponseBodyDataWarnConfs self = new DescribeBudgetsResponseBodyDataWarnConfs();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setEventBridge(Boolean eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }
        public Boolean getEventBridge() {
            return this.eventBridge;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setMscChannels(java.util.List<String> mscChannels) {
            this.mscChannels = mscChannels;
            return this;
        }
        public java.util.List<String> getMscChannels() {
            return this.mscChannels;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setMscContacts(java.util.List<String> mscContacts) {
            this.mscContacts = mscContacts;
            return this;
        }
        public java.util.List<String> getMscContacts() {
            return this.mscContacts;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setThresholdValue(String thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        public String getThresholdValue() {
            return this.thresholdValue;
        }

        public DescribeBudgetsResponseBodyDataWarnConfs setWarnTarget(String warnTarget) {
            this.warnTarget = warnTarget;
            return this;
        }
        public String getWarnTarget() {
            return this.warnTarget;
        }

    }

    public static class DescribeBudgetsResponseBodyData extends TeaModel {
        /**
         * <p>The budget name.</p>
         * 
         * <strong>example:</strong>
         * <p>department1-test</p>
         */
        @NameInMap("BudgetName")
        public String budgetName;

        /**
         * <p>The budget type.</p>
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
         * <p>budget-1</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The end period.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12</p>
         */
        @NameInMap("CycleEndPeriod")
        public String cycleEndPeriod;

        /**
         * <p>The specified quota per cycle.</p>
         */
        @NameInMap("CycleQuota")
        public java.util.List<DescribeBudgetsResponseBodyDataCycleQuota> cycleQuota;

        /**
         * <p>The start period.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10</p>
         */
        @NameInMap("CycleStartPeriod")
        public String cycleStartPeriod;

        /**
         * <p>The cycle type.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTHLY</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The enterprise multi-account filter conditions.</p>
         */
        @NameInMap("EcIdAccountIdsFilter")
        public DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter ecIdAccountIdsFilter;

        /**
         * <p>The expiration status.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_EXPIRED</p>
         */
        @NameInMap("ExpireStatus")
        public String expireStatus;

        /**
         * <p>The budget metric.</p>
         * 
         * <strong>example:</strong>
         * <p>REQUIRE_AMOUNT</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The filter conditions.</p>
         */
        @NameInMap("QueryFilter")
        public java.util.List<DescribeBudgetsResponseBodyDataQueryFilter> queryFilter;

        /**
         * <p>The fixed quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Quota")
        public String quota;

        /**
         * <p>The quota type.</p>
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
        public java.util.List<DescribeBudgetsResponseBodyDataWarnConfs> warnConfs;

        public static DescribeBudgetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetsResponseBodyData self = new DescribeBudgetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetsResponseBodyData setBudgetName(String budgetName) {
            this.budgetName = budgetName;
            return this;
        }
        public String getBudgetName() {
            return this.budgetName;
        }

        public DescribeBudgetsResponseBodyData setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }
        public String getBudgetType() {
            return this.budgetType;
        }

        public DescribeBudgetsResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeBudgetsResponseBodyData setCycleEndPeriod(String cycleEndPeriod) {
            this.cycleEndPeriod = cycleEndPeriod;
            return this;
        }
        public String getCycleEndPeriod() {
            return this.cycleEndPeriod;
        }

        public DescribeBudgetsResponseBodyData setCycleQuota(java.util.List<DescribeBudgetsResponseBodyDataCycleQuota> cycleQuota) {
            this.cycleQuota = cycleQuota;
            return this;
        }
        public java.util.List<DescribeBudgetsResponseBodyDataCycleQuota> getCycleQuota() {
            return this.cycleQuota;
        }

        public DescribeBudgetsResponseBodyData setCycleStartPeriod(String cycleStartPeriod) {
            this.cycleStartPeriod = cycleStartPeriod;
            return this;
        }
        public String getCycleStartPeriod() {
            return this.cycleStartPeriod;
        }

        public DescribeBudgetsResponseBodyData setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public DescribeBudgetsResponseBodyData setEcIdAccountIdsFilter(DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter ecIdAccountIdsFilter) {
            this.ecIdAccountIdsFilter = ecIdAccountIdsFilter;
            return this;
        }
        public DescribeBudgetsResponseBodyDataEcIdAccountIdsFilter getEcIdAccountIdsFilter() {
            return this.ecIdAccountIdsFilter;
        }

        public DescribeBudgetsResponseBodyData setExpireStatus(String expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }
        public String getExpireStatus() {
            return this.expireStatus;
        }

        public DescribeBudgetsResponseBodyData setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeBudgetsResponseBodyData setQueryFilter(java.util.List<DescribeBudgetsResponseBodyDataQueryFilter> queryFilter) {
            this.queryFilter = queryFilter;
            return this;
        }
        public java.util.List<DescribeBudgetsResponseBodyDataQueryFilter> getQueryFilter() {
            return this.queryFilter;
        }

        public DescribeBudgetsResponseBodyData setQuota(String quota) {
            this.quota = quota;
            return this;
        }
        public String getQuota() {
            return this.quota;
        }

        public DescribeBudgetsResponseBodyData setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public DescribeBudgetsResponseBodyData setWarnConfs(java.util.List<DescribeBudgetsResponseBodyDataWarnConfs> warnConfs) {
            this.warnConfs = warnConfs;
            return this;
        }
        public java.util.List<DescribeBudgetsResponseBodyDataWarnConfs> getWarnConfs() {
            return this.warnConfs;
        }

    }

}
