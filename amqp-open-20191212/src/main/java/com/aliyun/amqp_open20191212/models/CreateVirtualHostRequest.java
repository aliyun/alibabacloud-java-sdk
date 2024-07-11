// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateVirtualHostRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-v0h1kb9n***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the vhost that you want to create. Valid values:</p>
     * <ul>
     * <li>The name can contain letters, digits, hyphens (-), underscores (_), periods (.), number signs (#), forward slash (/), and at signs (@).</li>
     * <li>The name must be 1 to 255 characters in length.</li>
     * <li>After the vhost is created, you cannot change its name. If you want to change the name of a vhost, delete the vhost and create another vhost.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Demo</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static CreateVirtualHostRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualHostRequest self = new CreateVirtualHostRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVirtualHostRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
