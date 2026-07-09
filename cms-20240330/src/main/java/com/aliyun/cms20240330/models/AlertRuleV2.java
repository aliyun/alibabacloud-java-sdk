// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleV2 extends TeaModel {
    /**
     * <p>Configuration for action integrations, such as webhooks, that execute when an alert is triggered.</p>
     */
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    /**
     * <p>A set of key-value pairs that serve as annotations, providing additional, non-identifying information, such as a description or a runbook link.</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    /**
     * <p>The configuration for integrating the alert rule with Application Real-Time Monitoring Service (ARMS).</p>
     */
    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    /**
     * <p>The configuration for the conditions that trigger an alert.</p>
     */
    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>The template for the alert notification content.</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>The time the alert rule was created.</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The configuration for the data source to be evaluated.</p>
     */
    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>The data source type. Examples: <code>sls</code>, <code>prometheus</code>.</p>
     */
    @NameInMap("datasourceType")
    public String datasourceType;

    /**
     * <p>The user-defined display name for the alert rule.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Indicates whether the alert rule is active. Set to <code>true</code> to enable the rule, or <code>false</code> to disable it.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>A set of key-value pairs that serve as labels to filter and group alert rules.</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The configuration for sending notifications when an alert is triggered.</p>
     */
    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    /**
     * <p>The ID of the notification strategy to use for this alert rule.</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>Indicates whether the alert rule monitors all resources of the specified type. If <code>true</code>, the rule applies globally within the workspace.</p>
     */
    @NameInMap("observeResourceGlobalScope")
    public Boolean observeResourceGlobalScope;

    /**
     * <p>A list of specific resource IDs to monitor, used only when <code>observeResourceGlobalScope</code> is <code>false</code>.</p>
     */
    @NameInMap("observeResourceList")
    public java.util.List<String> observeResourceList;

    /**
     * <p>The type of resource that the alert rule monitors.</p>
     */
    @NameInMap("observeResourceType")
    public String observeResourceType;

    /**
     * <p>The partition key used to group alerts. Alerts with the same partition key are treated as a single incident.</p>
     */
    @NameInMap("partitionKey")
    public String partitionKey;

    /**
     * <p>The configuration for querying and processing data from the data source.</p>
     */
    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    /**
     * <p>The configuration for how often the alert rule is evaluated.</p>
     */
    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>The severity level of the alert. Examples: <code>critical</code>, <code>warning</code>.</p>
     */
    @NameInMap("severityLevels")
    public String severityLevels;

    /**
     * <p>The current status of the alert rule. Examples: <code>RUNNING</code>, <code>STOPPED</code>.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time the alert rule was last updated.</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The unique identifier for the alert rule.</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The ID of the workspace that contains the alert rule.</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static AlertRuleV2 build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleV2 self = new AlertRuleV2();
        return TeaModel.build(map, self);
    }

    public AlertRuleV2 setActionIntegrationConfig(ActionIntegrationConfig actionIntegrationConfig) {
        this.actionIntegrationConfig = actionIntegrationConfig;
        return this;
    }
    public ActionIntegrationConfig getActionIntegrationConfig() {
        return this.actionIntegrationConfig;
    }

    public AlertRuleV2 setAnnotations(java.util.Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.Map<String, String> getAnnotations() {
        return this.annotations;
    }

    public AlertRuleV2 setArmsIntegrationConfig(ArmsIntegrationConfig armsIntegrationConfig) {
        this.armsIntegrationConfig = armsIntegrationConfig;
        return this;
    }
    public ArmsIntegrationConfig getArmsIntegrationConfig() {
        return this.armsIntegrationConfig;
    }

    public AlertRuleV2 setConditionConfig(ConditionConfigUnified conditionConfig) {
        this.conditionConfig = conditionConfig;
        return this;
    }
    public ConditionConfigUnified getConditionConfig() {
        return this.conditionConfig;
    }

    public AlertRuleV2 setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
        return this;
    }
    public String getContentTemplate() {
        return this.contentTemplate;
    }

    public AlertRuleV2 setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AlertRuleV2 setDatasourceConfig(DatasourceConfigUnified datasourceConfig) {
        this.datasourceConfig = datasourceConfig;
        return this;
    }
    public DatasourceConfigUnified getDatasourceConfig() {
        return this.datasourceConfig;
    }

    public AlertRuleV2 setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public AlertRuleV2 setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AlertRuleV2 setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public AlertRuleV2 setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public AlertRuleV2 setNotifyConfig(NotifyConfigUnified notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public NotifyConfigUnified getNotifyConfig() {
        return this.notifyConfig;
    }

    public AlertRuleV2 setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public AlertRuleV2 setObserveResourceGlobalScope(Boolean observeResourceGlobalScope) {
        this.observeResourceGlobalScope = observeResourceGlobalScope;
        return this;
    }
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    public AlertRuleV2 setObserveResourceList(java.util.List<String> observeResourceList) {
        this.observeResourceList = observeResourceList;
        return this;
    }
    public java.util.List<String> getObserveResourceList() {
        return this.observeResourceList;
    }

    public AlertRuleV2 setObserveResourceType(String observeResourceType) {
        this.observeResourceType = observeResourceType;
        return this;
    }
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    public AlertRuleV2 setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public String getPartitionKey() {
        return this.partitionKey;
    }

    public AlertRuleV2 setQueryConfig(QueryConfigUnified queryConfig) {
        this.queryConfig = queryConfig;
        return this;
    }
    public QueryConfigUnified getQueryConfig() {
        return this.queryConfig;
    }

    public AlertRuleV2 setScheduleConfig(ScheduleConfigUnified scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public ScheduleConfigUnified getScheduleConfig() {
        return this.scheduleConfig;
    }

    public AlertRuleV2 setSeverityLevels(String severityLevels) {
        this.severityLevels = severityLevels;
        return this;
    }
    public String getSeverityLevels() {
        return this.severityLevels;
    }

    public AlertRuleV2 setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AlertRuleV2 setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public AlertRuleV2 setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public AlertRuleV2 setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
