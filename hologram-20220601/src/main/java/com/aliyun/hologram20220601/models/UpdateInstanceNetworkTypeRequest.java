// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkTypeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("anyTunnelToSingleTunnel")
    public String anyTunnelToSingleTunnel;

    @NameInMap("networkTypes")
    public String networkTypes;

    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID。</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    @NameInMap("vpcOwnerId")
    public String vpcOwnerId;

    /**
     * <p>vpc regionId。</p>
     */
    @NameInMap("vpcRegionId")
    public String vpcRegionId;

    public static UpdateInstanceNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkTypeRequest self = new UpdateInstanceNetworkTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNetworkTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceNetworkTypeRequest setAnyTunnelToSingleTunnel(String anyTunnelToSingleTunnel) {
        this.anyTunnelToSingleTunnel = anyTunnelToSingleTunnel;
        return this;
    }
    public String getAnyTunnelToSingleTunnel() {
        return this.anyTunnelToSingleTunnel;
    }

    public UpdateInstanceNetworkTypeRequest setNetworkTypes(String networkTypes) {
        this.networkTypes = networkTypes;
        return this;
    }
    public String getNetworkTypes() {
        return this.networkTypes;
    }

    public UpdateInstanceNetworkTypeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public UpdateInstanceNetworkTypeRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public UpdateInstanceNetworkTypeRequest setVpcOwnerId(String vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
        return this;
    }
    public String getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public UpdateInstanceNetworkTypeRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
