// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically delete the queue. Valid values:</p>
     * <ul>
     * <li>true: The queue is automatically deleted. After the last consumer unsubscribes from the queue, the queue is automatically deleted.</li>
     * <li>false: The queue is not automatically deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoDeleteState")
    public Boolean autoDeleteState;

    /**
     * <p>The validity period after which the queue is automatically deleted. If the queue is not accessed within the specified period of time, the queue is automatically deleted.</p>
     * <p>Unit: milliseconds.</p>
     * <blockquote>
     * <p> You can use the feature that corresponds to this parameter only after you enable the feature. To enable the feature, <a href="https://ticket-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("AutoExpireState")
    public Long autoExpireState;

    /**
     * <p>The dead-letter exchange. A dead-letter exchange is used to receive rejected messages.</p>
     * <p>If a consumer rejects a message that cannot be redelivered, ApsaraMQ for RabbitMQ routes the message to the specified dead-letter exchange. Then, the dead-letter exchange routes the message to the queue that is bound to the dead-letter exchange for storage.</p>
     * 
     * <strong>example:</strong>
     * <p>DLExchange</p>
     */
    @NameInMap("DeadLetterExchange")
    public String deadLetterExchange;

    /**
     * <p>The dead-letter routing key. The key must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
     * 
     * <strong>example:</strong>
     * <p>test.dl</p>
     */
    @NameInMap("DeadLetterRoutingKey")
    public String deadLetterRoutingKey;

    /**
     * <p>Specifies whether the exchange is an exclusive exchange. Valid values:</p>
     * <ul>
     * <li>true: The exchange is an exclusive exchange. Only the connection that declares the exclusive exchange can use the exclusive exchange. After the connection is closed, the exclusive exchange is automatically deleted.</li>
     * <li>false: The exchange is not an exclusive exchange.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExclusiveState")
    public Boolean exclusiveState;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance on which you want to create a queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9nu***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is unavailable in the current version of ApsaraMQ for RabbitMQ.</p>
     * <p>The maximum number of messages that can be stored in the queue. If this threshold is exceeded, the earliest stored messages in the queue are deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxLength")
    public Long maxLength;

    /**
     * <p>Queue priorities are not supported. The value does not affect the call or return results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumPriority")
    public Integer maximumPriority;

    /**
     * <p>The message time to live (TTL) of the queue.</p>
     * <ul>
     * <li>If the retention period of a message in the queue exceeds the message TTL of the queue, the message expires.</li>
     * <li>The message TTL must be set to a non-negative integer. The maximum message TTL is one day. Unit: milliseconds. For example, if the message TTL is 1,000 milliseconds, the message can be retained for up to 1 second in the queue.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MessageTTL")
    public Long messageTTL;

    /**
     * <p>The name of the queue that you want to create.</p>
     * <ul>
     * <li>The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</li>
     * <li>After the queue is created, you cannot change the name of the queue. If you want to change the name of the queue, delete the queue and create another queue.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoQueue</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The name of the vhost to which the queue that you want to create belongs. The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static CreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueRequest self = new CreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueRequest setAutoDeleteState(Boolean autoDeleteState) {
        this.autoDeleteState = autoDeleteState;
        return this;
    }
    public Boolean getAutoDeleteState() {
        return this.autoDeleteState;
    }

    public CreateQueueRequest setAutoExpireState(Long autoExpireState) {
        this.autoExpireState = autoExpireState;
        return this;
    }
    public Long getAutoExpireState() {
        return this.autoExpireState;
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

    public CreateQueueRequest setExclusiveState(Boolean exclusiveState) {
        this.exclusiveState = exclusiveState;
        return this;
    }
    public Boolean getExclusiveState() {
        return this.exclusiveState;
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

    public CreateQueueRequest setMaximumPriority(Integer maximumPriority) {
        this.maximumPriority = maximumPriority;
        return this;
    }
    public Integer getMaximumPriority() {
        return this.maximumPriority;
    }

    public CreateQueueRequest setMessageTTL(Long messageTTL) {
        this.messageTTL = messageTTL;
        return this;
    }
    public Long getMessageTTL() {
        return this.messageTTL;
    }

    public CreateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateQueueRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
