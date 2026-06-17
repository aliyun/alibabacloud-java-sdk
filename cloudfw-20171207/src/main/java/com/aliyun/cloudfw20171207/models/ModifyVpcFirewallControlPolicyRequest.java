// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that is performed on traffic that hits the access control policy.</p>
     * <p>Valid values:</p>
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
     * <p>To modify an access control policy, you must provide the unique ID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to query the ID.</p>
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
     * <li><p>ANY (all application types)</p>
     * </li>
     * <li><p>FTP</p>
     * </li>
     * <li><p>HTTP</p>
     * </li>
     * <li><p>HTTPS</p>
     * </li>
     * <li><p>MySQL</p>
     * </li>
     * <li><p>SMTP</p>
     * </li>
     * <li><p>SMTPS</p>
     * </li>
     * <li><p>RDP</p>
     * </li>
     * <li><p>VNC</p>
     * </li>
     * <li><p>SSH</p>
     * </li>
     * <li><p>Redis</p>
     * </li>
     * <li><p>MQTT</p>
     * </li>
     * <li><p>MongoDB</p>
     * </li>
     * <li><p>Memcache</p>
     * </li>
     * <li><p>SSL</p>
     * </li>
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
     * <p>The name of the destination port address book for the traffic to which the access control policy applies.</p>
     * 
     * <strong>example:</strong>
     * <p>my_port_group</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port for the traffic to which the access control policy applies.</p>
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
     * <li><p>If <strong>DestinationType</strong> is set to <code>net</code>, specify a destination CIDR block.</p>
     * <p>Example: 10.2.3.0/24</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to <code>group</code>, specify the name of a destination address book.</p>
     * <p>Example: db_group</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to <code>domain</code>, specify a destination domain name.</p>
     * <p>Example: \*.aliyuncs.com</p>
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
     * <li><p><strong>net</strong>: destination CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: destination address book</p>
     * </li>
     * <li><p><strong>domain</strong>: destination domain name</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The domain name resolution method for the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>FQDN</strong>: based on Fully Qualified Domain Name (FQDN)</p>
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
     * <p>The end time of the policy validity period. The value is a UNIX timestamp. The time is on the hour or on the half hour, and is at least 30 minutes later than the start time.</p>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Permanent\\</code>, this parameter is empty. If RepeatType is set to \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, you must specify this parameter.</p>
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
     * <p>The protocol type for the traffic to which the access control policy applies.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ANY (all protocol types)</p>
     * </li>
     * <li><p>TCP</p>
     * </li>
     * <li><p>UDP</p>
     * </li>
     * <li><p>ICMP</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the access control policy.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the access control policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of a week or month on which the policy takes effect.</p>
     * <ul>
     * <li><p>If RepeatType is set to \<code>Permanent\\</code>, \<code>None\\</code>, or \<code>Daily\\</code>, this parameter is empty.
     * Example: []</p>
     * </li>
     * <li><p>If RepeatType is set to \<code>Weekly\\</code>, this parameter cannot be empty.
     * Example: [0, 6]</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Weekly\\</code>, the elements in the array cannot be repeated.</p>
     * </blockquote>
     * <ul>
     * <li>If RepeatType is set to \<code>Monthly\\</code>, this parameter cannot be empty.
     * Example: [1, 31]</li>
     * </ul>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Monthly\\</code>, the elements in the array cannot be repeated.</p>
     * </blockquote>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The end time of the recurrence. The time is in the HH:mm format. The time is on the hour or on the half hour, and is at least 30 minutes later than the start time. Example: 23:30.</p>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Permanent\\</code> or \<code>None\\</code>, this parameter is empty. If RepeatType is set to \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23:30</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The start time of the recurrence. The time is in the HH:mm format. The time is on the hour or on the half hour, and is at least 30 minutes earlier than the end time. Example: 08:00.</p>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Permanent\\</code> or \<code>None\\</code>, this parameter is empty. If RepeatType is set to \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, you must specify this parameter.</p>
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
     * <li><p><strong>None</strong>: The policy takes effect for a specific period of time.</p>
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
     * <p>The source address in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If <strong>SourceType</strong> is set to <code>net</code>, specify a source CIDR block.</p>
     * <p>Example: 10.2.4.0/24</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is set to <code>group</code>, specify the name of a source address book.</p>
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
     * <p>The start time of the policy validity period. The value is a UNIX timestamp. The time is on the hour or on the half hour, and is at least 30 minutes earlier than the end time.</p>
     * <blockquote>
     * <p>If RepeatType is set to \<code>Permanent\\</code>, this parameter is empty. If RepeatType is set to \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1694761200</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the VPC firewall instance. You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
     * <ul>
     * <li><p>If the VPC firewall protects a CEN instance, the value of this parameter is the ID of the CEN instance.</p>
     * <p>Example: cen-ervw0g12b5jbw\<em>\</em>\<em>\</em></p>
     * </li>
     * <li><p>If the VPC firewall protects an Express Connect circuit, the value of this parameter is the ID of the VPC firewall instance.</p>
     * <p>Example: vfw-a42bbb7b887148c9\<em>\</em>\<em>\</em></p>
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
