// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The differentiated services code point (DSCP) value to be added to packets that match the traffic classification rule. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
     * <p>The DSCP value of each traffic marking policy on a transit router must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MarkingDscp")
    public Integer markingDscp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority value of the traffic marking policy. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>The priority value of each traffic marking policy on a transit router must be unique. A smaller value specifies a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The description of the traffic marking policy.</p>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TrafficMarkingPolicyDescription")
    public String trafficMarkingPolicyDescription;

    /**
     * <p>The name of the traffic marking policy.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficMarkingPolicyName")
    public String trafficMarkingPolicyName;

    /**
     * <p>The traffic classification rules in the traffic marking policy.</p>
     * <p>Data packets that meet the traffic classification rule is assigned the DSCP value of quality of service (QoS) policy.</p>
     * <p>You can create up to 50 traffic classification rules.</p>
     */
    @NameInMap("TrafficMatchRules")
    public java.util.List<CreateTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules;

    /**
     * <p>The ID of the transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-8vbuqeo5h5pu3m01d****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTrafficMarkingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMarkingPolicyRequest self = new CreateTrafficMarkingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMarkingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrafficMarkingPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTrafficMarkingPolicyRequest setMarkingDscp(Integer markingDscp) {
        this.markingDscp = markingDscp;
        return this;
    }
    public Integer getMarkingDscp() {
        return this.markingDscp;
    }

    public CreateTrafficMarkingPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTrafficMarkingPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTrafficMarkingPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTrafficMarkingPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTrafficMarkingPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTrafficMarkingPolicyRequest setTrafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
        this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
        return this;
    }
    public String getTrafficMarkingPolicyDescription() {
        return this.trafficMarkingPolicyDescription;
    }

    public CreateTrafficMarkingPolicyRequest setTrafficMarkingPolicyName(String trafficMarkingPolicyName) {
        this.trafficMarkingPolicyName = trafficMarkingPolicyName;
        return this;
    }
    public String getTrafficMarkingPolicyName() {
        return this.trafficMarkingPolicyName;
    }

    public CreateTrafficMarkingPolicyRequest setTrafficMatchRules(java.util.List<CreateTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules) {
        this.trafficMatchRules = trafficMatchRules;
        return this;
    }
    public java.util.List<CreateTrafficMarkingPolicyRequestTrafficMatchRules> getTrafficMatchRules() {
        return this.trafficMatchRules;
    }

    public CreateTrafficMarkingPolicyRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class CreateTrafficMarkingPolicyRequestTrafficMatchRules extends TeaModel {
        /**
         * <p>The address family. You can set the value to IPv4 or IPv6, or leave the value empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
         * <p>Packets whose destination IP addresses fall into the specified destination CIDR block meet the traffic classification rule. If you do not specify a destination CIDR block, all packets meet the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call You can specify a destination CIDR block for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Packets whose destination ports fall within the destination port range meet the traffic classification rule. If you do not specify destination port range, all packets meet the traffic classification rule.</p>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, packets whose destination port is 1 meet the traffic classification rule. A value of -1 specifies all destination ports.</li>
         * <li>If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 meet the traffic classification rule.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</li>
         * </ul>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination port range for each traffic classification rule.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Service Code Point (DSCP) value that is used to match packets. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>Packets that carry the specified DSCP value meet the traffic classification rule. If you do not specify a DSCP value, all packets meet the traffic classification rule.</p>
         * <blockquote>
         * <p> The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.</p>
         * </blockquote>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a DSCP value for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol that is used to match packets.</p>
         * <p>Traffic classification rules support the following protocols: <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more information, log on to the <a href="https://cen.console.aliyun.com/cen/list">CEN console</a>.</p>
         * <p><strong>Some protocols use a fixed port. Click to view the protocols and ports.</strong></p>
         * <ul>
         * <li>If the protocol is <strong>ICMP</strong>, the destination port must be <strong>-1</strong>.</li>
         * <li>If the protocol is <strong>GRE</strong>, the destination port must be <strong>1</strong>.</li>
         * <li>If the protocol is <strong>SSH</strong>, the destination port must be <strong>22</strong>.</li>
         * <li>If the protocol is <strong>Telnet</strong>, the destination port must be <strong>23</strong>.</li>
         * <li>If the protocol is <strong>HTTP</strong>, the destination port must be <strong>80</strong>.</li>
         * <li>If the protocol is <strong>HTTPS</strong>, the destination port must be <strong>443</strong>.</li>
         * <li>If the protocol is <strong>MS SQL</strong>, the destination port must be <strong>1443</strong>.</li>
         * <li>If the protocol is <strong>Oracle</strong>, the destination port must be <strong>1521</strong>.</li>
         * <li>If the protocol is <strong>Mysql</strong>, the destination port must be <strong>3306</strong>.</li>
         * <li>If the protocol is <strong>RDP</strong>, the destination port must be <strong>3389</strong>.</li>
         * <li>If the protocol is <strong>Postgre SQL</strong>, the destination port must be <strong>5432</strong>.</li>
         * <li>If the protocol is <strong>Redis</strong>, the destination port must be <strong>6379</strong>.</li>
         * </ul>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of packets. IPv6 and IPv4 addresses are supported.</p>
         * <p>Packets whose source IP addresses fall into the specified source CIDR block meet the traffic classification rule. If you do not specify a source CIDR block, all packets meet the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Packets whose source ports fall within the source port range meet the traffic classification rule. If you do not specify a source port range, all packets meet the traffic classification rule.</p>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, packets whose source port is 1 meet the traffic classification rule. A value of -1 specifies all source ports.</li>
         * <li>If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 meet the traffic classification rule.</li>
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
         * <p>desctest</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a name for each traffic classification rule.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static CreateTrafficMarkingPolicyRequestTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMarkingPolicyRequestTrafficMatchRules self = new CreateTrafficMarkingPolicyRequestTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setDstPortRange(java.util.List<Integer> dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setSrcPortRange(java.util.List<Integer> srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        public CreateTrafficMarkingPolicyRequestTrafficMatchRules setTrafficMatchRuleName(String trafficMatchRuleName) {
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

    }

}
