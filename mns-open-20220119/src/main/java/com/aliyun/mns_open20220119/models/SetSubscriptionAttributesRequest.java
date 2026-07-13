// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetSubscriptionAttributesRequest extends TeaModel {
    @NameInMap("DlqPolicy")
    public SetSubscriptionAttributesRequestDlqPolicy dlqPolicy;

    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/roleName</p>
     */
    @NameInMap("StsRoleArn")
    public String stsRoleArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    @NameInMap("TenantRateLimitPolicy")
    public SetSubscriptionAttributesRequestTenantRateLimitPolicy tenantRateLimitPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SetSubscriptionAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSubscriptionAttributesRequest self = new SetSubscriptionAttributesRequest();
        return TeaModel.build(map, self);
    }

    public SetSubscriptionAttributesRequest setDlqPolicy(SetSubscriptionAttributesRequestDlqPolicy dlqPolicy) {
        this.dlqPolicy = dlqPolicy;
        return this;
    }
    public SetSubscriptionAttributesRequestDlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    public SetSubscriptionAttributesRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SetSubscriptionAttributesRequest setStsRoleArn(String stsRoleArn) {
        this.stsRoleArn = stsRoleArn;
        return this;
    }
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    public SetSubscriptionAttributesRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SetSubscriptionAttributesRequest setTenantRateLimitPolicy(SetSubscriptionAttributesRequestTenantRateLimitPolicy tenantRateLimitPolicy) {
        this.tenantRateLimitPolicy = tenantRateLimitPolicy;
        return this;
    }
    public SetSubscriptionAttributesRequestTenantRateLimitPolicy getTenantRateLimitPolicy() {
        return this.tenantRateLimitPolicy;
    }

    public SetSubscriptionAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class SetSubscriptionAttributesRequestDlqPolicy extends TeaModel {
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static SetSubscriptionAttributesRequestDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetSubscriptionAttributesRequestDlqPolicy self = new SetSubscriptionAttributesRequestDlqPolicy();
            return TeaModel.build(map, self);
        }

        public SetSubscriptionAttributesRequestDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public SetSubscriptionAttributesRequestDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class SetSubscriptionAttributesRequestTenantRateLimitPolicy extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceivesPerSecond")
        public Integer maxReceivesPerSecond;

        public static SetSubscriptionAttributesRequestTenantRateLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetSubscriptionAttributesRequestTenantRateLimitPolicy self = new SetSubscriptionAttributesRequestTenantRateLimitPolicy();
            return TeaModel.build(map, self);
        }

        public SetSubscriptionAttributesRequestTenantRateLimitPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SetSubscriptionAttributesRequestTenantRateLimitPolicy setMaxReceivesPerSecond(Integer maxReceivesPerSecond) {
            this.maxReceivesPerSecond = maxReceivesPerSecond;
            return this;
        }
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

    }

}
