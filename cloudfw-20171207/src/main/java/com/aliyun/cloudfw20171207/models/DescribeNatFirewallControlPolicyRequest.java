// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The action that Cloud Firewall performs on the traffic.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **accept**: allows the traffic.</p>
     * <p>*   **drop**: denies the traffic.</p>
     * <p>*   **log**: monitors the traffic.</p>
     */
    @NameInMap("AclAction")
    public String aclAction;

    /**
     * <p>The UUID of the access control policy.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The description of the access control policy. Fuzzy match is supported.</p>
     * <br>
     * <p>> If you do not specify this parameter, the descriptions of all policies are queried.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the DestinationType parameter.</p>
     * <br>
     * <p>*   If DestinationType is set to `net`, the value of Destination must be a CIDR block. Example: 10.0.3.0/24.</p>
     * <p>*   If DestinationType is set to `domain`, the value of Destination must be a domain name. Example: aliyun.</p>
     * <p>*   If DestinationType is set to `group`, the value of Destination must be the name of an address book. Example: db_group.</p>
     * <p>*   If DestinationType is set to `location`, the value of Destination is a location. For more information about location codes, see [AddControlPolicy](~~474128~~). Example: \["BJ11", "ZB"].</p>
     * <br>
     * <p>> If you do not specify this parameter, all types of destination addresses are queried.</p>
     */
    @NameInMap("Destination")
    public String destination;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <br>
     * <p>*   **out**: outbound traffic</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The type of the protocol in the access control policy. Valid values:</p>
     * <br>
     * <p>*   **TCP**</p>
     * <p>*   **UDP**</p>
     * <p>*   **ICMP**</p>
     * <p>*   **ANY**: all types of protocols</p>
     * <br>
     * <p>> If you do not specify this parameter, access control policies of all protocol types are queried.</p>
     */
    @NameInMap("Proto")
    public String proto;

    /**
     * <p>Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The recurrence type for the access control policy to take effect. Valid values:</p>
     * <br>
     * <p>*   **Permanent** (default): The policy always takes effect.</p>
     * <p>*   **None**: The policy takes effect for only once.</p>
     * <p>*   **Daily**: The policy takes effect on a daily basis.</p>
     * <p>*   **Weekly**: The policy takes effect on a weekly basis.</p>
     * <p>*   **Monthly**: The policy takes effect on a monthly basis.</p>
     */
    @NameInMap("RepeatType")
    public String repeatType;

    /**
     * <p>The source address in the access control policy. Fuzzy match is supported. The value of this parameter varies based on the value of the SourceType parameter.</p>
     * <br>
     * <p>*   If SourceType is set to `net`, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.</p>
     * <p>*   If SourceType is set to `group`, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.</p>
     * <p>*   If SourceType is set to `location`, the value of Source must be a location. Example: beijing.</p>
     * <br>
     * <p>> If you do not specify this parameter, all types of source addresses are queried.</p>
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
