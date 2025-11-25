// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPrecheckDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cen-hxsqf2bv6di1a****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>134388541648****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <strong>example:</strong>
     * <p>cen_firewall</p>
     */
    @NameInMap("NetworkInstanceType")
    public String networkInstanceType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>tr-2vcn4u2g86tm72****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <strong>example:</strong>
     * <p>vpc-2zev8s8rxao33xt****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallPrecheckDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallPrecheckDetailRequest self = new DescribeVpcFirewallPrecheckDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallPrecheckDetailRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeVpcFirewallPrecheckDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallPrecheckDetailRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallPrecheckDetailRequest setNetworkInstanceType(String networkInstanceType) {
        this.networkInstanceType = networkInstanceType;
        return this;
    }
    public String getNetworkInstanceType() {
        return this.networkInstanceType;
    }

    public DescribeVpcFirewallPrecheckDetailRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVpcFirewallPrecheckDetailRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeVpcFirewallPrecheckDetailRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
