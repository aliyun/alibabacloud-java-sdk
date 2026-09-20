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
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
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
         * <p>The baseline ID. The baseline ID configured for the node as a leaf node is returned. If no baseline is configured, a workspace default value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The ID of the workflow.</p>
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
         * <p>odps_source_dev</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1727280000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1727280000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The CRON expression.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The deployment date.</p>
         * <p>The value is a 13-digit number, such as <code>1727280000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1727280000000</p>
         */
        @NameInMap("DeployDate")
        public Long deployDate;

        /**
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The DQC partitioning rule string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;test_0923001&quot;,&quot;tableName&quot;:&quot;test_table_001&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyymmdd]&quot;},{&quot;projectName&quot;:&quot;test_0923001&quot;,&quot;tableName&quot;:&quot;test_table_002&quot;,&quot;partition&quot;:&quot;NOTAPARTITIONTABLE&quot;}]</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The DQC type. A value of 0 indicates that no DQC rule is associated. A value of 1 indicates that a DQC rule is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The file ID. <warning>This field is deprecated.</warning></p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The file type. Different file types have different codes. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>The file version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <p>The modification time.</p>
         * <p>The value is a 13-digit number, such as <code>1727280000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1727280000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>sql_node</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>17366294****</p>
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
         * <p>The priority of the node. Valid values: 1, 3, 5, 7, and 8.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the associated workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The interval at which the node is rescheduled after a failure.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>The rerun mode. A value of 0 indicates that the node can be rerun only upon failure. A value of 1 indicates that the node can be rerun in all cases. A value of 2 indicates that the node cannot be rerun in any case.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatMode")
        public Integer repeatMode;

        /**
         * <p>Indicates whether the node can be rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeatability")
        public String repeatability;

        /**
         * <p>The unique identifier of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>group_123</p>
         */
        @NameInMap("ResGroupIdentifier")
        public String resGroupIdentifier;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Resource Group</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: normal scheduling node.</li>
         * <li>MANUAL: manual node that is not scheduled on a regular basis.</li>
         * <li>PAUSE: paused node.</li>
         * <li>SKIP: dry-run node that is scheduled on a regular basis but is directly set to successful when scheduling starts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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

        public GetNodeResponseBodyData setRepeatMode(Integer repeatMode) {
            this.repeatMode = repeatMode;
            return this;
        }
        public Integer getRepeatMode() {
            return this.repeatMode;
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
