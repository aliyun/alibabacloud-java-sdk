// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallCenConfigureRequest extends TeaModel {
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
     * <p>The instance IDs of VPC firewalls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallIdList")
    public java.util.List<String> vpcFirewallIdList;

    public static DeleteVpcFirewallCenConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallCenConfigureRequest self = new DeleteVpcFirewallCenConfigureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallCenConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteVpcFirewallCenConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DeleteVpcFirewallCenConfigureRequest setVpcFirewallIdList(java.util.List<String> vpcFirewallIdList) {
        this.vpcFirewallIdList = vpcFirewallIdList;
        return this;
    }
    public java.util.List<String> getVpcFirewallIdList() {
        return this.vpcFirewallIdList;
    }

}
