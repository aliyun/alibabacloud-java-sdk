// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on traffic that matches the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: Drops the traffic.</p>
     * </li>
     * <li><p><strong>log</strong>: Logs the traffic.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The list of applications to which the access control policy applies.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>放行流量</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port for the traffic. The value of this parameter depends on the <code>Proto</code> and <code>DestPortType</code> parameters.</p>
     * <ul>
     * <li>If <code>Proto</code> is <code>ICMP</code>, leave this parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p>Access control cannot be configured based on the destination port for ICMP traffic.</p>
     * </blockquote>
     * <ul>
     * <li>If the destination port type (<code>DestPortType</code>) is <code>group</code>, leave this parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p>If <code>DestPortType</code> is set to <code>group</code>, you do not need to specify a destination port because the required ports are defined in the selected port address book.</p>
     * </blockquote>
     * <ul>
     * <li>If the protocol is TCP, UDP, or ANY and the destination port type (<code>DestPortType</code>) is <code>port</code>, specify the destination port number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book.</p>
     * <blockquote>
     * <p>This parameter is required if <code>DestPortType</code> is set to <code>group</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>my_port_group</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port.</p>
     * <ul>
     * <li><p><strong>port</strong>: Port or port range</p>
     * </li>
     * <li><p><strong>group</strong>: Port address book</p>
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
     * <p>The value of this parameter varies based on the value of <code>DestinationType</code>:</p>
     * <ul>
     * <li><p>If <code>DestinationType</code> is <code>net</code>, set this parameter to the destination CIDR.</p>
     * <p>Example: <code>1.2.XX.XX/24</code></p>
     * </li>
     * <li><p>If <code>DestinationType</code> is <code>group</code>, set this parameter to the name of the destination address book.</p>
     * <p>Example: <code>db_group</code></p>
     * </li>
     * <li><p>If <code>DestinationType</code> is <code>domain</code>, set this parameter to the destination domain.</p>
     * <p>Example: \*.aliyuncs.com</p>
     * </li>
     * <li><p>If <code>DestinationType</code> is <code>location</code>, set this parameter to the destination location.</p>
     * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XX.XX.XX.XX/24</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: Destination CIDR</p>
     * </li>
     * <li><p><strong>group</strong>: Destination address book</p>
     * </li>
     * <li><p><strong>domain</strong>: Destination domain</p>
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
     * <p>The traffic direction for the access control policy. Valid values:</p>
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
     * <p>The domain name resolution method. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: FQDN-based resolution</p>
     * </li>
     * <li><p><strong>1</strong>: Dynamic DNS-based resolution</p>
     * </li>
     * <li><p><strong>2</strong>: FQDN-based and dynamic DNS-based resolution</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the resolution method includes FQDN, you can set the protocol only to TCP. The supported applications are HTTP, HTTPS, SMTP, SMTPS, and SSL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DomainResolveType")
    public Integer domainResolveType;

    /**
     * <p>The end time of the policy\&quot;s validity period, specified as a Unix timestamp. The time must be on the hour or half-hour and be at least 30 minutes after the start time.</p>
     * <blockquote>
     * <p>This parameter is required if <code>RepeatType</code> is <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code>, leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP version for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>4</strong> (default): IPv4</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the response messages.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese (default)</p>
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
     * <p>The instance ID of the NAT Gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-2vc2ustolqn6sr0******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The priority of the access control policy. Values start from 1. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The protocol for the traffic in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ANY: all protocols</p>
     * </li>
     * <li><p>TCP</p>
     * </li>
     * <li><p>UDP</p>
     * </li>
     * <li><p>ICMP</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the destination is a domain, a threat intelligence address book, or a cloud service address book, you can only set this parameter to <code>TCP</code>. The supported application types are HTTP, HTTPS, SMTP, SMTPS, and SSL.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. By default, policies are enabled upon creation. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables the policy.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables the policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of the week or month on which the policy recurs.</p>
     * <ul>
     * <li><p>If <code>RepeatType</code> is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty. Example: <code>[]</code></p>
     * </li>
     * <li><p>If <code>RepeatType</code> is <code>Weekly</code>, this parameter is required. Example: <code>[0, 6]</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If <code>RepeatType</code> is <code>Weekly</code>, the values in <code>RepeatDays</code> must be unique.</p>
     * </blockquote>
     * <ul>
     * <li>If <code>RepeatType</code> is <code>Monthly</code>, this parameter is required. Example: <code>[1, 31]</code></li>
     * </ul>
     * <blockquote>
     * <p>If <code>RepeatType</code> is <code>Monthly</code>, the values in <code>RepeatDays</code> must be unique.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The end time of the recurrence. The time must be on the hour or half-hour, and must be at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>This parameter is required if <code>RepeatType</code> is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code> or <code>None</code>, leave this parameter empty.
     * The time is in the HH:mm format (24-hour). For example, <code>08:00</code> or <code>23:30</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The start time of the recurrence. The time must be on the hour or half-hour, and must be at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>This parameter is required if <code>RepeatType</code> is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code> or <code>None</code>, leave this parameter empty.
     * The time is in the HH:mm format (24-hour). For example, <code>08:00</code> or <code>23:30</code>.</p>
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
     * <li><p><strong>Permanent</strong> (default): The policy is always active.</p>
     * </li>
     * <li><p><strong>None</strong>: The policy runs once for a specified duration.</p>
     * </li>
     * <li><p><strong>Daily</strong>: The policy recurs daily.</p>
     * </li>
     * <li><p><strong>Weekly</strong>: The policy recurs weekly within a specified time range.</p>
     * </li>
     * <li><p><strong>Monthly</strong>: The policy recurs monthly within a specified time range.</p>
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
     * <p>The value of this parameter varies based on the value of <code>SourceType</code>:</p>
     * <ul>
     * <li><p>If <strong>SourceType</strong> is <code>net</code>, set this parameter to the source CIDR.</p>
     * <p>Example: 10.2.4.0/24</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is <code>group</code>, set this parameter to the name of the source address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.25/32</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: Source CIDR</p>
     * </li>
     * <li><p><strong>group</strong>: Source address book</p>
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
     * <p>The start time of the policy\&quot;s validity period, specified as a Unix timestamp. The time must be on the hour or half-hour and be at least 30 minutes before the end time.</p>
     * <blockquote>
     * <p>This parameter is required if <code>RepeatType</code> is <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>. If <code>RepeatType</code> is <code>Permanent</code>, leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static CreateNatFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallControlPolicyRequest self = new CreateNatFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public CreateNatFirewallControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public CreateNatFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNatFirewallControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public CreateNatFirewallControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public CreateNatFirewallControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public CreateNatFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateNatFirewallControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateNatFirewallControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateNatFirewallControlPolicyRequest setDomainResolveType(Integer domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public Integer getDomainResolveType() {
        return this.domainResolveType;
    }

    public CreateNatFirewallControlPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateNatFirewallControlPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateNatFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateNatFirewallControlPolicyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateNatFirewallControlPolicyRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public CreateNatFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public CreateNatFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public CreateNatFirewallControlPolicyRequest setRepeatDays(java.util.List<Long> repeatDays) {
        this.repeatDays = repeatDays;
        return this;
    }
    public java.util.List<Long> getRepeatDays() {
        return this.repeatDays;
    }

    public CreateNatFirewallControlPolicyRequest setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }
    public String getRepeatEndTime() {
        return this.repeatEndTime;
    }

    public CreateNatFirewallControlPolicyRequest setRepeatStartTime(String repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
        return this;
    }
    public String getRepeatStartTime() {
        return this.repeatStartTime;
    }

    public CreateNatFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public CreateNatFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateNatFirewallControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateNatFirewallControlPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
