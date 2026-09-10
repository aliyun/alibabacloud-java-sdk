// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionAndNotifyStrategyForListView extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The migration batch ID. This field is empty for user-created entries and has a value for migration artifacts.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("migrationBatchId")
    public String migrationBatchId;

    /**
     * <p>The migration metadata JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("migrationMeta")
    public String migrationMeta;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The notification policy snapshot.</p>
     */
    @NameInMap("notifyStrategy")
    public NotifyStrategyForSNSView notifyStrategy;

    /**
     * <p>The UUID of the associated notifyStrategy, which is shared with the responsePlan UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("notifyStrategyUuid")
    public String notifyStrategyUuid;

    /**
     * <p>The UUID of the directly bound primary subscription, which has a 1:1 association in the NOTIFY mode.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("subscriptionUuid")
    public String subscriptionUuid;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The user ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The UUID of the aggregate entity.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The optimistic lock version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    /**
     * <p>The workspace identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
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
