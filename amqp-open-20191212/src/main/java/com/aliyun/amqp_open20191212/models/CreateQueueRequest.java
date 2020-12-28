// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VirtualHost")
    public String virtualHost;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("AutoDeleteState")
    public Boolean autoDeleteState;

    @NameInMap("ExclusiveState")
    public Boolean exclusiveState;

    @NameInMap("MessageTTL")
    public Long messageTTL;

    @NameInMap("AutoExpireState")
    public Long autoExpireState;

    @NameInMap("MaxLength")
    public Long maxLength;

    @NameInMap("DeadLetterExchange")
    public String deadLetterExchange;

    @NameInMap("DeadLetterRoutingKey")
    public String deadLetterRoutingKey;

    @NameInMap("MaximumPriority")
    public Integer maximumPriority;

    public static CreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueRequest self = new CreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQueueRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public CreateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateQueueRequest setAutoDeleteState(Boolean autoDeleteState) {
        this.autoDeleteState = autoDeleteState;
        return this;
    }
    public Boolean getAutoDeleteState() {
        return this.autoDeleteState;
    }

    public CreateQueueRequest setExclusiveState(Boolean exclusiveState) {
        this.exclusiveState = exclusiveState;
        return this;
    }
    public Boolean getExclusiveState() {
        return this.exclusiveState;
    }

    public CreateQueueRequest setMessageTTL(Long messageTTL) {
        this.messageTTL = messageTTL;
        return this;
    }
    public Long getMessageTTL() {
        return this.messageTTL;
    }

    public CreateQueueRequest setAutoExpireState(Long autoExpireState) {
        this.autoExpireState = autoExpireState;
        return this;
    }
    public Long getAutoExpireState() {
        return this.autoExpireState;
    }

    public CreateQueueRequest setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public CreateQueueRequest setDeadLetterExchange(String deadLetterExchange) {
        this.deadLetterExchange = deadLetterExchange;
        return this;
    }
    public String getDeadLetterExchange() {
        return this.deadLetterExchange;
    }

    public CreateQueueRequest setDeadLetterRoutingKey(String deadLetterRoutingKey) {
        this.deadLetterRoutingKey = deadLetterRoutingKey;
        return this;
    }
    public String getDeadLetterRoutingKey() {
        return this.deadLetterRoutingKey;
    }

    public CreateQueueRequest setMaximumPriority(Integer maximumPriority) {
        this.maximumPriority = maximumPriority;
        return this;
    }
    public Integer getMaximumPriority() {
        return this.maximumPriority;
    }

}
