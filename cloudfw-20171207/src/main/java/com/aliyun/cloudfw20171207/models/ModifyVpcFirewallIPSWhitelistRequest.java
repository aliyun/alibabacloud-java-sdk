// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallIPSWhitelistRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the list. Valid values:</p>
     * <br>
     * <p>*   **1**: user-defined</p>
     * <p>*   **2**: address book</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListType")
    public Long listType;

    /**
     * <p>The entry in the list.</p>
     */
    @NameInMap("ListValue")
    public String listValue;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The type of the whitelist. Valid values:</p>
     * <br>
     * <p>*   **1**: destination</p>
     * <p>*   **2**: source</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhiteType")
    public Long whiteType;

    public static ModifyVpcFirewallIPSWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallIPSWhitelistRequest self = new ModifyVpcFirewallIPSWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallIPSWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setListType(Long listType) {
        this.listType = listType;
        return this;
    }
    public Long getListType() {
        return this.listType;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setListValue(String listValue) {
        this.listValue = listValue;
        return this;
    }
    public String getListValue() {
        return this.listValue;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setWhiteType(Long whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Long getWhiteType() {
        return this.whiteType;
    }

}
