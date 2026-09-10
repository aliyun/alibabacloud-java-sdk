// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionForSNSView extends TeaModel {
    /**
     * <p>The time when the subscription was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Indicates whether the subscription is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The filter configuration.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>The lifecycle mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The subscription name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The reverse association to the SNS (= snsUuid).</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("notifyStrategyUuid")
    public String notifyStrategyUuid;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Indicates whether the subscription includes legacy product events (CMS 1.0, ARMS, or SLS events where workspace is null). Valid values: true: Subscribed. false or null: Not subscribed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("subscribeLegacyEvent")
    public Boolean subscribeLegacyEvent;

    /**
     * <p>The subscription type.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("subscriptionType")
    public String subscriptionType;

    /**
     * <p>The sync source type.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The time when the subscription was last updated.</p>
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
     * <p>The subscription UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-id-001</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("workspace")
    public String workspace;

    /**
     * <p>The workspace filter configuration.</p>
     */
    @NameInMap("workspaceFilterSetting")
    public WorkspaceFilterSetting workspaceFilterSetting;

    public static SubscriptionForSNSView build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionForSNSView self = new SubscriptionForSNSView();
        return TeaModel.build(map, self);
    }

    public SubscriptionForSNSView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SubscriptionForSNSView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SubscriptionForSNSView setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public SubscriptionForSNSView setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SubscriptionForSNSView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubscriptionForSNSView setNotifyStrategyUuid(String notifyStrategyUuid) {
        this.notifyStrategyUuid = notifyStrategyUuid;
        return this;
    }
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    public SubscriptionForSNSView setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubscriptionForSNSView setSubscribeLegacyEvent(Boolean subscribeLegacyEvent) {
        this.subscribeLegacyEvent = subscribeLegacyEvent;
        return this;
    }
    public Boolean getSubscribeLegacyEvent() {
        return this.subscribeLegacyEvent;
    }

    public SubscriptionForSNSView setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public SubscriptionForSNSView setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public SubscriptionForSNSView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public SubscriptionForSNSView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubscriptionForSNSView setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public SubscriptionForSNSView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public SubscriptionForSNSView setWorkspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
        this.workspaceFilterSetting = workspaceFilterSetting;
        return this;
    }
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

}
