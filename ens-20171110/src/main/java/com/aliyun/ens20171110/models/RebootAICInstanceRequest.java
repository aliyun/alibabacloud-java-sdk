// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootAICInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServerId")
    public String serverId;

    public static RebootAICInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootAICInstanceRequest self = new RebootAICInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebootAICInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RebootAICInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
