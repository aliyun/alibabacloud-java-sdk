// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRuleTasksRequest extends TeaModel {
    /**
     * <p>The paging query conditions.</p>
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
     * <p>The operator user ID.</p>
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
         * <p>The business date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The rule types. Valid values: CONSISTENT (consistency), EFFECTIVE (effectiveness), TIMELINESE (timeliness), ACCURATE (accuracy), UNIQUENESS (uniqueness), COMPLETENESS (completeness), STABILITY (stability), and CUSTOM (custom).</p>
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
         * <p>The rule strengths. Valid values: STRONG (strong) and WEAK (weak).</p>
         */
        @NameInMap("RuleStrengthList")
        public java.util.List<String> ruleStrengthList;

        /**
         * <p>The rule labels. Valid values: DEFAULT (default label), DATA_STANDARD_MANUAL (manually created standard rules), DATA_STANDARD_AUTO (standard quality rules created by automatic creation), PIPELINE (rules created by pipelines), and DATA_MODELING (data modeling).</p>
         */
        @NameInMap("RuleTagList")
        public java.util.List<String> ruleTagList;

        /**
         * <p>The task statuses. Valid values: NOT_RUN (not run), WAITING (waiting), RUNNING (running), SUCCESS (successful), FAILED (failed), CANCEL (canceled), TIMEOUT (timed out), and OFFLINE (offline).</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The validation results. Valid values: NOT_RUN (not run), WAITING (waiting), RUNNING (running), PASS (passed), NOT_PASS (not passed), FAILED (failed), OFFLINE (offline and requires restart), CANCEL (canceled), and TIMEOUT (timed out).</p>
         */
        @NameInMap("ValidateResultList")
        public java.util.List<String> validateResultList;

        /**
         * <p>The quality watchtask ID.</p>
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
