// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityWatchTasksRequest extends TeaModel {
    /**
     * <p>The paged query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListQualityWatchTasksRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
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
         * <p>The business date filter.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The business unit names.</p>
         */
        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        /**
         * <p>Specifies whether to query only the quality monitoring node objects owned by the current user.</p>
         */
        @NameInMap("CurrentUserOwned")
        public Boolean currentUserOwned;

        /**
         * <p>The data source IDs.</p>
         */
        @NameInMap("DataSourceIdList")
        public java.util.List<String> dataSourceIdList;

        /**
         * <p>The data source owners.</p>
         */
        @NameInMap("DataSourceOwnerList")
        public java.util.List<String> dataSourceOwnerList;

        /**
         * <p>The data source scopes. Valid values:</p>
         * <ul>
         * <li>STREAMING: real-time only.</li>
         * <li>OFFLINE: offline only.</li>
         * <li>ALL: real-time and offline.</li>
         * </ul>
         */
        @NameInMap("DataSourceScopeList")
        public java.util.List<String> dataSourceScopeList;

        /**
         * <p>The data source types, such as MAX_COMPUTE, HADOOP, and MYSQL.</p>
         */
        @NameInMap("DataSourceTypeList")
        public java.util.List<String> dataSourceTypeList;

        /**
         * <p>The rule exception types. Valid values:</p>
         * <ul>
         * <li>STRONG: strong.</li>
         * <li>WEAK: weak.</li>
         * </ul>
         */
        @NameInMap("ErrorRuleStrengthList")
        public java.util.List<String> errorRuleStrengthList;

        /**
         * <p>The search keyword, which is the name of the monitored table.</p>
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
         * <p>The task statuses. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: not executed.</li>
         * <li>WAITING: waiting.</li>
         * <li>RUNNING: running.</li>
         * <li>SUCCESS: succeeded.</li>
         * <li>FAILED: failed.</li>
         * <li>CANCEL: canceled.</li>
         * <li>TIMEOUT: timed out.</li>
         * <li>OFFLINE: offline.</li>
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
         * <p>The table types. Valid values:</p>
         * <ul>
         * <li>LOGIC_DIM_TABLE: logical dimension table.</li>
         * <li>LOGIC_FACT_TABLE: logical fact table.</li>
         * <li>LOGIC_SUM_TABLE: logical aggregate table.</li>
         * <li>LOGIC_LABEL_TABLE: logical label table.</li>
         * <li>PHYSICAL_TABLE: physical table.</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         */
        @NameInMap("TableTypeList")
        public java.util.List<String> tableTypeList;

        /**
         * <p>The monitored object types. Valid values:</p>
         * <ul>
         * <li>TABLE: Dataphin table.</li>
         * <li>DATASOURCE_TABLE: global table.</li>
         * <li>DATASOURCE: data source.</li>
         * <li>INDEX: metric.</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table.</li>
         * </ul>
         */
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
