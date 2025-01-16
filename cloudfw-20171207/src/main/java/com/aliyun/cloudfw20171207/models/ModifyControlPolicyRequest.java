// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows the traffic.</li>
     * <li><strong>drop</strong>: denies the traffic.</li>
     * <li><strong>log</strong>: monitors the traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The UUID of the access control policy.</p>
     * <blockquote>
     * <p> To modify an access control policy, you must specify the UUID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/138866.html">DescribeControlPolicy</a> interface to query the UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221ad84c</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The type of the application that the access control policy supports. Valid values:</p>
     * <ul>
     * <li><strong>ANY</strong></li>
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
     * </ul>
     * <blockquote>
     * <p> The value <strong>ANY</strong> indicates all types of applications.</p>
     * </blockquote>
     * <blockquote>
     * <p> You must specify one of the ApplicationNameList and ApplicationName parameters. If you configure both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The application names.</p>
     * <blockquote>
     * <p> You must specify one of the ApplicationNameList and ApplicationName parameters. If you configure both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.</p>
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
     * <li><strong>port</strong>: port</li>
     * <li><strong>group</strong>: port address book</li>
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
     * <li>If <strong>DestinationType</strong> is set to net, the value of <strong>Destination</strong> is a CIDR block. Example: 1.2.XX.XX/24.</li>
     * <li>If <strong>DestinationType</strong> is set to group, the value of <strong>Destination</strong> is an address book. Example: db_group.</li>
     * <li>If <strong>DestinationType</strong> is set to domain, the value of <strong>Destination</strong> is a domain name. Example: \*.aliyuncs.com.</li>
     * <li>If <strong>DestinationType</strong> is set to location, the value of <strong>Destination</strong> is a location. For more information about the location codes, see the &quot;AddControlPolicy&quot; topic. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
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
     * <li><strong>net</strong>: CIDR block</li>
     * <li><strong>group</strong>: address book</li>
     * <li><strong>domain</strong>: domain name</li>
     * <li><strong>location</strong>: location</li>
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
     * <li><strong>in</strong>: inbound traffic</li>
     * <li><strong>out</strong>: outbound traffic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name resolution method of the access control policy. By default, an access control policy is enabled after the policy is created. Valid values:</p>
     * <ul>
     * <li><strong>FQDN</strong>: fully qualified domain name (FQDN)-based resolution</li>
     * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
     * <li><strong>FQDN_AND_DNS</strong>: FQDN and DNS-based dynamic resolution</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FQDN</p>
     */
    @NameInMap("DomainResolveType")
    public String domainResolveType;

    /**
     * <p>The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of StartTime.</p>
     * <blockquote>
     * <p> If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
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
     * <p>The protocol type that the access control policy supports. Valid values:</p>
     * <ul>
     * <li><strong>ANY</strong></li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong></li>
     * </ul>
     * <blockquote>
     * <p> The value <strong>ANY</strong> indicates all types of applications.</p>
     * </blockquote>
     * <blockquote>
     * <p> If the traffic direction is outbound and the destination address is a threat intelligence address book of the domain name type or a cloud service address book, you can set Proto to TCP or ANY. If you set Proto to TCP, you can set ApplicationName to HTTP, HTTPS, SMTP, SMTPS, and SSL. If you set Proto to ANY, you can set ApplicationName to ANY.</p>
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
     * <li>true: enabled</li>
     * <li>false: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of a week or of a month on which the access control policy takes effect.</p>
     * <ul>
     * <li>If you set RepeatType to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, the value of this parameter is an empty array. Example: []</li>
     * <li>If you set RepeatType to Weekly, you must specify this parameter. Example: [0, 6]</li>
     * </ul>
     * <blockquote>
     * <p> If you set RepeatType to Weekly, the fields in the value of this parameter cannot be repeated.</p>
     * </blockquote>
     * <ul>
     * <li>If you set RepeatType to <code>Monthly</code>, you must specify this parameter. Example: [1, 31]</li>
     * </ul>
     * <blockquote>
     * <p> If you set RepeatType to Monthly, the fields in the value of this parameter cannot be repeated.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of RepeatStartTime.</p>
     * <blockquote>
     * <p> If you set RepeatType to Permanent or None, leave this parameter empty. If you set RepeatType to Daily, Weekly, or Monthly, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of RepeatEndTime.</p>
     * <blockquote>
     * <p> If you set RepeatType to Permanent or None, leave this parameter empty. If you set RepeatType to Daily, Weekly, or Monthly, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

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
     * <p>The source address in the access control policy.</p>
     * <ul>
     * <li>If <strong>SourceType</strong> is set to net, the value of <strong>Source</strong> is a CIDR block. Example: 1.2.XX.XX/24.</li>
     * <li>If <strong>SourceType</strong> is set to group, the value of <strong>Source</strong> is an address book. Example: db_group.</li>
     * <li>If <strong>SourceType</strong> is set to location, the value of <strong>Source</strong> is a location. For more information about the location codes, see the &quot;AddControlPolicy&quot; topic. Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</li>
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
     * <li><strong>net</strong>: CIDR block</li>
     * <li><strong>group</strong>: address book</li>
     * <li><strong>location</strong>: location</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of EndTime.</p>
     * <blockquote>
     * <p> If you set RepeatType to Permanent, leave this parameter empty. If you set RepeatType to None, Daily, Weekly, or Monthly, you must specify this parameter.</p>
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
