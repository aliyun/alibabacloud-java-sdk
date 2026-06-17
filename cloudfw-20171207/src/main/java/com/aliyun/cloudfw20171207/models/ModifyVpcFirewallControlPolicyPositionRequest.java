// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyPositionRequest extends TeaModel {
    /**
     * <p>The unique ID of the access control policy.</p>
     * <p>To modify an access control policy, provide the unique ID of the policy. Call the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2746d9ff-5d7c-449d-a2a9-ccaa15fe****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The language of the request and response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (Default): Chinese</p>
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
     * <p>The new priority of the access control policy.</p>
     * <blockquote>
     * <p>For more information about the valid range of priorities, see <a href="https://help.aliyun.com/document_detail/474145.html">DescribePolicyPriorities</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The original priority of the access control policy.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Use the AclUuid parameter to specify the policy to modify.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("OldOrder")
    public String oldOrder;

    /**
     * <p>The ID of the policy group for the VPC firewall. You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain the ID.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If the VPC firewall protects a Cloud Enterprise Network (CEN) instance, the ID of the policy group is the ID of the CEN instance.</p>
     * <p>Example: cen-ervw0g12b5jbw\<em>\</em>\<em>\</em></p>
     * </li>
     * <li><p>If the VPC firewall protects an Express Connect circuit, the ID of the policy group is the ID of the VPC firewall instance.</p>
     * <p>Example: vfw-a42bbb7b887148c9\<em>\</em>\<em>\</em></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallControlPolicyPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyPositionRequest self = new ModifyVpcFirewallControlPolicyPositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setOldOrder(String oldOrder) {
        this.oldOrder = oldOrder;
        return this;
    }
    public String getOldOrder() {
        return this.oldOrder;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
