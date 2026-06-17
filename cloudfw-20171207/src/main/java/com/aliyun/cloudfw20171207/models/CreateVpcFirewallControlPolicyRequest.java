// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: Denies the traffic.</p>
     * </li>
     * <li><p><strong>log</strong>: Monitors the traffic.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The application type that the access control policy supports. Valid values:</p>
     * <ul>
     * <li><p><strong>FTP</strong></p>
     * </li>
     * <li><p><strong>HTTP</strong></p>
     * </li>
     * <li><p><strong>HTTPS</strong></p>
     * </li>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>SMTP</strong></p>
     * </li>
     * <li><p><strong>SMTPS</strong></p>
     * </li>
     * <li><p><strong>RDP</strong></p>
     * </li>
     * <li><p><strong>VNC</strong></p>
     * </li>
     * <li><p><strong>SSH</strong></p>
     * </li>
     * <li><p><strong>Redis</strong></p>
     * </li>
     * <li><p><strong>MQTT</strong></p>
     * </li>
     * <li><p><strong>MongoDB</strong></p>
     * </li>
     * <li><p><strong>Memcache</strong></p>
     * </li>
     * <li><p><strong>SSL</strong></p>
     * </li>
     * <li><p><strong>ANY</strong> (all application types)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The list of application types that the access control policy supports.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy.</p>
     * <blockquote>
     * <p>Set this parameter when <strong>DestPortType</strong> is set to <code>port</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy.</p>
     * <blockquote>
     * <p>Set this parameter when <strong>DestPortType</strong> is set to <code>group</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>my_port_group</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>port</strong>: port</p>
     * </li>
     * <li><p><strong>group</strong>: port address book</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>port</p>
     */
    @NameInMap("DestPortType")
    public String destPortType;

    /**
     * <p>The destination address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p>If <strong>DestinationType</strong> is <code>net</code>, set this parameter to a destination CIDR block.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is <code>group</code>, set this parameter to the name of a destination address book.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is <code>domain</code>, set this parameter to a destination domain name.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.2.XX.XX/24</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: address book</p>
     * </li>
     * <li><p><strong>domain</strong>: domain name</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The domain name resolution method for the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>FQDN</strong>: FQDN-based</p>
     * </li>
     * <li><p><strong>DNS</strong>: DNS-based dynamic resolution</p>
     * </li>
     * <li><p><strong>FQDN_AND_DNS</strong>: FQDN-based and DNS-based dynamic resolution</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FQDN</p>
     */
    @NameInMap("DomainResolveType")
    public String domainResolveType;

    /**
     * <p>The end time of the policy validity period. This value is a UNIX timestamp. The time must be on the hour or half-hour and must be at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>If RepeatType is \<code>Permanent\\</code>, leave this parameter empty. If RepeatType is \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The priority of the access control policy.</p>
     * <p>The priority starts from 1. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The protocol type in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>ANY</strong> (Set this value if you are unsure of the protocol type.)</p>
     * </li>
     * <li><p><strong>TCP</strong></p>
     * </li>
     * <li><p><strong>UDP</strong></p>
     * </li>
     * <li><p><strong>ICMP</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. The policy is enabled by default after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables the access control policy.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables the access control policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of the week or month on which the policy is recurrently active.</p>
     * <ul>
     * <li><p>If RepeatType is <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty. Example: \<code>[]\\</code></p>
     * </li>
     * <li><p>If RepeatType is \<code>Weekly\\</code>, set this parameter. Example: \<code>[0, 6]\\</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Weekly\\</code>, the values in RepeatDays cannot be duplicates.</p>
     * </blockquote>
     * <ul>
     * <li>If <strong>RepeatType</strong> is \<code>Monthly\\</code>, set this parameter. Example: \<code>[1, 31]\\</code></li>
     * </ul>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Monthly\\</code>, the values in RepeatDays cannot be duplicates.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The recurring end time of the policy validity period. For example: \<code>23:30\\</code>. The time must be on the hour or half-hour and must be at least 30 minutes later than the recurring start time.</p>
     * <blockquote>
     * <p>If RepeatType is \<code>Permanent\\</code> or \<code>None\\</code>, leave this parameter empty. If RepeatType is \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The recurring start time of the policy validity period. For example: \<code>08:00\\</code>. The time must be on the hour or half-hour and must be at least 30 minutes earlier than the recurring end time.</p>
     * <blockquote>
     * <p>If RepeatType is \<code>Permanent\\</code> or \<code>None\\</code>, leave this parameter empty. If RepeatType is \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

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
     * <p>The source address in the access control policy.</p>
     * <ul>
     * <li><p>If SourceType is <code>net</code>, set this parameter to a source CIDR block.</p>
     * </li>
     * <li><p>If SourceType is <code>group</code>, set this parameter to the name of a source address book.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.2.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: address book</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the policy validity period. This value is a UNIX timestamp. The time must be on the hour or half-hour and must be at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>If RepeatType is \<code>Permanent\\</code>, leave this parameter empty. If RepeatType is \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the policy group for the VPC border firewall.</p>
     * <ul>
     * <li><p>If the VPC border firewall protects traffic between two VPCs that are connected using a CEN instance, set this parameter to the ID of the CEN instance.</p>
     * </li>
     * <li><p>If the VPC border firewall protects traffic between two VPCs that are connected using an Express Connect circuit, set this parameter to the ID of the VPC border firewall instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to get this ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static CreateVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallControlPolicyRequest self = new CreateVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    @Deprecated
    public CreateVpcFirewallControlPolicyRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateVpcFirewallControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public CreateVpcFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcFirewallControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public CreateVpcFirewallControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public CreateVpcFirewallControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public CreateVpcFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateVpcFirewallControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateVpcFirewallControlPolicyRequest setDomainResolveType(String domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public String getDomainResolveType() {
        return this.domainResolveType;
    }

    public CreateVpcFirewallControlPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateVpcFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateVpcFirewallControlPolicyRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateVpcFirewallControlPolicyRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public CreateVpcFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public CreateVpcFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public CreateVpcFirewallControlPolicyRequest setRepeatDays(java.util.List<Long> repeatDays) {
        this.repeatDays = repeatDays;
        return this;
    }
    public java.util.List<Long> getRepeatDays() {
        return this.repeatDays;
    }

    public CreateVpcFirewallControlPolicyRequest setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }
    public String getRepeatEndTime() {
        return this.repeatEndTime;
    }

    public CreateVpcFirewallControlPolicyRequest setRepeatStartTime(String repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
        return this;
    }
    public String getRepeatStartTime() {
        return this.repeatStartTime;
    }

    public CreateVpcFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public CreateVpcFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateVpcFirewallControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateVpcFirewallControlPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
