// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2RoutePolicyScopeRequest extends TeaModel {
    /**
     * <p>The secondary traffic redirection instances.</p>
     */
    @NameInMap("DestCandidateList")
    public java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList> destCandidateList;

    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-6520de0253bc4669bbd9</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to restore the traffic redirection configurations. Valid values:</p>
     * <ul>
     * <li>true: roll back</li>
     * <li>false: withdraw</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShouldRecover")
    public String shouldRecover;

    /**
     * <p>The primary traffic redirection instances.</p>
     */
    @NameInMap("SrcCandidateList")
    public java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList> srcCandidateList;

    /**
     * <p>The ID of the routing policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-4d724d0139df48f18091</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static ModifyTrFirewallV2RoutePolicyScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2RoutePolicyScopeRequest self = new ModifyTrFirewallV2RoutePolicyScopeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2RoutePolicyScopeRequest setDestCandidateList(java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList> destCandidateList) {
        this.destCandidateList = destCandidateList;
        return this;
    }
    public java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList> getDestCandidateList() {
        return this.destCandidateList;
    }

    public ModifyTrFirewallV2RoutePolicyScopeRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public ModifyTrFirewallV2RoutePolicyScopeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyTrFirewallV2RoutePolicyScopeRequest setShouldRecover(String shouldRecover) {
        this.shouldRecover = shouldRecover;
        return this;
    }
    public String getShouldRecover() {
        return this.shouldRecover;
    }

    public ModifyTrFirewallV2RoutePolicyScopeRequest setSrcCandidateList(java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList> srcCandidateList) {
        this.srcCandidateList = srcCandidateList;
        return this;
    }
    public java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList> getSrcCandidateList() {
        return this.srcCandidateList;
    }

    public ModifyTrFirewallV2RoutePolicyScopeRequest setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    public static class ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList extends TeaModel {
        /**
         * <p>The ID of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9epancaw8t4shajuzi</p>
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The type of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("CandidateType")
        public String candidateType;

        public static ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList self = new ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList();
            return TeaModel.build(map, self);
        }

        public ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

    }

    public static class ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList extends TeaModel {
        /**
         * <p>The ID of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9epancaw8t4shajuzi</p>
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The type of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("CandidateType")
        public String candidateType;

        public static ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList self = new ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList();
            return TeaModel.build(map, self);
        }

        public ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

    }

}
