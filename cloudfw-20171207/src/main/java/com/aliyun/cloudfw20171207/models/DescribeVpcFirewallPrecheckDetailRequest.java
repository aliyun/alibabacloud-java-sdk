// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPrecheckDetailRequest extends TeaModel {
    /**
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-hxsqf2bv6di1a****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the Cloud Firewall member accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>134388541648****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cen_firewall</strong>: CEN basic edition firewall</p>
     * </li>
     * <li><p><strong>cen_tr_firewall</strong>: CEN-TR firewall</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cen_firewall</p>
     */
    @NameInMap("NetworkInstanceType")
    public String networkInstanceType;

    /**
     * <p>The region ID. This parameter is required. If it is not specified, ErrorParameters is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The transit router instance ID. You must specify at least one of VpcId and TransitRouterId. Specify VpcId when querying a basic edition firewall, or specify TransitRouterId when querying a transit router (TR) scenario. If neither is specified, ErrorParameters is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-2vcn4u2g86tm72****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The VPC-connected instance ID. You must specify at least one of VpcId and TransitRouterId. Specify VpcId when querying a basic edition firewall, or specify TransitRouterId when querying a forward routing (TR) scenario. If neither is specified, ErrorParameters is returned.</p>
     * 
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
