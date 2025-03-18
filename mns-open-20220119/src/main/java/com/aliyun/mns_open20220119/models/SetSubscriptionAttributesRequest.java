// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetSubscriptionAttributesRequest extends TeaModel {
    /**
     * <p>The dead-letter queue policy.</p>
     */
    @NameInMap("DlqPolicy")
    public SetSubscriptionAttributesRequestDlqPolicy dlqPolicy;

    /**
     * <p>The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:</p>
     * <ul>
     * <li>BACKOFF_RETRY</li>
     * <li>EXPONENTIAL_DECAY_RETRY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BACKOFF_RETRY</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <p>The name of the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySubscription</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    /**
     * <p>The name of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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

    public SetSubscriptionAttributesRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SetSubscriptionAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class SetSubscriptionAttributesRequestDlqPolicy extends TeaModel {
        /**
         * <p>The queue to which dead-letter messages are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>deadLetterTargetQueue</p>
         */
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        /**
         * <p>Specifies whether to enable the dead-letter message delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

}
