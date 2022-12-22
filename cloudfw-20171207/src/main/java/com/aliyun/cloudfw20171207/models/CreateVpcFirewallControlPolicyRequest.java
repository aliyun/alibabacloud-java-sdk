// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyRequest extends TeaModel {
    // The action that Cloud Firewall performs on the traffic. Valid values:
    // 
    // - **accept**: allows the traffic.
    // - **drop**: blocks the traffic.
    // - **log**: monitors the traffic.
    @NameInMap("AclAction")
    public String aclAction;

    // The type of the applications that the access control policy supports. Valid values:
    // 
    // - **FTP**
    // - **HTTP**
    // - **HTTPS**
    // - **MySQL**
    // - **SMTP**
    // - **SMTPS**
    // - **RDP**
    // - **VNC**
    // - **SSH**
    // - **Redis**
    // - **MQTT**
    // - **MongoDB**
    // - **Memcache**
    // - **SSL**
    // - **ANY**: all types of applications
    @NameInMap("ApplicationName")
    public String applicationName;

    // The description of the access control policy.
    @NameInMap("Description")
    public String description;

    // The destination port in the access control policy. 
    // 
    // >  If **DestPortType** is set to `port`, you must specify this parameter.
    @NameInMap("DestPort")
    public String destPort;

    // The name of the destination port address book in the access control policy. 
    // 
    // >  If **DestPortType** is set to `group`, you must specify this parameter.
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    // The type of the destination port in the access control policy. Valid values:
    // 
    // - **port**: port
    // - **group**: port address book
    @NameInMap("DestPortType")
    public String destPortType;

    // The destination address in the access control policy. Valid values:
    // 
    // - If **DestinationType** is set to `net`, the value of **Destination** must be a CIDR block.
    // - If **DestinationType** is set to `group`, the value of **Destination** must be an address book.
    // - If **DestinationType** is set to `domain`, the value of **Destination** must be a domain name.
    @NameInMap("Destination")
    public String destination;

    // The type of the destination address in the access control policy. Valid values:
    // 
    // - **net**: CIDR block
    // - **group**: address book
    // - **domain**: domain name
    @NameInMap("DestinationType")
    public String destinationType;

    // The language of the content within the request and response. Valid values:
    // 
    // - **zh**: Chinese (default)
    // - **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is managed by your Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The priority of the access control policy. 
    // 
    // The priority value starts from 1. A smaller priority value indicates a higher priority.
    @NameInMap("NewOrder")
    public String newOrder;

    // The type of the protocol in the access control policy. Valid values:
    // 
    // - **ANY** (If you are not sure about the protocol type, you can set this parameter to ANY.)
    // - **TCP**
    // - **UDP**
    // - **ICMP**
    @NameInMap("Proto")
    public String proto;

    // Specifies whether to enable the access control policy. By default, an access control policy is enabled after the policy is created. Valid values: 
    // 
    // - **true**: enables the access control policy.
    // - **false**: disables the access control policy.
    @NameInMap("Release")
    public String release;

    // The source address in the access control policy. 
    // 
    // - If SourceType is set to `net`, the value of Source must be a CIDR block.
    // - If SourceType is set to `group`, the value of Source must be an address book.
    @NameInMap("Source")
    public String source;

    // The type of the source address in the access control policy. Valid values:
    // 
    // - **net**: CIDR block
    // - **group**: address book
    @NameInMap("SourceType")
    public String sourceType;

    // The ID of the policy group in which you want to create the access control policy. 
    // 
    // - If a VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.
    // - If a VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.
    // 
    // >  You can call the [DescribeVpcFirewallAclGroupList](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallaclgrouplist) operation to query the IDs.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static CreateVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallControlPolicyRequest self = new CreateVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public CreateVpcFirewallControlPolicyRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateVpcFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcFirewallControlPolicyRequest setDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }
    public String getDestPort() {
        return this.destPort;
    }

    public CreateVpcFirewallControlPolicyRequest setDestPortGroup(String destPortGroup) {
        this.destPortGroup = destPortGroup;
        return this;
    }
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    public CreateVpcFirewallControlPolicyRequest setDestPortType(String destPortType) {
        this.destPortType = destPortType;
        return this;
    }
    public String getDestPortType() {
        return this.destPortType;
    }

    public CreateVpcFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateVpcFirewallControlPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateVpcFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateVpcFirewallControlPolicyRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateVpcFirewallControlPolicyRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public CreateVpcFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public CreateVpcFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public CreateVpcFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateVpcFirewallControlPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
