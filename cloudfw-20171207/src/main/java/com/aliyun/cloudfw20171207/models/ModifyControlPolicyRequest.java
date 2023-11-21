// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyRequest extends TeaModel {
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
     * <p>>  To modify an access control policy, you must specify the UUID of the policy. You can call the [DescribeControlPolicy](~~138866~~) interface to query the UUID.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The type of the application that the access control policy supports. Valid values:</p>
     * <br>
     * <p>*   **ANY**</p>
     * <p>*   **HTTP**</p>
     * <p>*   **HTTPS**</p>
     * <p>*   **MySQL**</p>
     * <p>*   **SMTP**</p>
     * <p>*   **SMTPS**</p>
     * <p>*   **RDP**</p>
     * <p>*   **VNC**</p>
     * <p>*   **SSH**</p>
     * <p>*   **Redis**</p>
     * <p>*   **MQTT**</p>
     * <p>*   **MongoDB**</p>
     * <p>*   **Memcache**</p>
     * <p>*   **SSL**</p>
     * <br>
     * <p>>  The value ANY** indicates all types of applications.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The application names.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy.</p>
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
     * <p>*   If **DestinationType** is set to net, the value of **Destination** is a CIDR block. Example: 1.2.XX.XX/24.</p>
     * <p>*   If **DestinationType** is set to group, the value of **Destination** is an address book. Example: db_group.</p>
     * <p>*   If **DestinationType** is set to domain, the value of **Destination** is a domain name. Example: \*.aliyuncs.com.</p>
     * <p>*   If **DestinationType** is set to location, the value of **Destination** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"].</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <br>
     * <p>*   **net**: CIDR block</p>
     * <p>*   **group**: address book</p>
     * <p>*   **domain**: domain name</p>
     * <p>*   **location**: location</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <br>
     * <p>*   **in**: inbound traffic</p>
     * <p>*   **out**: outbound traffic</p>
     */
    @NameInMap("Direction")
    public String direction;

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
     * <p>The protocol type supported by the access control policy. Valid values:</p>
     * <br>
     * <p>*   **ANY**</p>
     * <p>*   **TCP**</p>
     * <p>*   **UDP**</p>
     * <p>*   **ICMP**</p>
     * <br>
     * <p>>  The value ANY** indicates all types of applications.</p>
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
     * <p>*   If **SourceType** is set to net, the value of **Source** is a CIDR block. Example: 1.2.XX.XX/24.</p>
     * <p>*   If **SourceType** is set to group, the value of **Source** is an address book. Example: db_group.</p>
     * <p>*   If **SourceType** is set to location, the value of **Source** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"]</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <br>
     * <p>*   **net**: CIDR block</p>
     * <p>*   **group**: address book</p>
     * <p>*   **location**: location</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

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
