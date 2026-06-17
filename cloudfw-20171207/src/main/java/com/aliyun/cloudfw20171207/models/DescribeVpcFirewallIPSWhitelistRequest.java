// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallIPSWhitelistRequest extends TeaModel {
    /**
     * <p>The language of the request and response messages.</p>
     * <p>Valid values:</p>
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
     * <p>The UID of the Cloud Firewall member account.</p>
     * 
     * <strong>example:</strong>
     * <p>176618****104675</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The instance ID of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><p>If the VPC firewall protects a network instance in a Cloud Enterprise Network (CEN) instance, set the value to the ID of the CEN instance. For a CEN instance of Basic Edition, you can call the <a href="https://help.aliyun.com/document_detail/345777.html">DescribeVpcFirewallCenList</a> operation to query the instance ID. For a CEN instance of Enterprise Edition, you can call the <a href="https://help.aliyun.com/document_detail/2384695.html">DescribeTrFirewallsV2List</a> operation to query the instance ID.</p>
     * </li>
     * <li><p>If the VPC firewall protects traffic between two VPCs that are connected by an Express Connect circuit, set the value to the instance ID of the VPC firewall. You can call the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation to query the instance ID of the VPC firewall.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-***</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallIPSWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallIPSWhitelistRequest self = new DescribeVpcFirewallIPSWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallIPSWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallIPSWhitelistRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallIPSWhitelistRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
