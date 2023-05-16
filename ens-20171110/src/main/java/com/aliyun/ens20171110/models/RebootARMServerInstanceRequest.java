// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootARMServerInstanceRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    public static RebootARMServerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootARMServerInstanceRequest self = new RebootARMServerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebootARMServerInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public RebootARMServerInstanceRequest setServerIds(java.util.List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

}
