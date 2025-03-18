// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetQueueAttributesShrinkRequest extends TeaModel {
    /**
     * <p>The period after which all messages sent to the queue are consumed. Valid values: 0 to 604800. Unit: seconds. Default value: 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    /**
     * <p>The dead-letter queue policy.</p>
     */
    @NameInMap("DlqPolicy")
    public String dlqPolicyShrink;

    /**
     * <p>Specifies whether to enable the log management feature. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled. Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    /**
     * <p>The maximum length of the message that is sent to the queue. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("MaximumMessageSize")
    public Long maximumMessageSize;

    /**
     * <p>The maximum duration for which a message is retained in the queue. After the specified retention period ends, the message is deleted regardless of whether the message is received. Valid values: 60 to 604800. Unit: seconds. Default value: 345600.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageRetentionPeriod")
    public Long messageRetentionPeriod;

    /**
     * <p>The maximum duration for which long polling requests are held after the ReceiveMessage operation is called. Valid values: 0 to 30. Unit: seconds. Default value: 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PollingWaitSeconds")
    public Long pollingWaitSeconds;

    /**
     * <p>The name of the queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testqueue</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The duration for which a message stays in the Inactive state after the message is received from the queue. Valid values: 1 to 43200. Unit: seconds. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("VisibilityTimeout")
    public Long visibilityTimeout;

    public static SetQueueAttributesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetQueueAttributesShrinkRequest self = new SetQueueAttributesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetQueueAttributesShrinkRequest setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    public SetQueueAttributesShrinkRequest setDlqPolicyShrink(String dlqPolicyShrink) {
        this.dlqPolicyShrink = dlqPolicyShrink;
        return this;
    }
    public String getDlqPolicyShrink() {
        return this.dlqPolicyShrink;
    }

    public SetQueueAttributesShrinkRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public SetQueueAttributesShrinkRequest setMaximumMessageSize(Long maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    public SetQueueAttributesShrinkRequest setMessageRetentionPeriod(Long messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public SetQueueAttributesShrinkRequest setPollingWaitSeconds(Long pollingWaitSeconds) {
        this.pollingWaitSeconds = pollingWaitSeconds;
        return this;
    }
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    public SetQueueAttributesShrinkRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public SetQueueAttributesShrinkRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

}
