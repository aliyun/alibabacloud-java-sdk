// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allow</p>
     * </li>
     * <li><p><strong>drop</strong>: Deny</p>
     * </li>
     * <li><p><strong>log</strong>: Monitor</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all action types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The number of the page to return.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the access control policy. Fuzzy queries are supported.</p>
     * <blockquote>
     * <p>If you do not set this parameter, the descriptions of all policies are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy queries are supported. The value of this parameter varies based on the value of the \<code>DestinationType\\</code> parameter.</p>
     * <ul>
     * <li><p>If \<code>DestinationType\\</code> is \<code>net\\</code>, the value of this parameter is a CIDR block. Example: 10.0.3.0/24.</p>
     * </li>
     * <li><p>If \<code>DestinationType\\</code> is \<code>domain\\</code>, the value of this parameter is a domain name. Example: aliyun.</p>
     * </li>
     * <li><p>If \<code>DestinationType\\</code> is \<code>group\\</code>, the value of this parameter is the name of an address book. Example: db_group.</p>
     * </li>
     * <li><p>If \<code>DestinationType\\</code> is \<code>location\\</code>, the value of this parameter is a region name. For more information about region codes, see AddControlPolicy. Example: \<code>[&quot;BJ11&quot;, &quot;ZB&quot;]\\</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all types of destination addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The traffic direction that the access control policy controls. Valid values:</p>
     * <ul>
     * <li><p><strong>in</strong>: Inbound traffic from an external source to an internal destination.</p>
     * </li>
     * <li><p><strong>out</strong>: Outbound traffic from an internal source to an external destination.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The IP version supported. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong> (default): IPv4 address</p>
     * </li>
     * <li><p><strong>6</strong>: IPv6 address</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
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
     * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>TCP</strong></p>
     * </li>
     * <li><p><strong>UDP</strong></p>
     * </li>
     * <li><p><strong>ICMP</strong></p>
     * </li>
     * <li><p><strong>ANY</strong> (all protocol types)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all protocol types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>The status of the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The access control policy is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: The access control policy is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The recurrence type for the policy validity period of the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Permanent</strong> (default): Always</p>
     * </li>
     * <li><p><strong>None</strong>: One-time</p>
     * </li>
     * <li><p><strong>Daily</strong>: Daily</p>
     * </li>
     * <li><p><strong>Weekly</strong>: Weekly</p>
     * </li>
     * <li><p><strong>Monthly</strong>: Monthly</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy queries are supported. The value of this parameter varies based on the value of the \<code>SourceType\\</code> parameter.</p>
     * <ul>
     * <li><p>If \<code>SourceType\\</code> is \<code>net\\</code>, the value of this parameter is a CIDR block. Example: 192.0.XX.XX/24.</p>
     * </li>
     * <li><p>If \<code>SourceType\\</code> is \<code>group\\</code>, the value of this parameter is the name of a source address book. Example: \<code>db_group\\</code>. If you leave this parameter empty, all source addresses are queried.</p>
     * </li>
     * <li><p>If \<code>SourceType\\</code> is \<code>location\\</code>, the value of this parameter is a source region. Example: \<code>Beijing\\</code> or \<code>beijing\\</code>. You can use either the Chinese name or the English name for the query.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, all types of source addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribeControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyRequest self = new DescribeControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeControlPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeControlPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeControlPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public DescribeControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
