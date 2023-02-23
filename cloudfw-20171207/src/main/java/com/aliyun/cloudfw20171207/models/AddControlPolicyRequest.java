// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <br>
     * <p>* **accept**: allows the traffic.</p>
     * <p>* **drop**: denies the traffic.</p>
     * <p>* **log**: monitors the traffic.</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The type of the application that the access control policy supports. Valid values:</p>
     * <br>
     * <p>* **FTP**</p>
     * <p>* **HTTP**</p>
     * <p>* **HTTPS**</p>
     * <p>* **Memcache**</p>
     * <p>* **MongoDB**</p>
     * <p>* **MQTT**</p>
     * <p>* **MySQL**</p>
     * <p>* **RDP**</p>
     * <p>* **Redis**</p>
     * <p>* **SMTP**</p>
     * <p>* **SMTPS**</p>
     * <p>* **SSH**</p>
     * <p>* **SSL_No_Cert**</p>
     * <p>* **SSL**</p>
     * <p>* **VNC**</p>
     * <p>* **ANY**: all types of applications</p>
     * <br>
     * <p>> The value of this parameter depends on the value of Proto. If Proto is set to TCP, you can set ApplicationName to any valid value. If Proto is set to UDP, ICMP, or ANY, you can set ApplicationName only to ANY.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The types of the application that the access control policy supports.</p>
     */
    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy. Valid values:</p>
     * <br>
     * <p>* If Proto is set to ICMP, the value of DestPort is empty.</p>
     * <br>
     * <p>> If Proto is set to ICMP, access control does not take effect on the destination port.</p>
     * <br>
     * <p>* If Proto is set to TCP, UDP, or ANY and DestPortType is set to group, the value of DestPort is empty.</p>
     * <br>
     * <p>> If DestPortType is set to group, you do not need to specify the destination port number. All ports that the access control policy controls are included in the destination port address book.</p>
     * <br>
     * <p>* If Proto is set to TCP, UDP, or ANY and DestPortType is set to port, the value of DestPort is the destination port number.</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy.</p>
     * <br>
     * <p>>  If DestPortType is set to group, you must specify the name of the destination port address book.</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
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
     * <p>* If DestinationType is set to net, the value of this parameter is a CIDR block.</p>
     * <br>
     * <p>    Example: 1.2.XX.XX/24</p>
     * <br>
     * <p>* If DestinationType is set to group, the value of this parameter is an address book.</p>
     * <br>
     * <p>    Example: db_group</p>
     * <br>
     * <p>* If DestinationType is set to domain, the value of this parameter is a domain name.</p>
     * <br>
     * <p>    Example: \*.aliyuncs.com</p>
     * <br>
     * <p>* If DestinationType is set to location, the value of this parameter is a location.</p>
     * <br>
     * <p>    Example: \["BJ11", "ZB"]</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <br>
     * <p>* **net**: destination CIDR block</p>
     * <p>* **group**: destination address book</p>
     * <p>* **domain**: destination domain name</p>
     * <p>* **location**: destination location</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <br>
     * <p>* **in**: inbound traffic</p>
     * <p>* **out**: outbound traffic</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The IP version of the address in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>* **4**: IPv4</p>
     * <p>* **6**: IPv6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>* **zh**: Chinese (default)</p>
     * <p>* **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priority of the access control policy. The priority value starts from 1. A small priority value indicates a high priority.</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The type of the protocol in the access control policy. Valid values:</p>
     * <br>
     * <p>* **ANY**: any protocol type</p>
     * <p>* **TCP**</p>
     * <p>* **UDP**</p>
     * <p>* **ICMP**</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <br>
     * <p>*   **true**: The access control policy is enabled.</p>
     * <p>*   **false**: The access control policy is disabled.</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The source address in the access control policy. Valid values:</p>
     * <br>
     * <p>* If SourceType is set to net, the value of this parameter is a CIDR block.</p>
     * <br>
     * <p>    Example: 1.1.XX.XX/24</p>
     * <br>
     * <p>* If SourceType is set to group, the value of this parameter is an address book.</p>
     * <br>
     * <p>    Example: db_group</p>
     * <br>
     * <p>* If SourceType is set to location, the value of this parameter is a location.</p>
     * <br>
     * <p>    Example: \["BJ11", "ZB"]</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the source address book in the access control policy. Valid values:</p>
     * <br>
     * <p>* **net**: source CIDR block</p>
     * <p>* **group**: source address book</p>
     * <p>* **location**: source location</p>
     */
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
