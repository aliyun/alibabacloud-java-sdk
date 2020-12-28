// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteBindingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VirtualHost")
    public String virtualHost;

    @NameInMap("SourceExchange")
    public String sourceExchange;

    @NameInMap("DestinationName")
    public String destinationName;

    @NameInMap("BindingType")
    public String bindingType;

    @NameInMap("BindingKey")
    public String bindingKey;

    public static DeleteBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingRequest self = new DeleteBindingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteBindingRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public DeleteBindingRequest setSourceExchange(String sourceExchange) {
        this.sourceExchange = sourceExchange;
        return this;
    }
    public String getSourceExchange() {
        return this.sourceExchange;
    }

    public DeleteBindingRequest setDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }
    public String getDestinationName() {
        return this.destinationName;
    }

    public DeleteBindingRequest setBindingType(String bindingType) {
        this.bindingType = bindingType;
        return this;
    }
    public String getBindingType() {
        return this.bindingType;
    }

    public DeleteBindingRequest setBindingKey(String bindingKey) {
        this.bindingKey = bindingKey;
        return this;
    }
    public String getBindingKey() {
        return this.bindingKey;
    }

}
