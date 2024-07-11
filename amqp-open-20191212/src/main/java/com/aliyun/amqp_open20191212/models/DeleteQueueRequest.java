// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteQueueRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1880770869023***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The queue name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DemoQueue</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The vhost name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
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
