// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DisableReplicationRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    public static DisableReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableReplicationRequest self = new DisableReplicationRequest();
        return TeaModel.build(map, self);
    }

    public DisableReplicationRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
