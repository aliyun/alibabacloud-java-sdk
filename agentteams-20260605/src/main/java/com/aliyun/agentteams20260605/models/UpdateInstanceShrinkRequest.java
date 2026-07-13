// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-abc123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>新的实例名称</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("NetworkType")
    public String networkType;

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
