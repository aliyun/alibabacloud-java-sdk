// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueRateShrinkRequest extends TeaModel {
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
    @NameInMap("QueueNames")
    public String queueNamesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static GetQueueRateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueRateShrinkRequest self = new GetQueueRateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueRateShrinkRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetQueueRateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQueueRateShrinkRequest setQueueNamesShrink(String queueNamesShrink) {
        this.queueNamesShrink = queueNamesShrink;
        return this;
    }
    public String getQueueNamesShrink() {
        return this.queueNamesShrink;
    }

    public GetQueueRateShrinkRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
