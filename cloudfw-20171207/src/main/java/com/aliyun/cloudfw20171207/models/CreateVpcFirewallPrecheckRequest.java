// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallPrecheckRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-iv8m2lj2fqg1xt****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The UID of the member account of Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>128599825273****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cen_firewall</strong></p>
     * </li>
     * <li><p><strong>cen_tr_firewall</strong></p>
     * </li>
     * <li><p><strong>ec_firewall</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cen_tr_firewall</p>
     */
    @NameInMap("NetworkInstanceType")
    public String networkInstanceType;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the transit router instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-t4n16htuv1jalj9cq****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the VPC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp132e2wpu9o6qth****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcFirewallPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallPrecheckRequest self = new CreateVpcFirewallPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallPrecheckRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateVpcFirewallPrecheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateVpcFirewallPrecheckRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateVpcFirewallPrecheckRequest setNetworkInstanceType(String networkInstanceType) {
        this.networkInstanceType = networkInstanceType;
        return this;
    }
    public String getNetworkInstanceType() {
        return this.networkInstanceType;
    }

    public CreateVpcFirewallPrecheckRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateVpcFirewallPrecheckRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateVpcFirewallPrecheckRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
