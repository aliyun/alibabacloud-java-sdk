// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
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
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy.</p>
     * <blockquote>
     * <p>To modify an access control policy, provide the unique ID of the policy. Call the <a href="https://help.aliyun.com/document_detail/138866.html">DescribeControlPolicy</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221ad84c</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The application type supported by the access control policy. The following application types are supported:</p>
     * <ul>
     * <li><p><strong>ANY</strong></p>
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
     * </ul>
     * <blockquote>
     * <p><strong>ANY</strong> indicates that the policy applies to all application types.</p>
     * </blockquote>
     * <blockquote>
     * <p>Specify either ApplicationNameList or ApplicationName. You cannot leave both empty. If you specify both, ApplicationNameList takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The list of application names.</p>
     * <blockquote>
     * <p>Specify either ApplicationNameList or ApplicationName. You cannot leave both empty. If you specify both, ApplicationNameList takes precedence.</p>
     * </blockquote>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy.</p>
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
     * <p>The destination address in the access control policy.</p>
     * <ul>
     * <li><p>If <strong>DestinationType</strong> is set to net, set <strong>Destination</strong> to a destination CIDR block. Example: 1.2.XX.XX/24</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to group, set <strong>Destination</strong> to the name of a destination address book. Example: db_group</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to domain, set <strong>Destination</strong> to a destination domain name. Example: \*.aliyuncs.com</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to location, set <strong>Destination</strong> to a destination location code. Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
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
     * <li><p><strong>location</strong>: destination region</p>
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
     * <li><p><strong>in</strong>: inbound traffic</p>
     * </li>
     * <li><p><strong>out</strong>: outbound traffic</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name resolution method for the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>FQDN</strong>: FQDN-based resolution</p>
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
     * <p>The end time of the policy validity period. The value is a UNIX timestamp. The time must be on the hour or half hour, and at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, leave this parameter empty. If RepeatType is set to None, Daily, Weekly, or Monthly, you must specify this parameter.</p>
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
     * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
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
     * <p>If the traffic direction is outbound and the destination is a domain name that belongs to a threat intelligence address book or a cloud service address book, you can set this parameter to TCP or ANY. If you set this parameter to TCP, you can set the application to HTTP, HTTPS, SMTP, SMTPS, or SSL. If you set this parameter to ANY, you must set the application to ANY.</p>
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
     * <li><p>true: The policy is enabled.</p>
     * </li>
     * <li><p>false: The policy is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of the week or month on which the policy is recurrent.</p>
     * <ul>
     * <li><p>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, leave this parameter empty.
     * Example: []</p>
     * </li>
     * <li><p>If RepeatType is set to Weekly, you must specify this parameter.
     * Example: [0, 6]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If RepeatType is set to Weekly, the values in the array cannot be repeated.</p>
     * </blockquote>
     * <ul>
     * <li>If RepeatType is set to <code>Monthly</code>, you must specify this parameter.
     * Example: [1, 31]</li>
     * </ul>
     * <blockquote>
     * <p>If RepeatType is set to Monthly, the values in the array cannot be repeated.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The end time of the recurrence. The time is in the HH:mm format and in 24-hour format. Example: 23:00.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, leave this parameter empty. If RepeatType is set to Daily, Weekly, or Monthly, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The start time of the recurrence. The time is in the HH:mm format and in 24-hour format. Example: 08:00.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, leave this parameter empty. If RepeatType is set to Daily, Weekly, or Monthly, you must specify this parameter.</p>
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
     * <li><p><strong>Permanent</strong> (default): The policy is always valid.</p>
     * </li>
     * <li><p><strong>None</strong>: The policy is valid only once.</p>
     * </li>
     * <li><p><strong>Daily</strong>: The policy is valid daily.</p>
     * </li>
     * <li><p><strong>Weekly</strong>: The policy is valid weekly.</p>
     * </li>
     * <li><p><strong>Monthly</strong>: The policy is valid monthly.</p>
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
     * <li><p>If <strong>SourceType</strong> is set to net, set <strong>Source</strong> to a source CIDR block. Example: 1.2.XX.XX/24</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is set to group, set <strong>Source</strong> to the name of a source address book. Example: db_group</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is set to location, set <strong>Source</strong> to a source location code. Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
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
     * <li><p><strong>location</strong>: source region</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the policy validity period. The value is a UNIX timestamp. The time must be on the hour or half hour, and at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, leave this parameter empty. If RepeatType is set to None, Daily, Weekly, or Monthly, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ModifyControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyRequest self = new ModifyControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public ModifyControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    @Deprecated
    public ModifyControlPolicyRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ModifyControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public ModifyControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public ModifyControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public ModifyControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public ModifyControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ModifyControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ModifyControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyControlPolicyRequest setDomainResolveType(String domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public String getDomainResolveType() {
        return this.domainResolveType;
    }

    public ModifyControlPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifyControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifyControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public ModifyControlPolicyRequest setRepeatDays(java.util.List<Long> repeatDays) {
        this.repeatDays = repeatDays;
        return this;
    }
    public java.util.List<Long> getRepeatDays() {
        return this.repeatDays;
    }

    public ModifyControlPolicyRequest setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }
    public String getRepeatEndTime() {
        return this.repeatEndTime;
    }

    public ModifyControlPolicyRequest setRepeatStartTime(String repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
        return this;
    }
    public String getRepeatStartTime() {
        return this.repeatStartTime;
    }

    public ModifyControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public ModifyControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ModifyControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModifyControlPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
