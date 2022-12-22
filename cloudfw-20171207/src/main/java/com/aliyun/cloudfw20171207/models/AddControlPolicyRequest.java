// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddControlPolicyRequest extends TeaModel {
    // The action that Cloud Firewall performs on the traffic. Valid values:
    // 
    // * **accept**: allows the traffic.
    // * **drop**: denies the traffic.
    // * **log**: monitors the traffic.
    @NameInMap("AclAction")
    public String aclAction;

    // The type of the application that the access control policy supports. Valid values:
    // 
    // * **FTP**
    // * **HTTP**
    // * **HTTPS**
    // * **Memcache**
    // * **MongoDB**
    // * **MQTT**
    // * **MySQL**
    // * **RDP**
    // * **Redis**
    // * **SMTP**
    // * **SMTPS**
    // * **SSH**
    // * **SSL_No_Cert**
    // * **SSL**
    // * **VNC**
    // * **ANY**: all types of applications
    // 
    // > The value of this parameter depends on the value of Proto. If Proto is set to TCP, you can set ApplicationName to any valid value. If Proto is set to UDP, ICMP, or ANY, you can set ApplicationName only to ANY.
    @NameInMap("ApplicationName")
    public String applicationName;

    // The types of the application that the access control policy supports.
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    // The description of the access control policy.
    @NameInMap("Description")
    public String description;

    // The destination port in the access control policy. Valid values:
    // 
    // * If Proto is set to ICMP, the value of DestPort is empty.
    // 
    // > If Proto is set to ICMP, access control does not take effect on the destination port.
    // 
    // * If Proto is set to TCP, UDP, or ANY and DestPortType is set to group, the value of DestPort is empty.
    // 
    // > If DestPortType is set to group, you do not need to specify the destination port number. All ports that the access control policy controls are included in the destination port address book.
    // 
    // * If Proto is set to TCP, UDP, or ANY and DestPortType is set to port, the value of DestPort is the destination port number.
    @NameInMap("DestPort")
    public String destPort;

    // The name of the destination port address book in the access control policy.
    // 
    // >  If DestPortType is set to group, you must specify the name of the destination port address book.
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    // The type of the destination port in the access control policy.
    // 
    // Valid values:
    // 
    // *   **port**: port
    // *   **group**: port address book
    @NameInMap("DestPortType")
    public String destPortType;

    // The destination address in the access control policy.
    // 
    // Valid values:
    // 
    // * If DestinationType is set to net, the value of this parameter is a CIDR block.
    // 
    //     Example: 1.2.XX.XX/24
    // 
    // * If DestinationType is set to group, the value of this parameter is an address book.
    // 
    //     Example: db_group
    // 
    // * If DestinationType is set to domain, the value of this parameter is a domain name.
    // 
    //     Example: \*.aliyuncs.com
    // 
    // * If DestinationType is set to location, the value of this parameter is a location.
    // 
    //     Example: \["BJ11", "ZB"]
    @NameInMap("Destination")
    public String destination;

    // The type of the destination address in the access control policy. Valid values:
    // 
    // * **net**: destination CIDR block
    // * **group**: destination address book
    // * **domain**: destination domain name
    // * **location**: destination location
    @NameInMap("DestinationType")
    public String destinationType;

    // The direction of the traffic to which the access control policy applies. Valid values:
    // 
    // * **in**: inbound traffic
    // * **out**: outbound traffic
    @NameInMap("Direction")
    public String direction;

    // The IP version of the address in the access control policy.
    // 
    // Valid values:
    // 
    // * **4**: IPv4
    // * **6**: IPv6
    @NameInMap("IpVersion")
    public String ipVersion;

    // The language of the content within the request and response. Valid values:
    // 
    // * **zh**: Chinese (default)
    // * **en**: English
    @NameInMap("Lang")
    public String lang;

    // The priority of the access control policy. The priority value starts from 1. A small priority value indicates a high priority.
    @NameInMap("NewOrder")
    public String newOrder;

    // The type of the protocol in the access control policy. Valid values:
    // 
    // * **ANY**: any protocol type
    // * **TCP**
    // * **UDP**
    // * **ICMP**
    @NameInMap("Proto")
    public String proto;

    // Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:
    // 
    // *   **true**: The access control policy is enabled.
    // *   **false**: The access control policy is disabled.
    @NameInMap("Release")
    public String release;

    // The source address in the access control policy. Valid values:
    // 
    // * If SourceType is set to net, the value of this parameter is a CIDR block.
    // 
    //     Example: 1.1.XX.XX/24
    // 
    // * If SourceType is set to group, the value of this parameter is an address book.
    // 
    //     Example: db_group
    // 
    // * If SourceType is set to location, the value of this parameter is a location.
    // 
    //     Example: \["BJ11", "ZB"]
    @NameInMap("Source")
    public String source;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the source address book in the access control policy. Valid values:
    // 
    // * **net**: source CIDR block
    // * **group**: source address book
    // * **location**: source location
    @NameInMap("SourceType")
    public String sourceType;

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

    public AddControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

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

}
