// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on traffic that matches the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: Allows the traffic.</li>
     * <li><strong>drop</strong>: Blocks the traffic.</li>
     * <li><strong>log</strong>: Monitors the traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The UUID of the access control policy.</p>
     * <p>You must provide the UUID when you modify the access control policy. You can call the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to query the UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The application type supported by the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ANY: all application types</li>
     * <li>FTP</li>
     * <li>HTTP</li>
     * <li>HTTPS</li>
     * <li>MySQL</li>
     * <li>SMTP</li>
     * <li>SMTPS</li>
     * <li>RDP</li>
     * <li>VNC</li>
     * <li>SSH</li>
     * <li>Redis</li>
     * <li>MQTT</li>
     * <li>MongoDB</li>
     * <li>Memcache</li>
     * <li>SSL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    @Deprecated
    public String applicationName;

    /**
     * <p>The list of application names.</p>
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
     * <ul>
     * <li><p>If <strong>DestinationType</strong> is set to <code>net</code>, Destination is the destination CIDR block.</p>
     * <p>Example: 10.2.3.0/24</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to <code>group</code>, Destination is the name of the destination address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to <code>domain</code>, Destination is the destination domain name.</p>
     * <p>Example: *.aliyuncs.com</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.2.X.X/XX</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: destination CIDR block</li>
     * <li><strong>group</strong>: destination address book</li>
     * <li><strong>domain</strong>: destination domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

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
     * <p>The end time of the Policy Validity Period for the access control policy. The value is expressed in the format of a UNIX timestamp in seconds. The time must be on the hour or half hour, and must be at least half an hour later than the start time.</p>
     * <blockquote>
     * <p>When RepeatType is set to Permanent, EndTime is empty. When RepeatType is set to None, Daily, Weekly, or Monthly, EndTime must be specified, and you must configure the Settings for the end time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694764800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the response message.</p>
     * <p>Valid values:</p>
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
     * <p>The type of the security protocol in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ANY: all protocol types</li>
     * <li>TCP</li>
     * <li>UDP</li>
     * <li>ICMP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. By default, the policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the access control policy.</li>
     * <li><strong>false</strong>: disables the access control policy.</li>
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
     * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty set.
     * Example: []</li>
     * <li>When the Settings for RepeatType are Weekly, RepeatDays cannot be empty.
     * Example: [0, 6]<blockquote>
     * <p>When the Settings for RepeatType are Weekly, duplicate values are not allowed in RepeatDays.</p>
     * </blockquote>
     * </li>
     * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty.
     * Example: [1, 31]<blockquote>
     * <p>When the Settings for RepeatType are Monthly, duplicate values are not allowed in RepeatDays.</p>
     * </blockquote>
     * </li>
     * </ul>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The recurrence end time when the policy takes effect. Use the 24-hour time format HH:mm, such as 23:30. The time must be on the hour or half hour, and must be at least half an hour later than the recurrence start time.</p>
     * <blockquote>
     * <p>When RepeatType is set to Permanent or None, RepeatEndTime is empty. When RepeatType is set to Daily, Weekly, or Monthly, RepeatEndTime must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The recurrence start time when the policy takes effect. Use the 24-hour time format HH:mm, such as 08:00. The time must be on the hour or half hour, and must be at least half an hour earlier than the recurrence end time.</p>
     * <blockquote>
     * <p>When RepeatType is set to Permanent or None, RepeatStartTime is empty. When RepeatType is set to Daily, Weekly, or Monthly, RepeatStartTime must be specified.</p>
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
     * <li><strong>None</strong>: specified single time</li>
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
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If <strong>SourceType</strong> is set to <code>net</code>, Source is the source CIDR block.</p>
     * <p>Example: 10.2.4.0/24</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is set to <code>group</code>, Source is the name of the source address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.2.X.X/XX</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>net</strong>: source CIDR block</li>
     * <li><strong>group</strong>: source address book</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the Policy Validity Period for the access control policy. The value is expressed in the format of a UNIX timestamp in seconds. The time must be on the hour or half hour, and must be at least half an hour earlier than the end time.</p>
     * <blockquote>
     * <p>When RepeatType is set to Permanent, StartTime is empty. When RepeatType is set to None, Daily, Weekly, or Monthly, StartTime must be specified, and you must configure the Settings for the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewalls at the border. You can invoke the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain the ID.</p>
     * <ul>
     * <li><p>When the virtual private cloud (VPC) firewalls protect a CEN instance, set this parameter to the instance ID of the CEN instance.</p>
     * <p>Example: cen-ervw0g12b5jbw*\<em>\</em>\*</p>
     * </li>
     * <li><p>When the virtual private cloud (VPC) firewalls protect an Express Connect circuit, set this parameter to the instance ID of the virtual private cloud (VPC) firewalls.</p>
     * <p>Example: vfw-a42bbb7b887148c9*\<em>\</em>\*</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyRequest self = new ModifyVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public ModifyVpcFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    @Deprecated
    public ModifyVpcFirewallControlPolicyRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ModifyVpcFirewallControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    public ModifyVpcFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpcFirewallControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public ModifyVpcFirewallControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public ModifyVpcFirewallControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public ModifyVpcFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ModifyVpcFirewallControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ModifyVpcFirewallControlPolicyRequest setDomainResolveType(String domainResolveType) {
        this.domainResolveType = domainResolveType;
        return this;
    }
    public String getDomainResolveType() {
        return this.domainResolveType;
    }

    public ModifyVpcFirewallControlPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifyVpcFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public ModifyVpcFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public ModifyVpcFirewallControlPolicyRequest setRepeatDays(java.util.List<Long> repeatDays) {
        this.repeatDays = repeatDays;
        return this;
    }
    public java.util.List<Long> getRepeatDays() {
        return this.repeatDays;
    }

    public ModifyVpcFirewallControlPolicyRequest setRepeatEndTime(String repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
        return this;
    }
    public String getRepeatEndTime() {
        return this.repeatEndTime;
    }

    public ModifyVpcFirewallControlPolicyRequest setRepeatStartTime(String repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
        return this;
    }
    public String getRepeatStartTime() {
        return this.repeatStartTime;
    }

    public ModifyVpcFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public ModifyVpcFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ModifyVpcFirewallControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModifyVpcFirewallControlPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ModifyVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
