// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionAndNotifyStrategyForModify extends TeaModel {
    /**
     * <p>The description of the alert policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Used to monitor the CPU utilization of ECS instances</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Read-only. This parameter does not take effect even if specified. The backend forcibly sets this parameter to true during creation and retains the current value during updates. To enable or disable the policy, call the EnableAlertPolicy or DisableAlertPolicy operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>Policy Name of the alert policy. If this parameter is not specified, the backend derives Policy Name from notifyStrategy.</p>
     * 
     * <strong>example:</strong>
     * <p>my-alert-policy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The notification configuration that defines noise reduction rules, notification channel routing, and templates. This parameter is required for Create operations.</p>
     */
    @NameInMap("notifyStrategy")
    public NotifyStrategyForSNSModify notifyStrategy;

    /**
     * <p>The event management configuration that defines recovery notifications, repeat notifications, automatic recovery, and escalation policies.</p>
     */
    @NameInMap("responsePlan")
    public IncidentResponsePlanForSNSModify responsePlan;

    /**
     * <p>The single primary subscription configuration that defines event filter conditions. This parameter is mutually exclusive with subscriptions. Do not specify both parameters at the same time.</p>
     */
    @NameInMap("subscription")
    public SubscriptionForSNSModify subscription;

    /**
     * <p>Dedicated to Update operations. Performs batch create, update, or remove adjustments on member subscriptions.</p>
     */
    @NameInMap("subscriptions")
    public java.util.List<SubscriptionOp> subscriptions;

    /**
     * <p>The unique identifier of the alert policy. This parameter is required for Update operations. Do not specify this parameter for Create operations because the backend automatically generates the value.</p>
     * 
     * <strong>example:</strong>
     * <p>7076c75c-c804-461e-975f-c6f9ed5af745</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The optimistic lock version number. This parameter is required for Update operations and must match the current value on the backend. Otherwise, a 409 VersionConflict error is returned. The version number increments by 1 after each successful update.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    public static SubscriptionAndNotifyStrategyForModify build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionAndNotifyStrategyForModify self = new SubscriptionAndNotifyStrategyForModify();
        return TeaModel.build(map, self);
    }

    public SubscriptionAndNotifyStrategyForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubscriptionAndNotifyStrategyForModify setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SubscriptionAndNotifyStrategyForModify setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubscriptionAndNotifyStrategyForModify setNotifyStrategy(NotifyStrategyForSNSModify notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public NotifyStrategyForSNSModify getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscriptionAndNotifyStrategyForModify setResponsePlan(IncidentResponsePlanForSNSModify responsePlan) {
        this.responsePlan = responsePlan;
        return this;
    }
    public IncidentResponsePlanForSNSModify getResponsePlan() {
        return this.responsePlan;
    }

    public SubscriptionAndNotifyStrategyForModify setSubscription(SubscriptionForSNSModify subscription) {
        this.subscription = subscription;
        return this;
    }
    public SubscriptionForSNSModify getSubscription() {
        return this.subscription;
    }

    public SubscriptionAndNotifyStrategyForModify setSubscriptions(java.util.List<SubscriptionOp> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }
    public java.util.List<SubscriptionOp> getSubscriptions() {
        return this.subscriptions;
    }

    public SubscriptionAndNotifyStrategyForModify setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public SubscriptionAndNotifyStrategyForModify setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
