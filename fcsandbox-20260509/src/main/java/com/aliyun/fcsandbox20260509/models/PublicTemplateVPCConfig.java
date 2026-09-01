// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplateVPCConfig extends TeaModel {
    /**
     * <p>The VPC authorization role name.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunFCSandboxDefaultRole</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1gx7yj8ud5mabcde</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <p>The list of vSwitch IDs.</p>
     */
    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1mwrqm3wkq7abcde</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static PublicTemplateVPCConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateVPCConfig self = new PublicTemplateVPCConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateVPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public PublicTemplateVPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PublicTemplateVPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public PublicTemplateVPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
