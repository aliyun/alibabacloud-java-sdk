// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionAndNotifyStrategyForModify extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>Optional. If omitted, the backend derives the name from <code>notifyStrategy</code>.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("notifyStrategy")
    public NotifyStrategyForSNSModify notifyStrategy;

    @NameInMap("responsePlan")
    public IncidentResponsePlanForSNSModify responsePlan;

    @NameInMap("subscription")
    public SubscriptionForSNSModify subscription;

    /**
     * <p>For update operations only. Use this parameter to batch create, update, and remove member subscriptions.</p>
     */
    @NameInMap("subscriptions")
    public java.util.List<SubscriptionOp> subscriptions;

    /**
     * <p>Required for update operations but optional for create operations. If omitted during creation, the backend automatically generates a UUID.</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>Required for update operations. The value must match the current version of the record. If the versions do not match, the request fails with an <code>OPTIMISTIC_LOCK_FAILED</code> error.</p>
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
