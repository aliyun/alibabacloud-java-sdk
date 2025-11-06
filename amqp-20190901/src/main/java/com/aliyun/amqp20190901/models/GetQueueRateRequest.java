// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueRateRequest extends TeaModel {
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
    public java.util.Map<String, ?> queueNames;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static GetQueueRateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueRateRequest self = new GetQueueRateRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueRateRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetQueueRateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQueueRateRequest setQueueNames(java.util.Map<String, ?> queueNames) {
        this.queueNames = queueNames;
        return this;
    }
    public java.util.Map<String, ?> getQueueNames() {
        return this.queueNames;
    }

    public GetQueueRateRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
