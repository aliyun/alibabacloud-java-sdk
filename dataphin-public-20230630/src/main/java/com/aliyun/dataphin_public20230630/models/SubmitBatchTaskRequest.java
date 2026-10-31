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
     * <p>The operator user ID.</p>
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
         * <p>条件名称</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("ConditionName")
        public String conditionName;

        /**
         * <p>命中后的cron表达式</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 5 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>是否启用该条件</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>是否跟随主调度参数</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowScheduleParam")
        public Boolean followScheduleParam;

        /**
         * <p>命中后的调度状态：1正常，2暂停，3空跑</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <p>条件表达式树JSON字符串，内部键名使用小驼峰</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScheduleConditionJson")
        public String scheduleConditionJson;

        /**
         * <p>命中后的调度时间</p>
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
         * <p>是否启用条件调度。传入ConditionScheduleConfig对象时必须提供，由后端校验；false关闭并清除旧配置。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>自定义条件列表；与TemplateId互斥，空列表清除旧条件</p>
         */
        @NameInMap("ParamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandConditionScheduleConfigParamList> paramList;

        /**
         * <p>条件调度模板ID，与ParamList互斥</p>
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
         * <li>MINUTE: Minute.</li>
         * <li>HOUR: Hour.</li>
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
         * <p>The description of the parameter.</p>
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
         * <p>The key of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>paramKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the parameter.</p>
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
         * <p>The name of the parameter.</p>
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
         * <p>基础调度模板ID，必须为正数</p>
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
         * <li>CURRENT_PERIOD: Current period.</li>
         * <li>LAST_PERIOD: Last period.</li>
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
         * <li>ALL: All.</li>
         * <li>FIRST: First.</li>
         * <li>LAST: Last.</li>
         * <li>NEAR: Nearest.</li>
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
         * <p>The period difference. A value of 0 indicates a dependency on the same period. A positive number indicates a dependency on the previous N periods.</p>
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
         * <p>The code of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The version number of the code template.</p>
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
         * <p>条件调度；不传保留，Enable=false关闭并清除原条件，仅周期任务支持</p>
         */
        @NameInMap("ConditionScheduleConfig")
        public SubmitBatchTaskRequestSubmitCommandConditionScheduleConfig conditionScheduleConfig;

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
        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig customScheduleConfig;

        /**
         * <p>The execution engine of the task. Valid values for Python tasks:</p>
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
         * <p>失败重试配置。不传时保留任务当前配置。传入时整体替换该配置对象。</p>
         */
        @NameInMap("ExecuteRerunConfig")
        public SubmitBatchTaskRequestSubmitCommandExecuteRerunConfig executeRerunConfig;

        /**
         * <p>执行超时配置。不传时保留任务当前配置。传入时整体替换该配置对象。</p>
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
         * <p>The description of the task.</p>
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
         * <p>The ID of the offline code template.</p>
         * 
         * <strong>example:</strong>
         * <p>template_123456</p>
         */
        @NameInMap("OfflineCodeTemplateId")
        public String offlineCodeTemplateId;

        /**
         * <p>The list of parameters for the offline code template.</p>
         */
        @NameInMap("OfflineCodeTemplateParams")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> offlineCodeTemplateParams;

        /**
         * <p>The list of custom parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> paramList;

        /**
         * <p>The scheduling priority of the task. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the project to which the task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The Python third-party packages required by the task.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>资源引用列表，元素为资源名称。不传时使用原有任务的资源引用；传入列表时整体替换，空列表表示清空引用。</p>
         */
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
         * <p>The schedule period. Valid values:</p>
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
         * <p>基础调度模板；不传保留，空对象解除绑定，仅周期任务支持</p>
         */
        @NameInMap("ScheduleTemplate")
        public SubmitBatchTaskRequestSubmitCommandScheduleTemplate scheduleTemplate;

        /**
         * <p>The Spark client.</p>
         */
        @NameInMap("SparkClientInfo")
        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo sparkClientInfo;

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
         * <p>Spark SQL资源配置，键为配置项名称，值为字符串。不传时保留任务当前配置。传入空Map时清空配置。</p>
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
