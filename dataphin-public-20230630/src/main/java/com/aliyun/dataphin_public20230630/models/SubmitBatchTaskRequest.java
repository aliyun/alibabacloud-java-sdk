// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTaskRequest extends TeaModel {
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
     * <p>The edit request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitBatchTaskRequestSubmitCommand submitCommand;

    public static SubmitBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTaskRequest self = new SubmitBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitBatchTaskRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitBatchTaskRequest setSubmitCommand(SubmitBatchTaskRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitBatchTaskRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList extends TeaModel {
        /**
         * <p>The condition name.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("ConditionName")
        public String conditionName;

        /**
         * <p>The cron expression used after a condition is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 5 * * ?</p>
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
         * <p>Specifies whether to follow the primary scheduling parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowScheduleParam")
        public Boolean followScheduleParam;

        /**
         * <p>The scheduling status used after a condition is matched. Valid values:</p>
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
         * <p>The JSON character string of the conditional expression tree. Internal key names use lower camel case.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScheduleConditionJson")
        public String scheduleConditionJson;

        /**
         * <p>The scheduling time used after a condition is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>05:00</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        public static SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList self = new SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setConditionName(String conditionName) {
            this.conditionName = conditionName;
            return this;
        }
        public String getConditionName() {
            return this.conditionName;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setFollowScheduleParam(Boolean followScheduleParam) {
            this.followScheduleParam = followScheduleParam;
            return this;
        }
        public Boolean getFollowScheduleParam() {
            return this.followScheduleParam;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setScheduleConditionJson(String scheduleConditionJson) {
            this.scheduleConditionJson = scheduleConditionJson;
            return this;
        }
        public String getScheduleConditionJson() {
            return this.scheduleConditionJson;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable conditional scheduling. This parameter is required when the ConditionScheduleConfig object is passed and is verified by the backend. If this parameter is set to false, conditional scheduling is disabled and the previous configuration is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The list of custom conditions. This parameter is mutually exclusive with TemplateId. An empty list clears the previous conditions.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList> paramList;

        /**
         * <p>The ID of the conditional scheduling template. This parameter is mutually exclusive with ParamList.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig self = new SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig setParamList(java.util.List<SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList> getParamList() {
            return this.paramList;
        }

        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig extends TeaModel {
        /**
         * <p>The end time in the HH:mm format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00</p>
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
         * <p>The scheduling period. Valid values:</p>
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
         * <p>10:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig self = new SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig extends TeaModel {
        /**
         * <p>The custom retry interval for failures.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CustomRerunInterval")
        public String customRerunInterval;

        /**
         * <p>The custom number of retries for failures.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CustomRerunTimes")
        public String customRerunTimes;

        /**
         * <p>Specifies whether to follow the system configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowSystem")
        public Boolean followSystem;

        public static SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig self = new SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig setCustomRerunInterval(String customRerunInterval) {
            this.customRerunInterval = customRerunInterval;
            return this;
        }
        public String getCustomRerunInterval() {
            return this.customRerunInterval;
        }

        public SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig setCustomRerunTimes(String customRerunTimes) {
            this.customRerunTimes = customRerunTimes;
            return this;
        }
        public String getCustomRerunTimes() {
            return this.customRerunTimes;
        }

        public SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig setFollowSystem(Boolean followSystem) {
            this.followSystem = followSystem;
            return this;
        }
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig extends TeaModel {
        /**
         * <p>The custom timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("CustomValues")
        public String customValues;

        /**
         * <p>Specifies whether to follow the system configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowSystem")
        public Boolean followSystem;

        public static SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig self = new SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig setCustomValues(String customValues) {
            this.customValues = customValues;
            return this;
        }
        public String getCustomValues() {
            return this.customValues;
        }

        public SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig setFollowSystem(Boolean followSystem) {
            this.followSystem = followSystem;
            return this;
        }
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether encryption is enabled.</p>
         */
        @NameInMap("EncryptEnabled")
        public Boolean encryptEnabled;

        /**
         * <p>The parameter key.</p>
         * 
         * <strong>example:</strong>
         * <p>paramKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>paramValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams self = new SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setEncryptEnabled(Boolean encryptEnabled) {
            this.encryptEnabled = encryptEnabled;
            return this;
        }
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandParamList extends TeaModel {
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
         * <p>key</p>
         */
        @NameInMap("Value")
        public String value;

        public static SubmitBatchTaskRequestSubmitCommandParamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandParamList self = new SubmitBatchTaskRequestSubmitCommandParamList();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitBatchTaskRequestSubmitCommandParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandScheduleTemplate extends TeaModel {
        /**
         * <p>The ID of the basic scheduling template. The value must be a positive number.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static SubmitBatchTaskRequestSubmitCommandScheduleTemplate build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandScheduleTemplate self = new SubmitBatchTaskRequestSubmitCommandScheduleTemplate();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandScheduleTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandSparkClientInfo extends TeaModel {
        /**
         * <p>The version name of the Spark client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SparkClientVersion")
        public String sparkClientVersion;

        public static SubmitBatchTaskRequestSubmitCommandSparkClientInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandSparkClientInfo self = new SubmitBatchTaskRequestSubmitCommandSparkClientInfo();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo setSparkClientVersion(String sparkClientVersion) {
            this.sparkClientVersion = sparkClientVersion;
            return this;
        }
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod extends TeaModel {
        /**
         * <p>The period offset. This parameter is required when dependencyPeriodType is set to LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>The dependency period type. Valid values:</p>
         * <ul>
         * <li>CURRENT_PERIOD: current period</li>
         * <li>LAST_PERIOD: last period</li>
         * <li>LAST_N_PERIOD: last N days</li>
         * <li>LAST_24_HOUR: last 24 hours</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_PERIOD</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod self = new SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandUpStreamList extends TeaModel {
        /**
         * <p>The dependency period.</p>
         */
        @NameInMap("DependPeriod")
        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values:</p>
         * <ul>
         * <li>ALL: all</li>
         * <li>FIRST: first</li>
         * <li>LAST: last</li>
         * <li>NEAR: nearest</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
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
         * <li>PHYSICAL: physical node</li>
         * <li>LOGICAL: logical table dependency</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The period difference. A value of 0 indicates a dependency on the same period. A positive value indicates a dependency on the previous N periods.</p>
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

        public static SubmitBatchTaskRequestSubmitCommandUpStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandUpStreamList self = new SubmitBatchTaskRequestSubmitCommandUpStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setDependPeriod(SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod dependPeriod) {
            this.dependPeriod = dependPeriod;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setDependStrategy(String dependStrategy) {
            this.dependStrategy = dependStrategy;
            return this;
        }
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceNodeEnabled(Boolean sourceNodeEnabled) {
            this.sourceNodeEnabled = sourceNodeEnabled;
            return this;
        }
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceNodeId(String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceNodeOutputName(String sourceNodeOutputName) {
            this.sourceNodeOutputName = sourceNodeOutputName;
            return this;
        }
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommand extends TeaModel {
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
         * <p>The code template version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CodeTemplateVersion")
        public Integer codeTemplateVersion;

        /**
         * <p>The comment for the submit operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The conditional scheduling configuration. If this parameter is not specified, the current configuration is retained. If Enable is set to false, conditional scheduling is disabled and the original conditions are cleared. This parameter is supported only for periodic tasks.</p>
         */
        @NameInMap("ConditionScheduleConfig")
        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig conditionScheduleConfig;

        /**
         * <p>The amount of CPU resources. If this parameter is not specified, the current configuration of the task is retained.</p>
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
         * <p>The custom scheduling interval configuration.</p>
         */
        @NameInMap("CustomScheduleConfig")
        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig customScheduleConfig;

        /**
         * <p>The task execution engine. For Python tasks, valid values:</p>
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
         * <p>The failure retry configuration. If this parameter is not specified, the current configuration of the task is retained. If this parameter is specified, the entire configuration object is replaced.</p>
         */
        @NameInMap("ExecuteRerunConfig")
        public SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig executeRerunConfig;

        /**
         * <p>The execution timeout configuration. If this parameter is not specified, the current configuration of the task is retained. If this parameter is specified, the entire configuration object is replaced.</p>
         */
        @NameInMap("ExecuteTimeOutConfig")
        public SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig executeTimeOutConfig;

        /**
         * <p>The ID of the node in the task directory tree.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The amount of CPU resources. If this parameter is not specified, the current configuration of the task is retained.</p>
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
         * <p>The task description.</p>
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
         * <p>The ID of the offline code template.</p>
         * 
         * <strong>example:</strong>
         * <p>template_123456</p>
         */
        @NameInMap("OfflineCodeTemplateId")
        public String offlineCodeTemplateId;

        /**
         * <p>The list of offline code template parameters.</p>
         */
        @NameInMap("OfflineCodeTemplateParams")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> offlineCodeTemplateParams;

        /**
         * <p>The list of custom parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> paramList;

        /**
         * <p>The task scheduling priority. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

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
         * <p>The list of Python third-party packages on which the node depends.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>The list of referenced resources. Each element is a resource name. If this parameter is not specified, the resource references of the original node are used. If a list is specified, the existing references are completely replaced. An empty list clears all references.</p>
         */
        @NameInMap("ResourceReferenceList")
        public java.util.List<String> resourceReferenceList;

        /**
         * <p>Specifies whether to enable retry on timeout. If this parameter is not specified, the current configuration of the node is retained. If this parameter is explicitly set to false, the feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RetryOnTimeoutEnable")
        public Boolean retryOnTimeoutEnable;

        /**
         * <p>The scheduling period. Valid values:</p>
         * <ul>
         * <li>YEARLY: yearly</li>
         * <li>MONTHLY: monthly</li>
         * <li>WEEKLY: weekly</li>
         * <li>DAILY: daily</li>
         * <li>HOURLY: hourly</li>
         * <li>MINUTELY: minutely</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The basic scheduling template. If this parameter is not specified, the current template is retained. An empty object unbinds the template. This parameter is supported only for periodic nodes.</p>
         */
        @NameInMap("ScheduleTemplate")
        public SubmitBatchTaskRequestSubmitCommandScheduleTemplate scheduleTemplate;

        /**
         * <p>The Spark client.</p>
         */
        @NameInMap("SparkClientInfo")
        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo sparkClientInfo;

        /**
         * <p>Specifies whether to enable dynamic resources for Spark. If this parameter is not specified, the current configuration of the node is retained. If this parameter is explicitly set to false, the feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SparkDynamicResourceSwitch")
        public Boolean sparkDynamicResourceSwitch;

        /**
         * <p>The effective scope of the Spark resource configuration. ONLY_PROD indicates the production environment only. PROD_AND_DEV indicates both the production and development environments. If this parameter is not specified, the current configuration of the node is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLY_PROD</p>
         */
        @NameInMap("SparkResourceEffectScope")
        public String sparkResourceEffectScope;

        /**
         * <p>The Spark SQL resource configurations. The key is the configuration item name, and the value is a string. If this parameter is not specified, the current configurations of the node are retained. An empty map clears all configurations.</p>
         */
        @NameInMap("SparkSqlResourceConfigMap")
        public java.util.Map<String, String> sparkSqlResourceConfigMap;

        /**
         * <p>The upstream dependencies.</p>
         */
        @NameInMap("UpStreamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandUpStreamList> upStreamList;

        public static SubmitBatchTaskRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommand self = new SubmitBatchTaskRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitBatchTaskRequestSubmitCommand setCodeTemplateVersion(Integer codeTemplateVersion) {
            this.codeTemplateVersion = codeTemplateVersion;
            return this;
        }
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        public SubmitBatchTaskRequestSubmitCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public SubmitBatchTaskRequestSubmitCommand setConditionScheduleConfig(SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig conditionScheduleConfig) {
            this.conditionScheduleConfig = conditionScheduleConfig;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig getConditionScheduleConfig() {
            return this.conditionScheduleConfig;
        }

        public SubmitBatchTaskRequestSubmitCommand setCpuResource(String cpuResource) {
            this.cpuResource = cpuResource;
            return this;
        }
        public String getCpuResource() {
            return this.cpuResource;
        }

        public SubmitBatchTaskRequestSubmitCommand setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public SubmitBatchTaskRequestSubmitCommand setCustomScheduleConfig(SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig customScheduleConfig) {
            this.customScheduleConfig = customScheduleConfig;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        public SubmitBatchTaskRequestSubmitCommand setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public SubmitBatchTaskRequestSubmitCommand setExecuteRerunConfig(SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig executeRerunConfig) {
            this.executeRerunConfig = executeRerunConfig;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig getExecuteRerunConfig() {
            return this.executeRerunConfig;
        }

        public SubmitBatchTaskRequestSubmitCommand setExecuteTimeOutConfig(SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig executeTimeOutConfig) {
            this.executeTimeOutConfig = executeTimeOutConfig;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandExecuteTimeOutConfig getExecuteTimeOutConfig() {
            return this.executeTimeOutConfig;
        }

        public SubmitBatchTaskRequestSubmitCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public SubmitBatchTaskRequestSubmitCommand setMemoryResource(String memoryResource) {
            this.memoryResource = memoryResource;
            return this;
        }
        public String getMemoryResource() {
            return this.memoryResource;
        }

        public SubmitBatchTaskRequestSubmitCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitBatchTaskRequestSubmitCommand setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public SubmitBatchTaskRequestSubmitCommand setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public SubmitBatchTaskRequestSubmitCommand setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public SubmitBatchTaskRequestSubmitCommand setOfflineCodeTemplateId(String offlineCodeTemplateId) {
            this.offlineCodeTemplateId = offlineCodeTemplateId;
            return this;
        }
        public String getOfflineCodeTemplateId() {
            return this.offlineCodeTemplateId;
        }

        public SubmitBatchTaskRequestSubmitCommand setOfflineCodeTemplateParams(java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> offlineCodeTemplateParams) {
            this.offlineCodeTemplateParams = offlineCodeTemplateParams;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> getOfflineCodeTemplateParams() {
            return this.offlineCodeTemplateParams;
        }

        public SubmitBatchTaskRequestSubmitCommand setParamList(java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> getParamList() {
            return this.paramList;
        }

        public SubmitBatchTaskRequestSubmitCommand setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public SubmitBatchTaskRequestSubmitCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SubmitBatchTaskRequestSubmitCommand setPythonModuleList(java.util.List<String> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public SubmitBatchTaskRequestSubmitCommand setResourceReferenceList(java.util.List<String> resourceReferenceList) {
            this.resourceReferenceList = resourceReferenceList;
            return this;
        }
        public java.util.List<String> getResourceReferenceList() {
            return this.resourceReferenceList;
        }

        public SubmitBatchTaskRequestSubmitCommand setRetryOnTimeoutEnable(Boolean retryOnTimeoutEnable) {
            this.retryOnTimeoutEnable = retryOnTimeoutEnable;
            return this;
        }
        public Boolean getRetryOnTimeoutEnable() {
            return this.retryOnTimeoutEnable;
        }

        public SubmitBatchTaskRequestSubmitCommand setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public SubmitBatchTaskRequestSubmitCommand setScheduleTemplate(SubmitBatchTaskRequestSubmitCommandScheduleTemplate scheduleTemplate) {
            this.scheduleTemplate = scheduleTemplate;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandScheduleTemplate getScheduleTemplate() {
            return this.scheduleTemplate;
        }

        public SubmitBatchTaskRequestSubmitCommand setSparkClientInfo(SubmitBatchTaskRequestSubmitCommandSparkClientInfo sparkClientInfo) {
            this.sparkClientInfo = sparkClientInfo;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        public SubmitBatchTaskRequestSubmitCommand setSparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
            this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
            return this;
        }
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        public SubmitBatchTaskRequestSubmitCommand setSparkResourceEffectScope(String sparkResourceEffectScope) {
            this.sparkResourceEffectScope = sparkResourceEffectScope;
            return this;
        }
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        public SubmitBatchTaskRequestSubmitCommand setSparkSqlResourceConfigMap(java.util.Map<String, String> sparkSqlResourceConfigMap) {
            this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
            return this;
        }
        public java.util.Map<String, String> getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
        }

        public SubmitBatchTaskRequestSubmitCommand setUpStreamList(java.util.List<SubmitBatchTaskRequestSubmitCommandUpStreamList> upStreamList) {
            this.upStreamList = upStreamList;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandUpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

    }

}
