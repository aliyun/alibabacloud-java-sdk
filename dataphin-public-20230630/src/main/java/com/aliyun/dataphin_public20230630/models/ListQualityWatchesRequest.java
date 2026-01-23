// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchesRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListQualityWatchesRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListQualityWatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityWatchesRequest self = new ListQualityWatchesRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityWatchesRequest setListQuery(ListQualityWatchesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListQualityWatchesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListQualityWatchesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListQualityWatchesRequestListQuery extends TeaModel {
        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        @NameInMap("DataSourceIdList")
        public java.util.List<Long> dataSourceIdList;

        @NameInMap("DataSourceOwnerList")
        public java.util.List<String> dataSourceOwnerList;

        @NameInMap("DataSourceScopeList")
        public java.util.List<String> dataSourceScopeList;

        @NameInMap("DataSourceTypeList")
        public java.util.List<String> dataSourceTypeList;

        @NameInMap("IndexComputeTypeList")
        public java.util.List<String> indexComputeTypeList;

        @NameInMap("IndexOwnerList")
        public java.util.List<String> indexOwnerList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("LatestWatchTaskStatusList")
        public java.util.List<String> latestWatchTaskStatusList;

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

        public static ListQualityWatchesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListQualityWatchesRequestListQuery self = new ListQualityWatchesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListQualityWatchesRequestListQuery setBizUnitNameList(java.util.List<String> bizUnitNameList) {
            this.bizUnitNameList = bizUnitNameList;
            return this;
        }
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        public ListQualityWatchesRequestListQuery setCurrentUserOwned(Boolean currentUserOwned) {
            this.currentUserOwned = currentUserOwned;
            return this;
        }
        public Boolean getCurrentUserOwned() {
            return this.currentUserOwned;
        }

        public ListQualityWatchesRequestListQuery setDataSourceIdList(java.util.List<Long> dataSourceIdList) {
            this.dataSourceIdList = dataSourceIdList;
            return this;
        }
        public java.util.List<Long> getDataSourceIdList() {
            return this.dataSourceIdList;
        }

        public ListQualityWatchesRequestListQuery setDataSourceOwnerList(java.util.List<String> dataSourceOwnerList) {
            this.dataSourceOwnerList = dataSourceOwnerList;
            return this;
        }
        public java.util.List<String> getDataSourceOwnerList() {
            return this.dataSourceOwnerList;
        }

        public ListQualityWatchesRequestListQuery setDataSourceScopeList(java.util.List<String> dataSourceScopeList) {
            this.dataSourceScopeList = dataSourceScopeList;
            return this;
        }
        public java.util.List<String> getDataSourceScopeList() {
            return this.dataSourceScopeList;
        }

        public ListQualityWatchesRequestListQuery setDataSourceTypeList(java.util.List<String> dataSourceTypeList) {
            this.dataSourceTypeList = dataSourceTypeList;
            return this;
        }
        public java.util.List<String> getDataSourceTypeList() {
            return this.dataSourceTypeList;
        }

        public ListQualityWatchesRequestListQuery setIndexComputeTypeList(java.util.List<String> indexComputeTypeList) {
            this.indexComputeTypeList = indexComputeTypeList;
            return this;
        }
        public java.util.List<String> getIndexComputeTypeList() {
            return this.indexComputeTypeList;
        }

        public ListQualityWatchesRequestListQuery setIndexOwnerList(java.util.List<String> indexOwnerList) {
            this.indexOwnerList = indexOwnerList;
            return this;
        }
        public java.util.List<String> getIndexOwnerList() {
            return this.indexOwnerList;
        }

        public ListQualityWatchesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListQualityWatchesRequestListQuery setLatestWatchTaskStatusList(java.util.List<String> latestWatchTaskStatusList) {
            this.latestWatchTaskStatusList = latestWatchTaskStatusList;
            return this;
        }
        public java.util.List<String> getLatestWatchTaskStatusList() {
            return this.latestWatchTaskStatusList;
        }

        public ListQualityWatchesRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListQualityWatchesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListQualityWatchesRequestListQuery setProjectNameList(java.util.List<String> projectNameList) {
            this.projectNameList = projectNameList;
            return this;
        }
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        public ListQualityWatchesRequestListQuery setQualityOwnerList(java.util.List<String> qualityOwnerList) {
            this.qualityOwnerList = qualityOwnerList;
            return this;
        }
        public java.util.List<String> getQualityOwnerList() {
            return this.qualityOwnerList;
        }

        public ListQualityWatchesRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListQualityWatchesRequestListQuery setTableOwnerList(java.util.List<String> tableOwnerList) {
            this.tableOwnerList = tableOwnerList;
            return this;
        }
        public java.util.List<String> getTableOwnerList() {
            return this.tableOwnerList;
        }

        public ListQualityWatchesRequestListQuery setTableTypeList(java.util.List<String> tableTypeList) {
            this.tableTypeList = tableTypeList;
            return this;
        }
        public java.util.List<String> getTableTypeList() {
            return this.tableTypeList;
        }

        public ListQualityWatchesRequestListQuery setWatchTypeList(java.util.List<String> watchTypeList) {
            this.watchTypeList = watchTypeList;
            return this;
        }
        public java.util.List<String> getWatchTypeList() {
            return this.watchTypeList;
        }

    }

}
