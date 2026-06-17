// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDnsFirewallPolicyRequest extends TeaModel {
    /**
     * <p>The action that is performed on traffic that hits the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allow</p>
     * </li>
     * <li><p><strong>drop</strong>: Deny</p>
     * </li>
     * <li><p><strong>log</strong>: Monitor</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df22****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The description of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy.</p>
     * <ul>
     * <li><p>If <strong>DestinationType</strong> is set to net, <strong>Destination</strong> specifies the destination CIDR block. For example: 1.2.3.4/24</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to group, <strong>Destination</strong> specifies the name of the destination address book. For example: db_group</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to domain, <strong>Destination</strong> specifies the destination domain name. For example: \*.aliyuncs.com</p>
     * </li>
     * <li><p>If <strong>DestinationType</strong> is set to location, <strong>Destination</strong> specifies the destination region. For more information about the location codes, see the following description. For example: [&quot;BJ11&quot;, &quot;ZB&quot;]</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db_group</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the access control policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: destination CIDR block (CIDR address)</p>
     * </li>
     * <li><p><strong>group</strong>: destination address book</p>
     * </li>
     * <li><p><strong>domain</strong>: destination domain name</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The language of the content within the request and response. Valid values:-<strong>zh</strong>: Chinese-<strong>en</strong>: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priority of the access control policy before the modification.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The status of the access control policy. By default, the policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the access control policy.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the access control policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: source CIDR block (CIDR)</p>
     * </li>
     * <li><p><strong>group</strong>: source address book</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ModifyDnsFirewallPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDnsFirewallPolicyRequest self = new ModifyDnsFirewallPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDnsFirewallPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public ModifyDnsFirewallPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ModifyDnsFirewallPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDnsFirewallPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ModifyDnsFirewallPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ModifyDnsFirewallPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDnsFirewallPolicyRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifyDnsFirewallPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public ModifyDnsFirewallPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ModifyDnsFirewallPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyDnsFirewallPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
