// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The ID of the policy group of the source VPC firewall. Valid values:</p>
     * <ul>
     * <li>If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</li>
     * <li>If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the IDs of policy groups.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("SourceVpcFirewallId")
    public String sourceVpcFirewallId;

    /**
     * <p>The ID of the policy group of the destination VPC firewall. Valid values:</p>
     * <ul>
     * <li>If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a VBR, or a CCN instance.</li>
     * <li>If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the IDs of policy groups.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-e37d3a04cf79446a****</p>
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

    @Deprecated
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
