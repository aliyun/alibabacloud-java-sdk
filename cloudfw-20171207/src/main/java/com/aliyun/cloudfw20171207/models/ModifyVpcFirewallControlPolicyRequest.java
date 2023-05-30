// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **accept**: allows the traffic.</p>
     * <p>*   **drop**: blocks the traffic.</p>
     * <p>*   **log**: monitors the traffic.</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy.</p>
     * <br>
     * <p>If you want to modify the configurations of an access control policy, you must provide the unique ID of the policy. You can call the [DescribeVpcFirewallControlPolicy](~~159758~~) operation to query the ID.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The application type in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   ANY</p>
     * <p>*   FTP</p>
     * <p>*   HTTP</p>
     * <p>*   HTTPS</p>
     * <p>*   MySQL</p>
     * <p>*   SMTP</p>
     * <p>*   SMTPS</p>
     * <p>*   RDP</p>
     * <p>*   VNC</p>
     * <p>*   SSH</p>
     * <p>*   Redis</p>
     * <p>*   MQTT</p>
     * <p>*   MongoDB</p>
     * <p>*   Memcache</p>
     * <p>*   SSL</p>
     * <p>*   ANY: all application types</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

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
     * <p>The type of the destination port in the access control policy.</p>
     * <br>
     * <p>*   **port**: port</p>
     * <p>*   **group**: port address book</p>
     */
    @NameInMap("DestPortType")
    public String destPortType;

    /**
     * <p>The destination address in the access control policy.</p>
     * <br>
     * <p>*   If **DestinationType** is set to `net`, the value of this parameter must be a CIDR block.</p>
     * <br>
     * <p>    Example: 10.2.3.0/24</p>
     * <br>
     * <p>*   If **DestinationType** is set to `group`, the value of this parameter must be an address book name.</p>
     * <br>
     * <p>    Example: db_group</p>
     * <br>
     * <p>*   If **DestinationType** is set to `domain`, the value of this parameter must be a domain name.</p>
     * <br>
     * <p>    Example: \*.aliyuncs.com</p>
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
     */
    @NameInMap("DestinationType")
    public String destinationType;

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
     * <p>The protocol type in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   ANY: all protocol types</p>
     * <p>*   TCP</p>
     * <p>*   UDP</p>
     * <p>*   ICMP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether to enable the access control policy. By default, an access control policy is enabled after the policy is created. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the access control policy.</p>
     * <p>*   **false**: disables the access control policy.</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The source address in the access control policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   If **SourceType** is set to `net`, the value of this parameter must be a CIDR block.</p>
     * <br>
     * <p>    Example: 10.2.4.0/24</p>
     * <br>
     * <p>*   If **SourceType** is set to `group`, the value of this parameter must be an address book name.</p>
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

    /**
     * <p>The instance ID of the VPC firewall. You can call the [DescribeVpcFirewallAclGroupList](~~159760~~) operation to query the ID.</p>
     * <br>
     * <p>*   If the VPC firewall is used to protect a CEN instance, the value of this parameter must be the ID of the CEN instance.</p>
     * <br>
     * <p>    Example: cen-ervw0g12b5jbw\*\*\*\*</p>
     * <br>
     * <p>*   If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter must be the instance ID of the VPC firewall.</p>
     * <br>
     * <p>    Example: vfw-a42bbb7b887148c9\*\*\*\*</p>
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
