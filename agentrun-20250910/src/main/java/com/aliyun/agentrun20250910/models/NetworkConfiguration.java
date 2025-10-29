// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class NetworkConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("networkMode")
    public String networkMode;

    /**
     * <strong>example:</strong>
     * <p>sg-1234567890abcdef0</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>vpc-1234567890abcdef0</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <strong>example:</strong>
     * <p>vsw-1234567890abcdef0,vsw-abcdef1234567890</p>
     */
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
