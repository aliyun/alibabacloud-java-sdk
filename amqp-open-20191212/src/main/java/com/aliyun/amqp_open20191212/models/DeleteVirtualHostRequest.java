// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteVirtualHostRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

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
