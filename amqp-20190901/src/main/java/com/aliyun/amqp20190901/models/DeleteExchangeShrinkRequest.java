// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DeleteExchangeShrinkRequest extends TeaModel {
    @NameInMap("Collina")
    public String collina;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("ExchangeName")
    public String exchangeName;

    @NameInMap("ExchangeNames")
    public String exchangeNamesShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UmidToken")
    public String umidToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static DeleteExchangeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExchangeShrinkRequest self = new DeleteExchangeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExchangeShrinkRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public DeleteExchangeShrinkRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public DeleteExchangeShrinkRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public DeleteExchangeShrinkRequest setExchangeNamesShrink(String exchangeNamesShrink) {
        this.exchangeNamesShrink = exchangeNamesShrink;
        return this;
    }
    public String getExchangeNamesShrink() {
        return this.exchangeNamesShrink;
    }

    public DeleteExchangeShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteExchangeShrinkRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public DeleteExchangeShrinkRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
