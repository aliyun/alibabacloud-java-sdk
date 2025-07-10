// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SubscribeRequest extends TeaModel {
    /**
     * <p>The dead-letter queue policy.</p>
     */
    @NameInMap("DlqPolicy")
    public SubscribeRequestDlqPolicy dlqPolicy;

    @NameInMap("DmAttributes")
    public SubscribeRequestDmAttributes dmAttributes;

    @NameInMap("DysmsAttributes")
    public SubscribeRequestDysmsAttributes dysmsAttributes;

    /**
     * <p>The receiver endpoint. The format of the endpoint varies based on the terminal type.</p>
     * <ul>
     * <li>If you set PushType to http, set Endpoint to an <code>HTTP URL that starts with http:// or https://</code>.</li>
     * <li>If you set PushType to queue, set Endpoint to a <code>queue name</code>.</li>
     * <li>If you set PushType to mpush, set Endpoint to an <code>AppKey</code>.</li>
     * <li>If you set PushType to alisms, set Endpoint to a <code>mobile number</code>.</li>
     * <li>If you set PushType to email, set Endpoint to an <code>email address</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("KafkaAttributes")
    public SubscribeRequestKafkaAttributes kafkaAttributes;

    /**
     * <p>The tag that is used to filter messages. Only messages that have the same tag can be pushed. Set the value to a string of no more than 16 characters.</p>
     * <p>By default, no tag is specified to filter messages.</p>
     * 
     * <strong>example:</strong>
     * <p>important</p>
     */
    @NameInMap("MessageTag")
    public String messageTag;

    /**
     * <p>The content format of the messages that are pushed to the endpoint. Valid values:</p>
     * <ul>
     * <li>XML</li>
     * <li>JSON</li>
     * <li>SIMPLIFIED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>XML</p>
     */
    @NameInMap("NotifyContentFormat")
    public String notifyContentFormat;

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
     * <p>The terminal type. Valid values:</p>
     * <ul>
     * <li>http: HTTP services</li>
     * <li>queue: queues</li>
     * <li>mpush: mobile devices</li>
     * <li>alisms: Alibaba Cloud Short Message Service (SMS)</li>
     * <li>email: emails</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>queue</p>
     */
    @NameInMap("PushType")
    public String pushType;

    @NameInMap("StsRoleArn")
    public String stsRoleArn;

    /**
     * <p>The name of the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSubscription</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    @NameInMap("TenantRateLimitPolicy")
    public SubscribeRequestTenantRateLimitPolicy tenantRateLimitPolicy;

    /**
     * <p>The name of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeRequest self = new SubscribeRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeRequest setDlqPolicy(SubscribeRequestDlqPolicy dlqPolicy) {
        this.dlqPolicy = dlqPolicy;
        return this;
    }
    public SubscribeRequestDlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    public SubscribeRequest setDmAttributes(SubscribeRequestDmAttributes dmAttributes) {
        this.dmAttributes = dmAttributes;
        return this;
    }
    public SubscribeRequestDmAttributes getDmAttributes() {
        return this.dmAttributes;
    }

    public SubscribeRequest setDysmsAttributes(SubscribeRequestDysmsAttributes dysmsAttributes) {
        this.dysmsAttributes = dysmsAttributes;
        return this;
    }
    public SubscribeRequestDysmsAttributes getDysmsAttributes() {
        return this.dysmsAttributes;
    }

    public SubscribeRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SubscribeRequest setKafkaAttributes(SubscribeRequestKafkaAttributes kafkaAttributes) {
        this.kafkaAttributes = kafkaAttributes;
        return this;
    }
    public SubscribeRequestKafkaAttributes getKafkaAttributes() {
        return this.kafkaAttributes;
    }

    public SubscribeRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public SubscribeRequest setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    public SubscribeRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscribeRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public SubscribeRequest setStsRoleArn(String stsRoleArn) {
        this.stsRoleArn = stsRoleArn;
        return this;
    }
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    public SubscribeRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SubscribeRequest setTenantRateLimitPolicy(SubscribeRequestTenantRateLimitPolicy tenantRateLimitPolicy) {
        this.tenantRateLimitPolicy = tenantRateLimitPolicy;
        return this;
    }
    public SubscribeRequestTenantRateLimitPolicy getTenantRateLimitPolicy() {
        return this.tenantRateLimitPolicy;
    }

    public SubscribeRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class SubscribeRequestDlqPolicy extends TeaModel {
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

        public static SubscribeRequestDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestDlqPolicy self = new SubscribeRequestDlqPolicy();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public SubscribeRequestDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class SubscribeRequestDmAttributes extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Subject")
        public String subject;

        public static SubscribeRequestDmAttributes build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestDmAttributes self = new SubscribeRequestDmAttributes();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestDmAttributes setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public SubscribeRequestDmAttributes setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class SubscribeRequestDysmsAttributes extends TeaModel {
        @NameInMap("SignName")
        public String signName;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static SubscribeRequestDysmsAttributes build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestDysmsAttributes self = new SubscribeRequestDysmsAttributes();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestDysmsAttributes setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public SubscribeRequestDysmsAttributes setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class SubscribeRequestKafkaAttributes extends TeaModel {
        @NameInMap("BusinessMode")
        public String businessMode;

        public static SubscribeRequestKafkaAttributes build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestKafkaAttributes self = new SubscribeRequestKafkaAttributes();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestKafkaAttributes setBusinessMode(String businessMode) {
            this.businessMode = businessMode;
            return this;
        }
        public String getBusinessMode() {
            return this.businessMode;
        }

    }

    public static class SubscribeRequestTenantRateLimitPolicy extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceivesPerSecond")
        public Integer maxReceivesPerSecond;

        public static SubscribeRequestTenantRateLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestTenantRateLimitPolicy self = new SubscribeRequestTenantRateLimitPolicy();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestTenantRateLimitPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SubscribeRequestTenantRateLimitPolicy setMaxReceivesPerSecond(Integer maxReceivesPerSecond) {
            this.maxReceivesPerSecond = maxReceivesPerSecond;
            return this;
        }
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

    }

}
