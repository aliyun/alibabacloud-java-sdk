// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class VPCConfig extends TeaModel {
    /**
     * <p>The RAM role that is assumed by Function Compute to access VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::188077086902****:role/fc-test</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp18hj1wtxgy3b0***</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The list of vSwitches.</p>
     */
    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-***</p>
     */
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
