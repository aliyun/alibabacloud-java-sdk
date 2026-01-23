// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRulesRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListQualityRulesRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

    public static class ListQualityRulesRequestListQuery extends TeaModel {
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

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        @NameInMap("TemplateIdList")
        public java.util.List<Long> templateIdList;

        @NameInMap("TestRunTaskStatusList")
        public java.util.List<String> testRunTaskStatusList;

        @NameInMap("TestRunTaskValidateResultList")
        public java.util.List<String> testRunTaskValidateResultList;

        /**
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
