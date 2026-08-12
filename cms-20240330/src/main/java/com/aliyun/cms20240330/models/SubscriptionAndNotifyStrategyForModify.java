// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionAndNotifyStrategyForModify extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable the subscription. Enabled by default during creation.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>Optional. The backend derives the name from notifyStrategy if this parameter is not specified.</p>
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
     * <p>Used exclusively for Update operations. Performs batch create, update, or remove adjustments on member subscriptions.</p>
     */
    @NameInMap("subscriptions")
    public java.util.List<SubscriptionOp> subscriptions;

    /**
     * <p>Required for Update. Can be omitted for Create, in which case the backend generates it.</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>Required for Update. The value must match the backend record for the write to succeed. If the values do not match, OPTIMISTIC_LOCK_FAILED is returned.</p>
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
