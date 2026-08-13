// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that the access control policy performs on the traffic that passes through the firewall. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows access.</li>
     * <li><strong>drop</strong>: deny access.</li>
     * <li><strong>log</strong>: monitors the traffic.</li>
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
     * <p>To modify an access control policy, you must provide the unique ID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/138866.html">DescribeControlPolicy</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221ad84c</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The application type supported by the access control policy. Valid values:</p>
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
     * <p><strong>ANY</strong> indicates that the policy applies to all types of applications.</p>
     * </blockquote>
     * <blockquote>
     * <p>You must specify either ApplicationNameList or ApplicationName. You cannot leave both parameters empty. If you specify both parameters, the value of ApplicationNameList takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The application name list.</p>
     * <blockquote>
     * <p>You must specify either ApplicationNameList or ApplicationName. You cannot leave both parameters empty. If you specify both parameters, the value of ApplicationNameList takes precedence.</p>
     * </blockquote>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>ddadxefexxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <li>If <strong>DestinationType</strong> is set to net, <strong>Destination</strong> is a destination CIDR block. Example: 1.2.XX.XX/24.</li>
     * <li>If <strong>DestinationType</strong> is set to group, <strong>Destination</strong> is a destination address book name. Example: db_group.</li>
     * <li>If <strong>DestinationType</strong> is set to domain, <strong>Destination</strong> is a destination domain name. Example: *.aliyuncs.com.</li>
     * <li>If <strong>DestinationType</strong> is set to location, <strong>Destination</strong> is a destination area. For specific area positional encoding, see the subsequent sections. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
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
     * <li><strong>net</strong>: destination CIDR block</li>
     * <li><strong>group</strong>: destination address book</li>
     * <li><strong>domain</strong>: destination domain name</li>
     * <li><strong>location</strong>: destination region</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The traffic direction of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound traffic access control</li>
     * <li><strong>out</strong>: outbound traffic access control</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name resolution method of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>FQDN</strong>: FQDN-based</li>
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
     * <p>Specifies whether to perform a dry run.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The end time of the Policy Validity Period for the access control policy. The value is a UNIX timestamp in seconds format. The time must be on the hour or half hour and must be at least 30 minutes later than the start time. Settings for the access control policy validity period.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter is required.</p>
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
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The security protocol type in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>ANY</strong></li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong></li>
     * </ul>
     * <blockquote>
     * <p><strong>ANY</strong> indicates that the policy applies to all protocol types.</p>
     * </blockquote>
     * <blockquote>
     * <p>If the traffic direction is outbound and the destination address is a threat intelligence address book or cloud service address book of the domain type, you can configure only the TCP or ANY protocol. If you select TCP, the application can be HTTP, HTTPS, SMTP, SMTPS, or SSL. If you select ANY, the application can only be ANY.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The enabling status of the access control policy. Valid values:</p>
     * <ul>
     * <li>true: The policy is enabled.</li>
     * <li>false: The policy is in shutdown state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of a week or of a month on which the access control policy takes effect. Settings for the Policy Validity Period recurrence days.</p>
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
     * <p>The recurrence end time of the policy validity period. The time is in the HH:mm format and uses a 24-hour clock. Example: 23:00.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The recurrence start time of the policy validity period. The time is in the HH:mm format and uses a 24-hour clock. Example: 08:00.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent or None, this parameter is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The recurrence type for the policy validity period of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong> (default): always</li>
     * <li><strong>None</strong>: one-time</li>
     * <li><strong>Daily</strong>: daily</li>
     * <li><strong>Weekly</strong>: weekly</li>
     * <li><strong>Monthly</strong>: monthly</li>
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
     * <li>If <strong>SourceType</strong> is set to net, <strong>Source</strong> is a source CIDR block. Example: 1.2.XX.XX/24.</li>
     * <li>If <strong>SourceType</strong> is set to group, <strong>Source</strong> is a source address book name. Example: db_group.</li>
     * <li>If <strong>SourceType</strong> is set to location, <strong>Source</strong> is a source area. For specific area positional encoding, see the subsequent sections. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
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
     * <li><strong>net</strong>: source CIDR block</li>
     * <li><strong>group</strong>: source address book</li>
     * <li><strong>location</strong>: source region</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the Policy Validity Period for the access control policy. The value is a UNIX timestamp in seconds format. The time must be on the hour or half hour and must be at least 30 minutes earlier than the end time. Settings for the access control policy validity period.</p>
     * <blockquote>
     * <p>If RepeatType is set to Permanent, this parameter is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter is required.</p>
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

    public ModifyControlPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public ModifyControlPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
