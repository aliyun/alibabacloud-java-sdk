// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateBindingRequest extends TeaModel {
    /**
     * <p>The key-value pairs for the message header attributes. The message header attributes consist of one or more key-value pairs. The x-match attribute is required. Other attributes are custom. The x-match attribute supports the following values:</p>
     * <ul>
     * <li><p>all: This is the default value. All key-value pairs in the message header must match.</p>
     * </li>
     * <li><p>any: At least one key-value pair in the message header must match.</p>
     * </li>
     * </ul>
     * <p>Separate attributes with semicolons (;) and separate keys from values with colons (:). Example: x-match:all;type:report;format:pdf
     * This parameter is valid only for headers exchanges. For other types of exchanges, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>x-match:all;type:report;format:pdf</p>
     */
    @NameInMap("Argument")
    public String argument;

    /**
     * <p>The binding key.</p>
     * <ul>
     * <li><p>If the source exchange is not a topic exchange:</p>
     * <ul>
     * <li><p>It can contain letters, digits, hyphens (-), underscores (_), periods (.), forward slashes (/), and at signs (@).</p>
     * </li>
     * <li><p>The length must be 1 to 255 characters.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If the source exchange is a topic exchange:</p>
     * <ul>
     * <li><p>It can contain letters, digits, hyphens (-), underscores (_), asterisks (\*), periods (.), number signs (#), forward slashes (/), and at signs (@).</p>
     * </li>
     * <li><p>The key cannot start or end with a period (.). If the key starts with a number sign (#) or an asterisk (\<em>), a period (.) must immediately follow. If the key ends with a number sign (#) or an asterisk (\</em>), a period (.) must immediately precede it. If a number sign (#) or an asterisk (\*) is in the middle of the key, it must have a period (.) on both sides.</p>
     * </li>
     * <li><p>The length must be 1 to 255 characters.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>.test</p>
     */
    @NameInMap("BindingKey")
    public String bindingKey;

    /**
     * <p>The type of the destination object. Valid values:</p>
     * <ul>
     * <li><p>0: Queue</p>
     * </li>
     * <li><p>1: Exchange</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BindingType")
    public String bindingType;

    /**
     * <p>The name of the binding destination. The destination must be created in the console. It must belong to the same vhost as <code>SourceExchange</code>. The <code>VirtualHost</code> parameter specifies the vhost.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoQueue</p>
     */
    @NameInMap("DestinationName")
    public String destinationName;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9nu***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the source exchange. This exchange must be created in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NormalEX</p>
     */
    @NameInMap("SourceExchange")
    public String sourceExchange;

    /**
     * <p>The name of the vhost. The vhost must be created in the console. Both <code>DestinationName</code> and <code>SourceExchange</code> must belong to this vhost.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
