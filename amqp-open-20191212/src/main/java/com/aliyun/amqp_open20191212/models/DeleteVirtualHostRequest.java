// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteVirtualHostRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance to which the vhost you want to delete belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the vhost that you want to delete.</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static DeleteVirtualHostRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualHostRequest self = new DeleteVirtualHostRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVirtualHostRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
