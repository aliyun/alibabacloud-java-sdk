// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseAICInstanceRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    public static ReleaseAICInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAICInstanceRequest self = new ReleaseAICInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseAICInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
