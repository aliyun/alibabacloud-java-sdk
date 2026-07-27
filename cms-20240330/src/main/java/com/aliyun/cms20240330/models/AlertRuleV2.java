// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleV2 extends TeaModel {
    @NameInMap("actionIntegrationConfig")
    public ActionIntegrationConfig actionIntegrationConfig;

    @NameInMap("annotations")
    public java.util.Map<String, String> annotations;

    @NameInMap("armsIntegrationConfig")
    public ArmsIntegrationConfig armsIntegrationConfig;

    @NameInMap("bizSource")
    public String bizSource;

    @NameInMap("conditionConfig")
    public ConditionConfigUnified conditionConfig;

    @NameInMap("contentTemplate")
    public String contentTemplate;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("datasourceConfig")
    public DatasourceConfigUnified datasourceConfig;

    @NameInMap("datasourceType")
    public String datasourceType;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("labels")
    public java.util.Map<String, String> labels;

    @NameInMap("notifyConfig")
    public NotifyConfigUnified notifyConfig;

    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    @NameInMap("observeResourceConfig")
    public ObserveResourceConfig observeResourceConfig;

    @NameInMap("observeResourceGlobalScope")
    @Deprecated
    public Boolean observeResourceGlobalScope;

    @NameInMap("observeResourceList")
    public java.util.List<String> observeResourceList;

    @NameInMap("observeResourceType")
    @Deprecated
    public String observeResourceType;

    @NameInMap("partitionKey")
    public String partitionKey;

    @NameInMap("queryConfig")
    public QueryConfigUnified queryConfig;

    @NameInMap("rcaConfig")
    public AlertRuleRcaConfig rcaConfig;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("scheduleConfig")
    public ScheduleConfigUnified scheduleConfig;

    @NameInMap("severityLevels")
    public String severityLevels;

    @NameInMap("status")
    public String status;

    @NameInMap("updatedAt")
    public String updatedAt;

    @NameInMap("uuid")
    public String uuid;

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
