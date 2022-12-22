// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyRequest extends TeaModel {
    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ID of the policy group of the source VPC firewall. Valid values:
    // 
    // *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
    // *   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.
    // 
    // >  You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the IDs of policy groups.
    @NameInMap("SourceVpcFirewallId")
    public String sourceVpcFirewallId;

    // The ID of the policy group of the destination VPC firewall. Valid values:
    // 
    // *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a VBR, or a CCN instance.
    // *   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.
    // 
    // >  You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the IDs of policy groups.
    @NameInMap("TargetVpcFirewallId")
    public String targetVpcFirewallId;

    public static BatchCopyVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCopyVpcFirewallControlPolicyRequest self = new BatchCopyVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public BatchCopyVpcFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BatchCopyVpcFirewallControlPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public BatchCopyVpcFirewallControlPolicyRequest setSourceVpcFirewallId(String sourceVpcFirewallId) {
        this.sourceVpcFirewallId = sourceVpcFirewallId;
        return this;
    }
    public String getSourceVpcFirewallId() {
        return this.sourceVpcFirewallId;
    }

    public BatchCopyVpcFirewallControlPolicyRequest setTargetVpcFirewallId(String targetVpcFirewallId) {
        this.targetVpcFirewallId = targetVpcFirewallId;
        return this;
    }
    public String getTargetVpcFirewallId() {
        return this.targetVpcFirewallId;
    }

}
