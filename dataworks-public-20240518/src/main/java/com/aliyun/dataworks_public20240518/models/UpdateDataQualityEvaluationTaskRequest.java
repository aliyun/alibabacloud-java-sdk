// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityEvaluationTaskRequest extends TeaModel {
    @NameInMap("DataQualityRules")
    public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules;

    /**
     * <strong>example:</strong>
     * <p>358750</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>质量监控任务描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>数据质量校验任务实例生命周期中的回调设置，目前只支持一个阻塞调度任务的Hook</p>
     */
    @NameInMap("Hooks")
    public java.util.List<UpdateDataQualityEvaluationTaskRequestHooks> hooks;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7227061794</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>质量监控任务名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>数据质量校验任务通知订阅配置</p>
     */
    @NameInMap("Notifications")
    public UpdateDataQualityEvaluationTaskRequestNotifications notifications;

    /**
     * <p>项目空间Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>使用数据源时的一些设置，目前只支持指定EMR的yarn队列、采集EMR表时把SQL引擎指定为SPARK-SQL</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;queue&quot;: &quot;default&quot;, &quot;sqlEngine&quot;: &quot;SPARK_SQL&quot; }</p>
     */
    @NameInMap("RuntimeConf")
    public String runtimeConf;

    /**
     * <p>参看 DataQualityTarget示例	数据质量校验任务的监控对象，参考 DataQualityTarget</p>
     */
    @NameInMap("Target")
    public UpdateDataQualityEvaluationTaskRequestTarget target;

    /**
     * <p>数据质量校验任务的触发配置</p>
     */
    @NameInMap("Trigger")
    public UpdateDataQualityEvaluationTaskRequestTrigger trigger;

    public static UpdateDataQualityEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityEvaluationTaskRequest self = new UpdateDataQualityEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityEvaluationTaskRequest setDataQualityRules(java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRules> dataQualityRules) {
        this.dataQualityRules = dataQualityRules;
        return this;
    }
    public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRules> getDataQualityRules() {
        return this.dataQualityRules;
    }

    public UpdateDataQualityEvaluationTaskRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataQualityEvaluationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataQualityEvaluationTaskRequest setHooks(java.util.List<UpdateDataQualityEvaluationTaskRequestHooks> hooks) {
        this.hooks = hooks;
        return this;
    }
    public java.util.List<UpdateDataQualityEvaluationTaskRequestHooks> getHooks() {
        return this.hooks;
    }

    public UpdateDataQualityEvaluationTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataQualityEvaluationTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataQualityEvaluationTaskRequest setNotifications(UpdateDataQualityEvaluationTaskRequestNotifications notifications) {
        this.notifications = notifications;
        return this;
    }
    public UpdateDataQualityEvaluationTaskRequestNotifications getNotifications() {
        return this.notifications;
    }

    public UpdateDataQualityEvaluationTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityEvaluationTaskRequest setRuntimeConf(String runtimeConf) {
        this.runtimeConf = runtimeConf;
        return this;
    }
    public String getRuntimeConf() {
        return this.runtimeConf;
    }

    public UpdateDataQualityEvaluationTaskRequest setTarget(UpdateDataQualityEvaluationTaskRequestTarget target) {
        this.target = target;
        return this;
    }
    public UpdateDataQualityEvaluationTaskRequestTarget getTarget() {
        return this.target;
    }

    public UpdateDataQualityEvaluationTaskRequest setTrigger(UpdateDataQualityEvaluationTaskRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateDataQualityEvaluationTaskRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical extends TeaModel {
        /**
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned extends TeaModel {
        /**
         * <strong>example:</strong>
         * <blockquote>
         * </blockquote>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>0.001</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds extends TeaModel {
        @NameInMap("Critical")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical;

        @NameInMap("Expected")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected;

        @NameInMap("Warned")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned warned;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setCritical(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical critical) {
            this.critical = critical;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsCritical getCritical() {
            return this.critical;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setExpected(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected expected) {
            this.expected = expected;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsExpected getExpected() {
            return this.expected;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds setWarned(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned warned) {
            this.warned = warned;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholdsWarned getWarned() {
            return this.warned;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;bizdate&quot;: [&quot;-1&quot;]}</p>
         */
        @NameInMap("ReferencedSamplesFilter")
        public String referencedSamplesFilter;

        @NameInMap("Thresholds")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds;

        /**
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setReferencedSamplesFilter(String referencedSamplesFilter) {
            this.referencedSamplesFilter = referencedSamplesFilter;
            return this;
        }
        public String getReferencedSamplesFilter() {
            return this.referencedSamplesFilter;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setThresholds(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfigThresholds getThresholds() {
            return this.thresholds;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM ods_d_openapi_log WHERE status = \&quot;Error\&quot;</p>
         */
        @NameInMap("ErrorDataFilter")
        public String errorDataFilter;

        /**
         * <strong>example:</strong>
         * <p>SaveErrorData</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers setErrorDataFilter(String errorDataFilter) {
            this.errorDataFilter = errorDataFilter;
            return this;
        }
        public String getErrorDataFilter() {
            return this.errorDataFilter;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CountNotIn</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>{ &quot;Columns&quot;: [ &quot;id&quot;, &quot;name&quot; ] , &quot;SQL&quot;: &quot;select count(1) from table;&quot;}</p>
         */
        @NameInMap("MetricParameters")
        public String metricParameters;

        /**
         * <strong>example:</strong>
         * <p>status != \&quot;Succeeded\&quot;</p>
         */
        @NameInMap("SamplingFilter")
        public String samplingFilter;

        /**
         * <strong>example:</strong>
         * <p>odps.sql.type.system.odps2=True,odps.sql.hive.compatible=True</p>
         */
        @NameInMap("SettingConfig")
        public String settingConfig;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig self = new UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setMetricParameters(String metricParameters) {
            this.metricParameters = metricParameters;
            return this;
        }
        public String getMetricParameters() {
            return this.metricParameters;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setSamplingFilter(String samplingFilter) {
            this.samplingFilter = samplingFilter;
            return this;
        }
        public String getSamplingFilter() {
            return this.samplingFilter;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig setSettingConfig(String settingConfig) {
            this.settingConfig = settingConfig;
            return this;
        }
        public String getSettingConfig() {
            return this.settingConfig;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestDataQualityRules extends TeaModel {
        @NameInMap("CheckingConfig")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ErrorHandlers")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers;

        /**
         * <strong>example:</strong>
         * <p>1022171560</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SamplingConfig")
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM:field:null_value:fixed:0</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static UpdateDataQualityEvaluationTaskRequestDataQualityRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestDataQualityRules self = new UpdateDataQualityEvaluationTaskRequestDataQualityRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setCheckingConfig(UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig checkingConfig) {
            this.checkingConfig = checkingConfig;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesCheckingConfig getCheckingConfig() {
            return this.checkingConfig;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setErrorHandlers(java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestDataQualityRulesErrorHandlers> getErrorHandlers() {
            return this.errorHandlers;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setSamplingConfig(UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }
        public UpdateDataQualityEvaluationTaskRequestDataQualityRulesSamplingConfig getSamplingConfig() {
            return this.samplingConfig;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public UpdateDataQualityEvaluationTaskRequestDataQualityRules setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestHooks extends TeaModel {
        /**
         * <p>Hook触发条件</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>Hook类型</p>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestHooks build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestHooks self = new UpdateDataQualityEvaluationTaskRequestHooks();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestHooks setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public UpdateDataQualityEvaluationTaskRequestHooks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels extends TeaModel {
        /**
         * <p>通知方式</p>
         */
        @NameInMap("Channels")
        public java.util.List<String> channels;

        public static UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels self = new UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels setChannels(java.util.List<String> channels) {
            this.channels = channels;
            return this;
        }
        public java.util.List<String> getChannels() {
            return this.channels;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers extends TeaModel {
        /**
         * <p>扩展信息，格式为 json，例如钉钉机器人支持 at 所有人</p>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;atAll&quot;: true }</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>告警接收人类型</p>
         * 
         * <strong>example:</strong>
         * <p>DingdingUrl</p>
         */
        @NameInMap("ReceiverType")
        public String receiverType;

        /**
         * <p>告警接收人</p>
         */
        @NameInMap("ReceiverValues")
        public java.util.List<String> receiverValues;

        public static UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers self = new UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setReceiverType(String receiverType) {
            this.receiverType = receiverType;
            return this;
        }
        public String getReceiverType() {
            return this.receiverType;
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers setReceiverValues(java.util.List<String> receiverValues) {
            this.receiverValues = receiverValues;
            return this;
        }
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotificationsNotifications extends TeaModel {
        /**
         * <p>通知方式</p>
         */
        @NameInMap("NotificationChannels")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels;

        /**
         * <p>告警接收人设置</p>
         */
        @NameInMap("NotificationReceivers")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> notificationReceivers;

        public static UpdateDataQualityEvaluationTaskRequestNotificationsNotifications build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotificationsNotifications self = new UpdateDataQualityEvaluationTaskRequestNotificationsNotifications();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotifications setNotificationChannels(java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationChannels> getNotificationChannels() {
            return this.notificationChannels;
        }

        public UpdateDataQualityEvaluationTaskRequestNotificationsNotifications setNotificationReceivers(java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> notificationReceivers) {
            this.notificationReceivers = notificationReceivers;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotificationsNotificationReceivers> getNotificationReceivers() {
            return this.notificationReceivers;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestNotifications extends TeaModel {
        /**
         * <p>通知触发条件</p>
         * 
         * <strong>example:</strong>
         * <p>${severity} == &quot;High&quot; AND ${status} == &quot;Critical&quot;</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>具体的消息通知设置</p>
         */
        @NameInMap("Notifications")
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotifications> notifications;

        public static UpdateDataQualityEvaluationTaskRequestNotifications build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestNotifications self = new UpdateDataQualityEvaluationTaskRequestNotifications();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestNotifications setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public UpdateDataQualityEvaluationTaskRequestNotifications setNotifications(java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotifications> notifications) {
            this.notifications = notifications;
            return this;
        }
        public java.util.List<UpdateDataQualityEvaluationTaskRequestNotificationsNotifications> getNotifications() {
            return this.notifications;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestTarget extends TeaModel {
        /**
         * <p>表所属的数据库类型</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>分区表的分区设置</p>
         * 
         * <strong>example:</strong>
         * <p>dt=$[yyyymmdd-1]</p>
         */
        @NameInMap("PartitionSpec")
        public String partitionSpec;

        /**
         * <p>表在数据地图中的唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>odsp.openapi.ods_d_openapi_log</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        public static UpdateDataQualityEvaluationTaskRequestTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestTarget self = new UpdateDataQualityEvaluationTaskRequestTarget();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestTarget setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public UpdateDataQualityEvaluationTaskRequestTarget setPartitionSpec(String partitionSpec) {
            this.partitionSpec = partitionSpec;
            return this;
        }
        public String getPartitionSpec() {
            return this.partitionSpec;
        }

        public UpdateDataQualityEvaluationTaskRequestTarget setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

    }

    public static class UpdateDataQualityEvaluationTaskRequestTrigger extends TeaModel {
        /**
         * <p>具体指明哪些调度节点的实例执行成功后可以触发</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>何种事件可以触发质量校验任务执行</p>
         * 
         * <strong>example:</strong>
         * <p>ByScheduledTaskInstance</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateDataQualityEvaluationTaskRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataQualityEvaluationTaskRequestTrigger self = new UpdateDataQualityEvaluationTaskRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateDataQualityEvaluationTaskRequestTrigger setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public UpdateDataQualityEvaluationTaskRequestTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
