// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateVPCConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AliyunFCSandboxDefaultRole</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>sg-bp1gx7yj8ud5mabcde</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("vSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1mwrqm3wkq7abcde</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static CreateTemplateVPCConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateVPCConfig self = new CreateTemplateVPCConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateVPCConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateTemplateVPCConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateTemplateVPCConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateTemplateVPCConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
