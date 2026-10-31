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
     * <p>The ID of the operator.</p>
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
         * <p>The condition name.</p>
         * 
         * <strong>example:</strong>
         * <p>condition1</p>
         */
        @NameInMap("ConditionName")
        public String conditionName;

        /**
         * <p>The cron expression used after the condition is met.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to enable the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Specifies whether to follow the primary schedule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowScheduleParam")
        public Boolean followScheduleParam;

        /**
         * <p>The node schedule status after the condition is met. Valid values:</p>
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
         * <p>The JSON string of the conditional expression tree. The keys are in lower camel case characters and must be parsed by the invoker.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;EXPRESSION&quot;,&quot;operator&quot;:&quot;or&quot;}</p>
         */
        @NameInMap("ScheduleConditionJson")
        public String scheduleConditionJson;

        /**
         * <p>The schedule time used after the condition is met.</p>
         * 
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
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test parameter</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The parameter name.</p>
         * 
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
         * <p>The end time in the HH:mm format.</p>
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
         * <li>MINUTE: Minutes.</li>
         * <li>HOUR: Hours.</li>
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
         * <li>YEARLY: Yearly.</li>
         * <li>MONTHLY: Monthly.</li>
         * <li>WEEKLY: Weekly.</li>
         * <li>DAILY: Daily.</li>
         * <li>HOURLY: Hourly.</li>
         * <li>MINUTELY: Minutely.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The start time in the HH:mm format.</p>
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

    public static class UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig extends TeaModel {
        /**
         * <p>自定义失败重试间隔。</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CustomRerunInterval")
        public String customRerunInterval;

        /**
         * <p>自定义失败重试次数。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CustomRerunTimes")
        public String customRerunTimes;

        /**
         * <p>是否跟随系统配置。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowSystem")
        public Boolean followSystem;

        public static UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig self = new UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig setCustomRerunInterval(String customRerunInterval) {
            this.customRerunInterval = customRerunInterval;
            return this;
        }
        public String getCustomRerunInterval() {
            return this.customRerunInterval;
        }

        public UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig setCustomRerunTimes(String customRerunTimes) {
            this.customRerunTimes = customRerunTimes;
            return this;
        }
        public String getCustomRerunTimes() {
            return this.customRerunTimes;
        }

        public UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig setFollowSystem(Boolean followSystem) {
            this.followSystem = followSystem;
            return this;
        }
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

    }

    public static class UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig extends TeaModel {
        /**
         * <p>自定义超时时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("CustomValues")
        public String customValues;

        /**
         * <p>是否跟随系统配置。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowSystem")
        public Boolean followSystem;

        public static UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig self = new UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig setCustomValues(String customValues) {
            this.customValues = customValues;
            return this;
        }
        public String getCustomValues() {
            return this.customValues;
        }

        public UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig setFollowSystem(Boolean followSystem) {
            this.followSystem = followSystem;
            return this;
        }
        public Boolean getFollowSystem() {
            return this.followSystem;
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
         * <p>The value of the parameter.</p>
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
         * <p>The cycle offset. This parameter is required when the PeriodType parameter is set to LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>The type of the dependency cycle. Valid values:</p>
         * <ul>
         * <li>CURRENT_PERIOD: Current cycle.</li>
         * <li>LAST_PERIOD: Last cycle.</li>
         * <li>LAST_N_PERIOD: Last N days.</li>
         * <li>LAST_24_HOUR: Last 24 hours.</li>
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
         * <p>The dependency cycle.</p>
         */
        @NameInMap("DependPeriod")
        public UpdateBatchTaskRequestUpdateCommandUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values:</p>
         * <ul>
         * <li>ALL: All.</li>
         * <li>FIRST: First.</li>
         * <li>LAST: Last.</li>
         * <li>NEAR: Nearest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LAST</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        /**
         * <p>The list of dependent logical table fields.</p>
         */
        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <p>The type of the upstream dependency node. Valid values:</p>
         * <ul>
         * <li>PHYSICAL: Physical node.</li>
         * <li>LOGICAL: Logical table dependency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The cycle difference. A value of 0 indicates a dependency on the same cycle. A positive integer indicates a dependency on the previous N cycles.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        /**
         * <p>Specifies whether the upstream node is enabled.</p>
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
         * <p>The base schedule template ID. This parameter takes effect when the configuration method is set to schedule template. If this parameter and all other schedule fields are not specified, the original binding is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>7305621095333696</p>
         */
        @NameInMap("BaseScheduleTemplateId")
        public Long baseScheduleTemplateId;

        /**
         * <p>The task code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Specifies whether to enable conditional scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConditionScheduleEnable")
        public Boolean conditionScheduleEnable;

        /**
         * <p>The conditional scheduling configuration details. This parameter overwrites the existing configurations. If this parameter is not specified, the original configurations are retained. This parameter is supported only for periodic tasks.</p>
         */
        @NameInMap("ConditionScheduleParamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandConditionScheduleParamList> conditionScheduleParamList;

        /**
         * <p>The conditional schedule template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7305621095333697</p>
         */
        @NameInMap("ConditionScheduleTemplateId")
        public Long conditionScheduleTemplateId;

        /**
         * <p>The cross-node parameters. These are output parameters declared by the current node for downstream nodes to reference. This parameter overwrites the existing parameters. If this parameter is not specified, the original parameters are retained.</p>
         */
        @NameInMap("ContextParamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandContextParamList> contextParamList;

        /**
         * <p>不传时保留任务当前配置。</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CpuResource")
        public String cpuResource;

        /**
         * <p>The cron expression for automatic scheduling. You can refer to Linux cron expressions.</p>
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
         * <p>The data source catalog for database SQL tasks. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The data source ID for database SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source schema for database SQL tasks. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>The HTTP path in the development environment for Databricks tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>/sql/protocolv1/o/xxx</p>
         */
        @NameInMap("DevHttpPath")
        public String devHttpPath;

        /**
         * <p>The ID of the schedule resource group for development tasks.</p>
         * 
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
         * <p>The task execution engine, such as Python tasks. Valid values:</p>
         * <ul>
         * <li>PYTHON2_7: Python 2.7.</li>
         * <li>PYTHON3_7: Python 3.7.</li>
         * <li>PYTHON3_11: Python 3.11.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>失败重试配置。不传时保留任务当前配置。传入时整体替换该配置对象。</p>
         */
        @NameInMap("ExecuteRerunConfig")
        public UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig executeRerunConfig;

        /**
         * <p>执行超时配置。不传时保留任务当前配置。传入时整体替换该配置对象。</p>
         */
        @NameInMap("ExecuteTimeOutConfig")
        public UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig executeTimeOutConfig;

        /**
         * <p>The ID of the task directory tree node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>不传时保留任务当前配置。</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MemoryResource")
        public String memoryResource;

        /**
         * <p>The name of the offline task.</p>
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
         * <p>xx test</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The list of node output names.</p>
         */
        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <p>The status of the node. Valid values:</p>
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
         * <p>The list of O&amp;M owner IDs. If you do not specify this parameter, the O&amp;M owners are not modified.</p>
         */
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
         * <p>The HTTP path in the production environment. This parameter is used for Databricks nodes.</p>
         * 
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
         * <p>The list of third-party Python packages on which the node depends.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>The ID of the scheduling resource group for the production node.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-abc123</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceReferenceList")
        public java.util.List<String> resourceReferenceList;

        /**
         * <p>超时重试开关。不传时保留任务当前配置。显式传入false时关闭。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RetryOnTimeoutEnable")
        public Boolean retryOnTimeoutEnable;

        /**
         * <p>The scheduling cycle. Valid values:</p>
         * <ul>
         * <li>YEARLY: Yearly.</li>
         * <li>MONTHLY: Monthly.</li>
         * <li>WEEKLY: Weekly.</li>
         * <li>DAILY: Daily.</li>
         * <li>HOURLY: Hourly.</li>
         * <li>MINUTELY: Minutely.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The Spark client.</p>
         */
        @NameInMap("SparkClientInfo")
        public UpdateBatchTaskRequestUpdateCommandSparkClientInfo sparkClientInfo;

        /**
         * <p>不传时保留任务当前配置。显式传入false时关闭。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SparkDynamicResourceSwitch")
        public Boolean sparkDynamicResourceSwitch;

        /**
         * <p>ONLY_PROD表示仅生产环境，PROD_AND_DEV表示生产和开发环境。不传时保留任务当前配置。</p>
         * 
         * <strong>example:</strong>
         * <p>ONLY_PROD</p>
         */
        @NameInMap("SparkResourceEffectScope")
        public String sparkResourceEffectScope;

        /**
         * <p>Spark SQL资源配置，键为配置项名称，值为字符串。不传时保留任务当前配置；传入空JSON对象{}时清空配置。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.executor.memory&quot;:&quot;2g&quot;}</p>
         */
        @NameInMap("SparkSqlResourceConfigMap")
        public String sparkSqlResourceConfigMap;

        /**
         * <p>The list of node tags. This parameter overwrites all existing tags. If you do not specify this parameter, the original tags remain unchanged.</p>
         */
        @NameInMap("TaskTagList")
        public java.util.List<String> taskTagList;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li>1: Hive SQL.</li>
         * <li>5: MaxCompute SQL.</li>
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
         * <p>The list of upstream dependencies.</p>
         */
        @NameInMap("UpStreamList")
        public java.util.List<UpdateBatchTaskRequestUpdateCommandUpStreamList> upStreamList;

        /**
         * <p>The end date of the validity period. Format: yyyy-MM-dd. This parameter must be specified together with the ValidStartDate parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-12-31</p>
         */
        @NameInMap("ValidEndDate")
        public String validEndDate;

        /**
         * <p>The start date of the validity period. Format: yyyy-MM-dd. This parameter must be specified together with the ValidEndDate parameter.</p>
         * 
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

        public UpdateBatchTaskRequestUpdateCommand setCpuResource(String cpuResource) {
            this.cpuResource = cpuResource;
            return this;
        }
        public String getCpuResource() {
            return this.cpuResource;
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

        public UpdateBatchTaskRequestUpdateCommand setExecuteRerunConfig(UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig executeRerunConfig) {
            this.executeRerunConfig = executeRerunConfig;
            return this;
        }
        public UpdateBatchTaskRequestUpdateCommandExecuteRerunConfig getExecuteRerunConfig() {
            return this.executeRerunConfig;
        }

        public UpdateBatchTaskRequestUpdateCommand setExecuteTimeOutConfig(UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig executeTimeOutConfig) {
            this.executeTimeOutConfig = executeTimeOutConfig;
            return this;
        }
        public UpdateBatchTaskRequestUpdateCommandExecuteTimeOutConfig getExecuteTimeOutConfig() {
            return this.executeTimeOutConfig;
        }

        public UpdateBatchTaskRequestUpdateCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public UpdateBatchTaskRequestUpdateCommand setMemoryResource(String memoryResource) {
            this.memoryResource = memoryResource;
            return this;
        }
        public String getMemoryResource() {
            return this.memoryResource;
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

        public UpdateBatchTaskRequestUpdateCommand setResourceReferenceList(java.util.List<String> resourceReferenceList) {
            this.resourceReferenceList = resourceReferenceList;
            return this;
        }
        public java.util.List<String> getResourceReferenceList() {
            return this.resourceReferenceList;
        }

        public UpdateBatchTaskRequestUpdateCommand setRetryOnTimeoutEnable(Boolean retryOnTimeoutEnable) {
            this.retryOnTimeoutEnable = retryOnTimeoutEnable;
            return this;
        }
        public Boolean getRetryOnTimeoutEnable() {
            return this.retryOnTimeoutEnable;
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

        public UpdateBatchTaskRequestUpdateCommand setSparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
            this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
            return this;
        }
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        public UpdateBatchTaskRequestUpdateCommand setSparkResourceEffectScope(String sparkResourceEffectScope) {
            this.sparkResourceEffectScope = sparkResourceEffectScope;
            return this;
        }
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        public UpdateBatchTaskRequestUpdateCommand setSparkSqlResourceConfigMap(String sparkSqlResourceConfigMap) {
            this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
            return this;
        }
        public String getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
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
