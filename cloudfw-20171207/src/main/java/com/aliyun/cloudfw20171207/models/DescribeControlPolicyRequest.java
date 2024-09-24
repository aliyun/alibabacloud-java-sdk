// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows the traffic.</li>
     * <li><strong>drop</strong>: denies the traffic.</li>
     * <li><strong>log</strong>: monitors the traffic.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, access control policies of all action types are queried.</p>
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
     * <p>The description of the access control policy. Fuzzy match is supported.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, access control policies that have descriptions are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the DestinationType parameter.</p>
     * <ul>
     * <li>If you set DestinationType to <code>net</code>, the value of Destination is a CIDR block. Example: 10.0.3.0/24.</li>
     * <li>If you set DestinationType to <code>domain</code>, the value of Destination is a domain name. Example: aliyun.</li>
     * <li>If you set DestinationType to <code>group</code>, the value of Destination is the name of an address book. Example: db_group.</li>
     * <li>If you set DestinationType to <code>location</code>, the value of Destination is the name of a location. For more information about location codes, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, access control policies of all destination address types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The direction of the traffic to which the access control policies apply. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound.</li>
     * <li><strong>out</strong>: outbound.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The IP version of the address in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>4</strong>: IPv4 (default)</li>
     * <li><strong>6</strong>: IPv6</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
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
     * <p>The type of the protocol in the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * <li><strong>ICMP</strong></li>
     * <li><strong>ANY</strong>: all types of protocols</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, access control policies of all protocol types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The access control policy is enabled.</li>
     * <li><strong>false</strong>: The access control policy is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
     * <ul>
     * <li><strong>Permanent</strong> (default): The policy always takes effect.</li>
     * <li><strong>None</strong>: The policy takes effect for only once.</li>
     * <li><strong>Daily</strong>: The policy takes effect on a daily basis.</li>
     * <li><strong>Weekly</strong>: The policy takes effect on a weekly basis.</li>
     * <li><strong>Monthly</strong>: The policy takes effect on a monthly basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Permanent</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy match is supported. The value of this parameter depends on the value of the SourceType parameter.</p>
     * <ul>
     * <li>If SourceType is set to <code>net</code>, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.</li>
     * <li>If SourceType is set to <code>group</code>, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.</li>
     * <li>If SourceType is set to <code>location</code>, the value of Source must be a location. Example: beijing.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, access control policies of all source address types are queried.</p>
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
