// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInnerNodesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Paging")
    public ListInnerNodesResponseBodyPaging paging;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The CRON expression.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The description of the inner node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the inner node.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;ztjy_dim&quot;,&quot;tableName&quot;:&quot;dim_user_agent_manage_area_a&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyy-mm-dd-1]&quot;}]</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>Indicates whether the inner node is associated with a monitoring rule in Data Quality. Valid values: 0 and 1. The value 0 indicates that the inner node is associated with a monitoring rule in Data Quality. The value 1 indicates that the inner node is not associated with a monitoring rule in Data Quality.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DqcType")
        public String dqcType;

        /**
         * <p>The inner node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the inner node.</p>
         * 
         * <strong>example:</strong>
         * <p>liux_test_n****</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1933****36551</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The additional parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>a=b</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The priority of the inner node. Valid values: 1, 3, 5, 7, and 8.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the inner node.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The interval at which the inner node is rerun after the inner node fails to run.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Indicates whether the inner node can be rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Resource Group</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The scheduling type of the inner node. Valid values:</p>
         * <ul>
         * <li>NORMAL: The inner node is an auto triggered node.</li>
         * <li>MANUAL: The inner node is a manually triggered node. The scheduling system does not run the node on a regular basis.</li>
         * <li>PAUSE: The inner node is a paused node.</li>
         * <li>SKIP: The inner node is a dry-run node. Dry-run nodes are started as scheduled, but the scheduling system sets the status of the nodes to successful when it starts to run them.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
         * <p>The list of inner nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ListInnerNodesResponseBodyPagingNodes> nodes;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of inner nodes returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
