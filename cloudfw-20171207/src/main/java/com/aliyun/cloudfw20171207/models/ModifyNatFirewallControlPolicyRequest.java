// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <br>
     * <p>*   **accept**: allows the traffic.</p>
     * <p>*   **drop**: denies the traffic.</p>
     * <p>*   **log**: monitors the traffic.</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The UUID of the access control policy.</p>
     * <br>
     * <p>To modify the configurations of an access control policy, you must provide the UUID of the policy. You can call the DescribeNatFirewallControlPolicy operation to query the UUIDs of access control policies.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy. Fuzzy match is supported.</p>
     * <br>
     * <p>> If you do not specify this parameter, the descriptions of all policies are queried.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy.</p>
     * <br>
     * <p>> If **DestPortType** is set to `port`, you must specify this parameter.</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy.</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port in the access control policy. Valid values:</p>
     * <br>
     * <p>*   **port**: port</p>
     * <p>*   **group**: port address book</p>
     */
    @NameInMap("DestPortType")
    public String destPortType;

    /**
     * <p>The destination address in the access control policy.</p>
     * <br>
     * <p>*   If **DestinationType** is set to net, the value of **Destination** is a CIDR block. Example: 1.2.3.4/24</p>
     * <p>*   If **DestinationType** is set to group, the value of **Destination** is an address book. Example: db_group</p>
     * <p>*   If **DestinationType** is set to domain, the value of **Destination** is a domain name. Example: \*.aliyuncs.com</p>
     * <p>*   If **DestinationType** is set to location, the value of **Destination** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"]</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <br>
     * <p>*   **net**: CIDR block</p>
     * <p>*   **group**: address book</p>
     * <p>*   **domain**: domain name</p>
     * <p>*   **location**</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The domain name resolution method of the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <br>
     * <p>*   **0**: Fully qualified domain name (FQDN)-based resolution</p>
     * <p>*   **1**: Domain Name System (DNS)-based dynamic resolution</p>
     * <p>*   **2**: FQDN and DNS-based dynamic resolution</p>
     */
    @NameInMap("DomainResolveType")
    public String domainResolveType;

    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The protocol type supported by the access control policy. Valid values:</p>
     * <br>
     * <p>*   **ANY**</p>
     * <p>*   **TCP**</p>
     * <p>*   **UDP**</p>
     * <p>*   **ICMP**</p>
     * <br>
     * <p>> The value **ANY** indicates all types of protocols.</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. Valid values:</p>
     * <br>
     * <p>*   true: enabled</p>
     * <p>*   false: disabled</p>
     */
    @NameInMap("Release")
    public String release;

    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   If **SourceType** is set to `net`, the value of Source is a CIDR block.</p>
     * <br>
     * <p>    Example: 10.2.4.0/24</p>
     * <br>
     * <p>*   If **SourceType** is set to `group`, the value of this parameter is an address book.</p>
     * <br>
     * <p>    Example: db_group</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **net**: CIDR block</p>
     * <p>*   **group**: address book</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

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
