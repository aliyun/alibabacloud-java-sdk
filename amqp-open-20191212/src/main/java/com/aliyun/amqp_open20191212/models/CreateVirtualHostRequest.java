// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateVirtualHostRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

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
