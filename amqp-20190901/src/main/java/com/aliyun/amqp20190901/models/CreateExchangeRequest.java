// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateExchangeRequest extends TeaModel {
    @NameInMap("AlternateExchange")
    public String alternateExchange;

    @NameInMap("AutoDelete")
    public Boolean autoDelete;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExchangeName")
    public String exchangeName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExchangeType")
    public Integer exchangeType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Internal")
    public Boolean internal;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    @NameInMap("XDelayedType")
    public String XDelayedType;

    @NameInMap("XHashHeader")
    public String XHashHeader;

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

    public CreateExchangeRequest setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }
    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    public CreateExchangeRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public CreateExchangeRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public CreateExchangeRequest setExchangeType(Integer exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public Integer getExchangeType() {
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

    public CreateExchangeRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

    public CreateExchangeRequest setXDelayedType(String XDelayedType) {
        this.XDelayedType = XDelayedType;
        return this;
    }
    public String getXDelayedType() {
        return this.XDelayedType;
    }

    public CreateExchangeRequest setXHashHeader(String XHashHeader) {
        this.XHashHeader = XHashHeader;
        return this;
    }
    public String getXHashHeader() {
        return this.XHashHeader;
    }

}
