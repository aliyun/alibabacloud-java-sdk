// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <br>
     * <p>- **accept**: allows the traffic.</p>
     * <p>- **drop**: blocks the traffic.</p>
     * <p>- **log**: monitors the traffic.</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The type of the applications that the access control policy supports. Valid values:</p>
     * <br>
     * <p>- **FTP**</p>
     * <p>- **HTTP**</p>
     * <p>- **HTTPS**</p>
     * <p>- **MySQL**</p>
     * <p>- **SMTP**</p>
     * <p>- **SMTPS**</p>
     * <p>- **RDP**</p>
     * <p>- **VNC**</p>
     * <p>- **SSH**</p>
     * <p>- **Redis**</p>
     * <p>- **MQTT**</p>
     * <p>- **MongoDB**</p>
     * <p>- **Memcache**</p>
     * <p>- **SSL**</p>
     * <p>- **ANY**: all types of applications</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("ApplicationNameList")
    public java.util.List<String> applicationNameList;

    /**
     * <p>The description of the access control policy.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination port in the access control policy. </p>
     * <br>
     * <p>>  If **DestPortType** is set to `port`, you must specify this parameter.</p>
     */
    @NameInMap("DestPort")
    public String destPort;

    /**
     * <p>The name of the destination port address book in the access control policy. </p>
     * <br>
     * <p>>  If **DestPortType** is set to `group`, you must specify this parameter.</p>
     */
    @NameInMap("DestPortGroup")
    public String destPortGroup;

    /**
     * <p>The type of the destination port in the access control policy. Valid values:</p>
     * <br>
     * <p>- **port**: port</p>
     * <p>- **group**: port address book</p>
     */
    @NameInMap("DestPortType")
    public String destPortType;

    /**
     * <p>The destination address in the access control policy. Valid values:</p>
     * <br>
     * <p>- If **DestinationType** is set to `net`, the value of **Destination** must be a CIDR block.</p>
     * <p>- If **DestinationType** is set to `group`, the value of **Destination** must be an address book.</p>
     * <p>- If **DestinationType** is set to `domain`, the value of **Destination** must be a domain name.</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy. Valid values:</p>
     * <br>
     * <p>- **net**: CIDR block</p>
     * <p>- **group**: address book</p>
     * <p>- **domain**: domain name</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>- **zh**: Chinese (default)</p>
     * <p>- **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The priority of the access control policy. </p>
     * <br>
     * <p>The priority value starts from 1. A smaller priority value indicates a higher priority.</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The type of the protocol in the access control policy. Valid values:</p>
     * <br>
     * <p>- **ANY** (If you are not sure about the protocol type, you can set this parameter to ANY.)</p>
     * <p>- **TCP**</p>
     * <p>- **UDP**</p>
     * <p>- **ICMP**</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether to enable the access control policy. By default, an access control policy is enabled after the policy is created. Valid values: </p>
     * <br>
     * <p>- **true**: enables the access control policy.</p>
     * <p>- **false**: disables the access control policy.</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The source address in the access control policy. </p>
     * <br>
     * <p>- If SourceType is set to `net`, the value of Source must be a CIDR block.</p>
     * <p>- If SourceType is set to `group`, the value of Source must be an address book.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <br>
     * <p>- **net**: CIDR block</p>
     * <p>- **group**: address book</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the policy group in which you want to create the access control policy. </p>
     * <br>
     * <p>- If a VPC firewall protects the traffic between two VPCs that are connected by using a CEN instance, the value of this parameter must be the ID of the CEN instance.</p>
     * <p>- If a VPC firewall protects the traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.</p>
     * <br>
     * <p>>  You can call the [DescribeVpcFirewallAclGroupList](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallaclgrouplist) operation to query the IDs.</p>
     */
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

    public CreateVpcFirewallControlPolicyRequest setApplicationNameList(java.util.List<String> applicationNameList) {
        this.applicationNameList = applicationNameList;
        return this;
    }
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
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
