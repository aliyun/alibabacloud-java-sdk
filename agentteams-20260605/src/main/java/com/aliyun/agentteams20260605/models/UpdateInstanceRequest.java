// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
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
    public java.util.List<UpdateInstanceRequestZones> zones;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateInstanceRequest setZones(java.util.List<UpdateInstanceRequestZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<UpdateInstanceRequestZones> getZones() {
        return this.zones;
    }

    public static class UpdateInstanceRequestZones extends TeaModel {
        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static UpdateInstanceRequestZones build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestZones self = new UpdateInstanceRequestZones();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateInstanceRequestZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
