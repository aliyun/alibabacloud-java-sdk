// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class PurgeQueueShrinkRequest extends TeaModel {
    @NameInMap("Collina")
    public String collina;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("QueueNames")
    public String queueNamesShrink;

    @NameInMap("UmidToken")
    public String umidToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static PurgeQueueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PurgeQueueShrinkRequest self = new PurgeQueueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PurgeQueueShrinkRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public PurgeQueueShrinkRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public PurgeQueueShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PurgeQueueShrinkRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public PurgeQueueShrinkRequest setQueueNamesShrink(String queueNamesShrink) {
        this.queueNamesShrink = queueNamesShrink;
        return this;
    }
    public String getQueueNamesShrink() {
        return this.queueNamesShrink;
    }

    public PurgeQueueShrinkRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public PurgeQueueShrinkRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
