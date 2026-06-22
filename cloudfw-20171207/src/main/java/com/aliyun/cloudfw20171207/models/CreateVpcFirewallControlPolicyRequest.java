// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic in the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows the traffic.</li>
     * <li><strong>drop</strong>: denies the traffic.</li>
     * <li><strong>log</strong>: monitors the traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The application type supported by the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><strong>FTP</strong></li>
     * <li><strong>HTTP</strong></li>
     * <li><strong>HTTPS</strong></li>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SMTP</strong></li>
     * <li><strong>SMTPS</strong></li>
     * <li><strong>RDP</strong></li>
     * <li><strong>VNC</strong></li>
     * <li><strong>SSH</strong></li>
     * <li><strong>Redis</strong></li>
     * <li><strong>MQTT</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>Memcache</strong></li>
     * <li><strong>SSL</strong></li>
     * <li><strong>ANY</strong>: all application types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The application types supported by the access control policy.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the virtual private cloud (VPC) firewall access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port of traffic in the virtual private cloud (VPC) firewall access control policy.</p>
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
     * <p>The name of the destination port address book of traffic in the virtual private cloud (VPC) firewall access control policy.</p>
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
     * <p>The type of the destination port of traffic in the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><strong>port</strong>: port</li>
     * <li><strong>group</strong>: port address book.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>port</p>
     */
    @NameInMap("DestPortType")
    public String destPortType;

    /**
     * <p>The destination address of traffic in the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><p>If <strong>DestinationType</strong> is set to <code>net</code>, the value of <strong>Destination</strong> is a destination CIDR block.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to <code>group</code>, the value of <strong>Destination</strong> is a destination address book name.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to <code>domain</code>, the value of <strong>Destination</strong> is a destination domain name.</p>
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
     * <p>The type of the destination address in the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: destination CIDR block</li>
     * <li><strong>group</strong>: destination address book</li>
     * <li><strong>domain</strong>: destination domain name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The domain name resolution method of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>FQDN</strong>: FQDN-based resolution</li>
     * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
     * <li><strong>FQDN_AND_DNS</strong>: FQDN-based and DNS-based dynamic resolution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FQDN</p>
     */
    @NameInMap("DomainResolveType")
    public String domainResolveType;

    /**
     * <p>The end time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The value must be on the hour or on the half hour and must be at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, EndTime is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, EndTime must be specified.</p>
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
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of a member account of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The priority of the virtual private cloud (VPC) firewall access control policy.</p>
     * <p>The priority value starts from 1 and increases by increment. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The security protocol type of traffic in the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><strong>ANY</strong>: any protocol type. Set this value if the protocol type is uncertain.</li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether to enable the access control policy. The policy is enabled by default after it is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the access control policy.</li>
     * <li><strong>false</strong>: does not enable the access control policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of the recurrence for the policy validity period of the access control policy.</p>
     * <ul>
     * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty collection.
     * Example: []</li>
     * <li>If RepeatType is set to Weekly, RepeatDays cannot be empty.
     * Example: [0, 6]<blockquote>
     * <p>If RepeatType is set to Weekly, the values in RepeatDays cannot be repeated.</p>
     * </blockquote>
     * </li>
     * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty.
     * Example: [1, 31]<blockquote>
     * <p>If RepeatType is set to Monthly, the values in RepeatDays cannot be repeated.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The recurrence end time of the policy validity period for the access control policy. Example: 23:30. The value must be on the hour or on the half hour and must be at least 30 minutes later than the recurrence start time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, RepeatEndTime is empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatEndTime must be specified. The format is HH:MM (24-hour clock), such as 08:00.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The recurrence start time of the policy validity period for the access control policy. Example: 08:00. The value must be on the hour or on the half hour and must be at least 30 minutes earlier than the recurrence end time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, RepeatStartTime is empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatStartTime must be specified. The format is HH:MM (24-hour clock), such as 08:00.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The recurrence type of the policy validity period for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong> (default): The policy is always valid.</li>
     * <li><strong>None</strong>: The policy is valid for a specified single time period.</li>
     * <li><strong>Daily</strong>: The policy is valid on a daily basis.</li>
     * <li><strong>Weekly</strong>: The policy is valid on a weekly basis.</li>
     * <li><strong>Monthly</strong>: The policy is valid on a monthly basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the virtual private cloud (VPC) firewall access control policy.</p>
     * <ul>
     * <li>If SourceType is set to <code>net</code>, the value of Source is a source CIDR block.</li>
     * <li>If SourceType is set to <code>group</code>, the value of Source is a source address book name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.2.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the virtual private cloud (VPC) firewall access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: source CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: source address book.</p>
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
     * <p>The start time of the policy validity period for the access control policy. The value is a UNIX timestamp in seconds. The value must be on the hour or on the half hour and must be at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, StartTime is empty. If RepeatType is set to None, Daily, Weekly, or Monthly, StartTime must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the virtual private cloud (VPC) firewall access control policy group.</p>
     * <ul>
     * <li><p>If the VPC firewall protects traffic between two VPCs connected through CEN, the value of this parameter is the CEN instance ID.</p>
     * </li>
     * <li><p>If the VPC firewall protects traffic between two VPCs connected through Express Connect, the value of this parameter is the VPC firewall instance ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain the ID.</p>
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
