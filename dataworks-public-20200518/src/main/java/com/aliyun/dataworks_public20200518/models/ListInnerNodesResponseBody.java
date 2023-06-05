// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInnerNodesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Paging")
    public ListInnerNodesResponseBodyPaging paging;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The paging information.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInnerNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInnerNodesResponseBody self = new ListInnerNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInnerNodesResponseBody setPaging(ListInnerNodesResponseBodyPaging paging) {
        this.paging = paging;
        return this;
    }
    public ListInnerNodesResponseBodyPaging getPaging() {
        return this.paging;
    }

    public ListInnerNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInnerNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInnerNodesResponseBodyPagingNodes extends TeaModel {
        /**
         * <p>The description of the inner node.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the inner node.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The values of other parameters related to the inner node.</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The ID of the inner node.</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The name of the inner node.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The cron expression.</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The ID of the baseline with which the inner node is associated.</p>
         */
        @NameInMap("DqcType")
        public String dqcType;

        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The connection string.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Indicates whether the node is associated with Data Quality. Valid values: 0 and 1. The value 0 indicates that the node is associated with Data Quality. The value 1 indicates that the node is not associated with Data Quality.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The ID of the owner of the inner node.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The priority of the inner node. Valid values: 1, 3, 5, 7, and 8.</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The type of the inner node.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Indicates whether the inner node can be rerun.</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The interval at which the inner node is rerun after the inner node fails to be run.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        public static ListInnerNodesResponseBodyPagingNodes build(java.util.Map<String, ?> map) throws Exception {
            ListInnerNodesResponseBodyPagingNodes self = new ListInnerNodesResponseBodyPagingNodes();
            return TeaModel.build(map, self);
        }

        public ListInnerNodesResponseBodyPagingNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListInnerNodesResponseBodyPagingNodes setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListInnerNodesResponseBodyPagingNodes setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListInnerNodesResponseBodyPagingNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListInnerNodesResponseBodyPagingNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInnerNodesResponseBodyPagingNodes setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListInnerNodesResponseBodyPagingNodes setDqcType(String dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public String getDqcType() {
            return this.dqcType;
        }

        public ListInnerNodesResponseBodyPagingNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListInnerNodesResponseBodyPagingNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListInnerNodesResponseBodyPagingNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListInnerNodesResponseBodyPagingNodes setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListInnerNodesResponseBodyPagingNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListInnerNodesResponseBodyPagingNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListInnerNodesResponseBodyPagingNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListInnerNodesResponseBodyPagingNodes setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListInnerNodesResponseBodyPagingNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListInnerNodesResponseBodyPagingNodes setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public ListInnerNodesResponseBodyPagingNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

    public static class ListInnerNodesResponseBodyPaging extends TeaModel {
        /**
         * <p>The scheduling type of the inner node. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The inner node is an auto triggered node.</p>
         * <p>*   MANUAL: The inner node is a manually triggered node. Manually triggered nodes cannot be automatically triggered.</p>
         * <p>*   PAUSE: The inner node is a paused node.</p>
         * <p>*   SKIP: The inner node is a dry-run node. Dry-run nodes are started as scheduled but the scheduling system sets the status of the nodes to succeeded when the scheduling system starts to run the nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ListInnerNodesResponseBodyPagingNodes> nodes;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of inner nodes returned.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of inner nodes.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInnerNodesResponseBodyPaging build(java.util.Map<String, ?> map) throws Exception {
            ListInnerNodesResponseBodyPaging self = new ListInnerNodesResponseBodyPaging();
            return TeaModel.build(map, self);
        }

        public ListInnerNodesResponseBodyPaging setNodes(java.util.List<ListInnerNodesResponseBodyPagingNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListInnerNodesResponseBodyPagingNodes> getNodes() {
            return this.nodes;
        }

        public ListInnerNodesResponseBodyPaging setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInnerNodesResponseBodyPaging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInnerNodesResponseBodyPaging setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
