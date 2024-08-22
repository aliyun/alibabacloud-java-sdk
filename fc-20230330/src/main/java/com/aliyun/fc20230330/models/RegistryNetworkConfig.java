// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RegistryNetworkConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sg-xxxxxxxxxxxxxx</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>vsw-xxxxxxxxxxxxxx</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-xxxxxxxxxxxxxx</p>
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
