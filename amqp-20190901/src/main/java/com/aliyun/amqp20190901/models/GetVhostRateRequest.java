// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetVhostRateRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostNames")
    public java.util.Map<String, ?> vhostNames;

    public static GetVhostRateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVhostRateRequest self = new GetVhostRateRequest();
        return TeaModel.build(map, self);
    }

    public GetVhostRateRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetVhostRateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVhostRateRequest setVhostNames(java.util.Map<String, ?> vhostNames) {
        this.vhostNames = vhostNames;
        return this;
    }
    public java.util.Map<String, ?> getVhostNames() {
        return this.vhostNames;
    }

}
