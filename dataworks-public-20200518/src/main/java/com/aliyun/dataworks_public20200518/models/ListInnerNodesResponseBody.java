// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInnerNodesResponseBody extends TeaModel {
    @NameInMap("Paging")
    public ListInnerNodesResponseBodyPaging paging;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BusinessId")
        public Long businessId;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("Description")
        public String description;

        @NameInMap("DqcDescription")
        public String dqcDescription;

        @NameInMap("DqcType")
        public String dqcType;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProgramType")
        public String programType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        @NameInMap("Repeatability")
        public Boolean repeatability;

        @NameInMap("ResGroupName")
        public String resGroupName;

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
        @NameInMap("Nodes")
        public java.util.List<ListInnerNodesResponseBodyPagingNodes> nodes;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
