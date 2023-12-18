// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetAICInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AIC instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the AIC instance groups.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The ID of the server.</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    public static ResetAICInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAICInstanceShrinkRequest self = new ResetAICInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResetAICInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetAICInstanceShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ResetAICInstanceShrinkRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
