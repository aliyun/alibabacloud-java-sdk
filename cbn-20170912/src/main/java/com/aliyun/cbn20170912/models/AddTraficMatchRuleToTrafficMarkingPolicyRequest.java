// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AddTraficMatchRuleToTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId value as the client token. The RequestId value may be different for each API request.</p>
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
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions without adding a traffic classification rule to the traffic marking policy. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs the actual request. After the check passes, a traffic classification rule is directly added to the traffic marking policy.</li>
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
    public java.util.List<AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules;

    public static AddTraficMatchRuleToTrafficMarkingPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTraficMatchRuleToTrafficMarkingPolicyRequest self = new AddTraficMatchRuleToTrafficMarkingPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
        this.trafficMarkingPolicyId = trafficMarkingPolicyId;
        return this;
    }
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyRequest setTrafficMatchRules(java.util.List<AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules) {
        this.trafficMatchRules = trafficMatchRules;
        return this;
    }
    public java.util.List<AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules> getTrafficMatchRules() {
        return this.trafficMatchRules;
    }

    public static class AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules extends TeaModel {
        /**
         * <p>The destination CIDR block of the traffic packet.</p>
         * <p>The traffic classification rule matches traffic whose destination IP address falls within the destination CIDR block. If you do not set this parameter, the traffic classification rule matches traffic with any destination IP address.</p>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches traffic whose destination port number falls within the destination port range. If you do not set this parameter, the traffic classification rule matches traffic with any destination port number.</p>
         * <p>This parameter supports up to two port numbers. The input format is described as follows:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, the system matches traffic whose destination port is 1 by default.</li>
         * <li>If you enter two port numbers, such as 1 and 200, the system matches traffic whose destination port falls within the range of 1 to 200 by default.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any destination port is matched.</li>
         * </ul>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Services Code Point (DSCP) value of the traffic packet. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>The traffic classification rule matches traffic that contains the specified DSCP value. If you do not set this parameter, the traffic classification rule matches traffic with any DSCP value.</p>
         * <blockquote>
         * <p>The DSCP value refers to the DSCP value that the traffic packet already carries before entering the inter-region connection.</p>
         * </blockquote>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol type of the traffic packet.</p>
         * <p>The traffic classification rule supports matching traffic of multiple protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the traffic packet.</p>
         * <p>The traffic classification rule matches traffic whose source IP address falls within the source CIDR block. If you do not set this parameter, the traffic classification rule matches traffic with any source IP address.</p>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches traffic whose source port number falls within the source port range. If you do not set this parameter, the traffic classification rule matches traffic with any source port number.</p>
         * <p>This parameter supports up to two port numbers. The input format is described as follows:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, the system matches traffic whose source port is 1 by default.</li>
         * <li>If you enter two port numbers, such as 1 and 200, the system matches traffic whose source port falls within the range of 1 to 200 by default.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any source port is matched.</li>
         * </ul>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules self = new AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules();
            return TeaModel.build(map, self);
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setDstPortRange(java.util.List<Integer> dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setSrcPortRange(java.util.List<Integer> srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
            this.trafficMatchRuleDescription = trafficMatchRuleDescription;
            return this;
        }
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyRequestTrafficMatchRules setTrafficMatchRuleName(String trafficMatchRuleName) {
            this.trafficMatchRuleName = trafficMatchRuleName;
            return this;
        }
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

    }

}
