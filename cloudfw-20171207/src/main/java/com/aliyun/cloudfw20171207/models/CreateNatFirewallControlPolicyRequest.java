// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows the traffic</li>
     * <li><strong>drop</strong>: denies the traffic</li>
     * <li><strong>log</strong>: monitors the traffic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The list of application types supported by the access control policy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Allow traffic</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy. Valid values:</p>
     * <ul>
     * <li>If the protocol is ICMP, leave this parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p>Access control based on destination ports is not supported when the protocol is ICMP.</p>
     * </blockquote>
     * <ul>
     * <li>If the protocol is TCP, UDP, or ANY and the destination Protocol Type (DestPortType) is group, leave this parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p>If you set DestPortType to group, you do not need to specify a destination port. All ports managed by this policy are included in the destination port address book.</p>
     * </blockquote>
     * <ul>
     * <li>If the protocol is TCP, UDP, or ANY and the destination Protocol Type (DestPortType) is port, set this parameter to the destination port number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy.</p>
     * <blockquote>
     * <p>If you set DestPortType to group, you must specify the name of the destination port address book.</p>
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
     * <li><strong>port</strong>: a port</li>
     * <li><strong>group</strong>: a port address book</li>
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
     * <li><p>If DestinationType is set to net, set Destination to the destination CIDR block.</p>
     * <p>Example: 1.2.XX.XX/24</p>
     * </li>
     * <li><p>If DestinationType is set to group, set Destination to the name of the destination address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If DestinationType is set to domain, set Destination to the destination domain name.</p>
     * <p>Example: *.aliyuncs.com</p>
     * </li>
     * <li><p>If DestinationType is set to location, set Destination to the destination region.</p>
     * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;\]</p>
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
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: a destination CIDR block</li>
     * <li><strong>group</strong>: a destination address book</li>
     * <li><strong>domain</strong>: a destination domain name</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

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
     * <p>The domain name parse method of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: FQDN-based parse</li>
     * <li><strong>1</strong>: DNS-based dynamic parse</li>
     * <li><strong>2</strong>: FQDN-based and DNS-based dynamic parse</li>
     * </ul>
     * <blockquote>
     * <p>If the domain name identification mode includes FQDN, you can only configure the TCP protocol. The supported applications are HTTP, HTTPS, SMTP, SMTPS, SSL, IMAPS, and POPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DomainResolveType")
    public Integer domainResolveType;

    /**
     * <p>The end time for the Policy Validity Period of the access control policy. The value is in the format of a UNIX timestamp in seconds. The time must be on the hour or half hour, and must be at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, leave EndTime empty. If RepeatType is set to None, Daily, Weekly, or Monthly, EndTime must have a value, and you must specify the Settings for the end time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP address version. Valid values:</p>
     * <ul>
     * <li><strong>4</strong>: IPv4 (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the response message. Valid values:</p>
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
     * <p>The instance ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-2vc2ustolqn6sr0******</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The priority of the access control policy. The priority value starts from 1 and increases sequentially. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li>ANY: all protocols</li>
     * <li>TCP</li>
     * <li>UDP</li>
     * <li>ICMP</li>
     * </ul>
     * <blockquote>
     * <p>If the destination address is a threat intelligence address book or a cloud service address book of the domain name type, you can only configure the TCP protocol. The supported applications are HTTP, HTTPS, SMTP, SMTPS, and SSL.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether to enable the access control policy. By default, the policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the access control policy</li>
     * <li><strong>false</strong>: does not enable the access control policy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The set of recurrence days for the Policy Validity Period of the access control policy.</p>
     * <ul>
     * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave RepeatDays empty.
     * Example: []</li>
     * <li>If RepeatType is set to Weekly, RepeatDays cannot be empty.
     * Example: [0, 6]<blockquote>
     * <p>When the RepeatType Settings are Weekly, the values in RepeatDays cannot be duplicate.</p>
     * </blockquote>
     * </li>
     * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty.
     * Example: [1, 31]<blockquote>
     * <p>When the RepeatType Settings are Monthly, the values in RepeatDays cannot be duplicate.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The recurrence end time for the Policy Validity Period of the access control policy. Example: 23:30. The time must be on the hour or half hour, and must be at least 30 minutes later than the recurrence start time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, leave RepeatEndTime empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatEndTime must have a value, and you must specify the Settings for the recurrence end time.
     * The time format is HH:mm (24-hour clock), such as 08:00 and 23:30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The recurrence start time for the Policy Validity Period of the access control policy. Example: 08:00. The time must be on the hour or half hour, and must be at least 30 minutes earlier than the recurrence end time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, leave RepeatStartTime empty. If RepeatType is set to Daily, Weekly, or Monthly, RepeatStartTime must have a value, and you must specify the Settings for the recurrence start time.
     * The time format is HH:mm (24-hour clock), such as 08:00 and 23:30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The recurrence type of the Policy Validity Period for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong>: always (default)</li>
     * <li><strong>None</strong>: a specific single time</li>
     * <li><strong>Daily</strong>: every day</li>
     * <li><strong>Weekly</strong>: every week</li>
     * <li><strong>Monthly</strong>: every month</li>
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
     * <li><p>If <strong>SourceType</strong> is set to <code>net</code>, set Source to the source CIDR block.</p>
     * <p>Example: 10.2.4.0/24</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is set to <code>group</code>, set Source to the name of the source address book.</p>
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
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: a source CIDR block</li>
     * <li><strong>group</strong>: a source address book</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time for the Policy Validity Period of the access control policy. The value is in the format of a UNIX timestamp in seconds. The time must be on the hour or half hour, and must be at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, leave StartTime empty. If RepeatType is set to None, Daily, Weekly, or Monthly, StartTime must have a value, and you must specify the Settings for the start time.</p>
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
