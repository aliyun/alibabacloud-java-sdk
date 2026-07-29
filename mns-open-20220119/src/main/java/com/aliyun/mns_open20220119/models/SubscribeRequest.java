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
     * <p>The email push attributes. This parameter is required when PushType is set to dm. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>AccountName: The sender address configured in DirectMail (such as <a href="mailto:notify@example.com">notify@example.com</a>).</li>
     * <li>Subject: The email subject.</li>
     * </ul>
     */
    @NameInMap("DmAttributes")
    public SubscribeRequestDmAttributes dmAttributes;

    /**
     * <p>The SMS push attributes. This parameter is required when PushType is set to alisms. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>TemplateCode: The SMS template code, which can be obtained from the Short Message Service console.</li>
     * <li>SignName: The SMS signature name.</li>
     * </ul>
     */
    @NameInMap("DysmsAttributes")
    public SubscribeRequestDysmsAttributes dysmsAttributes;

    /**
     * <h2>Endpoint address for receiving messages</h2>
     * <p>The format varies depending on the value of <code>PushType</code>:</p>
     * <ul>
     * <li><code>PushType=http</code>: An HTTP/HTTPS callback URL, such as <code>http://example.com/callback</code> or <code>https://example.com/callback</code>.</li>
     * <li><code>PushType=queue</code>: The ARN of the destination queue, in the format <code>acs:mns:{RegionId}:{Alibaba Cloud account ID}:queues/{QueueName}</code>.</li>
     * <li><code>PushType=dm</code>: The email push endpoint, in the fixed format <code>smq-ep:dm:{Alibaba Cloud account ID}:__dynamic</code>. Replace <code>{Alibaba Cloud account ID}</code> with your Alibaba Cloud account ID.</li>
     * <li><code>PushType=dysms</code>: The SMS push endpoint, in the format <code>smq-ep:dysms:{Alibaba Cloud account ID}:{PhoneNumber}</code>.</li>
     * <li><code>PushType=kafka</code>: The Kafka push endpoint. The Kafka push type is deprecated.</li>
     * <li><code>PushType=fc</code>: The Function Compute endpoint, in the format <code>acs:fc:{RegionId}:{Alibaba Cloud account ID}:services/{ServiceName}/functions/{FunctionName}</code>.</li>
     * <li><code>PushType=eventbus</code>: The EventBridge endpoint, in the format <code>acs:eventbridge:{RegionId}:{Alibaba Cloud account ID}:eventbus/{EventBusName}</code>.</li>
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
     * <p>The tag used for message filtering in this subscription. Only messages with a matching tag are pushed. The value is a string of up to 16 characters.</p>
     * <p>By default, no message filtering is applied.</p>
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
     * <li><code>XML</code>: The message body is pushed in XML format. This is the default value.</li>
     * <li><code>JSON</code>: The message body is pushed in JSON format.</li>
     * <li><code>SIMPLIFIED</code>: Only the raw message body content is pushed, without SMQ metadata wrapping.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>XML</p>
     */
    @NameInMap("NotifyContentFormat")
    public String notifyContentFormat;

    /**
     * <p>The retry strategy when an error occurs while pushing messages to the endpoint. Valid values:</p>
     * <ul>
     * <li><p>BACKOFF_RETRY: backoff retry.</p>
     * </li>
     * <li><p>EXPONENTIAL_DECAY_RETRY: exponential decay retry.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BACKOFF_RETRY</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <h2>Push type of the subscription</h2>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>http</code>: HTTP/HTTPS push. Pushes messages to a specified HTTP or HTTPS callback URL.</p>
     * </li>
     * <li><p><code>queue</code>: Queue push. Pushes messages to a specified SMQ queue.</p>
     * </li>
     * <li><p><code>dm</code>: Email push. Sends notifications through DirectMail. You must also set the <code>DmAttributes</code> and <code>StsRoleArn</code> parameters.</p>
     * </li>
     * <li><p><code>dysms</code>: SMS push. Sends notifications through Alibaba Cloud Short Message Service. You must also set the <code>DysmsAttributes</code> parameter.</p>
     * </li>
     * <li><p><code>fc</code>: Function Compute push. Pushes messages to Alibaba Cloud Function Compute (FC).</p>
     * </li>
     * <li><p><code>eventbus</code>: EventBridge push. Pushes messages to an EventBridge event bus.</p>
     * </li>
     * </ul>
     * <p><strong>Note:</strong>
     * The following values are deprecated and are only used for compatibility with legacy subscriptions:</p>
     * <ul>
     * <li><code>mpush</code>: Mobile push.</li>
     * <li><code>alisms</code>: Legacy SMS.</li>
     * <li><code>email</code>: Legacy email. Use <code>dm</code> instead.</li>
     * <li><code>kafka</code>: Kafka push type is deprecated.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>queue</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>The ARN of the RAM role assumed by the service. The format is acs:ram::{Alibaba Cloud account ID}:role/{RoleName}. Replace {Alibaba Cloud account ID} with the Alibaba Cloud account ID that calls the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/AliyunMNSNotificationRole</p>
     */
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

    /**
     * <p>The throttling policy.</p>
     */
    @NameInMap("TenantRateLimitPolicy")
    public SubscribeRequestTenantRateLimitPolicy tenantRateLimitPolicy;

    /**
     * <p>The name of the topic.</p>
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
         * <p>The destination queue for dead-letter message delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>deadLetterTargetQueue</p>
         */
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        /**
         * <p>Specifies whether to enable dead-letter message delivery.</p>
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
         * <p>The SMS signature name.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云短信测试专用</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The SMS template code.</p>
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
         * <p>Specifies whether to enable the throttling policy. Valid values: true and false.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of pushes or consumptions per second.</p>
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
