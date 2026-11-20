// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SubscribeRequest extends TeaModel {
    /**
     * <p>The dead-letter queue policy.</p>
     */
    @NameInMap("DlqPolicy")
    public SubscribeRequestDlqPolicy dlqPolicy;

    /**
     * <p>The attributes for Direct Mail push. This parameter is required when the PushType parameter is set to dm. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>AccountName: the sender address, which is the sender address configured in Direct Mail, such as <a href="mailto:notify@example.com">notify@example.com</a>.</li>
     * <li>Subject: the email subject.</li>
     * </ul>
     */
    @NameInMap("DmAttributes")
    public SubscribeRequestDmAttributes dmAttributes;

    /**
     * <p>The attributes for SMS push. This parameter is required when the PushType parameter is set to alisms. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>TemplateCode: the code of the SMS template, which can be obtained from the SMS console.</li>
     * <li>SignName: the name of the SMS signature.</li>
     * </ul>
     */
    @NameInMap("DysmsAttributes")
    public SubscribeRequestDysmsAttributes dysmsAttributes;

    /**
     * <h2>Endpoint for receiving messages</h2>
     * <p>The format varies based on the <code>PushType</code> parameter:</p>
     * <ul>
     * <li><code>PushType=http</code>: The HTTP or HTTPS callback URL, such as <code>http://example.com/callback</code> or <code>https://example.com/callback</code>.</li>
     * <li><code>PushType=queue</code>: The ARN of the destination queue, in the format of <code>acs:mns:{RegionId}:{Alibaba Cloud account ID}:/queues/{QueueName}</code>.</li>
     * <li><code>PushType=dm</code>: The Direct Mail push endpoint, in the fixed format of <code>smq-ep:dm:{Alibaba Cloud account ID}:__dynamic</code>. Replace <code>{Alibaba Cloud account ID}</code> with the ID of your Alibaba Cloud account.</li>
     * <li><code>PushType=dysms</code>: The SMS push endpoint, in the format of <code>smq-ep:dysms:{Alibaba Cloud account ID}:{Phone number}</code>.</li>
     * <li><code>PushType=kafka</code>: The Kafka push endpoint. The Kafka push type is deprecated.</li>
     * <li><code>PushType=fc</code>: The Function Compute endpoint, in the format of <code>acs:fc:{RegionId}:{Alibaba Cloud account ID}:services/{ServiceName}/functions/{FunctionName}</code>.</li>
     * <li><code>PushType=eventbus</code>: The EventBridge endpoint, in the format of <code>acs:eventbridge:{RegionId}:{Alibaba Cloud account ID}:eventbus/{EventBusName}</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://*****.com/uri1/xxx</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The Kafka push type is deprecated.</p>
     */
    @NameInMap("KafkaAttributes")
    public SubscribeRequestKafkaAttributes kafkaAttributes;

    /**
     * <p>The tag used for message filtering in the subscription. Only messages with a matching tag are pushed.
     * The value must be a string up to 16 characters in length.</p>
     * <p>By default, message filtering is not performed.</p>
     * 
     * <strong>example:</strong>
     * <p>important</p>
     */
    @NameInMap("MessageTag")
    public String messageTag;

    /**
     * <h2>Format of the pushed message content</h2>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>XML</code>: XML format (default)</li>
     * <li><code>JSON</code>: JSON format</li>
     * <li><code>SIMPLIFIED</code>: original message body content without the SMQ metadata wrapper</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>XML</p>
     */
    @NameInMap("NotifyContentFormat")
    public String notifyContentFormat;

    /**
     * <p>The retry strategy that is used when an error occurs during message pushing to the endpoint. Valid values:</p>
     * <ul>
     * <li>BACKOFF_RETRY: backoff retry (default)</li>
     * <li>EXPONENTIAL_DECAY_RETRY: exponential decay retry</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BACKOFF_RETRY</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <h2>Push types for subscriptions</h2>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>http</code>: Pushes messages to the specified HTTP or HTTPS callback URL.</li>
     * <li><code>queue</code>: Pushes messages to the specified Simple Message Queue (SMQ) queue.</li>
     * <li><code>dm</code>: Sends notifications by using the Direct Mail service. You must also set the <code>DmAttributes</code> and <code>StsRoleArn</code> parameters.</li>
     * <li><code>dysms</code>: Sends notifications by using the Alibaba Cloud SMS service. You must also set the <code>DysmsAttributes</code> parameter.</li>
     * <li><code>fc</code>: Pushes messages to Alibaba Cloud Function Compute (FC).</li>
     * <li><code>eventbus</code>: Pushes messages to an EventBridge event bus.</li>
     * </ul>
     * <p><strong>Note:</strong>
     * The following values are deprecated and are retained only for compatibility with legacy subscriptions:</p>
     * <ul>
     * <li><code>mpush</code>: mobile push</li>
     * <li><code>alisms</code>: legacy SMS</li>
     * <li><code>email</code>: legacy email, use <code>dm</code> instead</li>
     * <li><code>kafka</code>: deprecated Kafka push type</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>queue</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>The ARN of the RAM role assumed by the service. The format is acs:ram::{Alibaba Cloud account ID}:role/{RoleName}. Replace {Alibaba Cloud account ID} with the ID of the Alibaba Cloud account that calls the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/AliyunMNSNotificationRole</p>
     */
    @NameInMap("StsRoleArn")
    public String stsRoleArn;

    /**
     * <p>The name of the subscription. The name must be 1 to 255 characters in length. It must start with a letter or a digit, and can contain only letters, digits, and hyphens (-). The name cannot start with mns-reserved-.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSubscription</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    /**
     * <p>The throttling policy.</p>
     */
    @NameInMap("TenantRateLimitPolicy")
    public SubscribeRequestTenantRateLimitPolicy tenantRateLimitPolicy;

    /**
     * <p>The name of the topic. The name must be 1 to 255 characters in length. It must start with a letter or a digit, and can contain only letters, digits, and hyphens (-). The name cannot start with mns-reserved-.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic****1</p>
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
         * <p>The destination queue for dead-letter message delivery. The queue must already exist in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>deadLetterTargetQueue</p>
         */
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        /**
         * <p>Specifies whether to enable dead-letter message delivery. Default value: false.</p>
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
        /**
         * <p>The sender address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:notify@example.com">notify@example.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The email subject.</p>
         * 
         * <strong>example:</strong>
         * <p>notify</p>
         */
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
        /**
         * <p>The name of the SMS signature.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud SMS test</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The code of the SMS template.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
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
        /**
         * <p>The Kafka push type is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Default empty string</p>
         */
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
        /**
         * <p>Specifies whether to enable the throttling policy. Valid values:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled (default)</li>
         * </ul>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of pushes or consumptions per second. The value must be a positive integer and is valid only when the PushType parameter is set to http or https. The specific minimum value varies by region.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
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
