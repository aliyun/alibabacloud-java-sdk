// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootAICInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AIC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-instance****</p>
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
     * 
     * <strong>example:</strong>
     * <p>cas-instance****</p>
     */
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
