// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallPrecheckRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cen-iv8m2lj2fqg1xt****</p>
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
     * <p>128599825273****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <strong>example:</strong>
     * <p>cen_tr_firewall</p>
     */
    @NameInMap("NetworkInstanceType")
    public String networkInstanceType;

    /**
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>tr-t4n16htuv1jalj9cq****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
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
