// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyRequest extends TeaModel {
    // The action that Cloud Firewall performs on the traffic. 
    // 
    // Valid values:
    // 
    // - **accept**: allows the traffic.
    // - **drop**: denies the traffic.
    // - **log**: monitors the traffic.
    @NameInMap("AclAction")
    public String aclAction;

    // The ID of the access control policy. 
    // 
    // If you want to modify the configurations of an access control policy, you must provide the ID of the policy. You can call the [DescribeVpcFirewallControlPolicy](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallcontrolpolicy#doc-api-Cloudfw-DescribeVpcFirewallControlPolicy) operation to query the ID.
    @NameInMap("AclUuid")
    public String aclUuid;

    // The type of the application that the access control policy supports. 
    // 
    // Valid values:
    // 
    // - FTP
    // - HTTP
    // - HTTPS
    // - MySQL
    // - SMTP
    // - SMTPS
    // - RDP
    // - VNC
    // - SSH
    // - Redis
    // - MQTT
    // - MongoDB
    // - Memcache
    // - SSL
    // - ANY: all types of applications
    @NameInMap("ApplicationName")
    public String applicationName;

    // The description of the access control policy.
    @NameInMap("Description")
    public String description;

    // The destination port in the access control policy.
    @NameInMap("DestPort")
    public String destPort;

    // The name of the destination port address book in the access control policy.
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    // The type of the destination port in the access control policy. 
    // 
    // - **port**: port
    // - **group**: port address book
    @NameInMap("DestPortType")
    public String destPortType;

    // The destination address in the access control policy. 
    // 
    // - If **DestinationType** is set to `net`, the value of Destination is a CIDR block.  
    // 
    // Example: 10.2.3.0/24
    // - If **DestinationType** is set to `group`, the value of Destination is an address book.  
    // 
    // Example: db_group
    // - If **DestinationType** is set to `domain`, the value of Destination is a domain name.  
    // 
    // Example: *.aliyuncs.com
    @NameInMap("Destination")
    public String destination;

    // The type of the destination address in the access control policy. 
    // 
    // Valid values:
    // 
    // - **net**: destination CIDR block
    // - **group**: destination address book
    // - **domain**: destination domain name
    @NameInMap("DestinationType")
    public String destinationType;

    // The natural language of the request and response. 
    // 
    // Valid values:
    // 
    // - **zh**: Chinese
    // - **en**: English
    @NameInMap("Lang")
    public String lang;

    // The type of the protocol in the access control policy. 
    // 
    // Valid values:
    // 
    // - ANY: all types of protocols
    // - TCP
    // - UDP
    // - ICMP
    @NameInMap("Proto")
    public String proto;

    // Indicates whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: 
    // 
    // - **true**: The access control policy is enabled.
    // - **false**: The access control policy is disabled.
    @NameInMap("Release")
    public String release;

    // The source address in the access control policy. 
    // 
    // Valid values:
    // 
    // - If **SourceType** is set to `net`, the value of Source is a CIDR block.  
    // 
    // Example: 10.2.4.0/24
    // - If **SourceType** is set to `group`, the value of Source is an address book.  
    // 
    // Example: db_group
    @NameInMap("Source")
    public String source;

    // The type of the source address in the access control policy. 
    // 
    // Valid values:
    // 
    // - **net**: source CIDR block
    // - **group**: source address book
    @NameInMap("SourceType")
    public String sourceType;

    // The ID of the policy group to which the access control policy belongs. You can call the DescribeVpcFirewallAclGroupList operation to query the ID.  
    // 
    // - If the VPC firewall is used to protect a CEN instance, the value of this parameter is the ID of the CEN instance.  
    // 
    // Example: cen-ervw0g12b5jbw****
    // - If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.  
    // 
    // Example: vfw-a42bbb7b887148c9****
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

    public ModifyVpcFirewallControlPolicyRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
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

    public ModifyVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
