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

    /**
     * <p>The name of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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

    public SubscribeShrinkRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
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

    public SubscribeShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
