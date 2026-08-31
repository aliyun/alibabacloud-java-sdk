// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: Development environment. </li>
     * <li>PROD (default): Production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The query request.</p>
     */
    @NameInMap("ListQuery")
    public ListInstancesRequestListQuery listQuery;

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
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public ListInstancesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListInstancesRequestListQuery extends TeaModel {
        /**
         * <p>The business type. Valid values:</p>
         * <ul>
         * <li>SCRIPT: Script instance.</li>
         * <li>LOGICAL_TABLE: Logical table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The business unit ID. Required when querying aggregate logical tables.</p>
         * 
         * <strong>example:</strong>
         * <p>6232322111</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The end business date and time. The time format must match the partition format specified by the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31</p>
         */
        @NameInMap("MaxBizDate")
        public String maxBizDate;

        /**
         * <p>The maximum instance run time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31</p>
         */
        @NameInMap("MaxRunDate")
        public String maxRunDate;

        /**
         * <p>The start business date and time. The time format must match the partition format specified by the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("MinBizDate")
        public String minBizDate;

        /**
         * <p>The minimum instance run time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30</p>
         */
        @NameInMap("MinRunDate")
        public String minRunDate;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_23131</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node owners.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The priority. Valid values:</p>
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
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>131311111321</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The run status. Valid values:</p>
         * <ul>
         * <li>INIT: Init.</li>
         * <li>WAIT_SUBMISSION: Waiting for submission.</li>
         * <li>WAIT_SCHEDULE: Waiting for schedule time.</li>
         * <li>DISPATCH_BLOCKED: Throttled.</li>
         * <li>WAIT_RESOURCE: Waiting for schedule resource.</li>
         * <li>RUNNING: Running.</li>
         * <li>SUCCESS: Succeeded.</li>
         * <li>FAILED: Failed.</li>
         * </ul>
         */
        @NameInMap("RunStatusList")
        public java.util.List<String> runStatusList;

        /**
         * <p>Specifies whether scheduling is paused.</p>
         */
        @NameInMap("SchedulePaused")
        public Boolean schedulePaused;

        /**
         * <p>The scheduling period. Valid values:</p>
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
         * <p>The instance scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: Periodic instance.</li>
         * <li>MANUAL: Manual instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>Fuzzy match by node name or exact match by node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchText")
        public String searchText;

        /**
         * <p>The sub-business type. Valid values:</p>
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

        /**
         * <p>The node tag filter list. Each element is a numeric string of a node tag ID (such as &quot;123&quot;). Filters the instance list by node tags. If not specified or empty, no filtering is applied and all instances are returned. Multiple tags use OR logic. Invalid elements (non-numeric or overflow) are ignored.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

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

        public ListInstancesRequestListQuery setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

    }

}
