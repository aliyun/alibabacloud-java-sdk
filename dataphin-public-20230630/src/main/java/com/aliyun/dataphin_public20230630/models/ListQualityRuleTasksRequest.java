// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRuleTasksRequest extends TeaModel {
    /**
     * <p>The paging conditions for the paged query.</p>
     */
    @NameInMap("ListQuery")
    public ListQualityRuleTasksRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListQualityRuleTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRuleTasksRequest self = new ListQualityRuleTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityRuleTasksRequest setListQuery(ListQualityRuleTasksRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListQualityRuleTasksRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListQualityRuleTasksRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListQualityRuleTasksRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListQualityRuleTasksRequestListQuery extends TeaModel {
        /**
         * <p>The business date. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The rule types. Valid values: CONSISTENT (Consistency), EFFECTIVE (Effectiveness), TIMELINESE (Timeliness), ACCURATE (Accuracy), UNIQUENESS (Uniqueness), COMPLETENESS (Completeness), STABILITY (Stability), and CUSTOM (Custom).</p>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <p>The search keyword. You can search by field name or rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The rule strengths. Valid values: STRONG (Strong) and WEAK (Weak).</p>
         */
        @NameInMap("RuleStrengthList")
        public java.util.List<String> ruleStrengthList;

        /**
         * <p>The rule labels. Valid values: DEFAULT (Default label), DATA_STANDARD_MANUAL (Manually created standard rule), DATA_STANDARD_AUTO (Standard quality rule of automatic creation), PIPELINE (Rule created by pipeline), and DATA_MODELING (Data modeling).</p>
         */
        @NameInMap("RuleTagList")
        public java.util.List<String> ruleTagList;

        /**
         * <p>The task statuses. Valid values: NOT_RUN (Not run), WAITING (Waiting), RUNNING (Running), SUCCESS (Successful), FAILED (Failed), CANCEL (Canceled), TIMEOUT (Timed out), and OFFLINE (Offline).</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The validation results. Valid values: NOT_RUN (Not run), WAITING (Waiting), RUNNING (Running), PASS (Passed), NOT_PASS (Not passed), FAILED (Failed), OFFLINE (Offline, requires restart), CANCEL (Canceled), and TIMEOUT (Timed out).</p>
         */
        @NameInMap("ValidateResultList")
        public java.util.List<String> validateResultList;

        /**
         * <p>The watchtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchTaskId")
        public Long watchTaskId;

        public static ListQualityRuleTasksRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRuleTasksRequestListQuery self = new ListQualityRuleTasksRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListQualityRuleTasksRequestListQuery setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityRuleTasksRequestListQuery setCatalogList(java.util.List<String> catalogList) {
            this.catalogList = catalogList;
            return this;
        }
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        public ListQualityRuleTasksRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListQualityRuleTasksRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListQualityRuleTasksRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityRuleTasksRequestListQuery setRuleStrengthList(java.util.List<String> ruleStrengthList) {
            this.ruleStrengthList = ruleStrengthList;
            return this;
        }
        public java.util.List<String> getRuleStrengthList() {
            return this.ruleStrengthList;
        }

        public ListQualityRuleTasksRequestListQuery setRuleTagList(java.util.List<String> ruleTagList) {
            this.ruleTagList = ruleTagList;
            return this;
        }
        public java.util.List<String> getRuleTagList() {
            return this.ruleTagList;
        }

        public ListQualityRuleTasksRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListQualityRuleTasksRequestListQuery setValidateResultList(java.util.List<String> validateResultList) {
            this.validateResultList = validateResultList;
            return this;
        }
        public java.util.List<String> getValidateResultList() {
            return this.validateResultList;
        }

        public ListQualityRuleTasksRequestListQuery setWatchTaskId(Long watchTaskId) {
            this.watchTaskId = watchTaskId;
            return this;
        }
        public Long getWatchTaskId() {
            return this.watchTaskId;
        }

    }

}
