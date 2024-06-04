// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeResponseBody extends TeaModel {
    /**
     * <p>The details of the node.</p>
     */
    @NameInMap("Data")
    public GetNodeResponseBodyData data;

    /**
     * <p>The ID of the node. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the node ID.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The connection string.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The operation that you want to perform. Set the value to **GetNode**.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Other parameters.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the workflow.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponseBody self = new GetNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeResponseBody setData(GetNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeResponseBodyData getData() {
        return this.data;
    }

    public GetNodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeResponseBodyData extends TeaModel {
        /**
         * <p>The description of the node.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The operation that you want to perform. Set the value to **GetNode**.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
         */
        @NameInMap("Connection")
        public String connection;

        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("DeployDate")
        public Long deployDate;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the node. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the node ID.</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The error message returned.</p>
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
         * <p>The HTTP status code returned.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The node is an auto triggered node.</p>
         * <p>*   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered.</p>
         * <p>*   PAUSE: The node is a paused node.</p>
         * <p>*   SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The CRON expression returned.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The HTTP status code returned.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the owner of the node.</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>Indicates whether the node can be rerun.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Indicates whether the node is associated with Data Quality. Valid values: 0 and 1. A value of 0 indicates that the node is associated with Data Quality. A value of 1 indicates that the node is not associated with Data Quality.</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The ID of the workflow to which the node belongs.</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>The type of the node.</p>
         */
        @NameInMap("Repeatability")
        public String repeatability;

        @NameInMap("ResGroupIdentifier")
        public String resGroupIdentifier;

        /**
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        public static GetNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyData self = new GetNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeResponseBodyData setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetNodeResponseBodyData setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public GetNodeResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNodeResponseBodyData setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeResponseBodyData setDeployDate(Long deployDate) {
            this.deployDate = deployDate;
            return this;
        }
        public Long getDeployDate() {
            return this.deployDate;
        }

        public GetNodeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNodeResponseBodyData setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public GetNodeResponseBodyData setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public GetNodeResponseBodyData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetNodeResponseBodyData setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetNodeResponseBodyData setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public GetNodeResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetNodeResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeResponseBodyData setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetNodeResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeResponseBodyData setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeResponseBodyData setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public GetNodeResponseBodyData setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public GetNodeResponseBodyData setRepeatability(String repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public String getRepeatability() {
            return this.repeatability;
        }

        public GetNodeResponseBodyData setResGroupIdentifier(String resGroupIdentifier) {
            this.resGroupIdentifier = resGroupIdentifier;
            return this;
        }
        public String getResGroupIdentifier() {
            return this.resGroupIdentifier;
        }

        public GetNodeResponseBodyData setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public GetNodeResponseBodyData setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

}
