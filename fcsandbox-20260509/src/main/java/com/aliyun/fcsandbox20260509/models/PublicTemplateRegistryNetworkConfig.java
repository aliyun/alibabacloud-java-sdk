// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplateRegistryNetworkConfig extends TeaModel {
    /**
     * <p>The ID of the security group where the image repository resides.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1gx7yj8ud5mabcde</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch where the image repository resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnlk4jl2abcde</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC where the image repository resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1mwrqm3wkq7abcde</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static PublicTemplateRegistryNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateRegistryNetworkConfig self = new PublicTemplateRegistryNetworkConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateRegistryNetworkConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PublicTemplateRegistryNetworkConfig setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public PublicTemplateRegistryNetworkConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
