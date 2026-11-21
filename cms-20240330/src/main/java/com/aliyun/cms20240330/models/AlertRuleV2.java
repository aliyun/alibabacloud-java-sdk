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
     * 
     * <strong>example:</strong>
     * <p>{&quot;platform&quot;:&quot;github&quot;}</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    /**
     * <p>The ARMS integration configuration.</p>
     */
    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    /**
     * <p>The business source. This parameter is read-only. Examples include managed_service_for_prometheus, umodel, application_insights, cloud_monitoring, and sls.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("bizSource")
    public String bizSource;

    /**
     * <p>The detection condition configuration aggregation, including simple Prometheus, UModel, simple APM, and composite APM.</p>
     */
    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>The content template.</p>
     * 
     * <strong>example:</strong>
     * <p>告警触发: ${metricName} 当前值 ${currentValue} 超过阈值 ${threshold}</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>The creation time in ISO 8601 format. This parameter is read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>1751595283143</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The datasource config aggregation. The PROMETHEUS, UMODEL, and APM data sources share the same object, and fields are selected based on the type.</p>
     */
    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>The data source type. This parameter is read-only and derived.</p>
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
     * <p>CPU水位告警95%</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether the rule is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;platform&quot;:&quot;github&quot;}</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The manager of the rule. This parameter is read-only. An empty value indicates a user-created rule. A non-empty value indicates that the rule is created and managed by the corresponding cloud service logic.</p>
     * 
     * <strong>example:</strong>
     * <p>integrationCenter</p>
     */
    @NameInMap("managedBy")
    public String managedBy;

    /**
     * <p>The notification configuration aggregation. Currently, only DIRECT_NOTIFY is supported, which corresponds to DirectNotifyConfig.</p>
     */
    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    /**
     * <p>The notification strategy ID. This parameter is read-only and derived from the first item in the notification strategy list.</p>
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
     * <p><strong>[Deprecated]</strong> Specifies whether the rule takes effect on all resources of this type. This parameter is read-only and derived. For new integrations, check whether observeResourceConfig.relationType is set to ALL to determine the equivalent semantics.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("observeResourceGlobalScope")
    @Deprecated
    public Boolean observeResourceGlobalScope;

    /**
     * <p>The list of observable resource IDs. This parameter is read-only and derived.</p>
     */
    @NameInMap("observeResourceList")
    public java.util.List<String> observeResourceList;

    /**
     * <p><strong>[Deprecated]</strong> The observable resource type. This parameter is read-only and derived. For new integrations, use observeResourceConfig.entityType instead.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("observeResourceType")
    @Deprecated
    public String observeResourceType;

    /**
     * <p>The partition key. This parameter is read-only and maintained by the system for rule routing and sharding.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("partitionKey")
    public String partitionKey;

    /**
     * <p>The query configuration aggregation, including PROMETHEUS_SINGLE_QUERY, UMODEL_METRICSET_QUERY, and APM_MULTI_QUERY.</p>
     */
    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    /**
     * <p>The root cause analysis (RCA) configuration.</p>
     */
    @NameInMap("rcaConfig")
    public AlertRuleRcaConfig rcaConfig;

    /**
     * <p>The region ID. This parameter is aligned with V1 AlertRule.regionId. Priority: regionId in the request body &gt; callerRegionId in the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The schedule configuration aggregation. Currently, only FIXED is supported.</p>
     */
    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>The severity levels covered by this rule, separated by commas. This parameter is read-only and derived. The format is consistent with the filter.severityLevels query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("severityLevels")
    public String severityLevels;

    /**
     * <p>The alert status. This parameter is read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>Alarm</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time in ISO 8601 format. This parameter is read-only.</p>
     * 
     * <strong>example:</strong>
     * <p>1764556086388</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The UUID of the rule. This parameter is generated by the system and is read-only.</p>
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
