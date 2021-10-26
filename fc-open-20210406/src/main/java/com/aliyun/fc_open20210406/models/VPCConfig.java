// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class VPCConfig extends TeaModel {
    // Role
    @NameInMap("role")
    public String role;

    // 安全组ID
    @NameInMap("securityGroupId")
    public String securityGroupId;

    // VSwitch ID列表
    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    // VPC ID
    @NameInMap("vpcId")
    public String vpcId;

    public static VPCConfig build(java.util.Map<String, ?> map) throws Exception {
        VPCConfig self = new VPCConfig();
        return TeaModel.build(map, self);
    }

    public VPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public VPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public VPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public VPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
