// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allow</p>
     * </li>
     * <li><p><strong>drop</strong>: Deny</p>
     * </li>
     * <li><p><strong>log</strong>: Monitor</p>
     * </li>
     * </ul>
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
     * <p>323f0697-2a21-4e43-b142-*****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The page number of the current page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the access control policy. Fuzzy queries are supported.</p>
     * <blockquote>
     * <p>If you do not set this parameter, the descriptions of all policies are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test-description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy queries are supported. The value of this parameter varies based on the value of the DestinationType parameter.</p>
     * <ul>
     * <li><p>If DestinationType is set to <code>net</code>, the value of this parameter is a CIDR block. Example: 10.0.3.0/24.</p>
     * </li>
     * <li><p>If DestinationType is set to <code>domain</code>, the value of this parameter is a domain name. Example: aliyun.</p>
     * </li>
     * <li><p>If DestinationType is set to <code>group</code>, the value of this parameter is the name of an address book. Example: db_group.</p>
     * </li>
     * <li><p>If DestinationType is set to <code>location</code>, the value of this parameter is a region name. For more information, see <a href="https://help.aliyun.com/document_detail/474128.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all types of destination addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>x.x.x.x/32</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The traffic direction of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>out</strong>: outbound traffic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The ID of the NAT Gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxxxxx</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The maximum number of entries to return on each page for a paged query. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>TCP</strong></p>
     * </li>
     * <li><p><strong>UDP</strong></p>
     * </li>
     * <li><p><strong>ICMP</strong></p>
     * </li>
     * <li><p><strong>ANY</strong> (all protocol types)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all protocol types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled</p>
     * </li>
     * <li><p><strong>false</strong>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The recurrence type for the policy validity period. Valid values:</p>
     * <ul>
     * <li><p><strong>Permanent</strong> (default): always</p>
     * </li>
     * <li><p><strong>None</strong>: one-time</p>
     * </li>
     * <li><p><strong>Daily</strong>: daily</p>
     * </li>
     * <li><p><strong>Weekly</strong>: weekly</p>
     * </li>
     * <li><p><strong>Monthly</strong>: monthly</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy queries are supported. The value of this parameter varies based on the value of the SourceType parameter.</p>
     * <ul>
     * <li><p>If SourceType is set to <code>net</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
     * </li>
     * <li><p>If SourceType is set to <code>group</code>, the value of this parameter is the name of an address book. Example: db_group. If you leave this parameter empty, all source addresses are queried.</p>
     * </li>
     * <li><p>If SourceType is set to <code>location</code>, the value of this parameter is a source region. Example: Beijing or beijing. You can use either Chinese or English to specify the region.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all types of source addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1/32</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribeNatFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallControlPolicyRequest self = new DescribeNatFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeNatFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeNatFirewallControlPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNatFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNatFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeNatFirewallControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeNatFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNatFirewallControlPolicyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatFirewallControlPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNatFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeNatFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeNatFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public DescribeNatFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
