// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootAICInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the AIC instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the AIC instance groups.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the server.</p>
     */
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

    public RebootAICInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RebootAICInstanceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
