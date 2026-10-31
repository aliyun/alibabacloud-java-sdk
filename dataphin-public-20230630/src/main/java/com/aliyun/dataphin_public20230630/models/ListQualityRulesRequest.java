// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRulesRequest extends TeaModel {
    /**
     * <p>The paged query conditions, including paging parameters.</p>
     */
    @NameInMap("ListQuery")
    public ListQualityRulesRequestListQuery listQuery;

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
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListQualityRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRulesRequest self = new ListQualityRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityRulesRequest setListQuery(ListQualityRulesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListQualityRulesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListQualityRulesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListQualityRulesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListQualityRulesRequestListQuery extends TeaModel {
        /**
         * <p>The rule type. Valid values: CONSISTENT (Consistency), EFFECTIVE (Effectiveness), TIMELINESE (Timeliness), ACCURATE (Accuracy), UNIQUENESS (Uniqueness), COMPLETENESS (Completeness), STABILITY (Stability), and CUSTOM (Custom).</p>
         */
        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <p>The search keyword. Supports searching by rule name and validation object.</p>
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
         * <p>The rule strength. Valid values: STRONG (Strong) and WEAK (Weak).</p>
         */
        @NameInMap("RuleStrengthList")
        public java.util.List<String> ruleStrengthList;

        /**
         * <p>The effective status of the rule. Valid values: ENABLE (Enabled) and DISABLE (Disabled).</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The rule template.</p>
         */
        @NameInMap("TemplateIdList")
        public java.util.List<Long> templateIdList;

        /**
         * <p>The task status. Valid values: NOT_RUN (Not run), WAITING (Waiting), RUNNING (Running), SUCCESS (Succeeded), FAILED (Failed), CANCEL (Canceled), TIMEOUT (Timed out), and OFFLINE (Offline).</p>
         */
        @NameInMap("TestRunTaskStatusList")
        public java.util.List<String> testRunTaskStatusList;

        /**
         * <p>The validation result of the rule test run. Valid values: NOT_RUN (Not run), WAITING (Waiting), RUNNING (Running), PASS (Passed), NOT_PASS (Not passed), FAILED (Failed), OFFLINE (Offline, requires restart), CANCEL (Canceled), and TIMEOUT (Timed out).</p>
         */
        @NameInMap("TestRunTaskValidateResultList")
        public java.util.List<String> testRunTaskValidateResultList;

        /**
         * <p>The monitoring ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static ListQualityRulesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRulesRequestListQuery self = new ListQualityRulesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListQualityRulesRequestListQuery setCatalogList(java.util.List<String> catalogList) {
            this.catalogList = catalogList;
            return this;
        }
        public java.util.List<String> getCatalogList() {
            return this.catalogList;
        }

        public ListQualityRulesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListQualityRulesRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListQualityRulesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityRulesRequestListQuery setRuleStrengthList(java.util.List<String> ruleStrengthList) {
            this.ruleStrengthList = ruleStrengthList;
            return this;
        }
        public java.util.List<String> getRuleStrengthList() {
            return this.ruleStrengthList;
        }

        public ListQualityRulesRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListQualityRulesRequestListQuery setTemplateIdList(java.util.List<Long> templateIdList) {
            this.templateIdList = templateIdList;
            return this;
        }
        public java.util.List<Long> getTemplateIdList() {
            return this.templateIdList;
        }

        public ListQualityRulesRequestListQuery setTestRunTaskStatusList(java.util.List<String> testRunTaskStatusList) {
            this.testRunTaskStatusList = testRunTaskStatusList;
            return this;
        }
        public java.util.List<String> getTestRunTaskStatusList() {
            return this.testRunTaskStatusList;
        }

        public ListQualityRulesRequestListQuery setTestRunTaskValidateResultList(java.util.List<String> testRunTaskValidateResultList) {
            this.testRunTaskValidateResultList = testRunTaskValidateResultList;
            return this;
        }
        public java.util.List<String> getTestRunTaskValidateResultList() {
            return this.testRunTaskValidateResultList;
        }

        public ListQualityRulesRequestListQuery setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
