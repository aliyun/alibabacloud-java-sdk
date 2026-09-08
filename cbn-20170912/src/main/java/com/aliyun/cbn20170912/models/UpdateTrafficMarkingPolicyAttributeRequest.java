// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeRequest extends TeaModel {
    /**
     * <p>The list of traffic classification rules to add.</p>
     * <p>You can add up to 50 traffic classification rules at a time.</p>
     */
    @NameInMap("AddTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules> addTrafficMatchRules;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>The client generates the value of this parameter. Ensure that the value is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of traffic classification rules to delete.</p>
     * <blockquote>
     * <p>Provide as much information as possible for the traffic classification rules, such as the source CIDR block, destination CIDR block, source port, destination port, and DSCP value. Otherwise, the system may fail to locate the target traffic classification rules and will not delete them.</p>
     * </blockquote>
     */
    @NameInMap("DeleteTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules> deleteTrafficMatchRules;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions without modifying the name, description, or traffic classification rules of the traffic marking policy. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. After the request passes the dry run, the name, description, and traffic classification rules of the traffic marking policy are directly modified.</li>
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
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The address family. Valid values: IPv4, IPv6, or empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
         * <p>The traffic classification rule matches traffic whose destination IP address falls within the destination CIDR block. If you do not set this parameter, the traffic classification rule matches traffic with any destination IP address.</p>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can specify one destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.30.0.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches traffic whose destination port falls within the destination port range. If you do not set this parameter, the traffic classification rule matches traffic with any destination port.</p>
         * <p>This parameter supports up to two port numbers. The input format is described as follows:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, the system matches traffic whose destination port is 1 by default. If the value is -1, the system matches traffic with any destination port.</li>
         * <li>If you enter two port numbers, such as 1 and 200, the system matches traffic whose destination port is in the range of 1 to 200 by default.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any destination port is matched.</li>
         * </ul>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can specify one destination port range.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The Differentiated Services Code Point (DSCP) value of the traffic packet. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>The traffic classification rule matches traffic that contains the specified DSCP value. If you do not set this parameter, the traffic classification rule matches traffic with any DSCP value.</p>
         * <blockquote>
         * <p>The DSCP value refers to the DSCP value that the traffic packet already carries before entering the inter-region connection.</p>
         * </blockquote>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can match one DSCP value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol type of the traffic packet.</p>
         * <p>The traffic marking policy supports matching traffic of multiple protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
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
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can match one protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
         * <p>The traffic classification rule matches traffic whose source IP address falls within the source CIDR block. If you do not set this parameter, the traffic classification rule matches traffic with any source IP address.</p>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can match one source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.128.32.0/19</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The traffic classification rule matches traffic whose source port falls within the source port range. If you do not set this parameter, the traffic classification rule matches traffic with any source port.</p>
         * <p>This parameter supports up to two port numbers. The input format is described as follows:</p>
         * <ul>
         * <li>If you enter only one port number, such as 1, the system matches traffic whose source port is 1 by default. If the value is -1, the system matches traffic with any source port.</li>
         * <li>If you enter two port numbers, such as 1 and 200, the system matches traffic whose source port is in the range of 1 to 200 by default.</li>
         * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any source port is matched.</li>
         * </ul>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can specify one source port range.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can have one description.</p>
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can have one name.</p>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Guangzhou test</p>
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
         * <p>The address family. Valid values: IPv4, IPv6, or empty.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv6</p>
         */
        @NameInMap("AddressFamily")
        public String addressFamily;

        /**
         * <p>The destination CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.200.3/32</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination port of the traffic packet.</p>
         */
        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        /**
         * <p>The DSCP value of the traffic packet.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The protocol type of the traffic packet.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/468322.html">ListTrafficMarkingPolicies</a> operation to query the details of the traffic classification rules that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.72.0.0/16</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source port of the traffic packet.</p>
         */
        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou-Qingdao CAT</p>
         */
        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
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
