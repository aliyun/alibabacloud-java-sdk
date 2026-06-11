// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionForView extends TeaModel {
    @NameInMap("agentConfig")
    public SubscriptionForViewAgentConfig agentConfig;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the subscription is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The filter settings.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>The UUID of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>23123123</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>The push settings.</p>
     */
    @NameInMap("pushingSetting")
    public SubscriptionForViewPushingSetting pushingSetting;

    /**
     * <p>The UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123123</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>订阅测试</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("subscriptionType")
    public String subscriptionType;

    /**
     * <p>The source type of the synchronization policy.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ARMS&quot;</p>
     */
    @NameInMap("syncFromType")
    public String syncFromType;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-23T02:29:02Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>Specifies the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    @NameInMap("workspaceFilterSetting")
    public WorkspaceFilterSetting workspaceFilterSetting;

    public static SubscriptionForView build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionForView self = new SubscriptionForView();
        return TeaModel.build(map, self);
    }

    public SubscriptionForView setAgentConfig(SubscriptionForViewAgentConfig agentConfig) {
        this.agentConfig = agentConfig;
        return this;
    }
    public SubscriptionForViewAgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    public SubscriptionForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SubscriptionForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubscriptionForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SubscriptionForView setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public SubscriptionForView setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public SubscriptionForView setPushingSetting(SubscriptionForViewPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public SubscriptionForViewPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public SubscriptionForView setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public SubscriptionForView setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SubscriptionForView setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public SubscriptionForView setSyncFromType(String syncFromType) {
        this.syncFromType = syncFromType;
        return this;
    }
    public String getSyncFromType() {
        return this.syncFromType;
    }

    public SubscriptionForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public SubscriptionForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubscriptionForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public SubscriptionForView setWorkspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
        this.workspaceFilterSetting = workspaceFilterSetting;
        return this;
    }
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

    public static class SubscriptionForViewAgentConfig extends TeaModel {
        @NameInMap("agentUuid")
        public String agentUuid;

        @NameInMap("routes")
        public java.util.List<NotifyRouteForSubscription> routes;

        public static SubscriptionForViewAgentConfig build(java.util.Map<String, ?> map) throws Exception {
            SubscriptionForViewAgentConfig self = new SubscriptionForViewAgentConfig();
            return TeaModel.build(map, self);
        }

        public SubscriptionForViewAgentConfig setAgentUuid(String agentUuid) {
            this.agentUuid = agentUuid;
            return this;
        }
        public String getAgentUuid() {
            return this.agentUuid;
        }

        public SubscriptionForViewAgentConfig setRoutes(java.util.List<NotifyRouteForSubscription> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<NotifyRouteForSubscription> getRoutes() {
            return this.routes;
        }

    }

    public static class SubscriptionForViewPushingSetting extends TeaModel {
        /**
         * <p>A list of action integration IDs for alert pushes.</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>The action plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        @NameInMap("responsePlanId")
        public String responsePlanId;

        /**
         * <p>A list of action integration IDs for recovery pushes.</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        /**
         * <p>The template UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static SubscriptionForViewPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            SubscriptionForViewPushingSetting self = new SubscriptionForViewPushingSetting();
            return TeaModel.build(map, self);
        }

        public SubscriptionForViewPushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        public SubscriptionForViewPushingSetting setResponsePlanId(String responsePlanId) {
            this.responsePlanId = responsePlanId;
            return this;
        }
        public String getResponsePlanId() {
            return this.responsePlanId;
        }

        public SubscriptionForViewPushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        public SubscriptionForViewPushingSetting setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

}
