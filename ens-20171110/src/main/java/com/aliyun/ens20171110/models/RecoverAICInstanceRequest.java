// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RecoverAICInstanceRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    public static RecoverAICInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverAICInstanceRequest self = new RecoverAICInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RecoverAICInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
