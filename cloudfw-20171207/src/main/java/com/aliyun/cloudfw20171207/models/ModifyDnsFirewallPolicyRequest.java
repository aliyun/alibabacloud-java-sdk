// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDnsFirewallPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: Allow.</li>
     * <li><strong>drop</strong>: Deny.</li>
     * <li><strong>log</strong>: Monitor.</li>
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
     * <li>If <strong>DestinationType</strong> is set to net, <strong>Destination</strong> is a destination CIDR block. Example: 1.2.3.4/24.</li>
     * <li>If <strong>DestinationType</strong> is set to group, <strong>Destination</strong> is a destination address book name. Example: db_group.</li>
     * <li>If <strong>DestinationType</strong> is set to domain, <strong>Destination</strong> is a destination domain name. Example: *.aliyuncs.com.</li>
     * <li>If <strong>DestinationType</strong> is set to location, <strong>Destination</strong> is a destination area. For specific area positional encoding values, see the subsequent sections. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
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
     * <li><strong>net</strong>: destination CIDR block.</li>
     * <li><strong>group</strong>: destination address book.</li>
     * <li><strong>domain</strong>: destination domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The policy priority of the access control policy before the modification.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The enabled status of the access control policy. The policy is enabled by default after it is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable the access control policy.</li>
     * <li><strong>false</strong>: Disable the access control policy.</li>
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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: source CIDR block.</p>
     * </li>
     * <li><p><strong>group</strong>: source address book.</p>
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
