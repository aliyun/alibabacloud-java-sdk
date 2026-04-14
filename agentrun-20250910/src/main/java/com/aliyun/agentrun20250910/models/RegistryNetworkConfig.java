// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RegistryNetworkConfig extends TeaModel {
    /**
     * <p>镜像仓库的安全组ID</p>
     * 
     * <strong>example:</strong>
     * <p>sg-xxxxxxxxxxxxx</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>镜像仓库所在的交换机ID</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxxxx</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <p>镜像仓库所在的VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxxxxxxxxxxx</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static RegistryNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryNetworkConfig self = new RegistryNetworkConfig();
        return TeaModel.build(map, self);
    }

    public RegistryNetworkConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RegistryNetworkConfig setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RegistryNetworkConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
