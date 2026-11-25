// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on traffic based on the access control policy. Valid values:</p>
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
     * <p>The application type supported by the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>FTP</strong></li>
     * <li><strong>HTTP</strong></li>
     * <li><strong>HTTPS</strong></li>
     * <li><strong>Memcache</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>MQTT</strong></li>
     * <li><strong>MySQL</strong></li>
     * <li><strong>RDP</strong></li>
     * <li><strong>Redis</strong></li>
     * <li><strong>SMTP</strong></li>
     * <li><strong>SMTPS</strong></li>
     * <li><strong>SSH</strong></li>
     * <li><strong>SSL_No_Cert</strong></li>
     * <li><strong>SSL</strong></li>
     * <li><strong>VNC</strong></li>
     * <li><strong>ANY</strong> (all application types)</li>
     * </ul>
     * <blockquote>
     * <p>The supported application types depend on the protocol type specified by the Proto parameter. If Proto is set to TCP, ApplicationName can be set to any of the preceding application types. If Proto is set to UDP, ICMP, or ANY, ApplicationName can only be set to ANY. You must specify either ApplicationNameList or ApplicationName. You cannot leave both parameters empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The list of application types supported by the access control policy.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ddadxefexxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Release flow</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port for traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li>If the protocol type is ICMP, leave DestPort empty.<blockquote>
     * <p>If the protocol type is ICMP, access control on destination ports is not supported.</p>
     * </blockquote>
     * </li>
     * <li>If the protocol type is TCP, UDP, or ANY, and the destination port type (DestPortType) is group, leave DestPort empty.<blockquote>
     * <p>If you set the destination port type to group (destination port address book), you do not need to specify a destination port number. All ports managed by the access control policy are included in the destination port address book.</p>
     * </blockquote>
     * </li>
     * <li>If the protocol type is TCP, UDP, or ANY, and the destination port type (DestPortType) is port, set DestPort to the destination port number.</li>
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
     * <p>If DestPortType is set to group, you must specify the name of the destination port address book.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>my_port_group</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port in the access control policy.</p>
     * <p>Valid values:</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If DestinationType is set to net, Destination specifies the destination CIDR block.</p>
     * <p>Example: 1.2.XX.XX/24</p>
     * </li>
     * <li><p>If DestinationType is set to group, Destination specifies the name of the destination address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If DestinationType is set to domain, Destination specifies the destination domain name.</p>
     * <p>Example: *.aliyuncs.com</p>
     * </li>
     * <li><p>If DestinationType is set to location, Destination specifies the destination location.</p>
     * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If Destination specifies a destination location, for more information, see <a href="https://help.aliyun.com/document_detail/2854161.html">Location codes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The destination address type in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: destination CIDR block</li>
     * <li><strong>group</strong>: destination address book</li>
     * <li><strong>domain</strong>: destination domain name</li>
     * <li><strong>location</strong>: destination region</li>
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
     * <li><strong>in</strong>: Inbound traffic.</li>
     * <li><strong>out</strong>: Outbound traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name resolution mode of the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>FQDN</strong>: FQDN-based resolution</li>
     * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
     * <li><strong>FQDN_AND_DNS</strong>: FQDN- and DNS-based dynamic resolution</li>
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
     * <p>The end time of the Policy Validity Period for the access control policy. The time is expressed in the UNIX timestamp in seconds format. The time must be on the hour or half hour, and must be at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>When RepeatType is set to <code>Permanent</code>, EndTime is empty. When RepeatType is set to <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, EndTime is required, and you must specify the end time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP address version.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: IPv4</p>
     * </li>
     * <li><p><strong>6</strong>: IPv6</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

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
     * <p>The priority of the access control policy. The priority value starts from 1 and increases sequentially. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The protocol type of traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>ANY</strong>: all protocols</li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong></li>
     * </ul>
     * <blockquote>
     * <p>If the traffic direction is outbound and the destination address is a domain name in a threat intelligence address book or a cloud service address book, you can only set Proto to TCP. In this case, you can set the application type to HTTP, HTTPS, SMTP, SMTPS, or SSL.</p>
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
     * <li><p><strong>true</strong>: enables the access control policy.</p>
     * </li>
     * <li><p><strong>false</strong>: does not enable the access control policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The set of repeat days for the Policy Validity Period of the access control policy.</p>
     * <ul>
     * <li>When RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty set. Example: []</li>
     * <li>When RepeatType is set to <code>Weekly</code>, RepeatDays cannot be empty. Example: [0, 6]<blockquote>
     * <p>When RepeatType is set to Weekly, the values in RepeatDays must be unique.</p>
     * </blockquote>
     * </li>
     * <li>When RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty. Example: [1, 31]<blockquote>
     * <p>When RepeatType is set to Monthly, the values in RepeatDays must be unique.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The repeat end time for the Policy Validity Period of the access control policy. Example: 23:30. The time must be on the hour or half hour, and must be at least 30 minutes later than the repeat start time.</p>
     * <blockquote>
     * <p>When RepeatType is set to <code>Permanent</code> or <code>None</code>, RepeatEndTime is empty. When RepeatType is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, RepeatEndTime is required, and you must specify the repeat end time.
     * The time format is HH:mm (24-hour clock). Examples: 08:00 and 23:30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The repeat start time for the Policy Validity Period of the access control policy. Example: 08:00. The time must be on the hour or half hour, and must be at least 30 minutes earlier than the repeat end time.</p>
     * <blockquote>
     * <p>When RepeatType is set to <code>Permanent</code> or <code>None</code>, RepeatStartTime is empty. When RepeatType is set to <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, RepeatStartTime is required, and you must specify the repeat start time.
     * The time format is HH:mm (24-hour clock). Examples: 08:00 and 23:30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The repeat type of the Policy Validity Period for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong> (default): always</li>
     * <li><strong>None</strong>: a single specified time</li>
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
     * <p>The source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p>If SourceType is set to net, set Source to the source CIDR block.</p>
     * <p>Example: 1.1.XX.XX/24</p>
     * </li>
     * <li><p>If SourceType is set to group, set Source to the name of the source address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If SourceType is set to location, set Source to the source region.</p>
     * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about source regions, see <a href="https://help.aliyun.com/document_detail/2854161.html">Region codes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: source CIDR block</li>
     * <li><strong>group</strong>: source address book</li>
     * <li><strong>location</strong>: source location</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the Policy Validity Period for the access control policy. The time is expressed in the UNIX timestamp in seconds format. The time must be on the hour or half hour, and must be at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>When RepeatType is set to <code>Permanent</code>, StartTime is empty. When RepeatType is set to <code>None</code>, <code>Daily</code>, <code>Weekly</code>, or <code>Monthly</code>, StartTime is required, and you must specify the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static AddControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddControlPolicyRequest self = new AddControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    @Deprecated
    public AddControlPolicyRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public AddControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public AddControlPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public AddControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public AddControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public AddControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public AddControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public AddControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public AddControlPolicyRequest setDomainResolveType(String domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public String getDomainResolveType() {
        return this.domainResolveType;
    }

    public AddControlPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddControlPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AddControlPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AddControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddControlPolicyRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public AddControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public AddControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public AddControlPolicyRequest setRepeatDays(java.util.List<Long> repeatDays) {
        this.repeatDays = repeatDays;
        return this;
    }
    public java.util.List<Long> getRepeatDays() {
        return this.repeatDays;
    }

    public AddControlPolicyRequest setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }
    public String getRepeatEndTime() {
        return this.repeatEndTime;
    }

    public AddControlPolicyRequest setRepeatStartTime(String repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
        return this;
    }
    public String getRepeatStartTime() {
        return this.repeatStartTime;
    }

    public AddControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public AddControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    @Deprecated
    public AddControlPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public AddControlPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
