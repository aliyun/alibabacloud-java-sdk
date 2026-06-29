// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoByVersionResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The node details.</p>
     */
    @NameInMap("TaskInfo")
    public GetBatchTaskInfoByVersionResponseBodyTaskInfo taskInfo;

    public static GetBatchTaskInfoByVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskInfoByVersionResponseBody self = new GetBatchTaskInfoByVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskInfoByVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchTaskInfoByVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBatchTaskInfoByVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTaskInfoByVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTaskInfoByVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBatchTaskInfoByVersionResponseBody setTaskInfo(GetBatchTaskInfoByVersionResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetBatchTaskInfoByVersionResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig extends TeaModel {
        /**
         * <p>The end time in the format of HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The custom interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The interval unit. Valid values: MINUTE, HOUR.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>The scheduling period.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The start time in the format of HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo extends TeaModel {
        /**
         * <p>The Spark client version.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SparkClientVersion")
        public String sparkClientVersion;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo setSparkClientVersion(String sparkClientVersion) {
            this.sparkClientVersion = sparkClientVersion;
            return this;
        }
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod extends TeaModel {
        /**
         * <p>The period offset. This parameter is required when PeriodType is set to LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>The dependency period type. Valid values:</p>
         * <ul>
         * <li>CURRENT_PERIOD</li>
         * <li>LAST_PERIOD</li>
         * <li>LAST_N_PERIOD</li>
         * <li>LAST_24_HOUR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_PERIOD</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList extends TeaModel {
        /**
         * <p>The dependency period.</p>
         */
        @NameInMap("DependPeriod")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values: ALL, FIRST, LAST, NEAR.</p>
         * 
         * <strong>example:</strong>
         * <p>LAST</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        /**
         * <p>The fields of the dependent logical table.</p>
         */
        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <p>The type of the upstream dependency node. Valid values:</p>
         * <ul>
         * <li>PHYSICAL: physical node.</li>
         * <li>LOGICAL: logical table dependency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The period difference. A value of 0 indicates a same-period dependency. A positive number indicates a dependency on the previous N periods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        /**
         * <p>Indicates whether the upstream node is enabled.</p>
         */
        @NameInMap("SourceNodeEnabled")
        public Boolean sourceNodeEnabled;

        /**
         * <p>The upstream node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_2001</p>
         */
        @NameInMap("SourceNodeId")
        public String sourceNodeId;

        /**
         * <p>The upstream node name.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeName")
        public String sourceNodeName;

        /**
         * <p>The output name of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
         * <p>The username of the upstream node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("SourceNodeUserName")
        public String sourceNodeUserName;

        /**
         * <p>The input table name.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setDependPeriod(GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod) {
            this.dependPeriod = dependPeriod;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setDependStrategy(String dependStrategy) {
            this.dependStrategy = dependStrategy;
            return this;
        }
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeEnabled(Boolean sourceNodeEnabled) {
            this.sourceNodeEnabled = sourceNodeEnabled;
            return this;
        }
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeId(String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeName(String sourceNodeName) {
            this.sourceNodeName = sourceNodeName;
            return this;
        }
        public String getSourceNodeName() {
            return this.sourceNodeName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeOutputName(String sourceNodeOutputName) {
            this.sourceNodeOutputName = sourceNodeOutputName;
            return this;
        }
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeUserName(String sourceNodeUserName) {
            this.sourceNodeUserName = sourceNodeUserName;
            return this;
        }
        public String getSourceNodeUserName() {
            return this.sourceNodeUserName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The node code.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The cron expression for automatic scheduling. For more information, refer to the Linux cron expression syntax.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The custom scheduling interval configuration.</p>
         */
        @NameInMap("CustomScheduleConfig")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig;

        /**
         * <p>The ID of the DAG to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dag_102121211</p>
         */
        @NameInMap("DagId")
        public String dagId;

        /**
         * <p>The catalog for database SQL nodes. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The data source ID for database SQL nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The schema for database SQL nodes. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>The node ID in the node directory tree.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>Indicates whether the node has a development environment node.</p>
         */
        @NameInMap("HasDevNode")
        public Boolean hasDevNode;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试任务1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the node needs to be published.</p>
         */
        @NameInMap("NeedPublish")
        public Boolean needPublish;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The source of the node, indicating the organization or application that created the node.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi</p>
         */
        @NameInMap("NodeFrom")
        public String nodeFrom;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_1011_21232132322</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试任务1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The list of node output names.</p>
         */
        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li>1: Normal.</li>
         * <li>2: Paused.</li>
         * <li>3: Dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <p>The user ID of the current operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OperatorUserId")
        public String operatorUserId;

        /**
         * <p>The name of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The user ID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The list of custom node parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> paramList;

        /**
         * <p>Indicates whether the node scheduling is paused.</p>
         */
        @NameInMap("Paused")
        public Boolean paused;

        /**
         * <p>The scheduling priority of the node. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Indicates whether the node has been published.</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test xx</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Indicates whether the node can be rerun.</p>
         */
        @NameInMap("Rerunable")
        public Boolean rerunable;

        /**
         * <p>The scheduling period. Valid values:</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>1: periodic node.</li>
         * <li>3: manual node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <p>The Spark client information.</p>
         */
        @NameInMap("SparkClientInfo")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo sparkClientInfo;

        /**
         * <p>The publish status. Valid values:</p>
         * <ul>
         * <li>0: draft.</li>
         * <li>1: submitted.</li>
         * <li>100: in development.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>测试任务1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The node type. For more information, see the API operation for creating a batch task.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        /**
         * <p>The upstream dependencies.</p>
         */
        @NameInMap("UpStreamList")
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList> upStreamList;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfo self = new GetBatchTaskInfoByVersionResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCustomScheduleConfig(GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig) {
            this.customScheduleConfig = customScheduleConfig;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDagId(String dagId) {
            this.dagId = dagId;
            return this;
        }
        public String getDagId() {
            return this.dagId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setHasDevNode(Boolean hasDevNode) {
            this.hasDevNode = hasDevNode;
            return this;
        }
        public Boolean getHasDevNode() {
            return this.hasDevNode;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNeedPublish(Boolean needPublish) {
            this.needPublish = needPublish;
            return this;
        }
        public Boolean getNeedPublish() {
            return this.needPublish;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeFrom(String nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public String getNodeFrom() {
            return this.nodeFrom;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOperatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setParamList(java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> getParamList() {
            return this.paramList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPaused(Boolean paused) {
            this.paused = paused;
            return this;
        }
        public Boolean getPaused() {
            return this.paused;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setRerunable(Boolean rerunable) {
            this.rerunable = rerunable;
            return this;
        }
        public Boolean getRerunable() {
            return this.rerunable;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSparkClientInfo(GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo sparkClientInfo) {
            this.sparkClientInfo = sparkClientInfo;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setUpStreamList(java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList> upStreamList) {
            this.upStreamList = upStreamList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

    }

}
