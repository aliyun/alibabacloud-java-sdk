// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteExchangeRequest extends TeaModel {
    @NameInMap("ExchangeName")
    public String exchangeName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VirtualHost")
    public String virtualHost;

    public static DeleteExchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExchangeRequest self = new DeleteExchangeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExchangeRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public DeleteExchangeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteExchangeRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
