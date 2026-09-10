// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesFilter extends TeaModel {
    /**
     * <p>The filter condition for the business source.</p>
     */
    @NameInMap("bizSource")
    public BizSourceFilter bizSource;

    /**
     * <p>The filter condition for the data source type.</p>
     */
    @NameInMap("datasourceType")
    public DatasourceTypeFilter datasourceType;

    /**
     * <p>The filter for alert rule names.</p>
     */
    @NameInMap("displayName")
    public DisplayNameFilter displayName;

    /**
     * <p>The filter for whether the alert rule is enabled.</p>
     */
    @NameInMap("enabled")
    public EnabledFilter enabled;

    /**
     * <p>The filter for labels.</p>
     */
    @NameInMap("labels")
    public LabelsFilter labels;

    /**
     * <p>The migration status filter. Set isMigrated to true to query migrated rules (migration_status is not 0 or NULL). Set isMigrated to false to query native rules (migration_status=0).</p>
     */
    @NameInMap("migrationStatus")
    public MigrationStatusFilter migrationStatus;

    /**
     * <p>The filter condition for notification channels.</p>
     */
    @NameInMap("notificationChannels")
    public NotificationChannelsFilter notificationChannels;

    /**
     * <p>The filter condition for the notification policy ID.</p>
     */
    @NameInMap("notifyStrategyId")
    public NotifyStrategyIdFilter notifyStrategyId;

    /**
     * <p>The composite filter based on the observeResourceConfig structure. This filter takes priority over the standalone observeResourceType, observeResourceGlobalScope, and observeResourceList fields. If both are specified and their semantics conflict, the request is rejected.</p>
     */
    @NameInMap("observeResourceConfig")
    public ObserveResourceConfigFilter observeResourceConfig;

    /**
     * <p>The filter condition for the global scope of observable resources.</p>
     */
    @NameInMap("observeResourceGlobalScope")
    public ObserveResourceGlobalScopeFilter observeResourceGlobalScope;

    /**
     * <p><strong>[Deprecated]</strong> The single-value filter for the resource instance ID. This field is retained only for compatibility with legacy SDKs. Use observeResourceList.contains instead for new integrations. If this field is not empty and observeResourceList is not specified, it is equivalent to observeResourceList.contains=[observeResourceInstanceId].</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1abcxxxxxxxx</p>
     */
    @NameInMap("observeResourceInstanceId")
    @Deprecated
    public String observeResourceInstanceId;

    /**
     * <p>The filter condition for the list of observable resources.</p>
     */
    @NameInMap("observeResourceList")
    public ObserveResourceListFilter observeResourceList;

    /**
     * <p><strong>[Deprecated]</strong> The filter for the observable resource type. Use observeResourceConfig.entityType instead for new integrations.</p>
     */
    @NameInMap("observeResourceType")
    @Deprecated
    public ObserveResourceTypeFilter observeResourceType;

    /**
     * <p>The filter condition for the partition key.</p>
     */
    @NameInMap("partitionKey")
    public PartitionKeyFilter partitionKey;

    /**
     * <p>The filter condition for alert severity levels.</p>
     */
    @NameInMap("severityLevels")
    public SeverityLevelsFilter severityLevels;

    /**
     * <p>The filter for statuses.</p>
     */
    @NameInMap("status")
    public StatusFilter status;

    /**
     * <p>The filter for alert rule UUIDs.</p>
     */
    @NameInMap("uuid")
    public UuidFilter uuid;

    public static QueryAlertRulesFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesFilter self = new QueryAlertRulesFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesFilter setBizSource(BizSourceFilter bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public BizSourceFilter getBizSource() {
        return this.bizSource;
    }

    public QueryAlertRulesFilter setDatasourceType(DatasourceTypeFilter datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public DatasourceTypeFilter getDatasourceType() {
        return this.datasourceType;
    }

    public QueryAlertRulesFilter setDisplayName(DisplayNameFilter displayName) {
        this.displayName = displayName;
        return this;
    }
    public DisplayNameFilter getDisplayName() {
        return this.displayName;
    }

    public QueryAlertRulesFilter setEnabled(EnabledFilter enabled) {
        this.enabled = enabled;
        return this;
    }
    public EnabledFilter getEnabled() {
        return this.enabled;
    }

    public QueryAlertRulesFilter setLabels(LabelsFilter labels) {
        this.labels = labels;
        return this;
    }
    public LabelsFilter getLabels() {
        return this.labels;
    }

    public QueryAlertRulesFilter setMigrationStatus(MigrationStatusFilter migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public MigrationStatusFilter getMigrationStatus() {
        return this.migrationStatus;
    }

    public QueryAlertRulesFilter setNotificationChannels(NotificationChannelsFilter notificationChannels) {
        this.notificationChannels = notificationChannels;
        return this;
    }
    public NotificationChannelsFilter getNotificationChannels() {
        return this.notificationChannels;
    }

    public QueryAlertRulesFilter setNotifyStrategyId(NotifyStrategyIdFilter notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public NotifyStrategyIdFilter getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public QueryAlertRulesFilter setObserveResourceConfig(ObserveResourceConfigFilter observeResourceConfig) {
        this.observeResourceConfig = observeResourceConfig;
        return this;
    }
    public ObserveResourceConfigFilter getObserveResourceConfig() {
        return this.observeResourceConfig;
    }

    public QueryAlertRulesFilter setObserveResourceGlobalScope(ObserveResourceGlobalScopeFilter observeResourceGlobalScope) {
        this.observeResourceGlobalScope = observeResourceGlobalScope;
        return this;
    }
    public ObserveResourceGlobalScopeFilter getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    @Deprecated
    public QueryAlertRulesFilter setObserveResourceInstanceId(String observeResourceInstanceId) {
        this.observeResourceInstanceId = observeResourceInstanceId;
        return this;
    }
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    public QueryAlertRulesFilter setObserveResourceList(ObserveResourceListFilter observeResourceList) {
        this.observeResourceList = observeResourceList;
        return this;
    }
    public ObserveResourceListFilter getObserveResourceList() {
        return this.observeResourceList;
    }

    @Deprecated
    public QueryAlertRulesFilter setObserveResourceType(ObserveResourceTypeFilter observeResourceType) {
        this.observeResourceType = observeResourceType;
        return this;
    }
    public ObserveResourceTypeFilter getObserveResourceType() {
        return this.observeResourceType;
    }

    public QueryAlertRulesFilter setPartitionKey(PartitionKeyFilter partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public PartitionKeyFilter getPartitionKey() {
        return this.partitionKey;
    }

    public QueryAlertRulesFilter setSeverityLevels(SeverityLevelsFilter severityLevels) {
        this.severityLevels = severityLevels;
        return this;
    }
    public SeverityLevelsFilter getSeverityLevels() {
        return this.severityLevels;
    }

    public QueryAlertRulesFilter setStatus(StatusFilter status) {
        this.status = status;
        return this;
    }
    public StatusFilter getStatus() {
        return this.status;
    }

    public QueryAlertRulesFilter setUuid(UuidFilter uuid) {
        this.uuid = uuid;
        return this;
    }
    public UuidFilter getUuid() {
        return this.uuid;
    }

}
