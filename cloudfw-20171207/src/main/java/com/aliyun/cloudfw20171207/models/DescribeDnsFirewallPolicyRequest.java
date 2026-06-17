// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDnsFirewallPolicyRequest extends TeaModel {
    /**
     * <p>The action that is performed on traffic that hits the DNS firewall policy. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: denies the traffic.</p>
     * </li>
     * <li><p><strong>log</strong>: monitors the traffic.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, policies of all action types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the firewall rule.</p>
     * 
     * <strong>example:</strong>
     * <p>b6c8f905-2eb6-442a-ba35-9416e****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The page number to return. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the DNS firewall policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the DNS firewall policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>The value of Destination can be a CIDR block, a domain name, or an address book.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.2.XX.XX/24</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The IP version that is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: IPv4</p>
     * </li>
     * <li><p><strong>6</strong>: IPv6</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the response messages. Valid values: <strong>zh</strong> (Chinese) and <strong>en</strong> (English).</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The status of the access control policy. The policy is enabled by default after it is created. Valid values:</p>
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

    /**
     * <p>The source address in the DNS firewall policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>The value of Source can be a CIDR block or an address book.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/24</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>140.205.118.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDnsFirewallPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsFirewallPolicyRequest self = new DescribeDnsFirewallPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsFirewallPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeDnsFirewallPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeDnsFirewallPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDnsFirewallPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDnsFirewallPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeDnsFirewallPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeDnsFirewallPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsFirewallPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsFirewallPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeDnsFirewallPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeDnsFirewallPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
