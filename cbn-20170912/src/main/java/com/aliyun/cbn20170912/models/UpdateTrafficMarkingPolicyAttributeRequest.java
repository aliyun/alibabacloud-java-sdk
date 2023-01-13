// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTrafficMarkingPolicyAttributeRequest extends TeaModel {
    @NameInMap("AddTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestAddTrafficMatchRules> addTrafficMatchRules;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeleteTrafficMatchRules")
    public java.util.List<UpdateTrafficMarkingPolicyAttributeRequestDeleteTrafficMatchRules> deleteTrafficMatchRules;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request but does not modify the name and description of the traffic marking policy. The system checks whether the required parameters are set, whether the formats of the values are valid, and the service limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): checks the request. If the request passes the check, the name and description of the traffic marking policy are modified.</p>
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
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
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
        @NameInMap("DstCidr")
        public String dstCidr;

        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        @NameInMap("MatchDscp")
        public Integer matchDscp;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SrcCidr")
        public String srcCidr;

        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

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
        @NameInMap("DstCidr")
        public String dstCidr;

        @NameInMap("DstPortRange")
        public java.util.List<Integer> dstPortRange;

        @NameInMap("MatchDscp")
        public Integer matchDscp;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SrcCidr")
        public String srcCidr;

        @NameInMap("SrcPortRange")
        public java.util.List<Integer> srcPortRange;

        @NameInMap("TrafficMatchRuleDescription")
        public String trafficMatchRuleDescription;

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
