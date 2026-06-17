// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddDnsFirewallPolicyRequest extends TeaModel {
    /**
     * <p>Specifies the action to take on traffic that matches the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: Denies the traffic.</p>
     * </li>
     * <li><p><strong>log</strong>: Monitors the traffic.</p>
     * </li>
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
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy.</p>
     * <ul>
     * <li><p>When <strong>DestinationType</strong> is <code>net</code>, this parameter specifies the destination CIDR block. Example: <code>1.2.3.4/24</code>.</p>
     * </li>
     * <li><p>When <strong>DestinationType</strong> is <code>group</code>, this parameter specifies the name of the destination address book. Example: <code>db_group</code>.</p>
     * </li>
     * <li><p>When <strong>DestinationType</strong> is <code>domain</code>, this parameter specifies the destination domain name. Example: <code>*.aliyuncs.com</code>.</p>
     * </li>
     * <li><p>When <strong>DestinationType</strong> is <code>location</code>, this parameter specifies the destination region. For more information about location codes, see the documentation. Example: <code>[&quot;BJ11&quot;, &quot;ZB&quot;]</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <li><p><strong>net</strong>: destination CIDR block</p>
     * </li>
     * <li><p><strong>group</strong>: destination address book</p>
     * </li>
     * <li><p><strong>domain</strong>: destination domain name</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The traffic direction for the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>in</strong>: inbound traffic</p>
     * </li>
     * <li><p><strong>out</strong>: outbound traffic</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The IP version supported by the policy.</p>
     * <p>Valid values:</p>
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
     * <p>The language of the request and response. Valid values:<br>-<strong>zh</strong>: Chinese<br>-<strong>en</strong>: English<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priority of the access control policy. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>Specifies whether to enable the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables the access control policy.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables the access control policy.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The source address in the access control policy.</p>
     * <ul>
     * <li><p>When <strong>SourceType</strong> is <code>net</code>, this parameter specifies the source CIDR block. Example: <code>10.2.XX.XX/24</code>.</p>
     * </li>
     * <li><p>When <strong>SourceType</strong> is <code>group</code>, this parameter specifies the name of the source address book. Example: <code>db_group</code>.</p>
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
