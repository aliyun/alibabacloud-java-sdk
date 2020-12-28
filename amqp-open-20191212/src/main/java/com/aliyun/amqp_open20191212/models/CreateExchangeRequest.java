// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateExchangeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VirtualHost")
    public String virtualHost;

    @NameInMap("ExchangeName")
    public String exchangeName;

    @NameInMap("ExchangeType")
    public String exchangeType;

    @NameInMap("AutoDeleteState")
    public Boolean autoDeleteState;

    @NameInMap("Internal")
    public Boolean internal;

    @NameInMap("AlternateExchange")
    public String alternateExchange;

    public static CreateExchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExchangeRequest self = new CreateExchangeRequest();
        return TeaModel.build(map, self);
    }

    public CreateExchangeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExchangeRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
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

    public CreateExchangeRequest setAutoDeleteState(Boolean autoDeleteState) {
        this.autoDeleteState = autoDeleteState;
        return this;
    }
    public Boolean getAutoDeleteState() {
        return this.autoDeleteState;
    }

    public CreateExchangeRequest setInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }
    public Boolean getInternal() {
        return this.internal;
    }

    public CreateExchangeRequest setAlternateExchange(String alternateExchange) {
        this.alternateExchange = alternateExchange;
        return this;
    }
    public String getAlternateExchange() {
        return this.alternateExchange;
    }

}
