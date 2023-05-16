// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootARMServerInstanceShrinkRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("ServerIds")
    public String serverIdsShrink;

    public static RebootARMServerInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootARMServerInstanceShrinkRequest self = new RebootARMServerInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RebootARMServerInstanceShrinkRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public RebootARMServerInstanceShrinkRequest setServerIdsShrink(String serverIdsShrink) {
        this.serverIdsShrink = serverIdsShrink;
        return this;
    }
    public String getServerIdsShrink() {
        return this.serverIdsShrink;
    }

}
