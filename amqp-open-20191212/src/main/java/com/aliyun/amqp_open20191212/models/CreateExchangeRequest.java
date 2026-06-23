// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateExchangeRequest extends TeaModel {
    /**
     * <p>The alternate exchange. Configure an alternate exchange to receive messages that fail to be routed.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoAE</p>
     */
    @NameInMap("AlternateExchange")
    public String alternateExchange;

    /**
     * <p>Specifies whether to automatically delete the exchange. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes. The exchange is automatically deleted after the last queue is unbound from it.</p>
     * </li>
     * <li><p><strong>false</strong>: No. The exchange is not automatically deleted after the last queue is unbound from it.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoDeleteState")
    public Boolean autoDeleteState;

    /**
     * <p>The name of the exchange. Note:</p>
     * <ul>
     * <li><p>The name can contain only letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slashes (/), and at signs (@). The name must be 1 to 255 characters in length.</p>
     * </li>
     * <li><p>The name of an exchange cannot be changed after the exchange is created. To change the name, delete the exchange and create a new one.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoExchange</p>
     */
    @NameInMap("ExchangeName")
    public String exchangeName;

    /**
     * <p>The type of the exchange. Valid values:</p>
     * <ul>
     * <li><p><strong>DIRECT</strong>: This routing rule type routes messages to a queue whose binding key exactly matches the routing key of the message.</p>
     * </li>
     * <li><p><strong>TOPIC</strong>: This type is similar to the DIRECT type. It routes messages to bound queues using routing key pattern matching and string comparison.</p>
     * </li>
     * <li><p><strong>FANOUT</strong>: This routing rule type is simple. It routes all messages sent to the exchange to all queues that are bound to the exchange. This works like a broadcast feature.</p>
     * </li>
     * <li><p><strong>HEADERS</strong>: This type is similar to the DIRECT type. It uses header properties instead of a routing key for routing. When a queue is bound to a headers exchange, key-value pairs are defined for the binding. When a message is sent to the exchange, key-value pairs are defined in the message header. The exchange routes the message by comparing the key-value pairs in the header with the key-value pairs of the binding.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECT</p>
     */
    @NameInMap("ExchangeType")
    public String exchangeType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9nu***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the exchange is an internal exchange. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: No</p>
     * </li>
     * <li><p><strong>true</strong>: Yes</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Internal")
    public Boolean internal;

    /**
     * <p>The name of the vhost to which the exchange belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    /**
     * <p>An x-delayed-message exchange lets you use the x-delay header property to specify a delivery delay for a message in milliseconds. The routing rule for the delayed message is determined by the exchange type that you specify for the XDelayedType parameter. This parameter sets the actual exchange type to which the message is delivered after the delay. Valid values:</p>
     * <ul>
     * <li><p><strong>DIRECT</strong>: Delivers the delayed message to the specified queue that is bound to a DIRECT exchange.</p>
     * </li>
     * <li><p><strong>TOPIC</strong>: Delivers the delayed message to queues that are bound to a TOPIC exchange.</p>
     * </li>
     * <li><p><strong>FANOUT</strong>: Delivers the delayed message to queues that are bound to a FANOUT exchange.</p>
     * </li>
     * <li><p><strong>HEADERS</strong>: Delivers the delayed message to queues that are bound to a HEADERS exchange.</p>
     * </li>
     * <li><p><strong>X-JMS-TOPIC</strong>: Delivers the delayed message to queues that are bound to an X-JMS-TOPIC exchange.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECT</p>
     */
    @NameInMap("XDelayedType")
    public String XDelayedType;

    public static CreateExchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExchangeRequest self = new CreateExchangeRequest();
        return TeaModel.build(map, self);
    }

    public CreateExchangeRequest setAlternateExchange(String alternateExchange) {
        this.alternateExchange = alternateExchange;
        return this;
    }
    public String getAlternateExchange() {
        return this.alternateExchange;
    }

    public CreateExchangeRequest setAutoDeleteState(Boolean autoDeleteState) {
        this.autoDeleteState = autoDeleteState;
        return this;
    }
    public Boolean getAutoDeleteState() {
        return this.autoDeleteState;
    }

    public CreateExchangeRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public CreateExchangeRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public CreateExchangeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExchangeRequest setInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }
    public Boolean getInternal() {
        return this.internal;
    }

    public CreateExchangeRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public CreateExchangeRequest setXDelayedType(String XDelayedType) {
        this.XDelayedType = XDelayedType;
        return this;
    }
    public String getXDelayedType() {
        return this.XDelayedType;
    }

}
