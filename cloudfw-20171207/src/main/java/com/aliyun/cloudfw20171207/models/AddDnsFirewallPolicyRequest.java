// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddDnsFirewallPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: Allow.</li>
     * <li><strong>drop</strong>: Deny.</li>
     * <li><strong>log</strong>: Monitor.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The description of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Allow specified domain names</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy.</p>
     * <ul>
     * <li>If <strong>DestinationType</strong> is set to net, <strong>Destination</strong> is a destination CIDR block. Example: 1.2.3.4/24.</li>
     * <li>If <strong>DestinationType</strong> is set to group, <strong>Destination</strong> is a destination address book name. Example: db_group.</li>
     * <li>If <strong>DestinationType</strong> is set to domain, <strong>Destination</strong> is a destination domain name. Example: *.aliyuncs.com.</li>
     * <li>If <strong>DestinationType</strong> is set to location, <strong>Destination</strong> is a destination area (see the area positional encoding below). Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db_group</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The type of the destination address in the DNS firewall access control policy. Only group (destination address book) and domain (destination domain name) are supported. net and CIDR addresses are not applicable to this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The traffic direction of the DNS firewall access control policy.</p>
     * <blockquote>
     * <p>This parameter is not validated on the backend. When you create or modify a DNS firewall policy, the direction is always stored as <strong>out</strong> (outbound). Passing <strong>in</strong> does not cause an error or take effect. The DNS firewall supports only outbound policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The IP address version. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: IPv4</p>
     * </li>
     * <li><p><strong>6</strong>: IPv6</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

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
     * <p>The policy priority of the DNS firewall policy. Valid values: 1 to 20000. A smaller value indicates a higher policy priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The enabled status of the access control policy. The policy is enabled by default after creation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable the access control policy.</li>
     * <li><strong>false</strong>: Disable the access control policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p>If <strong>SourceType</strong> is set to <code>net</code>, Source is a source CIDR block. Example: 10.2.XX.XX/24.</p>
     * </li>
     * <li><p>If <strong>SourceType</strong> is set to <code>group</code>, Source is a source address book name. Example: db_group.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.223/32</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>140.205.118.97</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the source address in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>net</strong>: source CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: source address book</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>net</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static AddDnsFirewallPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsFirewallPolicyRequest self = new AddDnsFirewallPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsFirewallPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public AddDnsFirewallPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddDnsFirewallPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public AddDnsFirewallPolicyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public AddDnsFirewallPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public AddDnsFirewallPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AddDnsFirewallPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDnsFirewallPolicyRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AddDnsFirewallPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public AddDnsFirewallPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddDnsFirewallPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddDnsFirewallPolicyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
