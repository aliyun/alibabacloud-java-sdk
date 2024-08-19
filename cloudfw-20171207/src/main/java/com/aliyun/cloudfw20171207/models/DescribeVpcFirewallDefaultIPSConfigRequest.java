// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDefaultIPSConfigRequest extends TeaModel {
    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The instance ID of the VPC firewall. Valid values:</p>
     * <ul>
     * <li>If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. You can call the <a href="https://help.aliyun.com/document_detail/345777.html">DescribeVpcFirewallCenList</a> operation to query the IDs of CEN instances.</li>
     * <li>If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall. You can call the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation to query the instance IDs of VPC firewalls.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-m5e7dbc4y****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallDefaultIPSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDefaultIPSConfigRequest self = new DescribeVpcFirewallDefaultIPSConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDefaultIPSConfigRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallDefaultIPSConfigRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
