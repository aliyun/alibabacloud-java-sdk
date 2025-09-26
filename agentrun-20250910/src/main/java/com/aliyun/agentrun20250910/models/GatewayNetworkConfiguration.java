// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GatewayNetworkConfiguration extends TeaModel {
    @NameInMap("networkMode")
    public String networkMode;

    @NameInMap("vpcId")
    public String vpcId;

    @NameInMap("vswitchIds")
    public java.util.List<String> vswitchIds;

    public static GatewayNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
        GatewayNetworkConfiguration self = new GatewayNetworkConfiguration();
        return TeaModel.build(map, self);
    }

    public GatewayNetworkConfiguration setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public GatewayNetworkConfiguration setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GatewayNetworkConfiguration setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

}
