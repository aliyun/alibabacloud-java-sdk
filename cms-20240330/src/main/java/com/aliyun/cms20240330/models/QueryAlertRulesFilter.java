// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesFilter extends TeaModel {
    @NameInMap("bizSource")
    public BizSourceFilter bizSource;

    @NameInMap("datasourceType")
    public DatasourceTypeFilter datasourceType;

    @NameInMap("displayName")
    public DisplayNameFilter displayName;

    @NameInMap("enabled")
    public EnabledFilter enabled;

    @NameInMap("labels")
    public LabelsFilter labels;

    @NameInMap("notificationChannels")
    public NotificationChannelsFilter notificationChannels;

    @NameInMap("notifyStrategyId")
    public NotifyStrategyIdFilter notifyStrategyId;

    @NameInMap("observeResourceConfig")
    public ObserveResourceConfigFilter observeResourceConfig;

    @NameInMap("observeResourceGlobalScope")
    public ObserveResourceGlobalScopeFilter observeResourceGlobalScope;

    /**
     * <strong>example:</strong>
     * <p>i-bp1abcxxxxxxxx</p>
     */
    @NameInMap("observeResourceInstanceId")
    @Deprecated
    public String observeResourceInstanceId;

    @NameInMap("observeResourceList")
    public ObserveResourceListFilter observeResourceList;

    @NameInMap("observeResourceType")
    @Deprecated
    public ObserveResourceTypeFilter observeResourceType;

    @NameInMap("partitionKey")
    public PartitionKeyFilter partitionKey;

    @NameInMap("severityLevels")
    public SeverityLevelsFilter severityLevels;

    @NameInMap("status")
    public StatusFilter status;

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
