// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    @NameInMap("ListQuery")
    public ListInstancesRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListInstancesRequest setListQuery(ListInstancesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListInstancesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListInstancesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListInstancesRequestListQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SCRIPT</p>
         */
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>2024-05-31</p>
         */
        @NameInMap("MaxBizDate")
        public String maxBizDate;

        /**
         * <strong>example:</strong>
         * <p>2024-05-31</p>
         */
        @NameInMap("MaxRunDate")
        public String maxRunDate;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("MinBizDate")
        public String minBizDate;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("MinRunDate")
        public String minRunDate;

        /**
         * <strong>example:</strong>
         * <p>n_23131</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131311111321</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RunStatusList")
        public java.util.List<String> runStatusList;

        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        @NameInMap("SubBizTypeList")
        public java.util.List<String> subBizTypeList;

        public static ListInstancesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestListQuery self = new ListInstancesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestListQuery setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListInstancesRequestListQuery setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListInstancesRequestListQuery setMaxBizDate(String maxBizDate) {
            this.maxBizDate = maxBizDate;
            return this;
        }
        public String getMaxBizDate() {
            return this.maxBizDate;
        }

        public ListInstancesRequestListQuery setMaxRunDate(String maxRunDate) {
            this.maxRunDate = maxRunDate;
            return this;
        }
        public String getMaxRunDate() {
            return this.maxRunDate;
        }

        public ListInstancesRequestListQuery setMinBizDate(String minBizDate) {
            this.minBizDate = minBizDate;
            return this;
        }
        public String getMinBizDate() {
            return this.minBizDate;
        }

        public ListInstancesRequestListQuery setMinRunDate(String minRunDate) {
            this.minRunDate = minRunDate;
            return this;
        }
        public String getMinRunDate() {
            return this.minRunDate;
        }

        public ListInstancesRequestListQuery setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListInstancesRequestListQuery setOwnerList(java.util.List<String> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        public ListInstancesRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListInstancesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesRequestListQuery setPriorityList(java.util.List<String> priorityList) {
            this.priorityList = priorityList;
            return this;
        }
        public java.util.List<String> getPriorityList() {
            return this.priorityList;
        }

        public ListInstancesRequestListQuery setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListInstancesRequestListQuery setRunStatusList(java.util.List<String> runStatusList) {
            this.runStatusList = runStatusList;
            return this;
        }
        public java.util.List<String> getRunStatusList() {
            return this.runStatusList;
        }

        public ListInstancesRequestListQuery setSchedulePaused(Boolean schedulePaused) {
            this.schedulePaused = schedulePaused;
            return this;
        }
        public Boolean getSchedulePaused() {
            return this.schedulePaused;
        }

        public ListInstancesRequestListQuery setSchedulePeriodList(java.util.List<String> schedulePeriodList) {
            this.schedulePeriodList = schedulePeriodList;
            return this;
        }
        public java.util.List<String> getSchedulePeriodList() {
            return this.schedulePeriodList;
        }

        public ListInstancesRequestListQuery setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListInstancesRequestListQuery setSearchText(String searchText) {
            this.searchText = searchText;
            return this;
        }
        public String getSearchText() {
            return this.searchText;
        }

        public ListInstancesRequestListQuery setSubBizTypeList(java.util.List<String> subBizTypeList) {
            this.subBizTypeList = subBizTypeList;
            return this;
        }
        public java.util.List<String> getSubBizTypeList() {
            return this.subBizTypeList;
        }

    }

}
