// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that you want to perform on traffic. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: denies the traffic.</p>
     * </li>
     * <li><p><strong>log</strong>: monitors the traffic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The UUID of the access control policy.</p>
     * <p>To modify an access control policy, you must provide the UUID of the policy. You can call the DescribeNatFirewallControlPolicy operation to query the UUIDs of access control policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>63ab1c02-926a-4d1b-9ef7-*****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The application names.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the descriptions of all policies are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy.</p>
     * <blockquote>
     * <p>This parameter is required when you set <strong>DestPortType</strong> to <code>port</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>my_dest_port_group</p>
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
     * <p>The destination address in the access control policy.</p>
     * <ul>
     * <li><p>If <strong>DestinationType</strong> is <code>net</code>, specify a destination CIDR block. Example: <code>1.2.3.4/24</code>.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is <code>group</code>, specify a destination address book. Example: <code>db_group</code>.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is <code>domain</code>, specify a destination domain name. Example: <code>*.aliyuncs.com</code>.</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is <code>location</code>, specify a destination location. For more information about location codes, see AddIpamPoolCidr. Example: <code>[&quot;BJ11&quot;, &quot;ZB&quot;]</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x.x.x.x/32</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: destination CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: destination address book</p>
     * </li>
     * <li><p><strong>domain</strong>: destination domain name</p>
     * </li>
     * <li><p><strong>location</strong>: destination location</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <ul>
     * <li><strong>out</strong>: outbound traffic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The DNS resolution method of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: FQDN</p>
     * </li>
     * <li><p><strong>1</strong>: dynamic DNS</p>
     * </li>
     * <li><p><strong>2</strong>: FQDN and dynamic DNS</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the domain name is resolved in FQDN mode, you can select only the TCP protocol. The supported applications are HTTP, HTTPS, SMTP, SMTPS, SSL, IMAPS, and POPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DomainResolveType")
    public String domainResolveType;

    /**
     * <p>The end time of the effective period for the access control policy. The time is a Unix timestamp. The time must be on the hour or half-hour and be at least 30 minutes after the start time.</p>
     * <blockquote>
     * <p>If <code>RepeatType</code> is Permanent, <code>EndTime</code> is empty. If <code>RepeatType</code> is None, Daily, Weekly, or Monthly, <code>EndTime</code> is required.</p>
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
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxxxxx</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The protocol type in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>ANY</strong></p>
     * </li>
     * <li><p><strong>TCP</strong></p>
     * </li>
     * <li><p><strong>UDP</strong></p>
     * </li>
     * <li><p><strong>ICMP</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><strong>ANY</strong> indicates that the policy applies to all protocol types.</p>
     * </blockquote>
     * <blockquote>
     * <p>If the destination is a domain name-based address book that contains a threat intelligence address book or a cloud service address book, you can select TCP. If you select TCP, you can select HTTP, HTTPS, SMTP, SMTPS, or SSL.</p>
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
     * <p>The days of a week or a month on which the policy recurs.</p>
     * <ul>
     * <li><p>If you set <strong>RepeatType</strong> to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty. Example: [].</p>
     * </li>
     * <li><p>If you set <strong>RepeatType</strong> to <code>Weekly</code>, this parameter is required. Example: [0, 6].</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When RepeatType is set to Weekly, RepeatDays does not allow duplicates.</p>
     * </blockquote>
     * <ul>
     * <li>When RepeatType is <code>Monthly</code>, RepeatDays cannot be empty. For example: [1, 31]</li>
     * </ul>
     * <blockquote>
     * <p>When RepeatType is set to Monthly, RepeatDays cannot contain duplicate values.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The end time of the policy\&quot;s recurrence period. The time must be in the 24-hour HH:mm format, such as 23:30, be on the hour or half-hour, and be at least half an hour later than the recurrence start time.</p>
     * <blockquote>
     * <p>When RepeatType is Permanent or None, RepeatEndTime is empty. When RepeatType is Daily, Weekly, or Monthly, you must set RepeatEndTime to specify the end time for the repetition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The start time of the repeat cycle. Use the 24-hour HH:mm format, such as 08:00. The time must be on the hour or half-hour and at least 30 minutes before the repeat end time.</p>
     * <blockquote>
     * <p>This parameter is not used if <code>RepeatType</code> is set to <code>Permanent</code> or <code>None</code>. This parameter is required if <code>RepeatType</code> is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The recurrence type for the policy to take effect. Valid values:</p>
     * <ul>
     * <li><p><strong>Permanent</strong> (default): The policy is always in effect.</p>
     * </li>
     * <li><p><strong>None</strong>: The policy takes effect for a specified period of time.</p>
     * </li>
     * <li><p><strong>Daily</strong>: The policy takes effect daily.</p>
     * </li>
     * <li><p><strong>Weekly</strong>: The policy takes effect weekly.</p>
     * </li>
     * <li><p><strong>Monthly</strong>: The policy takes effect monthly.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p>When <strong>SourceType</strong> is <code>net</code>, Source is the source CIDR address, for example, 10.2.XX.XX/24.</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is <code>group</code>, specify a source address book. Example: <code>db_group</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.2.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: source CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: source address book</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the effective period for the access control policy is specified in the Unix timestamp format. It must be on the hour or half-hour and at least half an hour earlier than the end time.</p>
     * <blockquote>
     * <p>When RepeatType is Permanent, StartTime is empty. When RepeatType is None, Daily, Weekly, or Monthly, StartTime is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ModifyNatFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatFirewallControlPolicyRequest self = new ModifyNatFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public ModifyNatFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ModifyNatFirewallControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public ModifyNatFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNatFirewallControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public ModifyNatFirewallControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public ModifyNatFirewallControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public ModifyNatFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ModifyNatFirewallControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ModifyNatFirewallControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyNatFirewallControlPolicyRequest setDomainResolveType(String domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public String getDomainResolveType() {
        return this.domainResolveType;
    }

    public ModifyNatFirewallControlPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifyNatFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyNatFirewallControlPolicyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifyNatFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public ModifyNatFirewallControlPolicyRequest setRepeatDays(java.util.List<Long> repeatDays) {
        this.repeatDays = repeatDays;
        return this;
    }
    public java.util.List<Long> getRepeatDays() {
        return this.repeatDays;
    }

    public ModifyNatFirewallControlPolicyRequest setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }
    public String getRepeatEndTime() {
        return this.repeatEndTime;
    }

    public ModifyNatFirewallControlPolicyRequest setRepeatStartTime(String repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
        return this;
    }
    public String getRepeatStartTime() {
        return this.repeatStartTime;
    }

    public ModifyNatFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public ModifyNatFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ModifyNatFirewallControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModifyNatFirewallControlPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
