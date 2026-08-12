// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleV2 extends TeaModel {
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    /**
     * <p>The annotations.</p>
     */
    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    /**
     * <p>The business source. This field is read-only. Example values: managed_service_for_prometheus, umodel, application_insights, cloud_monitoring, and sls.</p>
     */
    @NameInMap("bizSource")
    public String bizSource;

    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    /**
     * <p>The content template.</p>
     */
    @NameInMap("contentTemplate")
    public String contentTemplate;

    /**
     * <p>The creation time in ISO 8601 format. This field is read-only.</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    /**
     * <p>The data source type. This field is read-only and derived.</p>
     */
    @NameInMap("datasourceType")
    public String datasourceType;

    /**
     * <p>The display name.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether the alert rule is enabled.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The labels.</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    /**
     * <p>The notification strategy ID. This field is read-only and derived from the first item in the notification strategy list.</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>The observable resource configuration.</p>
     */
    @NameInMap("observeResourceConfig")
    public ObserveResourceConfig observeResourceConfig;

    /**
     * <p><strong>[Deprecated]</strong> Indicates whether the rule applies to all resources of this type. This field is read-only and derived. Use observeResourceConfig.relationType set to ALL for equivalent semantics in new integrations.</p>
     */
    @NameInMap("observeResourceGlobalScope")
    @Deprecated
    public Boolean observeResourceGlobalScope;

    /**
     * <p>The list of observable resource IDs. This field is read-only and derived.</p>
     */
    @NameInMap("observeResourceList")
    public java.util.List<String> observeResourceList;

    /**
     * <p><strong>[Deprecated]</strong> The observable resource type. This field is read-only and derived. Use observeResourceConfig.entityType instead for new integrations.</p>
     */
    @NameInMap("observeResourceType")
    @Deprecated
    public String observeResourceType;

    /**
     * <p>The partition key. This field is read-only and maintained by the system for rule routing and sharding.</p>
     */
    @NameInMap("partitionKey")
    public String partitionKey;

    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    /**
     * <p>The RCA (root cause analysis) configuration.</p>
     */
    @NameInMap("rcaConfig")
    public AlertRuleRcaConfig rcaConfig;

    /**
     * <p>The region ID. This field is aligned with V1 AlertRule.regionId. Priority: request body regionId &gt; gateway callerRegionId.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    /**
     * <p>The severity levels covered by this rule, separated by commas. This field is read-only and derived. The format is the same as the filter.severityLevels query parameter.</p>
     */
    @NameInMap("severityLevels")
    public String severityLevels;

    /**
     * <p>The alert status. This field is read-only.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time in ISO 8601 format. This field is read-only.</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The rule UUID. This field is system-generated and read-only.</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The workspace.</p>
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
