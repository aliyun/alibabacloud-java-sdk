// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTaskRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update request.</p>
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

    public UpdateBatchTaskRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateBatchTaskRequest setUpdateCommand(UpdateBatchTaskRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBatchTaskRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>condition1</p>
         */
        @NameInMap("ConditionName")
        public String conditionName;

        /**
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowScheduleParam")
        public Boolean followScheduleParam;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;EXPRESSION&quot;,&quot;operator&quot;:&quot;or&quot;}</p>
         */
        @NameInMap("ScheduleConditionJson")
        public String scheduleConditionJson;

        /**
         * <strong>example:</strong>
         * <p>01:00</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        public static UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList self = new UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setConditionName(String conditionName) {
            this.conditionName = conditionName;
            return this;
        }
        public String getConditionName() {
            return this.conditionName;
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setFollowScheduleParam(Boolean followScheduleParam) {
            this.followScheduleParam = followScheduleParam;
            return this;
        }
        public Boolean getFollowScheduleParam() {
            return this.followScheduleParam;
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setScheduleConditionJson(String scheduleConditionJson) {
            this.scheduleConditionJson = scheduleConditionJson;
            return this;
        }
        public String getScheduleConditionJson() {
            return this.scheduleConditionJson;
        }

        public UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandContextParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>测试参数</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("ParamKey")
        public String paramKey;

        public static UpdateBatchTaskRequestUpdateCommandContextParamList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandContextParamList self = new UpdateBatchTaskRequestUpdateCommandContextParamList();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandContextParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateBatchTaskRequestUpdateCommandContextParamList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public UpdateBatchTaskRequestUpdateCommandContextParamList setParamKey(String paramKey) {
            this.paramKey = paramKey;
            return this;
        }
        public String getParamKey() {
            return this.paramKey;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig extends TeaModel {
        /**
         * <p>The end time in the format of HH:mm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The custom interval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The interval unit. Valid values:</p>
         * <ul>
         * <li>MINUTE: minute.</li>
         * <li>HOUR: hour.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>The schedule period. Valid values:</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The start time in the format of HH:mm.</p>
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
         * <p>The parameter name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
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
         * <p>The version name of the Spark client.</p>
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
         * <p>The period offset. This parameter is required when dependencyPeriodType is set to LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>The type of the dependency period. Valid values:</p>
         * <ul>
         * <li>CURRENT_PERIOD: current period.</li>
         * <li>LAST_PERIOD: previous period.</li>
         * <li>LAST_N_PERIOD: last N days.</li>
         * <li>LAST_24_HOUR: last 24 hours.</li>
         * </ul>
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
        /**
         * <p>The dependency period.</p>
         */
        @NameInMap("DependPeriod")
        public UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values:</p>
         * <ul>
         * <li>ALL: all.</li>
         * <li>FIRST: first.</li>
         * <li>LAST: last.</li>
         * <li>NEAR: nearest.</li>
         * </ul>
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
         * <p>The period difference. A value of 0 indicates same-period dependency. A positive number indicates dependency on the previous N periods.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>n_2001</p>
         */
        @NameInMap("SourceNodeId")
        public String sourceNodeId;

        /**
         * <p>The output name of the upstream node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
         * <p>The name of the input table.</p>
         * 
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
         * <strong>example:</strong>
         * <p>7305621095333696</p>
         */
        @NameInMap("BaseScheduleTemplateId")
        public Long baseScheduleTemplateId;

        /**
         * <p>The code of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConditionScheduleEnable")
        public Boolean conditionScheduleEnable;

        @NameInMap("ConditionScheduleParamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList> conditionScheduleParamList;

        /**
         * <strong>example:</strong>
         * <p>7305621095333697</p>
         */
        @NameInMap("ConditionScheduleTemplateId")
        public Long conditionScheduleTemplateId;

        @NameInMap("ContextParamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandContextParamList> contextParamList;

        /**
         * <p>The cron expression for automatic scheduling. Refer to Linux cron expressions.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The custom schedule interval configuration.</p>
         */
        @NameInMap("CustomScheduleConfig")
        public UpdateBatchTaskRequestUpdateCommandCustomScheduleConfig customScheduleConfig;

        /**
         * <p>The catalog for database SQL nodes. This parameter applies only to datasource types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The datasource ID for database SQL nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The schema for database SQL nodes. This parameter applies only to datasource types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <strong>example:</strong>
         * <p>/sql/protocolv1/o/xxx</p>
         */
        @NameInMap("DevHttpPath")
        public String devHttpPath;

        /**
         * <strong>example:</strong>
         * <p>rg-def456</p>
         */
        @NameInMap("DevResourceGroupId")
        public String devResourceGroupId;

        /**
         * <p>The list of development owner IDs.</p>
         */
        @NameInMap("DevelopOwnerIdList")
        public java.util.List<String> developOwnerIdList;

        /**
         * <p>The execution engine for the node, such as for Python nodes. Valid values:</p>
         * <ul>
         * <li>PYTHON2_7</li>
         * <li>PYTHON3_7</li>
         * <li>PYTHON3_11</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The node ID in the folder tree.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the offline node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_description</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

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

        @NameInMap("OpsOwnerIdList")
        public java.util.List<String> opsOwnerIdList;

        /**
         * <p>The list of custom parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandParamList> paramList;

        /**
         * <p>The scheduling priority of the node. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>/sql/protocolv1/o/yyy</p>
         */
        @NameInMap("ProdHttpPath")
        public String prodHttpPath;

        /**
         * <p>The ID of the project to which the node belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The third-party Python packages required by the node.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <strong>example:</strong>
         * <p>rg-abc123</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The schedule period. Valid values:</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The Spark client information.</p>
         */
        @NameInMap("SparkClientInfo")
        public UpdateBatchTaskRequestUpdateCommandSparkClientInfo sparkClientInfo;

        @NameInMap("TaskTagList")
        public java.util.List<String> taskTagList;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>1: Hive_SQL.</li>
         * <li>5: MaxCompute_SQL.</li>
         * <li>10: Shell.</li>
         * <li>21: Python.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public java.util.List<UpdateBatchTaskRequestUpdateCommandUpStreamList> upStreamList;

        /**
         * <strong>example:</strong>
         * <p>9999-12-31</p>
         */
        @NameInMap("ValidEndDate")
        public String validEndDate;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("ValidStartDate")
        public String validStartDate;

        public static UpdateBatchTaskRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommand self = new UpdateBatchTaskRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommand setBaseScheduleTemplateId(Long baseScheduleTemplateId) {
            this.baseScheduleTemplateId = baseScheduleTemplateId;
            return this;
        }
        public Long getBaseScheduleTemplateId() {
            return this.baseScheduleTemplateId;
        }

        public UpdateBatchTaskRequestUpdateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateBatchTaskRequestUpdateCommand setConditionScheduleEnable(Boolean conditionScheduleEnable) {
            this.conditionScheduleEnable = conditionScheduleEnable;
            return this;
        }
        public Boolean getConditionScheduleEnable() {
            return this.conditionScheduleEnable;
        }

        public UpdateBatchTaskRequestUpdateCommand setConditionScheduleParamList(java.util.List<UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList> conditionScheduleParamList) {
            this.conditionScheduleParamList = conditionScheduleParamList;
            return this;
        }
        public java.util.List<UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList> getConditionScheduleParamList() {
            return this.conditionScheduleParamList;
        }

        public UpdateBatchTaskRequestUpdateCommand setConditionScheduleTemplateId(Long conditionScheduleTemplateId) {
            this.conditionScheduleTemplateId = conditionScheduleTemplateId;
            return this;
        }
        public Long getConditionScheduleTemplateId() {
            return this.conditionScheduleTemplateId;
        }

        public UpdateBatchTaskRequestUpdateCommand setContextParamList(java.util.List<UpdateBatchTaskRequestUpdateCommandContextParamList> contextParamList) {
            this.contextParamList = contextParamList;
            return this;
        }
        public java.util.List<UpdateBatchTaskRequestUpdateCommandContextParamList> getContextParamList() {
            return this.contextParamList;
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

        public UpdateBatchTaskRequestUpdateCommand setDevHttpPath(String devHttpPath) {
            this.devHttpPath = devHttpPath;
            return this;
        }
        public String getDevHttpPath() {
            return this.devHttpPath;
        }

        public UpdateBatchTaskRequestUpdateCommand setDevResourceGroupId(String devResourceGroupId) {
            this.devResourceGroupId = devResourceGroupId;
            return this;
        }
        public String getDevResourceGroupId() {
            return this.devResourceGroupId;
        }

        public UpdateBatchTaskRequestUpdateCommand setDevelopOwnerIdList(java.util.List<String> developOwnerIdList) {
            this.developOwnerIdList = developOwnerIdList;
            return this;
        }
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
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

        public UpdateBatchTaskRequestUpdateCommand setOpsOwnerIdList(java.util.List<String> opsOwnerIdList) {
            this.opsOwnerIdList = opsOwnerIdList;
            return this;
        }
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
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

        public UpdateBatchTaskRequestUpdateCommand setProdHttpPath(String prodHttpPath) {
            this.prodHttpPath = prodHttpPath;
            return this;
        }
        public String getProdHttpPath() {
            return this.prodHttpPath;
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

        public UpdateBatchTaskRequestUpdateCommand setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public UpdateBatchTaskRequestUpdateCommand setTaskTagList(java.util.List<String> taskTagList) {
            this.taskTagList = taskTagList;
            return this;
        }
        public java.util.List<String> getTaskTagList() {
            return this.taskTagList;
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

        public UpdateBatchTaskRequestUpdateCommand setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public UpdateBatchTaskRequestUpdateCommand setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

    }

}
