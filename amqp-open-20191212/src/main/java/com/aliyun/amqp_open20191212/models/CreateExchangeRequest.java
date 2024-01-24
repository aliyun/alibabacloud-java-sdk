// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateExchangeRequest extends TeaModel {
    /**
     * <p>The alternate exchange. An alternate exchange is used to receive messages that fail to be routed to queues from the current exchange.</p>
     */
    @NameInMap("AlternateExchange")
    public String alternateExchange;

    /**
     * <p>Specifies whether to automatically delete the exchange. Valid values:</p>
     * <br>
     * <p>*   **true**: If the last queue that is bound to the exchange is unbound, the exchange is automatically deleted.</p>
     * <p>*   **false**: If the last queue that is bound to the exchange is unbound, the exchange is not automatically deleted.</p>
     */
    @NameInMap("AutoDeleteState")
    public Boolean autoDeleteState;

    /**
     * <p>The name of the exchange that you want to create. The exchange name must meet the following conventions:</p>
     * <br>
     * <p>*   The name must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (\_), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
     * <p>*   After the exchange is created, you cannot change its name. If you want to change its name, delete the exchange and create another exchange.</p>
     */
    @NameInMap("ExchangeName")
    public String exchangeName;

    /**
     * <p>The exchange type. Valid values:</p>
     * <br>
     * <p>*   **DIRECT**: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.</p>
     * <p>*   **TOPIC**: This type of exchange is similar to direct exchanges. An exchange of this type routes a message to one or more queues based on the results of the fuzzy match or multi-condition match between the routing key of the message and the binding keys of the current exchange.</p>
     * <p>*   **FANOUT**: An exchange of this type routes all received messages to all queues bound to this exchange. You can use a fanout exchange to broadcast messages.</p>
     * <p>*   **HEADERS**: This type of exchange is similar to direct exchanges. The only difference is that a headers exchange routes messages based on the headers attributes instead of routing keys. When you bind a headers exchange to a queue, you must configure binding attributes in the key-value format for the binding. When you send a message to a headers exchange, you must configure the headers attributes in the key-value format for the message. After a headers exchange receives a message, the exchange routes the message based on the matching results between the headers attributes of the message and the binding attributes of the bound queues.</p>
     * <p>*   **X-CONSISTENT-HASH**: An exchange of this type allows you to perform hash calculations on routing keys or header values and use consistent hashing to route a message to different queues.</p>
     */
    @NameInMap("ExchangeType")
    public String exchangeType;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ for which you want to create an exchange.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the exchange is an internal exchange. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("Internal")
    public Boolean internal;

    /**
     * <p>The name of the vhost to which the exchange that you want to create belongs.</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

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

}
