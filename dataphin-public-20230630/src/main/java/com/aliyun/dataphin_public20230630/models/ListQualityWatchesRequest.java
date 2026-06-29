// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchesRequest extends TeaModel {
    /**
     * <p>The paged query conditions.</p>
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
        /**
         * <p>The business unit names.</p>
         */
        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        /**
         * <p>Specifies whether to query only monitored objects owned by the current user.</p>
         */
        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        /**
         * <p>The data source IDs.</p>
         */
        @NameInMap("DataSourceIdList")
        public java.util.List<Long> dataSourceIdList;

        /**
         * <p>The data source owners.</p>
         */
        @NameInMap("DataSourceOwnerList")
        public java.util.List<String> dataSourceOwnerList;

        /**
         * <p>The data source scope. Valid values:</p>
         * <ul>
         * <li>STREAMING: real-time only</li>
         * <li>OFFLINE: offline only</li>
         * <li>ALL: real-time and offline.</li>
         * </ul>
         */
        @NameInMap("DataSourceScopeList")
        public java.util.List<String> dataSourceScopeList;

        /**
         * <p>The data source type, such as MAX_COMPUTE, HADOOP, or MYSQL.</p>
         */
        @NameInMap("DataSourceTypeList")
        public java.util.List<String> dataSourceTypeList;

        /**
         * <p>The metric computation type. Valid values:</p>
         * <ul>
         * <li>AUTO: automated coding</li>
         * <li>CUSTOM: expert coding</li>
         * <li>MOUNT: external table registration</li>
         * <li>COMBINE: derived metric specific.</li>
         * </ul>
         */
        @NameInMap("IndexComputeTypeList")
        public java.util.List<String> indexComputeTypeList;

        /**
         * <p>The metric owners.</p>
         */
        @NameInMap("IndexOwnerList")
        public java.util.List<String> indexOwnerList;

        /**
         * <p>The search keyword. This is the name of the monitored table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: not executed</li>
         * <li>WAITING: waiting</li>
         * <li>RUNNING: executing</li>
         * <li>SUCCESS: executed successfully</li>
         * <li>FAILED: execution failed</li>
         * <li>CANCEL: canceled</li>
         * <li>TIMEOUT: timed out</li>
         * <li>OFFLINE: offline.</li>
         * </ul>
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
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The project names.</p>
         */
        @NameInMap("ProjectNameList")
        public java.util.List<String> projectNameList;

        /**
         * <p>The quality owners.</p>
         */
        @NameInMap("QualityOwnerList")
        public java.util.List<String> qualityOwnerList;

        /**
         * <p>The status of the monitored object. Valid values:</p>
         * <ul>
         * <li>ENABLE: enabled</li>
         * <li>DISABLE: disabled.</li>
         * </ul>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The table owners.</p>
         */
        @NameInMap("TableOwnerList")
        public java.util.List<String> tableOwnerList;

        /**
         * <p>The table type. Valid values:</p>
         * <ul>
         * <li>LOGIC_DIM_TABLE: logical dimension table</li>
         * <li>LOGIC_FACT_TABLE: logical fact table</li>
         * <li>LOGIC_SUM_TABLE: logical aggregate table</li>
         * <li>LOGIC_LABEL_TABLE: logical label table</li>
         * <li>PHYSICAL_TABLE: physical table</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         */
        @NameInMap("TableTypeList")
        public java.util.List<String> tableTypeList;

        /**
         * <p>The monitored object type. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table</li>
         * <li>DATASOURCE_TABLE: full-domain table</li>
         * <li>DATASOURCE: data source</li>
         * <li>INDEX: metric</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
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
