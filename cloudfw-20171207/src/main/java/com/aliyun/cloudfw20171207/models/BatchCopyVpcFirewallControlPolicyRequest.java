// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchCopyVpcFirewallControlPolicyRequest extends TeaModel {
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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The ID of the policy group for the source VPC firewall. Valid values:</p>
     * <ul>
     * <li><p>If the VPC firewall protects traffic between a network instance in a Cloud Enterprise Network (CEN) and a specified VPC, use the ID of the CEN instance. The network instance can be a VPC, a Virtual Border Router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * </li>
     * <li><p>If the VPC firewall protects traffic between two VPCs connected by an Express Connect circuit, use the ID of the VPC firewall instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("SourceVpcFirewallId")
    public String sourceVpcFirewallId;

    /**
     * <p>The ID of the policy group for the destination VPC firewall. Valid values:</p>
     * <ul>
     * <li><p>If the VPC firewall protects traffic between a network instance in a Cloud Enterprise Network (CEN) and a specified VPC, use the ID of the CEN instance. The network instance can be a VPC, a Virtual Border Router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * </li>
     * <li><p>If the VPC firewall protects traffic between two VPCs connected by an Express Connect circuit, use the ID of the VPC firewall instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
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
