// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>accept</strong>: allows the traffic.</li>
     * <li><strong>drop</strong>: denies the traffic.</li>
     * <li><strong>log</strong>: monitors the traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The UUID of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>303f0697-2a21-4e43-b142-4a77adf7b358</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The page number.</p>
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
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the DestinationType parameter.</p>
     * <ul>
     * <li>If DestinationType is set to <code>net</code>, the value of Destination must be a CIDR block. Example: 10.0.3.0/24.</li>
     * <li>If DestinationType is set to <code>domain</code>, the value of Destination must be a domain name. Example: aliyun.</li>
     * <li>If DestinationType is set to <code>group</code>, the value of Destination must be the name of an address book. Example: db_group.</li>
     * <li>If DestinationType is set to <code>location</code>, the value of Destination is a location. For more information about location codes, see <a href="https://help.aliyun.com/document_detail/474128.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all types of destination addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>x.x.x.x/32</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <ul>
     * <li><strong>out</strong>: outbound traffic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

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
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxxxxx</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
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
     * <p>If you do not specify this parameter, access control policies of all protocol types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ANY</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
     * <li><strong>None</strong>: The policy takes effect only once.</li>
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
     * <p>The source address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the SourceType parameter.</p>
     * <ul>
     * <li>If SourceType is set to <code>net</code>, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.</li>
     * <li>If SourceType is set to <code>group</code>, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.</li>
     * <li>If SourceType is set to <code>location</code>, the value of Source must be a location. Example: beijing.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all types of source addresses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1/32</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribeNatFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallControlPolicyRequest self = new DescribeNatFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeNatFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeNatFirewallControlPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeNatFirewallControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNatFirewallControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeNatFirewallControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeNatFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNatFirewallControlPolicyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeNatFirewallControlPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNatFirewallControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeNatFirewallControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeNatFirewallControlPolicyRequest setRepeatType(String repeatType) {
        this.repeatType = repeatType;
        return this;
    }
    public String getRepeatType() {
        return this.repeatType;
    }

    public DescribeNatFirewallControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
