// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class AttachVpcToNetLinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NetLinkId")
    public String netLinkId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitches")
    public java.util.List<String> vSwitches;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static AttachVpcToNetLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVpcToNetLinkRequest self = new AttachVpcToNetLinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachVpcToNetLinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachVpcToNetLinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachVpcToNetLinkRequest setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public AttachVpcToNetLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachVpcToNetLinkRequest setVSwitches(java.util.List<String> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<String> getVSwitches() {
        return this.vSwitches;
    }

    public AttachVpcToNetLinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AttachVpcToNetLinkRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
