// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetVhostRateShrinkRequest extends TeaModel {
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
    public String vhostNamesShrink;

    public static GetVhostRateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVhostRateShrinkRequest self = new GetVhostRateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetVhostRateShrinkRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetVhostRateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVhostRateShrinkRequest setVhostNamesShrink(String vhostNamesShrink) {
        this.vhostNamesShrink = vhostNamesShrink;
        return this;
    }
    public String getVhostNamesShrink() {
        return this.vhostNamesShrink;
    }

}
