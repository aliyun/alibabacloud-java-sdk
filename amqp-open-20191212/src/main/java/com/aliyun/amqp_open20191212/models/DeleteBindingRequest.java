// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteBindingRequest extends TeaModel {
    /**
     * <p>The binding key.</p>
     * 
     * <strong>example:</strong>
     * <p>.test.</p>
     */
    @NameInMap("BindingKey")
    public String bindingKey;

    /**
     * <p>The type of the object that you want to unbind from the source exchange. Valid values:</p>
     * <ul>
     * <li><strong>QUEUE</strong></li>
     * <li><strong>EXCHANGE</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QUEUE</p>
     */
    @NameInMap("BindingType")
    public String bindingType;

    /**
     * <p>The name of the object that you want to unbind from the source exchange.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoQueue</p>
     */
    @NameInMap("DestinationName")
    public String destinationName;

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
     * <p>The name of the source exchange.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NormalEX</p>
     */
    @NameInMap("SourceExchange")
    public String sourceExchange;

    /**
     * <p>The vhost name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static DeleteBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingRequest self = new DeleteBindingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBindingRequest setBindingKey(String bindingKey) {
        this.bindingKey = bindingKey;
        return this;
    }
    public String getBindingKey() {
        return this.bindingKey;
    }

    public DeleteBindingRequest setBindingType(String bindingType) {
        this.bindingType = bindingType;
        return this;
    }
    public String getBindingType() {
        return this.bindingType;
    }

    public DeleteBindingRequest setDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }
    public String getDestinationName() {
        return this.destinationName;
    }

    public DeleteBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteBindingRequest setSourceExchange(String sourceExchange) {
        this.sourceExchange = sourceExchange;
        return this;
    }
    public String getSourceExchange() {
        return this.sourceExchange;
    }

    public DeleteBindingRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
