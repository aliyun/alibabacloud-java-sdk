// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteQueueRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("VirtualHost")
    public String virtualHost;

    public static DeleteQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueueRequest self = new DeleteQueueRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQueueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public DeleteQueueRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
