// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The range of port numbers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The ID of the security group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
