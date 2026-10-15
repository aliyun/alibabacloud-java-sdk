// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class NetworkConfiguration extends TeaModel {
    /**
     * <p>The network mode.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("networkMode")
    public String networkMode;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1gx7yj8ud5mabcde</p>
     */
    @NameInMap("securityGroupID")
    public String securityGroupID;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1mwrqm3wkq7abcde</p>
     */
    @NameInMap("vpcID")
    public String vpcID;

    /**
     * <p>The list of vSwitch IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vsw-bp1s5fnlk4jl2abcde&quot;]</p>
     */
    @NameInMap("vswitchIDs")
    public java.util.List<String> vswitchIDs;

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

    public NetworkConfiguration setSecurityGroupID(String securityGroupID) {
        this.securityGroupID = securityGroupID;
        return this;
    }
    public String getSecurityGroupID() {
        return this.securityGroupID;
    }

    public NetworkConfiguration setVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }
    public String getVpcID() {
        return this.vpcID;
    }

    public NetworkConfiguration setVswitchIDs(java.util.List<String> vswitchIDs) {
        this.vswitchIDs = vswitchIDs;
        return this;
    }
    public java.util.List<String> getVswitchIDs() {
        return this.vswitchIDs;
    }

}
