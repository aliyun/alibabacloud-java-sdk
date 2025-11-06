// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DeleteExchangeRequest extends TeaModel {
    @NameInMap("Collina")
    public String collina;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("ExchangeName")
    public String exchangeName;

    @NameInMap("ExchangeNames")
    public java.util.Map<String, ?> exchangeNames;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UmidToken")
    public String umidToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static DeleteExchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExchangeRequest self = new DeleteExchangeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExchangeRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public DeleteExchangeRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public DeleteExchangeRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public DeleteExchangeRequest setExchangeNames(java.util.Map<String, ?> exchangeNames) {
        this.exchangeNames = exchangeNames;
        return this;
    }
    public java.util.Map<String, ?> getExchangeNames() {
        return this.exchangeNames;
    }

    public DeleteExchangeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteExchangeRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public DeleteExchangeRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
