// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceRabbitMQParameters extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>amqp-cn-nif22u74****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>eb-connect</p>
     */
    @NameInMap("VirtualHostName")
    public String virtualHostName;

    public static SourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceRabbitMQParameters self = new SourceRabbitMQParameters();
        return TeaModel.build(map, self);
    }

    public SourceRabbitMQParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceRabbitMQParameters setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public SourceRabbitMQParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
        this.virtualHostName = virtualHostName;
        return this;
    }
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

}
