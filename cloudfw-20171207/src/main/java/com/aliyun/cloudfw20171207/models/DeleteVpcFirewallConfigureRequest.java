// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallConfigureRequest extends TeaModel {
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
     * <p>The UID of a member account of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The list of instance IDs of the virtual private cloud (VPC) firewalls to delete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallIdList")
    public java.util.List<String> vpcFirewallIdList;

    public static DeleteVpcFirewallConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallConfigureRequest self = new DeleteVpcFirewallConfigureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteVpcFirewallConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DeleteVpcFirewallConfigureRequest setVpcFirewallIdList(java.util.List<String> vpcFirewallIdList) {
        this.vpcFirewallIdList = vpcFirewallIdList;
        return this;
    }
    public java.util.List<String> getVpcFirewallIdList() {
        return this.vpcFirewallIdList;
    }

}
