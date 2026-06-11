// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionForModify extends TeaModel {
    @NameInMap("agentConfig")
    public SubscriptionForModifyAgentConfig agentConfig;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Filter settings.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>Notification policy UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>Push settings.</p>
     */
    @NameInMap("pushingSetting")
    public SubscriptionForModifyPushingSetting pushingSetting;

    /**
     * <p>Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试订阅</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    @NameInMap("workspaceFilterSetting")
    public WorkspaceFilterSetting workspaceFilterSetting;

    public static SubscriptionForModify build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionForModify self = new SubscriptionForModify();
        return TeaModel.build(map, self);
    }

    public SubscriptionForModify setAgentConfig(SubscriptionForModifyAgentConfig agentConfig) {
        this.agentConfig = agentConfig;
        return this;
    }
    public SubscriptionForModifyAgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    public SubscriptionForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubscriptionForModify setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public SubscriptionForModify setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public SubscriptionForModify setPushingSetting(SubscriptionForModifyPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public SubscriptionForModifyPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public SubscriptionForModify setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SubscriptionForModify setWorkspaceFilterSetting(WorkspaceFilterSetting workspaceFilterSetting) {
        this.workspaceFilterSetting = workspaceFilterSetting;
        return this;
    }
    public WorkspaceFilterSetting getWorkspaceFilterSetting() {
        return this.workspaceFilterSetting;
    }

    public static class SubscriptionForModifyAgentConfig extends TeaModel {
        @NameInMap("agentUuid")
        public String agentUuid;

        @NameInMap("routes")
        public java.util.List<NotifyRouteForSubscription> routes;

        public static SubscriptionForModifyAgentConfig build(java.util.Map<String, ?> map) throws Exception {
            SubscriptionForModifyAgentConfig self = new SubscriptionForModifyAgentConfig();
            return TeaModel.build(map, self);
        }

        public SubscriptionForModifyAgentConfig setAgentUuid(String agentUuid) {
            this.agentUuid = agentUuid;
            return this;
        }
        public String getAgentUuid() {
            return this.agentUuid;
        }

        public SubscriptionForModifyAgentConfig setRoutes(java.util.List<NotifyRouteForSubscription> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<NotifyRouteForSubscription> getRoutes() {
            return this.routes;
        }

    }

    public static class SubscriptionForModifyPushingSetting extends TeaModel {
        /**
         * <p>A list of alert push action plan IDs.</p>
         */
        @NameInMap("alertActionIds")
        public java.util.List<String> alertActionIds;

        /**
         * <p>Action plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        @NameInMap("responsePlanId")
        public String responsePlanId;

        /**
         * <p>A list of action integration plan IDs.</p>
         */
        @NameInMap("restoreActionIds")
        public java.util.List<String> restoreActionIds;

        /**
         * <p>Template UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        @NameInMap("templateUuid")
        public String templateUuid;

        public static SubscriptionForModifyPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            SubscriptionForModifyPushingSetting self = new SubscriptionForModifyPushingSetting();
            return TeaModel.build(map, self);
        }

        public SubscriptionForModifyPushingSetting setAlertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }
        public java.util.List<String> getAlertActionIds() {
            return this.alertActionIds;
        }

        public SubscriptionForModifyPushingSetting setResponsePlanId(String responsePlanId) {
            this.responsePlanId = responsePlanId;
            return this;
        }
        public String getResponsePlanId() {
            return this.responsePlanId;
        }

        public SubscriptionForModifyPushingSetting setRestoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }
        public java.util.List<String> getRestoreActionIds() {
            return this.restoreActionIds;
        }

        public SubscriptionForModifyPushingSetting setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

}
