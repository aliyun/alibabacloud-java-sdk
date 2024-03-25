// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTrafficMarkingPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The differentiated services code point (DSCP) value to be added to packets that match the traffic classification rule. Valid values: **0** to **63**.</p>
     * <br>
     * <p>The DSCP value of each traffic marking policy on a transit router must be unique.</p>
     */
    @NameInMap("MarkingDscp")
    public Integer markingDscp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority value of the traffic marking policy. Valid values: **1** to **100**.</p>
     * <br>
     * <p>The priority value of each traffic marking policy on a transit router must be unique. A smaller value specifies a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The description of the traffic marking policy.</p>
     * <br>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     */
    @NameInMap("TrafficMarkingPolicyDescription")
    public String trafficMarkingPolicyDescription;

    /**
     * <p>The name of the traffic marking policy.</p>
     * <br>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     */
    @NameInMap("TrafficMarkingPolicyName")
    public String trafficMarkingPolicyName;

    /**
     * <p>The traffic classification rules in the traffic marking policy.</p>
     * <br>
     * <p>Data packets that meet the traffic classification rule is assigned the DSCP value of quality of service (QoS) policy.</p>
     * <br>
     * <p>You can create up to 50 traffic classification rules.</p>
     */
    @NameInMap("TrafficMatchRules")
    public java.util.List<CreateTrafficMarkingPolicyRequestTrafficMatchRules> trafficMatchRules;

    /**
     * <p>The ID of the transit router.</p>
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
         * <p>The destination CIDR block that is used to match packets.</p>
         * <br>
         * <p>Packets whose destination IP addresses fall into the specified destination CIDR block meet the traffic classification rule. If you do not specify a destination CIDR block, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call You can specify a destination CIDR block for each traffic classification rule.</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range that is used to match packets. Valid values: **-1** and **1** to **65535**.</p>
         * <br>
         * <p>Packets whose destination ports fall within the destination port range meet the traffic classification rule. If you do not specify destination port range, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <br>
         * <p>*   If you enter only one port number, such as 1, packets whose destination port is 1 meet the traffic classification rule.</p>
         * <p>*   If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 meet the traffic classification rule.</p>
         * <p>*   If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination port range for each traffic classification rule.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The DSCP value that is used to match packets. Valid values: **0** to **63**.</p>
         * <br>
         * <p>Packets that carry the specified DSCP value meet the traffic classification rule. If you do not specify a DSCP value, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>>  The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a DSCP value for each traffic classification rule.</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol that is used to match packets.</p>
         * <br>
         * <p>Traffic classification rules support the following protocols: **HTTP**, **HTTPS**, **TCP**, **UDP**, **SSH**, and **Telnet**. For more information, log on to the [CEN console](https://cen.console.aliyun.com/cen/list).</p>
         * <br>
         * <p>**Some protocols use a fixed port. Click to view protocols and ports.**</p>
         * <br>
         * <p>*   If the protocol is **ICMP**, the destination port must be **-1**.</p>
         * <p>*   If the protocol is **GRE**, the destination port must be **1**.</p>
         * <p>*   If the protocol is **SSH**, the destination port must be **22**.</p>
         * <p>*   If the protocol is **Telnet**, the destination port must be **23**.</p>
         * <p>*   If the protocol is **HTTP**, the destination port must be **80**.</p>
         * <p>*   If the protocol is **HTTPS**, the destination port must be **443**.</p>
         * <p>*   If the protocol is **MS SQL**, the destination port must be **1443**.</p>
         * <p>*   If the protocol is **Oracle**, the destination port must be **1521**.</p>
         * <p>*   If the protocol is **Mysql**, the destination port must be **3306**.</p>
         * <p>*   If the protocol is **RDP**, the destination port must be **3389**.</p>
         * <p>*   If the protocol is **Postgre SQL**, the destination port must be **5432**.</p>
         * <p>*   If the protocol is **Redis**, the destination port must be **6379**.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block that is used to match packets.</p>
         * <br>
         * <p>Packets whose source IP addresses fall into the specified source CIDR block meet the traffic classification rule. If you do not specify a source CIDR block, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range that is used to match packets. Valid values: **-1** and **1** to **65535**.</p>
         * <br>
         * <p>Packets whose source ports fall into the source port range meet the traffic classification rule. If you do not specify a source port range, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <br>
         * <p>*   If you enter only one port number, such as 1, packets whose source port is 1 meet the traffic classification rule.</p>
         * <p>*   If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 meet the traffic classification rule.</p>
         * <p>*   If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a source port range for each traffic classification rule.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a description for each traffic classification rule.</p>
         * <br>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a name for each traffic classification rule.</p>
         * <br>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static CreateTrafficMarkingPolicyRequestTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMarkingPolicyRequestTrafficMatchRules self = new CreateTrafficMarkingPolicyRequestTrafficMatchRules();
            return TeaModel.build(map, self);
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
