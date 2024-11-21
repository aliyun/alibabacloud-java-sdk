// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows the traffic.</li>
     * <li><strong>drop</strong>: blocks the traffic.</li>
     * <li><strong>log</strong>: monitors the traffic.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, access control policies are queried based on all actions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>4037fbf7-3e39-4634-92a4-d0155247****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the access control policy. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>The value of this parameter can be a CIDR block or an address book name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The language of the content within the request and response.</p>
     * <p>Valid values:</p>
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
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The protocol type in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong></li>
     * <li><strong>ANY</strong>: all protocol types</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, access control policies of all protocol types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong> (default): The policy always takes effect.</li>
     * <li><strong>None</strong>: The policy takes effect for only once.</li>
     * <li><strong>Daily</strong>: The policy takes effect on a daily basis.</li>
     * <li><strong>Weekly</strong>: The policy takes effect on a weekly basis.</li>
     * <li><strong>Monthly</strong>: The policy takes effect on a monthly basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>The value of this parameter can be a CIDR block or an address book name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The instance ID of the VPC firewall. Valid values:</p>
     * <ul>
     * <li>If the VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.</li>
     * <li>If the VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
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

    public DescribeVpcFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
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
