// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSecurityGroupRuleRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Description")
    public String description;

    // 网关ID
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // 端口范围
    @NameInMap("PortRange")
    public String portRange;

    // 安全组ID
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static AddSecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityGroupRuleRequest self = new AddSecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddSecurityGroupRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddSecurityGroupRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddSecurityGroupRuleRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddSecurityGroupRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AddSecurityGroupRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
