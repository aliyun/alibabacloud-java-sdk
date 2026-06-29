// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoResponseBody extends TeaModel {
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
    public GetBatchTaskInfoResponseBodyTaskInfo taskInfo;

    public static GetBatchTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskInfoResponseBody self = new GetBatchTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchTaskInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBatchTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBatchTaskInfoResponseBody setTaskInfo(GetBatchTaskInfoResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetBatchTaskInfoResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig extends TeaModel {
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
         * <p>The interval unit. Valid values:</p>
         * <ul>
         * <li>MINUTE</li>
         * <li>HOUR.</li>
         * </ul>
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

        public static GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig self = new GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetBatchTaskInfoResponseBodyTaskInfoParamList extends TeaModel {
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

        public static GetBatchTaskInfoResponseBodyTaskInfoParamList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoResponseBodyTaskInfoParamList self = new GetBatchTaskInfoResponseBodyTaskInfoParamList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoResponseBodyTaskInfoParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo extends TeaModel {
        /**
         * <p>The Spark client version name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SparkClientVersion")
        public String sparkClientVersion;

        public static GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo self = new GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo setSparkClientVersion(String sparkClientVersion) {
            this.sparkClientVersion = sparkClientVersion;
            return this;
        }
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

    }

    public static class GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod extends TeaModel {
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

        public static GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod self = new GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class GetBatchTaskInfoResponseBodyTaskInfoUpStreamList extends TeaModel {
        /**
         * <p>The dependency period.</p>
         */
        @NameInMap("DependPeriod")
        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values: ALL, FIRST, LAST, NEAR.</p>
         * 
         * <strong>example:</strong>
         * <p>LAST</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        /**
         * <p>The dependent logical table fields.</p>
         */
        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <p>The upstream dependency node type. Valid values:</p>
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
         * <p>The name of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        public static GetBatchTaskInfoResponseBodyTaskInfoUpStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoResponseBodyTaskInfoUpStreamList self = new GetBatchTaskInfoResponseBodyTaskInfoUpStreamList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setDependPeriod(GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod) {
            this.dependPeriod = dependPeriod;
            return this;
        }
        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setDependStrategy(String dependStrategy) {
            this.dependStrategy = dependStrategy;
            return this;
        }
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setSourceNodeEnabled(Boolean sourceNodeEnabled) {
            this.sourceNodeEnabled = sourceNodeEnabled;
            return this;
        }
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setSourceNodeId(String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setSourceNodeName(String sourceNodeName) {
            this.sourceNodeName = sourceNodeName;
            return this;
        }
        public String getSourceNodeName() {
            return this.sourceNodeName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setSourceNodeOutputName(String sourceNodeOutputName) {
            this.sourceNodeOutputName = sourceNodeOutputName;
            return this;
        }
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setSourceNodeUserName(String sourceNodeUserName) {
            this.sourceNodeUserName = sourceNodeUserName;
            return this;
        }
        public String getSourceNodeUserName() {
            return this.sourceNodeUserName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

    }

    public static class GetBatchTaskInfoResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The node code.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The cron expression for automatic scheduling. Refer to the Linux cron expression format.</p>
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
        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig;

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
         * <p>The user ID of the development owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("DevelopOwnerId")
        public String developOwnerId;

        /**
         * <p>The name of the development owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("DevelopOwnerName")
        public String developOwnerName;

        /**
         * <p>The node ID in the directory tree.</p>
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
         * <p>The node source, indicating the organization or application that created the node.</p>
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
         * <p>The user ID of the O&amp;M owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OpsOwnerId")
        public String opsOwnerId;

        /**
         * <p>The name of the O&amp;M owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OpsOwnerName")
        public String opsOwnerName;

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
        public java.util.List<GetBatchTaskInfoResponseBodyTaskInfoParamList> paramList;

        /**
         * <p>Indicates whether the node is paused for scheduling.</p>
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
         * <p>Indicates whether the node is published.</p>
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
        public GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo sparkClientInfo;

        /**
         * <p>The submit status. Valid values:</p>
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
         * <p>The node type. For more information, refer to the create offline compute node operation.</p>
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
        public java.util.List<GetBatchTaskInfoResponseBodyTaskInfoUpStreamList> upStreamList;

        public static GetBatchTaskInfoResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoResponseBodyTaskInfo self = new GetBatchTaskInfoResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setCustomScheduleConfig(GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig) {
            this.customScheduleConfig = customScheduleConfig;
            return this;
        }
        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setDagId(String dagId) {
            this.dagId = dagId;
            return this;
        }
        public String getDagId() {
            return this.dagId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setDevelopOwnerId(String developOwnerId) {
            this.developOwnerId = developOwnerId;
            return this;
        }
        public String getDevelopOwnerId() {
            return this.developOwnerId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setDevelopOwnerName(String developOwnerName) {
            this.developOwnerName = developOwnerName;
            return this;
        }
        public String getDevelopOwnerName() {
            return this.developOwnerName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setHasDevNode(Boolean hasDevNode) {
            this.hasDevNode = hasDevNode;
            return this;
        }
        public Boolean getHasDevNode() {
            return this.hasDevNode;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNeedPublish(Boolean needPublish) {
            this.needPublish = needPublish;
            return this;
        }
        public Boolean getNeedPublish() {
            return this.needPublish;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNodeFrom(String nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public String getNodeFrom() {
            return this.nodeFrom;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setOperatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setOpsOwnerId(String opsOwnerId) {
            this.opsOwnerId = opsOwnerId;
            return this;
        }
        public String getOpsOwnerId() {
            return this.opsOwnerId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setOpsOwnerName(String opsOwnerName) {
            this.opsOwnerName = opsOwnerName;
            return this;
        }
        public String getOpsOwnerName() {
            return this.opsOwnerName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setParamList(java.util.List<GetBatchTaskInfoResponseBodyTaskInfoParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoResponseBodyTaskInfoParamList> getParamList() {
            return this.paramList;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setPaused(Boolean paused) {
            this.paused = paused;
            return this;
        }
        public Boolean getPaused() {
            return this.paused;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setRerunable(Boolean rerunable) {
            this.rerunable = rerunable;
            return this;
        }
        public Boolean getRerunable() {
            return this.rerunable;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setSparkClientInfo(GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo sparkClientInfo) {
            this.sparkClientInfo = sparkClientInfo;
            return this;
        }
        public GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public GetBatchTaskInfoResponseBodyTaskInfo setUpStreamList(java.util.List<GetBatchTaskInfoResponseBodyTaskInfoUpStreamList> upStreamList) {
            this.upStreamList = upStreamList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoResponseBodyTaskInfoUpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

    }

}
