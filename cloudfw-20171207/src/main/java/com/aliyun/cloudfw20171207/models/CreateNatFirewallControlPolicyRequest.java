// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **accept**: allows the traffic.</p>
     * <p>*   **drop**: denies the traffic.</p>
     * <p>*   **log**: monitors the traffic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The application types supported by the access control policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy. Valid values:</p>
     * <br>
     * <p>*   If Proto is set to ICMP, DestPort is automatically left empty.</p>
     * <br>
     * <p>> If Proto is set to ICMP, access control does not take effect on the destination port.</p>
     * <br>
     * <p>*   If Proto is set to TCP, UDP, or ANY and DestPortType is set to group, DestPort is empty.</p>
     * <br>
     * <p>> If DestPortType is set to group, you do not need to specify the destination port number. All ports on which the access control policy takes effect are included in the destination port address book.</p>
     * <br>
     * <p>*   If Proto is set to TCP, UDP, or ANY and DestPortType is set to port, the value of DestPort is the destination port number.</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy.</p>
     * <br>
     * <p>> If DestPortType is set to group, you must specify the name of the destination port address book.</p>
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
     * <p>Valid values:</p>
     * <br>
     * <p>*   If DestinationType is set to net, the value of this parameter is a CIDR block.</p>
     * <br>
     * <p>    Example: 1.2.XX.XX/24</p>
     * <br>
     * <p>*   If DestinationType is set to group, the value of this parameter is an address book.</p>
     * <br>
     * <p>    Example: db_group</p>
     * <br>
     * <p>*   If DestinationType is set to domain, the value of this parameter is a domain name.</p>
     * <br>
     * <p>    Example: \\*.aliyuncs.com</p>
     * <br>
     * <p>*   If DestinationType is set to location, the value of this parameter is a location.</p>
     * <br>
     * <p>    Example: ["BJ11", "ZB"]</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **net**: CIDR block</p>
     * <p>*   **group**: address book</p>
     * <p>*   **domain**: domain name</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <br>
     * <p>*   **out**: outbound traffic</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name resolution method of the access control policy. Valid values:</p>
     * <br>
     * <p>*   **0**: fully qualified domain name (FQDN)-based resolution</p>
     * <p>*   **1**: Domain Name System (DNS)-based dynamic resolution</p>
     * <p>*   **2**: FQDN and DNS-based dynamic resolution</p>
     */
    @NameInMap("DomainResolveType")
    public Integer domainResolveType;

    /**
     * <p>The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of StartTime.</p>
     * <br>
     * <p>>  If RepeatType is set to Permanent, EndTime is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter must be specified.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The IP version supported by the access control policy. Valid values:</p>
     * <br>
     * <p>*   **4**: IPv4 (default)</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the content within the response.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The priority of the access control policy. The priority value starts from 1. A small priority value indicates a high priority.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The protocol type in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   ANY: all types of protocols</p>
     * <p>*   TCP</p>
     * <p>*   UDP</p>
     * <p>*   ICMP</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether to enable the access control policy. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The days of a week or of a month on which the access control policy takes effect.</p>
     * <br>
     * <p>*   If RepeatType is set to `Permanent`, `None`, or `Daily`, RepeatDays is left empty. Example: [].</p>
     * <p>*   If RepeatType is set to Weekly, RepeatDays must be specified. Example: [0, 6].</p>
     * <br>
     * <p>>  If RepeatType is set to Weekly, the fields in the value of RepeatDays cannot be repeated.</p>
     * <br>
     * <p>*   If RepeatType is set to `Monthly`, RepeatDays must be specified. Example: [1, 31].</p>
     * <br>
     * <p>>  If RepeatType is set to Monthly, the fields in the value of RepeatDays cannot be repeated.</p>
     */
    @NameInMap("RepeatDays")
    public java.util.List<Long> repeatDays;

    /**
     * <p>The point in time when the recurrence ends. Example: 23:30. The value must be on the hour or on the half hour, and at least 30 minutes later than the value of RepeatStartTime.</p>
     * <br>
     * <p>>  If RepeatType is set to Permanent or None, RepeatEndTime is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
     */
    @NameInMap("RepeatEndTime")
    public String repeatEndTime;

    /**
     * <p>The point in time when the recurrence starts. Example: 08:00. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of RepeatEndTime.</p>
     * <br>
     * <p>>  If RepeatType is set to Permanent or None, RepeatStartTime is left empty. If RepeatType is set to Daily, Weekly, or Monthly, this parameter must be specified.</p>
     */
    @NameInMap("RepeatStartTime")
    public String repeatStartTime;

    /**
     * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
     * <br>
     * <p>*   **Permanent** (default): The policy always takes effect.</p>
     * <p>*   **None**: The policy takes effect for only once.</p>
     * <p>*   **Daily**: The policy takes effect on a daily basis.</p>
     * <p>*   **Weekly**: The policy takes effect on a weekly basis.</p>
     * <p>*   **Monthly**: The policy takes effect on a monthly basis.</p>
     */
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
     * <p>*   If **SourceType** is set to `group`, the value of this parameter must be an address book name.</p>
     * <br>
     * <p>    Example: db_group</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **net**: source CIDR block</p>
     * <p>*   **group**: source address book</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the value of EndTime.</p>
     * <br>
     * <p>>  If RepeatType is set to Permanent, StartTime is left empty. If RepeatType is set to None, Daily, Weekly, or Monthly, this parameter must be specified.</p>
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
