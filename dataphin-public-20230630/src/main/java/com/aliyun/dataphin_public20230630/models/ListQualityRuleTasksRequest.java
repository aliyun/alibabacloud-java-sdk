// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRuleTasksRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListQualityRuleTasksRequestListQuery listQuery;

    /**
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
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("CatalogList")
        public java.util.List<String> catalogList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RuleStrengthList")
        public java.util.List<String> ruleStrengthList;

        @NameInMap("RuleTagList")
        public java.util.List<String> ruleTagList;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        @NameInMap("ValidateResultList")
        public java.util.List<String> validateResultList;

        /**
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
