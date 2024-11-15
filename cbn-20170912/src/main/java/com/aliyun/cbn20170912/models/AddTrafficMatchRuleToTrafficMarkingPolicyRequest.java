// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTrafficMatchRuleToTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <p>The traffic classification rules.</p>
     * <p>You can add at most 50 traffic classification rules in each call.</p>
     */
    @NameInMap("TrafficMatchRules")
    public java.util.List<AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules;

    public static AddTrafficMatchRuleToTrafficMarkingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTrafficMatchRuleToTrafficMarkingPolicyRequest self = new AddTrafficMatchRuleToTrafficMarkingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    public AddTrafficMatchRuleToTrafficMarkingPolicyRequest setTrafficMatchRules(java.util.List<AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules) {
        this.trafficMatchRules = trafficMatchRules;
        return this;
    }
    public java.util.List<AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules> getTrafficMatchRules() {
        return this.trafficMatchRules;
    }

    public static class AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules extends TeaModel {
        /**
         * <p>The address family. You can set the value to IPv4 or IPv6, or leave the value empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block that is used to match packets.</p>
         * <p>Packets whose destination IP addresses fall into the specified destination CIDR block are considered a match. If you do not specify a destination CIDR block, packets are considered a match regardless of the destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Packets whose destination ports fall into the specified destination port range are considered a match. If you do not specify destination port range, packets are considered a match regardless of the destination port.</p>
         * <p>You can specify at most two port numbers for this parameter. Take note of the following rules:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, packets whose destination port is 1 are considered a match. A value of -1 specifies all destination ports.</li>
         * <li>If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 are considered a match.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port must also be -1. In this case, packets are considered a match regardless of the destination port.</li>
         * </ul>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Services Code Point (DSCP) value that is used to match packets. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>Packets that carry the specified DSCP value are considered a match. If you do not specify a DSCP value, packets are considered a match regardless of the DSCP value.</p>
         * <blockquote>
         * <p> The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol that is used to match packets.</p>
         * <p>Traffic classification rules support the following protocols: <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more information, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
         * <p><strong>Some protocols use a specific port. Click to view protocols and ports.</strong></p>
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
         * <li>If the protocol is <strong>Redis</strong>, set the destination port to <strong>6379</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block that is used to match packets.</p>
         * <p>Packets whose source IP addresses fall into the specified source CIDR block are considered a match. If you do not specify a source CIDR block, packets are considered a match regardless of the source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>Packets whose source ports fall into the specified source port range are considered a match. If you do not specify a source port range, packets are considered a match regardless of the source port.</p>
         * <p>You can enter at most two port numbers. Take note of the following rules:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, packets whose source port is 1 are considered a match. A value of -1 specifies all source ports.</li>
         * <li>If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 are considered a match.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, packets are considered a match regardless of the source port.</li>
         * </ul>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>The name is optional. If you enter a name, it must be 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules self = new AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setAddressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }
        public String getAddressFamily() {
            return this.addressFamily;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setDstPortRange(java.util.List<Integer> dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setSrcPortRange(java.util.List<Integer> srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        public AddTrafficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setTrafficMatchRuleName(String trafficMatchRuleName) {
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

    }

}
