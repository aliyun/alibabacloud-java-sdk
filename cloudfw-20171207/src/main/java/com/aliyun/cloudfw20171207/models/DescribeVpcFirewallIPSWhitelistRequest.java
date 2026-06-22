// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallIPSWhitelistRequest extends TeaModel {
    /**
     * <p>The language of the request and response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
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
     * <p>176618****104675</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The instance ID of the VPC firewall. Valid values:</p>
     * <ul>
     * <li>If the VPC firewall protects network instances in a Cloud Enterprise Network (CEN) instance, the instance ID is the CEN instance ID. For CEN Basic Edition, call the <a href="https://help.aliyun.com/document_detail/345777.html">DescribeVpcFirewallCenList</a> operation to query the CEN instance ID. For CEN Enterprise Edition, call the <a href="https://help.aliyun.com/document_detail/2384695.html">DescribeTrFirewallsV2List</a> operation to query the CEN instance ID.</li>
     * <li>If the VPC firewall protects traffic between two VPCs connected through Express Connect, the instance ID is the VPC firewall instance ID. Call the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation to query the VPC firewall instance ID.</li>
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
