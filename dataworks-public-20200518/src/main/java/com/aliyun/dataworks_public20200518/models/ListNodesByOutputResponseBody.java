// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputResponseBody extends TeaModel {
    /**
     * <p>The nodes returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListNodesByOutputResponseBodyData> data;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>SDFSDFSDF-asdfDFSDF-SDFSDf-SDfSFD</p>
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

    public static ListNodesByOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByOutputResponseBody self = new ListNodesByOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesByOutputResponseBody setData(java.util.List<ListNodesByOutputResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesByOutputResponseBodyData> getData() {
        return this.data;
    }

    public ListNodesByOutputResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesByOutputResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesByOutputResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesByOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesByOutputResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodesByOutputResponseBodyDataNodeList extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1235667</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the data source.</p>
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
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;ztjy_dim&quot;,&quot;tableName&quot;:&quot;dim_user_agent_manage_area_a&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyy-mm-dd-1]&quot;}]</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>Indicates whether the node is associated with a monitoring rule in Data Quality. Valid values: 0 and 1. The value 0 indicates that the node is associated with a monitoring rule in Data Quality. The value 1 indicates that the node is not associated with a monitoring rule in Data Quality.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The node type. Valid values:</p>
         * <p>6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>125677</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
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
         * <p>19337906836551</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The scheduling parameters of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>a=b</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The priority of the node. Valid values: 1, 3, 5, 7, and 8. A greater value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The node type. This parameter is deprecated. For more information about node types, see valid values of the FileType parameter.</p>
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
         * <p>33671</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the workflow to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1235655464</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The interval at which the node is rerun after the node fails to run.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RepeatInterval")
        public Integer repeatInterval;

        /**
         * <p>Indicates whether the node can be rerun.</p>
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
         * <p>The scheduling type of the node. Valid values:</p>
         * <ul>
         * <li>NORMAL: The node is an auto triggered node. The scheduling system regularly runs the node.</li>
         * <li>MANUAL: The node is a manually triggered node. The scheduling system does not regularly run the node.</li>
         * <li>PAUSE: The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</li>
         * <li>SKIP: The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        public static ListNodesByOutputResponseBodyDataNodeList build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByOutputResponseBodyDataNodeList self = new ListNodesByOutputResponseBodyDataNodeList();
            return TeaModel.build(map, self);
        }

        public ListNodesByOutputResponseBodyDataNodeList setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListNodesByOutputResponseBodyDataNodeList setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListNodesByOutputResponseBodyDataNodeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesByOutputResponseBodyDataNodeList setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListNodesByOutputResponseBodyDataNodeList setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesByOutputResponseBodyDataNodeList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListNodesByOutputResponseBodyDataNodeList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListNodesByOutputResponseBodyDataNodeList setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNodesByOutputResponseBodyDataNodeList setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListNodesByOutputResponseBodyDataNodeList setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public ListNodesByOutputResponseBodyDataNodeList setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

    public static class ListNodesByOutputResponseBodyData extends TeaModel {
        /**
         * <p>The information about the nodes returned.</p>
         */
        @NameInMap("NodeList")
        public java.util.List<ListNodesByOutputResponseBodyDataNodeList> nodeList;

        /**
         * <p>The output name of the current node.</p>
         * 
         * <strong>example:</strong>
         * <p>test_0709_1.630003556_out</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListNodesByOutputResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByOutputResponseBodyData self = new ListNodesByOutputResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesByOutputResponseBodyData setNodeList(java.util.List<ListNodesByOutputResponseBodyDataNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<ListNodesByOutputResponseBodyDataNodeList> getNodeList() {
            return this.nodeList;
        }

        public ListNodesByOutputResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

}
