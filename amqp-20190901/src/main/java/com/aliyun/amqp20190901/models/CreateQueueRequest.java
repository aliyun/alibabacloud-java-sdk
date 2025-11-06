// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    @NameInMap("AutoDelete")
    public Boolean autoDelete;

    @NameInMap("AutoExpire")
    public Long autoExpire;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("DeadLetterExchange")
    public String deadLetterExchange;

    @NameInMap("DeadLetterRoutingKey")
    public String deadLetterRoutingKey;

    @NameInMap("Exclusive")
    public Boolean exclusive;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxLength")
    public Long maxLength;

    @NameInMap("MaximunPrioty")
    public Long maximunPrioty;

    @NameInMap("MessageTTL")
    public Long messageTTL;

    @NameInMap("Ordered")
    public Boolean ordered;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("RetryInherit")
    public Boolean retryInherit;

    @NameInMap("RetryInterval")
    public Integer retryInterval;

    @NameInMap("RetryTimes")
    public Integer retryTimes;

    @NameInMap("SingleActiveConsumer")
    public Boolean singleActiveConsumer;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static CreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueRequest self = new CreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueRequest setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }
    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    public CreateQueueRequest setAutoExpire(Long autoExpire) {
        this.autoExpire = autoExpire;
        return this;
    }
    public Long getAutoExpire() {
        return this.autoExpire;
    }

    public CreateQueueRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
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

    public CreateQueueRequest setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }
    public Boolean getExclusive() {
        return this.exclusive;
    }

    public CreateQueueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQueueRequest setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public CreateQueueRequest setMaximunPrioty(Long maximunPrioty) {
        this.maximunPrioty = maximunPrioty;
        return this;
    }
    public Long getMaximunPrioty() {
        return this.maximunPrioty;
    }

    public CreateQueueRequest setMessageTTL(Long messageTTL) {
        this.messageTTL = messageTTL;
        return this;
    }
    public Long getMessageTTL() {
        return this.messageTTL;
    }

    public CreateQueueRequest setOrdered(Boolean ordered) {
        this.ordered = ordered;
        return this;
    }
    public Boolean getOrdered() {
        return this.ordered;
    }

    public CreateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateQueueRequest setRetryInherit(Boolean retryInherit) {
        this.retryInherit = retryInherit;
        return this;
    }
    public Boolean getRetryInherit() {
        return this.retryInherit;
    }

    public CreateQueueRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateQueueRequest setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public CreateQueueRequest setSingleActiveConsumer(Boolean singleActiveConsumer) {
        this.singleActiveConsumer = singleActiveConsumer;
        return this;
    }
    public Boolean getSingleActiveConsumer() {
        return this.singleActiveConsumer;
    }

    public CreateQueueRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
