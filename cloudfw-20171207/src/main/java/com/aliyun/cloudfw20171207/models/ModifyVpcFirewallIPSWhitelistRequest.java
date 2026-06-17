// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallIPSWhitelistRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the list. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: user-defined</p>
     * </li>
     * <li><p><strong>2</strong>: address book</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ListType")
    public Long listType;

    /**
     * <p>The value that corresponds to the list type.</p>
     * 
     * <strong>example:</strong>
     * <p>10.130.0.0/20,10.130.17.11/32</p>
     */
    @NameInMap("ListValue")
    public String listValue;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>1415189284827022</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-d7b8ce273791475b9b0b</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The type of the whitelist. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: destination</p>
     * </li>
     * <li><p><strong>2</strong>: source</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
