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
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
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
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The cron expression.</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The description of the node.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>Indicates whether the node is associated with Data Quality. Valid values: 0 and 1. The value 0 indicates that node is associated with Data Quality, and the value 1 indicates that the node is not associated with Data Quality.</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The type of the node.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>6 (Shell node), 10 (ODPS SQL node), 11 (ODPS MR node), 23 (Data Integration node), 24 (ODPS Script node), 99 (zero-load node), 221 (PyODPS 2 node), 225 (ODPS Spark node), 227 (EMR Hive node), 228 (EMR Spark node), 229 (EMR Spark SQL node), 230 (EMR MR node), 239 (OSS object inspection node), 257 (EMR Shell node), 258 (EMR Spark Shell node), 259 (EMR Presto node), 260 (EMR Impala node), 900 (real-time synchronization node), 1089 (cross-tenant collaboration node), 1091 (Hologres development node), 1093 (Hologres SQL node), 1100 (assignment node), and 1221 (PyODPS 3 node).</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the node owner.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The values of the scheduling parameters configured for the node.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The priority of the node. Valid values: 1, 3, 5, 7, and 8. A large value indicates a high priority. Default value: 1.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the node. This parameter is deprecated. For more information about node types, see the valid values of FileType.</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the associated workflow.</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The interval at which the node is rerun after the node fails to run.</p>
         */
        @NameInMap("RepeatInterval")
        public Integer repeatInterval;

        /**
         * <p>Indicates whether the node can be rerun.</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("ResGroupName")
        public String resGroupName;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORAMAL: The node is an auto triggered node. The node is scheduled on a regular basis.</p>
         * <p>*   MANUAL: The node is a manually triggered node. The node is not scheduled on a regular basis.</p>
         * <p>*   PAUSE: The node is a frozen node. The system schedules the node on a regular basis but sets it to FAILURE when the system starts to schedule it.</p>
         * <p>*   SKIP: The node is a dry-run node. The system schedules the node on a regular basis but sets it to SUCCESS when the system starts to schedule it.</p>
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
         * <p>The information of the nodes returned.</p>
         */
        @NameInMap("NodeList")
        public java.util.List<ListNodesByOutputResponseBodyDataNodeList> nodeList;

        /**
         * <p>The output name of the current node.</p>
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
