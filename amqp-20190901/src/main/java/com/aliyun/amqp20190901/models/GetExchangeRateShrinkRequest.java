// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetExchangeRateShrinkRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExchangeNames")
    public String exchangeNamesShrink;

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

    public static GetExchangeRateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExchangeRateShrinkRequest self = new GetExchangeRateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetExchangeRateShrinkRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetExchangeRateShrinkRequest setExchangeNamesShrink(String exchangeNamesShrink) {
        this.exchangeNamesShrink = exchangeNamesShrink;
        return this;
    }
    public String getExchangeNamesShrink() {
        return this.exchangeNamesShrink;
    }

    public GetExchangeRateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetExchangeRateShrinkRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
