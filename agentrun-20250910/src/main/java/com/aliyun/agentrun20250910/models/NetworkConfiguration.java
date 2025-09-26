// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class NetworkConfiguration extends TeaModel {
    @NameInMap("networkMode")
    public String networkMode;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vpcId")
    public String vpcId;

    @NameInMap("vswitchIds")
    public java.util.List<String> vswitchIds;

    public static NetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
        NetworkConfiguration self = new NetworkConfiguration();
        return TeaModel.build(map, self);
    }

    public NetworkConfiguration setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public NetworkConfiguration setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public NetworkConfiguration setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public NetworkConfiguration setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

}
