// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewaySecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>The description of the security group rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Product center access security group</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The port ranges.</p>
     */
    @NameInMap("portRanges")
    public java.util.List<String> portRanges;

    /**
     * <p>The security group ID. This parameter is required. The specified security group must be different from the security group associated with the gateway. Otherwise, an error is returned.</p>
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
