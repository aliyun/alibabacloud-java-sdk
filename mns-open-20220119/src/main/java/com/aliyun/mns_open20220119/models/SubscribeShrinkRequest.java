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
     * <p>The email push attributes. This parameter is required when PushType is set to dm. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>AccountName: The sender address configured in DirectMail (such as <a href="mailto:notify@example.com">notify@example.com</a>).</li>
     * <li>Subject: The email subject.</li>
     * </ul>
     */
    @NameInMap("DmAttributes")
    public String dmAttributesShrink;

    /**
     * <p>The SMS push attributes. This parameter is required when PushType is set to alisms. The value is in JSON format and contains the following fields:</p>
     * <ul>
     * <li>TemplateCode: The SMS template code, which can be obtained from the Short Message Service console.</li>
     * <li>SignName: The SMS signature name.</li>
     * </ul>
     */
    @NameInMap("DysmsAttributes")
    public String dysmsAttributesShrink;

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
    public String kafkaAttributesShrink;

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
    public String tenantRateLimitPolicyShrink;

    /**
     * <p>The name of the topic.</p>
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
