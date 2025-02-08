// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    /**
     * <p>The nodes.</p>
     */
    @NameInMap("Data")
    public ListNodesResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The interval at which the node is rerun after the node fails to run.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the node can be rerun.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The operation that you want to perform. Set the value to <strong>ListNodes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The timestamp when the node was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593879116000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The timestamp when the node was deployed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1734537600000</p>
         */
        @NameInMap("DeployDate")
        public Long deployDate;

        /**
         * <p>The priority for running the node. Valid values: 1, 3, 5, 7, and 8.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;ztjy_dim&quot;,&quot;tableName&quot;:&quot;dim_user_agent_manage_area_a&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyy-mm-dd-1]&quot;}]</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The file ID. You can call the ListFiles operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>Different file types have different codes. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks node collection</a>.
         * You can also call the <a href="https://help.aliyun.com/document_detail/212428.html">ListFileType</a> interface to query the code type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>The latest version number of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <p>The timestamp when the node was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593879116000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The types of the nodes. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The total number of nodes returned.</p>
         * 
         * <strong>example:</strong>
         * <p>liux_test_n****</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The additional parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>19337906836551</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>a=b</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The information about the nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>33671</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1231123</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>The rerun mode. The value 0 indicates that rerun can be performed only if a failure occurs. The value 1 indicates that rerun can be performed in all cases. The value 2 indicates that rerun cannot be performed in all cases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatMode")
        public Integer repeatMode;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The identifier of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>group_123</p>
         */
        @NameInMap("ResGroupIdentifier")
        public String resGroupIdentifier;

        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The types of the nodes. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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

        public ListNodesResponseBodyDataNodes setRepeatMode(Integer repeatMode) {
            this.repeatMode = repeatMode;
            return this;
        }
        public Integer getRepeatMode() {
            return this.repeatMode;
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
         * <p>The information about the nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ListNodesResponseBodyDataNodes> nodes;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The cron expression returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
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
