// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyRequest extends TeaModel {
    // The action that Cloud Firewall performs on the traffic. Valid values:
    // 
    // *   **accept**: allows the traffic.
    // *   **drop**: blocks the traffic.
    // *   **log**: monitors the traffic.
    // 
    // >  If you do not specify this parameter, access control policies are queried based on all actions.
    @NameInMap("AclAction")
    public String aclAction;

    // The unique ID of the access control policy.
    @NameInMap("AclUuid")
    public String aclUuid;

    // The number of the page to return.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The description of the access control policy. Fuzzy match is supported.
    @NameInMap("Description")
    public String description;

    // The destination address in the access control policy. Fuzzy match is supported.
    // 
    // >  The value of this parameter can be a CIDR block, a domain name, or an address book name.
    @NameInMap("Destination")
    public String destination;

    // The language of the content within the request and response.
    // 
    // Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is managed by your Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The number of entries to return on each page.
    // 
    // Maximum value: 50.
    @NameInMap("PageSize")
    public String pageSize;

    // The protocol type in the access control policy. Valid values:
    // 
    // *   **TCP**
    // *   **UDP**
    // *   **ICMP**
    // *   **ANY**: all protocol types
    // 
    // >  If you do not specify this parameter, access control policies are queried based on all protocol types.
    @NameInMap("Proto")
    public String proto;

    // Indicates whether the access control policy is enabled. By default, an access control policy is enabled after the policy is created. Valid values:
    // 
    // *   **true**: The access control policy is enabled.
    // *   **false**: The access control policy is disabled.
    @NameInMap("Release")
    public String release;

    // The source address in the access control policy. Fuzzy match is supported.
    // 
    // >  The value of this parameter can be a CIDR block or an address book name.
    @NameInMap("Source")
    public String source;

    // The instance ID of the VPC firewall. Valid values:
    // 
    // *   If the VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.
    // *   If the VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.
    // 
    // >  You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the IDs.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallControlPolicyRequest self = new DescribeVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeVpcFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeVpcFirewallControlPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVpcFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeVpcFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallControlPolicyRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallControlPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeVpcFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeVpcFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
