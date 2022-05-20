// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
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

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("VisibilityTimeout")
    public Long visibilityTimeout;

    public static CreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueRequest self = new CreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueRequest setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Long getDelaySeconds() {
        return this.delaySeconds;
    }

    public CreateQueueRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public CreateQueueRequest setMaximumMessageSize(Long maximumMessageSize) {
        this.maximumMessageSize = maximumMessageSize;
        return this;
    }
    public Long getMaximumMessageSize() {
        return this.maximumMessageSize;
    }

    public CreateQueueRequest setMessageRetentionPeriod(Long messageRetentionPeriod) {
        this.messageRetentionPeriod = messageRetentionPeriod;
        return this;
    }
    public Long getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }

    public CreateQueueRequest setPollingWaitSeconds(Long pollingWaitSeconds) {
        this.pollingWaitSeconds = pollingWaitSeconds;
        return this;
    }
    public Long getPollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }

    public CreateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateQueueRequest setVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    public Long getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

}
