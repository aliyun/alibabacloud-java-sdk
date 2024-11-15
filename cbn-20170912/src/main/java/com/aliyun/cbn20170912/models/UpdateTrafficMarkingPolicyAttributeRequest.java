// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeRequest extends TeaModel {
    /**
     * <p>The traffic classification rules to be added to the traffic marking policy.</p>
     * <p>You can add at most 50 traffic classification rules in each call.</p>
     */
    @NameInMap("AddTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules> addTrafficMatchRules;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The traffic classification rules to be deleted from the traffic marking policy.</p>
     * <blockquote>
     * <p> Specify detailed information about the traffic classification rule, such as the source CIDR block, destination CIDR block, source port, destination port, and DSCP value. If you do not specify sufficient information, the system may fail to match the traffic classification rule that you want to delete.</p>
     * </blockquote>
     */
    @NameInMap("DeleteTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules> deleteTrafficMatchRules;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: preforms a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new description of the traffic marking policy.</p>
     * <p>The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TrafficMarkingPolicyDescription")
    public String trafficMarkingPolicyDescription;

    /**
     * <p>The ID of the traffic marking policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tm-u9nxup5kww5po8****</p>
     */
    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    /**
     * <p>The new name of the traffic marking policy.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficMarkingPolicyName")
    public String trafficMarkingPolicyName;

    public static UpdateTrafficMarkingPolicyAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMarkingPolicyAttributeRequest self = new UpdateTrafficMarkingPolicyAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setAddTrafficMatchRules(java.util.List<UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules> addTrafficMatchRules) {
        this.addTrafficMatchRules = addTrafficMatchRules;
        return this;
    }
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules> getAddTrafficMatchRules() {
        return this.addTrafficMatchRules;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setDeleteTrafficMatchRules(java.util.List<UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules> deleteTrafficMatchRules) {
        this.deleteTrafficMatchRules = deleteTrafficMatchRules;
        return this;
    }
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules> getDeleteTrafficMatchRules() {
        return this.deleteTrafficMatchRules;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setTrafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
        this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
        return this;
    }
    public String getTrafficMarkingPolicyDescription() {
        return this.trafficMarkingPolicyDescription;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    public UpdateTrafficMarkingPolicyAttributeRequest setTrafficMarkingPolicyName(String trafficMarkingPolicyName) {
        this.trafficMarkingPolicyName = trafficMarkingPolicyName;
        return this;
    }
    public String getTrafficMarkingPolicyName() {
        return this.trafficMarkingPolicyName;
    }

    public static class UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules extends TeaModel {
        /**
         * <p>The address family. Valid values: You can set the value to IPv4 or IPv6, or leave the value empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
         * <p>Packets whose destination IP addresses fall into the specified destination CIDR block meet the traffic classification rule. If you do not specify a destination CIDR block, all packets meet the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination CIDR block for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>172.30.0.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Packets whose destination ports fall within the specified destination port range are considered a match. If you do not specify a destination port range, packets are considered a match regardless of the destination port.</p>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, packets whose destination port is 1 match the traffic classification rule. A value of -1 specifies all destination ports.</li>
         * <li>If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 are considered a match.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</li>
         * </ul>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination port range for each traffic classification rule.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Service Code Point (DSCP) value that is used to match packets. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>Requests that carry the specified DSCP value are considered a match. If you do not specify a DSCP value, packets are considered a match regardless of the DSCP value.</p>
         * <blockquote>
         * <p> The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.</p>
         * </blockquote>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a DSCP value for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol that is used to match packets.</p>
         * <p>Traffic classification rules support the following protocols: <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more information, log on to the <a href="https://cen.console.aliyun.com/cen/list">CEN console</a>.</p>
         * <p><strong>Some protocols use a fixed port. Click to view the protocols and ports.</strong></p>
         * <ul>
         * <li>If the protocol is <strong>ICMP</strong>, set the destination port to <strong>-1</strong>.</li>
         * <li>If the protocol is <strong>GRE</strong>, set the destination port to <strong>-1</strong>.</li>
         * <li>If the protocol is <strong>SSH</strong>, set the destination port to <strong>22</strong>.</li>
         * <li>If the protocol is <strong>Telnet</strong>, set the destination port to <strong>23</strong>.</li>
         * <li>If the protocol is <strong>HTTP</strong>, set the destination port to <strong>80</strong>.</li>
         * <li>If the protocol is <strong>HTTPS</strong>, set the destination port to <strong>443</strong>.</li>
         * <li>If the protocol is <strong>MS SQL</strong>, set the destination port to <strong>1443</strong>.</li>
         * <li>If the protocol is <strong>Oracle</strong>, set the destination port to <strong>1521</strong>.</li>
         * <li>If the protocol is <strong>Mysql</strong>, set the destination port to <strong>3306</strong>.</li>
         * <li>If the protocol is <strong>RDP</strong>, set the destination port to <strong>3389</strong>.</li>
         * <li>If the protocol is <strong>Postgre SQL</strong>, set the destination port to <strong>5432</strong>.</li>
         * <li>If the protocol is <strong>Redis</strong>, the destination port must be <strong>6379</strong>.</li>
         * </ul>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
         * <p>Packets whose source IP addresses fall into the specified source CIDR block meet the traffic classification rule. If you do not specify a source CIDR block, all packets meet the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.128.32.0/19</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches the packets whose source ports fall within the source port range. If you do not specify this parameter, packets are considered a match regardless of the source port.</p>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, packets whose source port is 1 are considered a match. A value of -1 specifies all source ports.</li>
         * <li>If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 are considered a match.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</li>
         * </ul>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a source port range for each traffic classification rule.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a description for each traffic classification rule.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a name for each traffic classification rule.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Guangzhou Testing</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules self = new UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setDstPortRange(java.util.List<Integer> dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setSrcPortRange(java.util.List<Integer> srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules setTrafficMatchRuleName(String trafficMatchRuleName) {
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

    }

    public static class UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules extends TeaModel {
        /**
         * <p>The address family. Valid values: You can set the value to IPv4 or IPv6, or leave the value empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv6</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.200.3/32</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range that is used to match packets.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The DSCP value that is used to match packets.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol that is used to match packets.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/468322.html">ListTrafficMarkingPolicies</a> operation to query the details about a traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.72.0.0/16</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range that is used to match packets.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou-to-Qingdao CAT</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules self = new UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setDstPortRange(java.util.List<Integer> dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setSrcPortRange(java.util.List<Integer> srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        public UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules setTrafficMatchRuleName(String trafficMatchRuleName) {
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

    }

}
