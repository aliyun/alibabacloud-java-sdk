// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically delete the queue. Valid values:</p>
     * <ul>
     * <li><p>true: The queue is automatically deleted after the last consumer unsubscribes from it.</p>
     * </li>
     * <li><p>false: The queue is not automatically deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoDeleteState")
    public Boolean autoDeleteState;

    /**
     * <p>The auto-expiration time for the queue. The queue is automatically deleted if it is not accessed within the specified time period.</p>
     * <p>Unit: milliseconds.</p>
     * <blockquote>
     * <p>This feature must be enabled before you can use this parameter. To enable the feature, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://ticket-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("AutoExpireState")
    public Long autoExpireState;

    /**
     * <p>The dead-letter exchange. This type of exchange is used to receive rejected messages.</p>
     * <p>If a consumer rejects a message and the message is not requeued, ApsaraMQ for RabbitMQ routes the message to the specified dead-letter exchange. The dead-letter exchange then routes the message to a bound queue for storage.</p>
     * 
     * <strong>example:</strong>
     * <p>DLExchange</p>
     */
    @NameInMap("DeadLetterExchange")
    public String deadLetterExchange;

    /**
     * <p>The dead-letter routing key.
     * The key can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@). The key must be 1 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test.dl</p>
     */
    @NameInMap("DeadLetterRoutingKey")
    public String deadLetterRoutingKey;

    /**
     * <p>Specifies whether the queue is an exclusive queue. Valid values:</p>
     * <ul>
     * <li><p>true: The queue is an exclusive queue. An exclusive queue can be used only by the connection that declares it. The queue is automatically deleted after the connection is closed.</p>
     * </li>
     * <li><p>false: The queue is not an exclusive queue.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExclusiveState")
    public Boolean exclusiveState;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance to which the queue belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9nu***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is not supported in the current version.</p>
     * <p>The maximum number of messages that can be stored in the queue. If this limit is exceeded, the earliest messages in the queue are deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxLength")
    public Long maxLength;

    /**
     * <p>The priority of the queue. The recommended value is an integer from 1 to 10.</p>
     * <blockquote>
     * <p>This parameter is used for message priority. It is supported only by dedicated instances and can be used only after the message priority feature is enabled. To enable the feature, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://ticket-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaximumPriority")
    public Integer maximumPriority;

    /**
     * <p>The time to live (TTL) of a message in the queue.</p>
     * <ul>
     * <li><p>A message expires if its retention time in the queue exceeds the configured TTL.</p>
     * </li>
     * <li><p>The message TTL must be a non-negative integer. The maximum value is 1 day. The unit is milliseconds. For example, if the value is 1000, the message can be stored in the queue for a maximum of 1 second.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MessageTTL")
    public Long messageTTL;

    /**
     * <p>The name of the queue to create.</p>
     * <ul>
     * <li><p>The queue name can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@). The name must be 1 to 255 characters in length.</p>
     * </li>
     * <li><p>After a queue is created, its name cannot be changed. To change the name, delete the queue and create a new one.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoQueue</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The name of the vhost to which the queue belongs.
     * The name can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@). The name must be 1 to 255 characters in length.</p>
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
