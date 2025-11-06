// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetExchangeRateRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExchangeNames")
    public java.util.Map<String, ?> exchangeNames;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static GetExchangeRateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExchangeRateRequest self = new GetExchangeRateRequest();
        return TeaModel.build(map, self);
    }

    public GetExchangeRateRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetExchangeRateRequest setExchangeNames(java.util.Map<String, ?> exchangeNames) {
        this.exchangeNames = exchangeNames;
        return this;
    }
    public java.util.Map<String, ?> getExchangeNames() {
        return this.exchangeNames;
    }

    public GetExchangeRateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetExchangeRateRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
