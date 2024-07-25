// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AddGatewaySecurityGroupRuleRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("portRanges")
    public java.util.List<String> portRanges;

    /**
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
