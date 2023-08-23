// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallPolicyPriorUsedRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static DescribeNatFirewallPolicyPriorUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallPolicyPriorUsedRequest self = new DescribeNatFirewallPolicyPriorUsedRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallPolicyPriorUsedRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeNatFirewallPolicyPriorUsedRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeNatFirewallPolicyPriorUsedRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNatFirewallPolicyPriorUsedRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
