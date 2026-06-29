// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRuleTasksRequest extends TeaModel {
    /**
     * <p>The paged query conditions.</p>
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
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li>CONSISTENT: consistency</li>
         * <li>EFFECTIVE: validity</li>
         * <li>TIMELINESE: timeliness</li>
         * <li>ACCURATE: accuracy</li>
         * <li>UNIQUENESS: uniqueness</li>
         * <li>COMPLETENESS: completeness</li>
         * <li>STABILITY: stability</li>
         * <li>CUSTOM: custom.</li>
         * </ul>
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
         * <p>The rule strength. Valid values:</p>
         * <ul>
         * <li>STRONG: strong</li>
         * <li>WEAK: weak.</li>
         * </ul>
         */
        @NameInMap("RuleStrengthList")
        public java.util.List<String> ruleStrengthList;

        /**
         * <p>The rule label. Valid values:</p>
         * <ul>
         * <li>DEFAULT: default label</li>
         * <li>DATA_STANDARD_MANUAL: standard rule manually created</li>
         * <li>DATA_STANDARD_AUTO: quality rule created by automatic creation from a standard</li>
         * <li>PIPELINE: rule created by a pipeline</li>
         * <li>DATA_MODELING: data modeling diagnostics.</li>
         * </ul>
         */
        @NameInMap("RuleTagList")
        public java.util.List<String> ruleTagList;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: not executed</li>
         * <li>WAITING: waiting</li>
         * <li>RUNNING: running</li>
         * <li>SUCCESS: succeeded</li>
         * <li>FAILED: failed</li>
         * <li>CANCEL: canceled</li>
         * <li>TIMEOUT: timed out</li>
         * <li>OFFLINE: offline.</li>
         * </ul>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The validation result. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: not executed</li>
         * <li>WAITING: waiting for execution</li>
         * <li>RUNNING: running</li>
         * <li>PASS: passed</li>
         * <li>NOT_PASS: not passed</li>
         * <li>FAILED: execution failed</li>
         * <li>OFFLINE: offline and needs to be restarted</li>
         * <li>CANCEL: task canceled</li>
         * <li>TIMEOUT: task timed out.</li>
         * </ul>
         */
        @NameInMap("ValidateResultList")
        public java.util.List<String> validateResultList;

        /**
         * <p>The ID of the quality watchtask.</p>
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
