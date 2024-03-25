// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeRequest extends TeaModel {
    /**
     * <p>The traffic classification rules to be added to the traffic marking policy.</p>
     */
    @NameInMap("AddTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules> addTrafficMatchRules;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The traffic classification rules to be deleted from the traffic marking policy.</p>
     * <br>
     * <p>>  Specify detailed information about the traffic classification rule, such as the source CIDR block, destination CIDR block, source port, destination port, and DSCP value. If you do not specify sufficient information, the system may fail to match the traffic classification rule that you want to delete.</p>
     */
    @NameInMap("DeleteTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules> deleteTrafficMatchRules;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: preforms a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request.</p>
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
     * <br>
     * <p>The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.</p>
     */
    @NameInMap("TrafficMarkingPolicyDescription")
    public String trafficMarkingPolicyDescription;

    /**
     * <p>The ID of the traffic marking policy.</p>
     */
    @NameInMap("TrafficMarkingPolicyId")
    public String trafficMarkingPolicyId;

    /**
     * <p>The new name of the traffic marking policy.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
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
         * <p>The destination CIDR block that is used to match packets.</p>
         * <br>
         * <p>Packets whose destination IP addresses fall into the specified destination CIDR block are considered a match. If you do not specify a destination CIDR block, packets are considered a match regardless of the destination IP address.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination CIDR block for each traffic classification rule.</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port range that is used to match packets. Valid values: **-1** and **1** to **65535**.</p>
         * <br>
         * <p>Packets whose destination ports fall into the specified destination port range are considered a match. If you do not specify a destination port range, packets are considered a match regardless of the destination port.</p>
         * <br>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <br>
         * <p>*   If you enter only one port number, such as 1, packets whose destination port is 1 match the traffic classification rule.</p>
         * <p>*   If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 are considered a match.</p>
         * <p>*   If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, packets are considered a match regardless of the destination port.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination port range for each traffic classification rule.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Service Code Point (DSCP) value that is used to match packets. Valid values: **0** to **63**.</p>
         * <br>
         * <p>Requests that carry the specified DSCP value are considered a match. If you do not specify a DSCP value, packets are considered a match regardless of the DSCP value.</p>
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
         * <p>**Some protocols use a fixed port. Click to view the protocols and ports.**</p>
         * <br>
         * <p>*   If the protocol is **ICMP**, set the destination port to **-1**.</p>
         * <p>*   If the protocol is **GRE**, set the destination port to **-1**.</p>
         * <p>*   If the protocol is **SSH**, set the destination port to **22**.</p>
         * <p>*   If the protocol is **Telnet**, set the destination port to **23**.</p>
         * <p>*   If the protocol is **HTTP**, set the destination port to **80**.</p>
         * <p>*   If the protocol is **HTTPS**, set the destination port to **443**.</p>
         * <p>*   If the protocol is **MS SQL**, set the destination port to **1443**.</p>
         * <p>*   If the protocol is **Oracle**, set the destination port to **1521**.</p>
         * <p>*   If the protocol is **Mysql**, set the destination port to **3306**.</p>
         * <p>*   If the protocol is **RDP**, set the destination port to **3389**.</p>
         * <p>*   If the protocol is **Postgre SQL**, set the destination port to **5432**.</p>
         * <p>*   If the protocol is **Redis**, set the destination port to **6379**.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block that is used to match packets.</p>
         * <br>
         * <p>Packets whose source IP addresses fall into the specified source CIDR block are considered a match. If you do not specify a source CIDR block, packets are considered a match regardless of the source IP address.</p>
         * <br>
         * <p>You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port range that is used to match packets. Valid values: **-1** and **1** to **65535**.</p>
         * <br>
         * <p>Packets whose source ports fall into the specified source port range are considered a match. If you do not specify a source port range, packets are considered a match regardless of the source port.</p>
         * <br>
         * <p>You can enter up to two port numbers. Take note of the following rules:</p>
         * <br>
         * <p>*   If you enter only one port number, such as 1, packets whose source port is 1 are considered a match.</p>
         * <p>*   If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 are considered a match.</p>
         * <p>*   If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, packets are considered a match regardless of the source port.</p>
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

        public static UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules self = new UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules();
            return TeaModel.build(map, self);
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
         * <p>The destination CIDR block that is used to match packets.</p>
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
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol that is used to match packets.</p>
         * <br>
         * <p>You can call the [ListTrafficMarkingPolicies](~~468322~~) operation to query the details about a traffic classification rule.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block that is used to match packets.</p>
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
         * <br>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <br>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         */
        @NameInMap("TrafficMatchRuleName")
        public String trafficMatchRuleName;

        public static UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules self = new UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules();
            return TeaModel.build(map, self);
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
