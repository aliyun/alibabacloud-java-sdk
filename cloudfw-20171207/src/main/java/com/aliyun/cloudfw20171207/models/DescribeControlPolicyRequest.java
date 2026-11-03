// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic that matches the access control policy. Valid values:</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allow</p>
     * </li>
     * <li><p><strong>drop</strong>: Deny</p>
     * </li>
     * <li><p><strong>log</strong>: Monitor</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all action types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The unique ID of the access control policy. You must specify at least one of AclUuid and Direction. If you specify AclUuid, you can query the policy by its ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The page number of the current page returned for a paged query during paging.</p>
     * <p>Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the access control policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the descriptions of all policies are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Allow access to the office CIDR block</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy match is supported. The value of Destination varies based on the destination type (DestinationType).</p>
     * <ul>
     * <li><p>If DestinationType is set to <code>net</code>, the destination address is a CIDR block. Example: 10.0.3.0/24.</p>
     * </li>
     * <li><p>If DestinationType is set to <code>domain</code>, the destination address is a domain name. Example: aliyun.</p>
     * </li>
     * <li><p>If DestinationType is set to <code>group</code>, the destination address is the name of an address book. Example: db_group.</p>
     * </li>
     * <li><p>If DestinationType is set to <code>location</code>, the destination address is an area name. For more information about the area positional encoding, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter in the Settings, all types of destination addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The traffic direction controlled by the access control policy. Valid values: in (inbound) and out (outbound). You must specify at least one of Direction and AclUuid. If AclUuid is not specified, you must specify a non-empty Direction. Otherwise, ErrorParametersDirection is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The IP address version. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong> (default): IPv4</p>
     * </li>
     * <li><p><strong>6</strong>: IPv6</p>
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
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page for a paged query during paging.</p>
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
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong></li>
     * <li><strong>ANY</strong> (all protocol types)<blockquote>
     * <p>If you do not specify this parameter, all protocol types are queried.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. Valid values:</p>
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
     * <p>The recurrence type of the Policy Validity Period for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong> (default): Always</li>
     * <li><strong>None</strong>: One-time</li>
     * <li><strong>Daily</strong>: Daily</li>
     * <li><strong>Weekly</strong>: Weekly</li>
     * <li><strong>Monthly</strong>: Monthly</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy match is supported. The value of Source varies based on the value of SourceType.</p>
     * <ul>
     * <li><p>If SourceType is set to <code>net</code>, the source address is a CIDR block. Example: 192.0.XX.XX/24.</p>
     * </li>
     * <li><p>If SourceType is set to <code>group</code>, the source address is the name of a source address book. Example: db_group. If this parameter is left empty, all access sources are queried.</p>
     * </li>
     * <li><p>If SourceType is set to <code>location</code>, the source address is a source region. Example: Beijing or beijing. Both Chinese and English region names are supported.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all types of access sources are queried.</p>
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
