// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleV2 extends TeaModel {
    /**
     * <p>The action integration configuration.</p>
     */
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    /**
     * <p>The annotations.</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    /**
     * <p>The Application Real-Time Monitoring Service (ARMS) integration configuration.</p>
     */
    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    /**
     * <p>The business source (read-only), such as managed_service_for_prometheus, umodel, application_insights, cloud_monitoring, or sls.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("bizSource")
    public String bizSource;

    /**
     * <p>The detection condition configuration aggregation (Prometheus simple, UModel, APM simple, or APM composite).</p>
     */
    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>The content template.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert triggered: ${metricName} current value ${currentValue} exceeds threshold ${threshold}</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>The creation time (read-only), in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>1751595283143</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The datasource config aggregation (PROMETHEUS, UMODEL, and APM share a single object. Fields are selected based on the type).</p>
     */
    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>The data source type (read-only, derived).</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("datasourceType")
    public String datasourceType;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU usage alert 95%</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether the alert rule is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The labels.</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The rule manager (read-only). An empty value indicates a user-created rule. A non-empty value indicates the rule is created and managed by the corresponding cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>integrationCenter</p>
     */
    @NameInMap("managedBy")
    public String managedBy;

    /**
     * <p>The notification configuration aggregation (currently only DIRECT_NOTIFY, corresponding to DirectNotifyConfig).</p>
     */
    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    /**
     * <p>The notification policy ID (read-only, derived). The value is the first entry in the notification policy list.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>The observable resource configuration.</p>
     */
    @NameInMap("observeResourceConfig")
    public ObserveResourceConfig observeResourceConfig;

    /**
     * <p><strong>[Deprecated]</strong> Specifies whether the rule takes effect on all resources of this type (read-only, derived). For new integrations, use observeResourceConfig.relationType and check whether the value is ALL for equivalent semantics.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("observeResourceGlobalScope")
    @Deprecated
    public Boolean observeResourceGlobalScope;

    /**
     * <p>The list of observable resource IDs (read-only, derived).</p>
     */
    @NameInMap("observeResourceList")
    public java.util.List<String> observeResourceList;

    /**
     * <p><strong>[Deprecated]</strong> The observable resource type (read-only, derived). For new integrations, use observeResourceConfig.entityType instead.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("observeResourceType")
    @Deprecated
    public String observeResourceType;

    /**
     * <p>The partition key (read-only). Maintained by the system for rule routing and sharding.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("partitionKey")
    public String partitionKey;

    /**
     * <p>The query configuration aggregation (PROMETHEUS_SINGLE_QUERY, UMODEL_METRICSET_QUERY, or APM_MULTI_QUERY).</p>
     */
    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    /**
     * <p>The root cause analysis (RCA) configuration.</p>
     */
    @NameInMap("rcaConfig")
    public AlertRuleRcaConfig rcaConfig;

    /**
     * <p>The region ID, aligned with V1 AlertRule.regionId. Priority: regionId in the request body takes precedence over callerRegionId from the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The scheduling configuration aggregation (currently only FIXED is supported).</p>
     */
    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>The severity levels covered by this rule, separated by commas (read-only, derived). The format is consistent with the filter.severityLevels query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("severityLevels")
    public String severityLevels;

    /**
     * <p>The alert status (read-only).</p>
     * 
     * <strong>example:</strong>
     * <p>Alarm</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time (read-only), in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>1764556086388</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The rule UUID (system-generated, read-only).</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxx-xxxx</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
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

    public AlertRuleV2 setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
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

    public AlertRuleV2 setManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }
    public String getManagedBy() {
        return this.managedBy;
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

    public AlertRuleV2 setObserveResourceConfig(ObserveResourceConfig observeResourceConfig) {
        this.observeResourceConfig = observeResourceConfig;
        return this;
    }
    public ObserveResourceConfig getObserveResourceConfig() {
        return this.observeResourceConfig;
    }

    @Deprecated
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

    @Deprecated
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

    public AlertRuleV2 setRcaConfig(AlertRuleRcaConfig rcaConfig) {
        this.rcaConfig = rcaConfig;
        return this;
    }
    public AlertRuleRcaConfig getRcaConfig() {
        return this.rcaConfig;
    }

    public AlertRuleV2 setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
