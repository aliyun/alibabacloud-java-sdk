// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddControlPolicyRequest extends TeaModel {
    /**
     * <p>The action to perform on traffic that matches the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: denies the traffic.</p>
     * </li>
     * <li><p><strong>log</strong>: monitors the traffic.</p>
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
     * <li><p><strong>Memcache</strong></p>
     * </li>
     * <li><p><strong>MongoDB</strong></p>
     * </li>
     * <li><p><strong>MQTT</strong></p>
     * </li>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>RDP</strong></p>
     * </li>
     * <li><p><strong>Redis</strong></p>
     * </li>
     * <li><p><strong>SMTP</strong></p>
     * </li>
     * <li><p><strong>SMTPS</strong></p>
     * </li>
     * <li><p><strong>SSH</strong></p>
     * </li>
     * <li><p><strong>SSL_No_Cert</strong></p>
     * </li>
     * <li><p><strong>SSL</strong></p>
     * </li>
     * <li><p><strong>VNC</strong></p>
     * </li>
     * <li><p><strong>ANY</strong> (all application types)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The available application types depend on the protocol type (\<code>Proto\\</code>). If you set \<code>Proto\\</code> to \<code>TCP\\</code>, you can set \<code>ApplicationName\\</code> to any of the listed application types. If you set \<code>Proto\\</code> to \<code>UDP\\</code>, \<code>ICMP\\</code>, or \<code>ANY\\</code>, you can set \<code>ApplicationName\\</code> only to \<code>ANY\\</code>. Specify either \<code>ApplicationNameList\\</code> or \<code>ApplicationName\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The application types that the access control policy supports.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

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
     * <p>The destination port in the access control policy. Valid values:</p>
     * <ul>
     * <li>If \<code>Proto\\</code> is \<code>ICMP\\</code>, leave this parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p>If the protocol type is ICMP, you cannot control access based on the destination port.</p>
     * </blockquote>
     * <ul>
     * <li>If \<code>Proto\\</code> is \<code>TCP\\</code>, \<code>UDP\\</code>, or \<code>ANY\\</code>, and \<code>DestPortType\\</code> is \<code>group\\</code>, leave this parameter empty.</li>
     * </ul>
     * <blockquote>
     * <p>If you set \<code>DestPortType\\</code> to \<code>group\\</code> (port address book), you do not need to specify a destination port number. The port address book contains all the destination ports that the policy manages.</p>
     * </blockquote>
     * <ul>
     * <li>If \<code>Proto\\</code> is \<code>TCP\\</code>, \<code>UDP\\</code>, or \<code>ANY\\</code>, and \<code>DestPortType\\</code> is \<code>port\\</code>, set this parameter to the destination port number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book for the traffic in the access control policy.</p>
     * <blockquote>
     * <p>If you set \<code>DestPortType\\</code> to \<code>group\\</code>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>my_port_group</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port for the traffic in the access control policy.</p>
     * <p>Valid values:</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If \<code>DestinationType\\</code> is \<code>net\\</code>, set this parameter to the destination CIDR block.</p>
     * <p>Example: 1.2.XX.XX/24</p>
     * </li>
     * <li><p>If \<code>DestinationType\\</code> is \<code>group\\</code>, set this parameter to the name of the destination address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If \<code>DestinationType\\</code> is \<code>domain\\</code>, set this parameter to the destination domain name.</p>
     * <p>Example: \*.aliyuncs.com</p>
     * </li>
     * <li><p>If \<code>DestinationType\\</code> is \<code>location\\</code>, set this parameter to the destination region.</p>
     * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about region codes, see <a href="https://help.aliyun.com/document_detail/2854161.html">Region codes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name resolution method for the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>FQDN</strong>: based on FQDN</p>
     * </li>
     * <li><p><strong>DNS</strong>: based on dynamic DNS resolution</p>
     * </li>
     * <li><p><strong>FQDN_AND_DNS</strong>: based on FQDN and dynamic DNS resolution</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FQDN</p>
     */
    @NameInMap("DomainResolveType")
    public String domainResolveType;

    /**
     * <p>The time when the policy becomes ineffective. This is a UNIX timestamp. The time must be on the hour or half-hour, and at least 30 minutes after the start time.</p>
     * <blockquote>
     * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code>, leave this parameter empty. This parameter is required if \<code>RepeatType\\</code> is \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP version supported.</p>
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
     * <p>The priority of the access control policy. The priority starts from 1. A smaller value indicates a higher priority.</p>
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
     * <li><p><strong>ANY</strong> (any protocol)</p>
     * </li>
     * <li><p><strong>TCP</strong></p>
     * </li>
     * <li><p><strong>UDP</strong></p>
     * </li>
     * <li><p><strong>ICMP</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the traffic direction is \<code>out\\</code> and the destination is a domain-based threat intelligence or cloud service address book, you can set the protocol only to \<code>TCP\\</code>. The supported applications are HTTP, HTTPS, SMTP, SMTPS, and SSL.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. By default, the policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the access control policy</p>
     * </li>
     * <li><p><strong>false</strong>: disables the access control policy</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of the week or month when the policy is active.</p>
     * <ul>
     * <li><p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code>, \<code>None\\</code>, or \<code>Daily\\</code>, leave this parameter empty.
     * Example: []</p>
     * </li>
     * <li><p>This parameter is required if \<code>RepeatType\\</code> is \<code>Weekly\\</code>.
     * Example: [0, 6]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set \<code>RepeatType\\</code> to \<code>Weekly\\</code>, the values in \<code>RepeatDays\\</code> cannot be duplicates.</p>
     * </blockquote>
     * <ul>
     * <li>This parameter is required if \<code>RepeatType\\</code> is \<code>Monthly\\</code>.
     * Example: [1, 31]</li>
     * </ul>
     * <blockquote>
     * <p>If you set \<code>RepeatType\\</code> to \<code>Monthly\\</code>, the values in \<code>RepeatDays\\</code> cannot be duplicates.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The end time of the recurrence. Example: 23:30. The time must be on the hour or half-hour, and at least 30 minutes after the start time.</p>
     * <blockquote>
     * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code> or \<code>None\\</code>, leave this parameter empty. This parameter is required if \<code>RepeatType\\</code> is \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The start time of the recurrence. Example: 08:00. The time must be on the hour or half-hour, and at least 30 minutes before the end time.</p>
     * <blockquote>
     * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code> or \<code>None\\</code>, leave this parameter empty. This parameter is required if \<code>RepeatType\\</code> is \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The recurrence type for the policy\&quot;s effective period. Valid values:</p>
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
     * <p>The source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p>If \<code>SourceType\\</code> is \<code>net\\</code>, set this parameter to the source CIDR block.</p>
     * <p>Example: 1.1.XX.XX/24</p>
     * </li>
     * <li><p>If \<code>SourceType\\</code> is \<code>group\\</code>, set this parameter to the name of the source address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If \<code>SourceType\\</code> is \<code>location\\</code>, set this parameter to the source region.</p>
     * <p>Example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information about region codes, see <a href="https://help.aliyun.com/document_detail/2854161.html">Region codes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the traffic.</p>
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
     * <li><p><strong>net</strong>: source CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: source address book</p>
     * </li>
     * <li><p><strong>location</strong>: source region</p>
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
     * <p>The time when the policy becomes effective. This is a UNIX timestamp. The time must be on the hour or half-hour, and at least 30 minutes before the end time.</p>
     * <blockquote>
     * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code>, leave this parameter empty. This parameter is required if \<code>RepeatType\\</code> is \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>.</p>
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
