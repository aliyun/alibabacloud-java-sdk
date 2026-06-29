// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>Environment identifier</p>
     * <ul>
     * <li>DEV: Development environment</li>
     * <li>PROD (default): Production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>Query Request</p>
     */
    @NameInMap("ListQuery")
    public ListInstancesRequestListQuery listQuery;

    /**
     * <p>Tenant ID</p>
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
         * <p>Business Type</p>
         * <ul>
         * <li>SCRIPT: Script Instance</li>
         * <li>LOGICAL_TABLE: Logical Table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>Business unit ID. Required when querying summary logical tables.</p>
         * 
         * <strong>example:</strong>
         * <p>6232322111</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>Workflow ID</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>End business date and time. The time format must conform to the partition format specified by the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31</p>
         */
        @NameInMap("MaxBizDate")
        public String maxBizDate;

        /**
         * <p>Maximum instance run time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31</p>
         */
        @NameInMap("MaxRunDate")
        public String maxRunDate;

        /**
         * <p>Start business date and time. The time format must conform to the partition format specified by the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("MinBizDate")
        public String minBizDate;

        /**
         * <p>Minimum instance run time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("MinRunDate")
        public String minRunDate;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>n_23131</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Node Owner</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>Page Number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>Page Size</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Priority</p>
         * <ul>
         * <li>HIGHEST</li>
         * <li>HIGH</li>
         * <li>MIDDLE</li>
         * <li>LOW</li>
         * <li>LOWEST</li>
         * </ul>
         */
        @NameInMap("PriorityList")
        public java.util.List<String> priorityList;

        /**
         * <p>Project ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131311111321</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Running status</p>
         * <ul>
         * <li>INIT: Initialized</li>
         * <li>WAIT_SUBMISSION: Waiting for Submission</li>
         * <li>WAIT_SCHEDULE: Waiting for Schedule Time</li>
         * <li>DISPATCH_BLOCKED: Throttled</li>
         * <li>WAIT_RESOURCE: Waiting for Scheduling Resources</li>
         * <li>RUNNING: Running</li>
         * <li>SUCCESS: Succeeded</li>
         * <li>FAILED: Failed</li>
         * </ul>
         */
        @NameInMap("RunStatusList")
        public java.util.List<String> runStatusList;

        /**
         * <p>Whether scheduling is paused</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        /**
         * <p>Schedule Period</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY</li>
         * </ul>
         */
        @NameInMap("SchedulePeriodList")
        public java.util.List<String> schedulePeriodList;

        /**
         * <p>Instance schedule type</p>
         * <ul>
         * <li>NORMAL (Periodic Instance)</li>
         * <li>MANUAL (Manual Instance)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>Fuzzy match by node name or exact match by node ID</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        /**
         * <p>Sub-business Type</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL</li>
         * </ul>
         */
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

        public ListInstancesRequestListQuery setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
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
