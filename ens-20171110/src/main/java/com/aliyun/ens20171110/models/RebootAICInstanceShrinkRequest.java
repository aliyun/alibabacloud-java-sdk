// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootAICInstanceShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("ServerId")
    public String serverId;

    public static RebootAICInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootAICInstanceShrinkRequest self = new RebootAICInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RebootAICInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RebootAICInstanceShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public RebootAICInstanceShrinkRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
