// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyRequest extends TeaModel {
    // The action that Cloud Firewall performs on the traffic. Valid values:
    // 
    // *   **accept**: allows the traffic.
    // *   **drop**: denies the traffic.
    // *   **log**: monitors the traffic.
    @NameInMap("AclAction")
    public String aclAction;

    // The ID of the access control policy.
    // 
    // >  If you want to modify the configurations of an access control policy, you must provide the ID of the policy. You can call the [DescribeControlPolicy](~~138866~~) operation to query the ID.
    @NameInMap("AclUuid")
    public String aclUuid;

    // The type of the application that the access control policy supports. Valid values:
    // 
    // *   **ANY**
    // *   **HTTP**
    // *   **HTTPS**
    // *   **MySQL**
    // *   **SMTP**
    // *   **SMTPS**
    // *   **RDP**
    // *   **VNC**
    // *   **SSH**
    // *   **Redis**
    // *   **MQTT**
    // *   **MongoDB**
    // *   **Memcache**
    // *   **SSL**
    // 
    // >  The value **ANY** indicates all types of applications.
    @NameInMap("ApplicationName")
    public String applicationName;

    // The application names. You can specify multiple application names.
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    // The description of the access control policy.
    @NameInMap("Description")
    public String description;

    // The destination port in the access control policy.
    @NameInMap("DestPort")
    public String destPort;

    // The name of the destination port address book in the access control policy.
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    // The type of the destination port in the access control policy. Valid values:
    // 
    // *   **port**: port
    // *   **group**: port address book
    @NameInMap("DestPortType")
    public String destPortType;

    // The destination address in the access control policy.
    // 
    // *   If **DestinationType** is set to net, the value of **Destination** is a CIDR block. Example: 1.2.XX.XX/24
    // *   If **DestinationType** is set to group, the value of **Destination** is an address book. Example: db_group
    // *   If **DestinationType** is set to domain, the value of **Destination** is a domain name. Example: \*.aliyuncs.com
    // *   If **DestinationType** is set to location, the value of **Destination** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"]
    @NameInMap("Destination")
    public String destination;

    // The type of the destination address in the access control policy. Valid values:
    // 
    // *   **net**: destination CIDR block
    // *   **group**: destination address book
    // *   **domain**: destination domain name
    // *   **location**: destination location
    @NameInMap("DestinationType")
    public String destinationType;

    // The direction of the traffic to which the access control policy applies. Valid values:
    // 
    // *   **in**: inbound traffic
    // *   **out**: outbound traffic
    @NameInMap("Direction")
    public String direction;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The type of the protocol in the access control policy. Valid values:
    // 
    // *   **ANY**
    // *   **TCP**
    // *   **UDP**
    // *   **ICMP**
    // 
    // >  The value **ANY** indicates all types of protocols.
    @NameInMap("Proto")
    public String proto;

    // The status of the access control policy. Valid values:
    // 
    // *   true: enabled
    // *   false: disabled
    @NameInMap("Release")
    public String release;

    // The source address in the access control policy.
    // 
    // *   If **SourceType** is set to net, the value of **Source** is a CIDR block. Example: 1.2.XX.XX/24
    // *   If **SourceType** is set to group, the value of **Source** is an address book. Example: db_group
    // *   If **SourceType** is set to location, the value of **Source** is a location. For more information about the location codes, see the "AddControlPolicy" topic. Example: \["BJ11", "ZB"]
    @NameInMap("Source")
    public String source;

    // The type of the source address in the access control policy. Valid values:
    // 
    // *   **net**: source CIDR block
    // *   **group**: source address book
    // *   **location**: source location
    @NameInMap("SourceType")
    public String sourceType;

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

}
