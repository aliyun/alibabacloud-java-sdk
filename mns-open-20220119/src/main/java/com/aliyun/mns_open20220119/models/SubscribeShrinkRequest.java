// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SubscribeShrinkRequest extends TeaModel {
    /**
     * <p>The dead-letter queue policy.</p>
     */
    @NameInMap("DlqPolicy")
    public String dlqPolicyShrink;

    /**
     * <p>The attributes for Direct Mail push. This parameter is required when the PushType parameter is set to dm. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>AccountName: the sender address, which is the sender address configured in Direct Mail, such as <a href="mailto:notify@example.com">notify@example.com</a>.</li>
     * <li>Subject: the email subject.</li>
     * </ul>
     */
    @NameInMap("DmAttributes")
    public String dmAttributesShrink;

    /**
     * <p>The attributes for SMS push. This parameter is required when the PushType parameter is set to alisms. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>TemplateCode: the code of the SMS template, which can be obtained from the SMS console.</li>
     * <li>SignName: the name of the SMS signature.</li>
     * </ul>
     */
    @NameInMap("DysmsAttributes")
    public String dysmsAttributesShrink;

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
    public String kafkaAttributesShrink;

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
    public String tenantRateLimitPolicyShrink;

    /**
     * <p>The name of the topic. The name must be 1 to 255 characters in length. It must start with a letter or a digit, and can contain only letters, digits, and hyphens (-). The name cannot start with mns-reserved-.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic****1</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SubscribeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeShrinkRequest self = new SubscribeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeShrinkRequest setDlqPolicyShrink(String dlqPolicyShrink) {
        this.dlqPolicyShrink = dlqPolicyShrink;
        return this;
    }
    public String getDlqPolicyShrink() {
        return this.dlqPolicyShrink;
    }

    public SubscribeShrinkRequest setDmAttributesShrink(String dmAttributesShrink) {
        this.dmAttributesShrink = dmAttributesShrink;
        return this;
    }
    public String getDmAttributesShrink() {
        return this.dmAttributesShrink;
    }

    public SubscribeShrinkRequest setDysmsAttributesShrink(String dysmsAttributesShrink) {
        this.dysmsAttributesShrink = dysmsAttributesShrink;
        return this;
    }
    public String getDysmsAttributesShrink() {
        return this.dysmsAttributesShrink;
    }

    public SubscribeShrinkRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SubscribeShrinkRequest setKafkaAttributesShrink(String kafkaAttributesShrink) {
        this.kafkaAttributesShrink = kafkaAttributesShrink;
        return this;
    }
    public String getKafkaAttributesShrink() {
        return this.kafkaAttributesShrink;
    }

    public SubscribeShrinkRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public SubscribeShrinkRequest setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    public SubscribeShrinkRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscribeShrinkRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public SubscribeShrinkRequest setStsRoleArn(String stsRoleArn) {
        this.stsRoleArn = stsRoleArn;
        return this;
    }
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    public SubscribeShrinkRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SubscribeShrinkRequest setTenantRateLimitPolicyShrink(String tenantRateLimitPolicyShrink) {
        this.tenantRateLimitPolicyShrink = tenantRateLimitPolicyShrink;
        return this;
    }
    public String getTenantRateLimitPolicyShrink() {
        return this.tenantRateLimitPolicyShrink;
    }

    public SubscribeShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
