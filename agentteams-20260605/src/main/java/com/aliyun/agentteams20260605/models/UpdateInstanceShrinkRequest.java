// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p><strong>The ID of the AgentTeams instance.</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-abc123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p><strong>The new instance name. This parameter cannot be empty.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>New instance name.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateNet</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The list of zones and vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Zones")
    public String zonesShrink;

    public static UpdateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceShrinkRequest self = new UpdateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateInstanceShrinkRequest setZonesShrink(String zonesShrink) {
        this.zonesShrink = zonesShrink;
        return this;
    }
    public String getZonesShrink() {
        return this.zonesShrink;
    }

}
