// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The ID of the associated workflow.</p>
     */
    @NameInMap("Data")
    public ListNodesResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The interval at which the node is rerun after the node fails to run.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the node can be rerun.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setData(ListNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNodesResponseBodyData getData() {
        return this.data;
    }

    public ListNodesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodesResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The number of the page to return. Minimum value: 1. Maximum value: 100.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The operation that you want to perform. Set the value to **ListNodes**.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("Connection")
        public String connection;

        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The name of the workflow.</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("DeployDate")
        public Long deployDate;

        /**
         * <p>The priority for running the node. Valid values: 1, 3, 5, 7, and 8.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the owner.</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The connection string.</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("FileType")
        public Integer fileType;

        @NameInMap("FileVersion")
        public Integer fileVersion;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The types of the nodes. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the type of the node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The total number of nodes returned.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The additional parameters.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The type of the node.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The ID of the owner.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The information about the nodes.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        @NameInMap("ResGroupIdentifier")
        public String resGroupIdentifier;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The types of the nodes. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the type of the node.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        public static ListNodesResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyDataNodes self = new ListNodesResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListNodesResponseBodyDataNodes setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListNodesResponseBodyDataNodes setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListNodesResponseBodyDataNodes setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNodesResponseBodyDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListNodesResponseBodyDataNodes setDeployDate(Long deployDate) {
            this.deployDate = deployDate;
            return this;
        }
        public Long getDeployDate() {
            return this.deployDate;
        }

        public ListNodesResponseBodyDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesResponseBodyDataNodes setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListNodesResponseBodyDataNodes setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListNodesResponseBodyDataNodes setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListNodesResponseBodyDataNodes setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListNodesResponseBodyDataNodes setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public ListNodesResponseBodyDataNodes setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListNodesResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodesResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesResponseBodyDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListNodesResponseBodyDataNodes setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListNodesResponseBodyDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListNodesResponseBodyDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListNodesResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListNodesResponseBodyDataNodes setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListNodesResponseBodyDataNodes setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNodesResponseBodyDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListNodesResponseBodyDataNodes setResGroupIdentifier(String resGroupIdentifier) {
            this.resGroupIdentifier = resGroupIdentifier;
            return this;
        }
        public String getResGroupIdentifier() {
            return this.resGroupIdentifier;
        }

        public ListNodesResponseBodyDataNodes setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public ListNodesResponseBodyDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

    public static class ListNodesResponseBodyData extends TeaModel {
        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL: indicates that the node is a normal auto triggered node.</p>
         * <p>*   MANUAL: indicates that the node is a manually triggered node.</p>
         * <p>*   PAUSE: indicates that the node is a paused node.</p>
         * <p>*   SKIP: indicates that the node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ListNodesResponseBodyDataNodes> nodes;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The cron expression returned.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The name of the workflow.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyData self = new ListNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyData setNodes(java.util.List<ListNodesResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListNodesResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public ListNodesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNodesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNodesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
