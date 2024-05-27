// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetQueueAttributesRequest extends TeaModel {
    @NameInMap("DelaySeconds")
    public Long delaySeconds;

    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("MaximumMessageSize")
    public Long maximumMessageSize;

    @NameInMap("MessageRetentionPeriod")
    public Long messageRetentionPeriod;

    @NameInMap("PollingWaitSeconds")
    public Long pollingWaitSeconds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("VisibilityTimeout")
    public Long visibilityTimeout;

    public static SetQueueAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetQueueAttributesRequest self = new SetQueueAttributesRequest();
        return TeaModel.build(map, self);
    }

    public SetQueueAttributesRequest setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    public SetQueueAttributesRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public SetQueueAttributesRequest setMaximumMessageSize(Long maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    public SetQueueAttributesRequest setMessageRetentionPeriod(Long messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public SetQueueAttributesRequest setPollingWaitSeconds(Long pollingWaitSeconds) {
        this.pollingWaitSeconds = pollingWaitSeconds;
        return this;
    }
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    public SetQueueAttributesRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public SetQueueAttributesRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

}
