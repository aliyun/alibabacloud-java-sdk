// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenConfigureRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <br>
     * <p>> You can call the [DescribeVpcFirewallCenList](https://help.aliyun.com/document_detail/345777.html) operation to query the instance IDs of VPC firewalls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The instance name of the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static ModifyVpcFirewallCenConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenConfigureRequest self = new ModifyVpcFirewallCenConfigureRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallCenConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallCenConfigureRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public ModifyVpcFirewallCenConfigureRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

}
