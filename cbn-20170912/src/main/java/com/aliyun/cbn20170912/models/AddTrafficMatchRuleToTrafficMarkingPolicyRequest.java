// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTrafficMatchRuleToTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, traffic classification rules are added to the traffic marking policy.</li>
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
     * <p>The list of traffic classification rules.</p>
     * <p>You can add up to 50 traffic classification rules at a time.</p>
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
         * <p>The address type. Valid values: IPv4, IPv6, or empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of the traffic packet.</p>
         * <p>The traffic classification rule matches traffic whose destination IP address falls within the destination CIDR block. If you do not specify this parameter, the traffic classification rule matches traffic with any destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches traffic whose destination port falls within the destination port range. If you do not specify this parameter, the traffic classification rule matches traffic with any destination port.</p>
         * <p>You can specify up to 2 port numbers for this parameter. The input format is described as follows:</p>
         * <ul>
         * <li>If you specify only one port number, for example, 1, the system matches traffic whose destination port is 1. If the value is -1, the system matches traffic with any destination port.</li>
         * <li>If you specify two port numbers, for example, 1 and 200, the system matches traffic whose destination port is in the range of 1 to 200.</li>
         * <li>If you specify two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any destination port is matched.</li>
         * </ul>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Services Code Point (DSCP) value of the traffic packet. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>The traffic classification rule matches traffic that contains the specified DSCP value. If you do not specify this parameter, the traffic classification rule matches traffic with any DSCP value.</p>
         * <blockquote>
         * <p>The DSCP value refers to the DSCP value that the traffic packet already carries before it enters the inter-region connection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol type of the traffic packet.</p>
         * <p>The traffic classification rule supports matching traffic of multiple protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
         * <details>
         * <summary>Some protocols have fixed ports. Click to view port details.</summary>
         * 
         * <ul>
         * <li>If the protocol type is <strong>ICMP</strong>, the destination port must be set to <strong>-1</strong>.</li>
         * <li>If the protocol type is <strong>GRE</strong>, the destination port must be set to <strong>-1</strong>.</li>
         * <li>If the protocol type is <strong>SSH</strong>, the destination port must be set to <strong>22</strong>.</li>
         * <li>If the protocol type is <strong>Telnet</strong>, the destination port must be set to <strong>23</strong>.</li>
         * <li>If the protocol type is <strong>HTTP</strong>, the destination port must be set to <strong>80</strong>.</li>
         * <li>If the protocol type is <strong>HTTPS</strong>, the destination port must be set to <strong>443</strong>.</li>
         * <li>If the protocol type is <strong>MS SQL</strong>, the destination port must be set to <strong>1443</strong>.</li>
         * <li>If the protocol type is <strong>Oracle</strong>, the destination port must be set to <strong>1521</strong>.</li>
         * <li>If the protocol type is <strong>Mysql</strong>, the destination port must be set to <strong>3306</strong>.</li>
         * <li>If the protocol type is <strong>RDP</strong>, the destination port must be set to <strong>3389</strong>.</li>
         * <li>If the protocol type is <strong>Postgre SQL</strong>, the destination port must be set to <strong>5432</strong>.</li>
         * <li>If the protocol type is <strong>Redis</strong>, the destination port must be set to <strong>6379</strong>.</li>
         * </ul>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the traffic packet.</p>
         * <p>The traffic classification rule matches traffic whose source IP address falls within the source CIDR block. If you do not specify this parameter, the traffic classification rule matches traffic with any source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches traffic whose source port falls within the source port range. If you do not specify this parameter, the traffic classification rule matches traffic with any source port.</p>
         * <p>You can specify up to two port numbers for this parameter. The input format is described as follows:</p>
         * <ul>
         * <li>If you specify only one port number, for example, 1, the system matches traffic whose source port is 1. If the value is -1, the system matches traffic with any source port.</li>
         * <li>If you specify two port numbers, for example, 1 and 200, the system matches traffic whose source port is in the range of 1 to 200.</li>
         * <li>If you specify two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any source port is matched.</li>
         * </ul>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
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
