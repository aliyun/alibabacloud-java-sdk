// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewaySecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>Description of the security group rule.</p>
     * 
     * <strong>example:</strong>
     * <p>商品中心访问安全组</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Port ranges.</p>
     */
    @NameInMap("portRanges")
    public java.util.List<String> portRanges;

    /**
     * <p>Security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-wz929kxhcdp****</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    public static AddGatewaySecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewaySecurityGroupRuleRequest self = new AddGatewaySecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewaySecurityGroupRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddGatewaySecurityGroupRuleRequest setPortRanges(java.util.List<String> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<String> getPortRanges() {
        return this.portRanges;
    }

    public AddGatewaySecurityGroupRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
