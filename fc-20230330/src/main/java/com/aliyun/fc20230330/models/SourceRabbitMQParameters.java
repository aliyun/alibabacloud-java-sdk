// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceRabbitMQParameters extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("RegionId")
    public String regionId;

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
