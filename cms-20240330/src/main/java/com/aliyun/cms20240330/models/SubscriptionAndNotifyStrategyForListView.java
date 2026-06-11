// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionAndNotifyStrategyForListView extends TeaModel {
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

    @NameInMap("subscriptionUuid")
    public String subscriptionUuid;

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

    public static SubscriptionAndNotifyStrategyForListView build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionAndNotifyStrategyForListView self = new SubscriptionAndNotifyStrategyForListView();
        return TeaModel.build(map, self);
    }

    public SubscriptionAndNotifyStrategyForListView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SubscriptionAndNotifyStrategyForListView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubscriptionAndNotifyStrategyForListView setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SubscriptionAndNotifyStrategyForListView setMigrationBatchId(String migrationBatchId) {
        this.migrationBatchId = migrationBatchId;
        return this;
    }
    public String getMigrationBatchId() {
        return this.migrationBatchId;
    }

    public SubscriptionAndNotifyStrategyForListView setMigrationMeta(String migrationMeta) {
        this.migrationMeta = migrationMeta;
        return this;
    }
    public String getMigrationMeta() {
        return this.migrationMeta;
    }

    public SubscriptionAndNotifyStrategyForListView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubscriptionAndNotifyStrategyForListView setNotifyStrategy(NotifyStrategyForSNSView notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public NotifyStrategyForSNSView getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscriptionAndNotifyStrategyForListView setNotifyStrategyUuid(String notifyStrategyUuid) {
        this.notifyStrategyUuid = notifyStrategyUuid;
        return this;
    }
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    public SubscriptionAndNotifyStrategyForListView setSubscriptionUuid(String subscriptionUuid) {
        this.subscriptionUuid = subscriptionUuid;
        return this;
    }
    public String getSubscriptionUuid() {
        return this.subscriptionUuid;
    }

    public SubscriptionAndNotifyStrategyForListView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public SubscriptionAndNotifyStrategyForListView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubscriptionAndNotifyStrategyForListView setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public SubscriptionAndNotifyStrategyForListView setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public SubscriptionAndNotifyStrategyForListView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
