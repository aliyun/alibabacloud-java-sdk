// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionAndNotifyStrategyForView extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("migrationBatchId")
    public String migrationBatchId;

    @NameInMap("migrationMeta")
    public String migrationMeta;

    @NameInMap("name")
    public String name;

    @NameInMap("notifyStrategy")
    public NotifyStrategyForSNSView notifyStrategy;

    @NameInMap("notifyStrategyUuid")
    public String notifyStrategyUuid;

    @NameInMap("responsePlan")
    public IncidentResponsePlanForSNSView responsePlan;

    @NameInMap("subscription")
    public SubscriptionForSNSView subscription;

    @NameInMap("subscriptionUuid")
    public String subscriptionUuid;

    @NameInMap("subscriptions")
    public java.util.List<SubscriptionForView> subscriptions;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

    @NameInMap("uuid")
    public String uuid;

    @NameInMap("version")
    public Integer version;

    @NameInMap("workspace")
    public String workspace;

    public static SubscriptionAndNotifyStrategyForView build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionAndNotifyStrategyForView self = new SubscriptionAndNotifyStrategyForView();
        return TeaModel.build(map, self);
    }

    public SubscriptionAndNotifyStrategyForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SubscriptionAndNotifyStrategyForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubscriptionAndNotifyStrategyForView setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SubscriptionAndNotifyStrategyForView setMigrationBatchId(String migrationBatchId) {
        this.migrationBatchId = migrationBatchId;
        return this;
    }
    public String getMigrationBatchId() {
        return this.migrationBatchId;
    }

    public SubscriptionAndNotifyStrategyForView setMigrationMeta(String migrationMeta) {
        this.migrationMeta = migrationMeta;
        return this;
    }
    public String getMigrationMeta() {
        return this.migrationMeta;
    }

    public SubscriptionAndNotifyStrategyForView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubscriptionAndNotifyStrategyForView setNotifyStrategy(NotifyStrategyForSNSView notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public NotifyStrategyForSNSView getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscriptionAndNotifyStrategyForView setNotifyStrategyUuid(String notifyStrategyUuid) {
        this.notifyStrategyUuid = notifyStrategyUuid;
        return this;
    }
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    public SubscriptionAndNotifyStrategyForView setResponsePlan(IncidentResponsePlanForSNSView responsePlan) {
        this.responsePlan = responsePlan;
        return this;
    }
    public IncidentResponsePlanForSNSView getResponsePlan() {
        return this.responsePlan;
    }

    public SubscriptionAndNotifyStrategyForView setSubscription(SubscriptionForSNSView subscription) {
        this.subscription = subscription;
        return this;
    }
    public SubscriptionForSNSView getSubscription() {
        return this.subscription;
    }

    public SubscriptionAndNotifyStrategyForView setSubscriptionUuid(String subscriptionUuid) {
        this.subscriptionUuid = subscriptionUuid;
        return this;
    }
    public String getSubscriptionUuid() {
        return this.subscriptionUuid;
    }

    public SubscriptionAndNotifyStrategyForView setSubscriptions(java.util.List<SubscriptionForView> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }
    public java.util.List<SubscriptionForView> getSubscriptions() {
        return this.subscriptions;
    }

    public SubscriptionAndNotifyStrategyForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public SubscriptionAndNotifyStrategyForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubscriptionAndNotifyStrategyForView setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public SubscriptionAndNotifyStrategyForView setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public SubscriptionAndNotifyStrategyForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
