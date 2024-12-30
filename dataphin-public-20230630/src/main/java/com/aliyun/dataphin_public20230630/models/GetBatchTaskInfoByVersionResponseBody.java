// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoByVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
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
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
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
        @NameInMap("DependPeriod")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod;

        /**
         * <strong>example:</strong>
         * <p>LAST</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        @NameInMap("SourceNodeEnabled")
        public Boolean sourceNodeEnabled;

        /**
         * <strong>example:</strong>
         * <p>n_2001</p>
         */
        @NameInMap("SourceNodeId")
        public String sourceNodeId;

        /**
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeName")
        public String sourceNodeName;

        /**
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("SourceNodeUserName")
        public String sourceNodeUserName;

        /**
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
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("CustomScheduleConfig")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig;

        /**
         * <strong>example:</strong>
         * <p>dag_102121211</p>
         */
        @NameInMap("DagId")
        public String dagId;

        /**
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("HasDevNode")
        public Boolean hasDevNode;

        /**
         * <strong>example:</strong>
         * <p>测试任务1</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NeedPublish")
        public Boolean needPublish;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <strong>example:</strong>
         * <p>openapi</p>
         */
        @NameInMap("NodeFrom")
        public String nodeFrom;

        /**
         * <strong>example:</strong>
         * <p>n_1011_21232132322</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>测试任务1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OperatorUserId")
        public String operatorUserId;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("ParamList")
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> paramList;

        @NameInMap("Paused")
        public Boolean paused;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Published")
        public Boolean published;

        /**
         * <strong>example:</strong>
         * <p>test xx</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("Rerunable")
        public Boolean rerunable;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        @NameInMap("SparkClientInfo")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo sparkClientInfo;

        /**
         * <strong>example:</strong>
         * <p>测试任务1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

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
