// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchesRequest extends TeaModel {
    /**
     * <p>The paging query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListQualityWatchesRequestListQuery listQuery;

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
     * <p>The ID of the operating user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public ListQualityWatchesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListQualityWatchesRequestListQuery extends TeaModel {
        /**
         * <p>The name of the business unit.</p>
         */
        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        /**
         * <p>Specifies whether the monitoring object is owned by the current user.</p>
         */
        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        /**
         * <p>The data source ID.</p>
         */
        @NameInMap("DataSourceIdList")
        public java.util.List<Long> dataSourceIdList;

        /**
         * <p>The data source owner.</p>
         */
        @NameInMap("DataSourceOwnerList")
        public java.util.List<String> dataSourceOwnerList;

        /**
         * <p>The data source scope. Valid values: STREAMING (real-time only), OFFLINE (offline only), and ALL (real-time and offline).</p>
         */
        @NameInMap("DataSourceScopeList")
        public java.util.List<String> dataSourceScopeList;

        /**
         * <p>The data source type, such as MAX_COMPUTE, HADOOP, or MYSQL.</p>
         */
        @NameInMap("DataSourceTypeList")
        public java.util.List<String> dataSourceTypeList;

        /**
         * <p>The metric compute type. Valid values: AUTO (automated coding), CUSTOM (expert coding), MOUNT (external table registration), and COMBINE (specific to derived metrics).</p>
         */
        @NameInMap("IndexComputeTypeList")
        public java.util.List<String> indexComputeTypeList;

        /**
         * <p>The metric owner.</p>
         */
        @NameInMap("IndexOwnerList")
        public java.util.List<String> indexOwnerList;

        /**
         * <p>The search keyword, which is the name of the monitored table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The task status. Valid values: NOT_RUN (not run), WAITING (waiting), RUNNING (running), SUCCESS (successful), FAILED (failed), CANCEL (canceled), TIMEOUT (timed out), and OFFLINE (offline).</p>
         */
        @NameInMap("LatestWatchTaskStatusList")
        public java.util.List<String> latestWatchTaskStatusList;

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
         * <p>The name of the project.</p>
         */
        @NameInMap("ProjectNameList")
        public java.util.List<String> projectNameList;

        /**
         * <p>The quality owner.</p>
         */
        @NameInMap("QualityOwnerList")
        public java.util.List<String> qualityOwnerList;

        /**
         * <p>The effective status of the monitoring object. Valid values: ENABLE (enabled) and DISABLE (disabled).</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The table owner.</p>
         */
        @NameInMap("TableOwnerList")
        public java.util.List<String> tableOwnerList;

        /**
         * <p>The table type. Valid values: LOGIC_DIM_TABLE (logical dimension table), LOGIC_FACT_TABLE (logical fact table), LOGIC_SUM_TABLE (logical aggregate table), LOGIC_LABEL_TABLE (logical label table), PHYSICAL_TABLE (physical table), and REALTIME_LOGICAL_TABLE (real-time metadata table).</p>
         */
        @NameInMap("TableTypeList")
        public java.util.List<String> tableTypeList;

        /**
         * <p>The monitoring object type. Valid values: TABLE (Dataphin table), DATASOURCE_TABLE (global table), DATASOURCE (data source), INDEX (metric), and REALTIME_LOGICAL_TABLE (real-time metadata table).</p>
         */
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
