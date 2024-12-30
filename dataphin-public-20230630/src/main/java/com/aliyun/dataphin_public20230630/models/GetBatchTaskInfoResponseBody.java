// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoResponseBody extends TeaModel {
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
        @NameInMap("DependPeriod")
        public GetBatchTaskInfoResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod;

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
        public GetBatchTaskInfoResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig;

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
        public java.util.List<GetBatchTaskInfoResponseBodyTaskInfoParamList> paramList;

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
        public GetBatchTaskInfoResponseBodyTaskInfoSparkClientInfo sparkClientInfo;

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
