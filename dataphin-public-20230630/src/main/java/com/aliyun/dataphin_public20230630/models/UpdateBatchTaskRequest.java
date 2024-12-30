// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateBatchTaskRequestUpdateCommand updateCommand;

    public static UpdateBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTaskRequest self = new UpdateBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBatchTaskRequest setUpdateCommand(UpdateBatchTaskRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBatchTaskRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig self = new UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandParamList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateBatchTaskRequestUpdateCommandParamList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandParamList self = new UpdateBatchTaskRequestUpdateCommandParamList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateBatchTaskRequestUpdateCommandParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandSparkClientInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SparkClientVersion")
        public String sparkClientVersion;

        public static UpdateBatchTaskRequestUpdateCommandSparkClientInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandSparkClientInfo self = new UpdateBatchTaskRequestUpdateCommandSparkClientInfo();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandSparkClientInfo setSparkClientVersion(String sparkClientVersion) {
            this.sparkClientVersion = sparkClientVersion;
            return this;
        }
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_PERIOD</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod self = new UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandUpStreamList extends TeaModel {
        @NameInMap("DependPeriod")
        public UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod dependPeriod;

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
         * <p>This parameter is required.</p>
         * 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        public static UpdateBatchTaskRequestUpdateCommandUpStreamList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandUpStreamList self = new UpdateBatchTaskRequestUpdateCommandUpStreamList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setDependPeriod(UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod dependPeriod) {
            this.dependPeriod = dependPeriod;
            return this;
        }
        public UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setDependStrategy(String dependStrategy) {
            this.dependStrategy = dependStrategy;
            return this;
        }
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setSourceNodeEnabled(Boolean sourceNodeEnabled) {
            this.sourceNodeEnabled = sourceNodeEnabled;
            return this;
        }
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setSourceNodeId(String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setSourceNodeOutputName(String sourceNodeOutputName) {
            this.sourceNodeOutputName = sourceNodeOutputName;
            return this;
        }
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        public UpdateBatchTaskRequestUpdateCommandUpStreamList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
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
        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig customScheduleConfig;

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
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        @NameInMap("ParamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandParamList> paramList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        @NameInMap("SparkClientInfo")
        public UpdateBatchTaskRequestUpdateCommandSparkClientInfo sparkClientInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        @NameInMap("UpStreamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandUpStreamList> upStreamList;

        public static UpdateBatchTaskRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommand self = new UpdateBatchTaskRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateBatchTaskRequestUpdateCommand setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public UpdateBatchTaskRequestUpdateCommand setCustomScheduleConfig(UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig customScheduleConfig) {
            this.customScheduleConfig = customScheduleConfig;
            return this;
        }
        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        public UpdateBatchTaskRequestUpdateCommand setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public UpdateBatchTaskRequestUpdateCommand setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public UpdateBatchTaskRequestUpdateCommand setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public UpdateBatchTaskRequestUpdateCommand setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public UpdateBatchTaskRequestUpdateCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public UpdateBatchTaskRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBatchTaskRequestUpdateCommand setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public UpdateBatchTaskRequestUpdateCommand setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public UpdateBatchTaskRequestUpdateCommand setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public UpdateBatchTaskRequestUpdateCommand setParamList(java.util.List<UpdateBatchTaskRequestUpdateCommandParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<UpdateBatchTaskRequestUpdateCommandParamList> getParamList() {
            return this.paramList;
        }

        public UpdateBatchTaskRequestUpdateCommand setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateBatchTaskRequestUpdateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateBatchTaskRequestUpdateCommand setPythonModuleList(java.util.List<String> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public UpdateBatchTaskRequestUpdateCommand setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public UpdateBatchTaskRequestUpdateCommand setSparkClientInfo(UpdateBatchTaskRequestUpdateCommandSparkClientInfo sparkClientInfo) {
            this.sparkClientInfo = sparkClientInfo;
            return this;
        }
        public UpdateBatchTaskRequestUpdateCommandSparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        public UpdateBatchTaskRequestUpdateCommand setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public UpdateBatchTaskRequestUpdateCommand setUpStreamList(java.util.List<UpdateBatchTaskRequestUpdateCommandUpStreamList> upStreamList) {
            this.upStreamList = upStreamList;
            return this;
        }
        public java.util.List<UpdateBatchTaskRequestUpdateCommandUpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

    }

}
