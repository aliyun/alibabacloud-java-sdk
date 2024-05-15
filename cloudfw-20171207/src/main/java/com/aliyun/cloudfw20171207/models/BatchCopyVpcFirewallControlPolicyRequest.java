// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The ID of the policy group of the source VPC firewall. Valid values:</p>
     * <br>
     * <p>*   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <p>*   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</p>
     * <br>
     * <p>>  You can call the [DescribeVpcFirewallAclGroupList](https://help.aliyun.com/document_detail/159760.html) operation to query the IDs of policy groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceVpcFirewallId")
    public String sourceVpcFirewallId;

    /**
     * <p>The ID of the policy group of the destination VPC firewall. Valid values:</p>
     * <br>
     * <p>*   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a VBR, or a CCN instance.</p>
     * <p>*   If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</p>
     * <br>
     * <p>>  You can call the [DescribeVpcFirewallAclGroupList](https://help.aliyun.com/document_detail/159760.html) operation to query the IDs of policy groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
