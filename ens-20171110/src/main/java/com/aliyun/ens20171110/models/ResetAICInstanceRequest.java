// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetAICInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServerId")
    public String serverId;

    public static ResetAICInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAICInstanceRequest self = new ResetAICInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResetAICInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetAICInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
