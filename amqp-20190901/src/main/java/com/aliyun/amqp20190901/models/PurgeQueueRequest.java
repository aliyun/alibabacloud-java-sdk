// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class PurgeQueueRequest extends TeaModel {
    @NameInMap("Collina")
    public String collina;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("QueueNames")
    public java.util.Map<String, ?> queueNames;

    @NameInMap("UmidToken")
    public String umidToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static PurgeQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        PurgeQueueRequest self = new PurgeQueueRequest();
        return TeaModel.build(map, self);
    }

    public PurgeQueueRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public PurgeQueueRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public PurgeQueueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PurgeQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public PurgeQueueRequest setQueueNames(java.util.Map<String, ?> queueNames) {
        this.queueNames = queueNames;
        return this;
    }
    public java.util.Map<String, ?> getQueueNames() {
        return this.queueNames;
    }

    public PurgeQueueRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public PurgeQueueRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
