// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateBindingRequest extends TeaModel {
    /**
     * <p>The key-value pairs that are configured for the headers attributes of a message. One or more key-value pairs can be concatenated to configure the headers attributes of a message. You must specify the x-match attribute as one of the valid values. You can specify custom values for other attributes. Valid values of the x-match attribute:</p>
     * <br>
     * <p>*   \*\*all: \*\*A headers exchange routes a message to a queue only if all binding attributes of the queue except for x-match match the headers attributes of the message. This value is the default value.</p>
     * <p>*   \*\*any: \*\*A headers exchange routes a message to a queue if one or more binding attributes of the queue except for x-match match the headers attributes of the message.</p>
     * <br>
     * <p>Separate the attributes with semicolons (;). Separate the key and value of an attribute with a colon (:). Example: x-match:all;type:report;format:pdf. This parameter is available for only headers exchanges. You can set this parameter to an arbitrary value for other types of exchanges.</p>
     */
    @NameInMap("Argument")
    public String argument;

    /**
     * <p>The binding key.</p>
     * <br>
     * <p>*   If the source exchange is not a topic exchange, the binding key must meet the following conventions:</p>
     * <br>
     * <p>    *   The binding key can contain only letters, digits, hyphens (-), underscores (\_), periods (.), forward slashes (/), and at signs (@).</p>
     * <p>    *   The binding key must be 1 to 255 characters in length.</p>
     * <br>
     * <p>*   If the source exchange is a topic exchange, the binding key must meet the following conventions:</p>
     * <br>
     * <p>    *   The binding key can contain letters, digits, hyphens (-), underscores (\_), asterisks (\*), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
     * <p>    *   The binding key cannot start or end with a period (.). If a binding key starts with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be followed by a period (.). If the binding key ends with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be preceded by a period (.). If a number sign (#) or an asterisk (\*) is used in the middle of a binding key, the number sign (#) or asterisk (\*) must be preceded and followed by a period (.).</p>
     * <p>    *   The binding key must be 1 to 255 characters in length.</p>
     */
    @NameInMap("BindingKey")
    public String bindingKey;

    /**
     * <p>The type of the object that you want to bind to the source exchange. Valid values:</p>
     * <br>
     * <p>*   \*\*0: \*\*Queue</p>
     * <p>*   \*\*1: \*\*Exchange</p>
     */
    @NameInMap("BindingType")
    public String bindingType;

    /**
     * <p>The name of the object that you want to bind to the source exchange. You must create the object in the ApsaraMQ for RabbitMQ console in advance. The vhost of the object is the same as the vhost to which the source exchange specified by **SourceExchange** belongs. The vhost of the source exchange is the one specified by **VirtualHost**.</p>
     */
    @NameInMap("DestinationName")
    public String destinationName;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the source exchange. You must create the source exchange in the ApsaraMQ for RabbitMQ console in advance.</p>
     */
    @NameInMap("SourceExchange")
    public String sourceExchange;

    /**
     * <p>The virtual host (vhost) name. You must create the vhost in the ApsaraMQ for RabbitMQ console in advance. The object specified by **DestinationName** and the source exchange specified by **SourceExchange** must belong to the vhost.</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static CreateBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingRequest self = new CreateBindingRequest();
        return TeaModel.build(map, self);
    }

    public CreateBindingRequest setArgument(String argument) {
        this.argument = argument;
        return this;
    }
    public String getArgument() {
        return this.argument;
    }

    public CreateBindingRequest setBindingKey(String bindingKey) {
        this.bindingKey = bindingKey;
        return this;
    }
    public String getBindingKey() {
        return this.bindingKey;
    }

    public CreateBindingRequest setBindingType(String bindingType) {
        this.bindingType = bindingType;
        return this;
    }
    public String getBindingType() {
        return this.bindingType;
    }

    public CreateBindingRequest setDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }
    public String getDestinationName() {
        return this.destinationName;
    }

    public CreateBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBindingRequest setSourceExchange(String sourceExchange) {
        this.sourceExchange = sourceExchange;
        return this;
    }
    public String getSourceExchange() {
        return this.sourceExchange;
    }

    public CreateBindingRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
