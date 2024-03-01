// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2RoutePolicyScopeRequest extends TeaModel {
    @NameInMap("DestCandidateList")
    public java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestDestCandidateList> destCandidateList;

    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ShouldRecover")
    public String shouldRecover;

    @NameInMap("SrcCandidateList")
    public java.util.List<ModifyTrFirewallV2RoutePolicyScopeRequestSrcCandidateList> srcCandidateList;

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
        @NameInMap("CandidateId")
        public String candidateId;

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
        @NameInMap("CandidateId")
        public String candidateId;

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
