// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchTasksRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListQualityWatchTasksRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListQualityWatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityWatchTasksRequest self = new ListQualityWatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityWatchTasksRequest setListQuery(ListQualityWatchTasksRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListQualityWatchTasksRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListQualityWatchTasksRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListQualityWatchTasksRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        @NameInMap("DataSourceIdList")
        public java.util.List<String> dataSourceIdList;

        @NameInMap("DataSourceOwnerList")
        public java.util.List<String> dataSourceOwnerList;

        @NameInMap("DataSourceScopeList")
        public java.util.List<String> dataSourceScopeList;

        @NameInMap("DataSourceTypeList")
        public java.util.List<String> dataSourceTypeList;

        @NameInMap("ErrorRuleStrengthList")
        public java.util.List<String> errorRuleStrengthList;

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

        @NameInMap("ProjectNameList")
        public java.util.List<String> projectNameList;

        @NameInMap("QualityOwnerList")
        public java.util.List<String> qualityOwnerList;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        @NameInMap("TableOwnerList")
        public java.util.List<String> tableOwnerList;

        @NameInMap("TableTypeList")
        public java.util.List<String> tableTypeList;

        @NameInMap("WatchTypeList")
        public java.util.List<String> watchTypeList;

        public static ListQualityWatchTasksRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchTasksRequestListQuery self = new ListQualityWatchTasksRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchTasksRequestListQuery setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityWatchTasksRequestListQuery setBizUnitNameList(java.util.List<String> bizUnitNameList) {
            this.bizUnitNameList = bizUnitNameList;
            return this;
        }
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        public ListQualityWatchTasksRequestListQuery setCurrentUserOwned(Boolean currentUserOwned) {
            this.currentUserOwned = currentUserOwned;
            return this;
        }
        public Boolean getCurrentUserOwned() {
            return this.currentUserOwned;
        }

        public ListQualityWatchTasksRequestListQuery setDataSourceIdList(java.util.List<String> dataSourceIdList) {
            this.dataSourceIdList = dataSourceIdList;
            return this;
        }
        public java.util.List<String> getDataSourceIdList() {
            return this.dataSourceIdList;
        }

        public ListQualityWatchTasksRequestListQuery setDataSourceOwnerList(java.util.List<String> dataSourceOwnerList) {
            this.dataSourceOwnerList = dataSourceOwnerList;
            return this;
        }
        public java.util.List<String> getDataSourceOwnerList() {
            return this.dataSourceOwnerList;
        }

        public ListQualityWatchTasksRequestListQuery setDataSourceScopeList(java.util.List<String> dataSourceScopeList) {
            this.dataSourceScopeList = dataSourceScopeList;
            return this;
        }
        public java.util.List<String> getDataSourceScopeList() {
            return this.dataSourceScopeList;
        }

        public ListQualityWatchTasksRequestListQuery setDataSourceTypeList(java.util.List<String> dataSourceTypeList) {
            this.dataSourceTypeList = dataSourceTypeList;
            return this;
        }
        public java.util.List<String> getDataSourceTypeList() {
            return this.dataSourceTypeList;
        }

        public ListQualityWatchTasksRequestListQuery setErrorRuleStrengthList(java.util.List<String> errorRuleStrengthList) {
            this.errorRuleStrengthList = errorRuleStrengthList;
            return this;
        }
        public java.util.List<String> getErrorRuleStrengthList() {
            return this.errorRuleStrengthList;
        }

        public ListQualityWatchTasksRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListQualityWatchTasksRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListQualityWatchTasksRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityWatchTasksRequestListQuery setProjectNameList(java.util.List<String> projectNameList) {
            this.projectNameList = projectNameList;
            return this;
        }
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        public ListQualityWatchTasksRequestListQuery setQualityOwnerList(java.util.List<String> qualityOwnerList) {
            this.qualityOwnerList = qualityOwnerList;
            return this;
        }
        public java.util.List<String> getQualityOwnerList() {
            return this.qualityOwnerList;
        }

        public ListQualityWatchTasksRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListQualityWatchTasksRequestListQuery setTableOwnerList(java.util.List<String> tableOwnerList) {
            this.tableOwnerList = tableOwnerList;
            return this;
        }
        public java.util.List<String> getTableOwnerList() {
            return this.tableOwnerList;
        }

        public ListQualityWatchTasksRequestListQuery setTableTypeList(java.util.List<String> tableTypeList) {
            this.tableTypeList = tableTypeList;
            return this;
        }
        public java.util.List<String> getTableTypeList() {
            return this.tableTypeList;
        }

        public ListQualityWatchTasksRequestListQuery setWatchTypeList(java.util.List<String> watchTypeList) {
            this.watchTypeList = watchTypeList;
            return this;
        }
        public java.util.List<String> getWatchTypeList() {
            return this.watchTypeList;
        }

    }

}
