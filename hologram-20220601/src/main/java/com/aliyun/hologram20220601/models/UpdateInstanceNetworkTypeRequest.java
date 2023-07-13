// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstanceNetworkTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to change the network type from AnyTunnel to SingleTunnel. This parameter is invalid for new instances. For new instances, this parameter is set to null by default.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   others/null</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("anyTunnelToSingleTunnel")
    public String anyTunnelToSingleTunnel;

    /**
     * <p>A list of network types that you want to enable. The list of enabled network types is randomly ordered. For example, the Internet, internal network, and VPCSingleTunnel network types are enabled. If you want to disable the Internet type, set this parameter to Intranet,VPCSingleTunnel.</p>
     */
    @NameInMap("networkTypes")
    public String networkTypes;

    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the instance belongs.</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The owner ID of the VPC, which is the ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("vpcOwnerId")
    public String vpcOwnerId;

    /**
     * <p>The region ID of the VPC.</p>
     */
    @NameInMap("vpcRegionId")
    public String vpcRegionId;

    public static UpdateInstanceNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNetworkTypeRequest self = new UpdateInstanceNetworkTypeRequest();
        return TeaModel.build(map, self);
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
