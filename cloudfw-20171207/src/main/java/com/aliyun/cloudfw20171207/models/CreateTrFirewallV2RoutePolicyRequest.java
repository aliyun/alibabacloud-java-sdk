// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2RoutePolicyRequest extends TeaModel {
    /**
     * <p>The list of secondary traffic redirection instances.</p>
     */
    @NameInMap("DestCandidateList")
    public java.util.List<CreateTrFirewallV2RoutePolicyRequestDestCandidateList> destCandidateList;

    /**
     * <p>The VPC border firewall instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-f8ce36689b224f77****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language type for receiving messages. Valid values:</p>
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
     * <p>The traffic redirection description.</p>
     * 
     * <strong>example:</strong>
     * <p>Singapore Point to Multipoint</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

    /**
     * <p>The traffic redirection name.</p>
     * 
     * <strong>example:</strong>
     * <p>Singapore Point to Multipoint</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The traffic redirection scenario type for the VPC border firewall with Cloud Enterprise Network Enterprise Edition. Valid values:</p>
     * <ul>
     * <li><p><strong>fullmesh</strong>: Multi-point interconnection</p>
     * </li>
     * <li><p><strong>one_to_one</strong>: Point-to-point</p>
     * </li>
     * <li><p><strong>end_to_end</strong>: Point-to-multipoint</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fullmesh</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The list of primary traffic redirection instances.</p>
     */
    @NameInMap("SrcCandidateList")
    public java.util.List<CreateTrFirewallV2RoutePolicyRequestSrcCandidateList> srcCandidateList;

    public static CreateTrFirewallV2RoutePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2RoutePolicyRequest self = new CreateTrFirewallV2RoutePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2RoutePolicyRequest setDestCandidateList(java.util.List<CreateTrFirewallV2RoutePolicyRequestDestCandidateList> destCandidateList) {
        this.destCandidateList = destCandidateList;
        return this;
    }
    public java.util.List<CreateTrFirewallV2RoutePolicyRequestDestCandidateList> getDestCandidateList() {
        return this.destCandidateList;
    }

    public CreateTrFirewallV2RoutePolicyRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public CreateTrFirewallV2RoutePolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTrFirewallV2RoutePolicyRequest setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    public CreateTrFirewallV2RoutePolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateTrFirewallV2RoutePolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateTrFirewallV2RoutePolicyRequest setSrcCandidateList(java.util.List<CreateTrFirewallV2RoutePolicyRequestSrcCandidateList> srcCandidateList) {
        this.srcCandidateList = srcCandidateList;
        return this;
    }
    public java.util.List<CreateTrFirewallV2RoutePolicyRequestSrcCandidateList> getSrcCandidateList() {
        return this.srcCandidateList;
    }

    public static class CreateTrFirewallV2RoutePolicyRequestDestCandidateList extends TeaModel {
        /**
         * <p>The ID of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9epancaw8t4sha****</p>
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

        public static CreateTrFirewallV2RoutePolicyRequestDestCandidateList build(java.util.Map<String, ?> map) throws Exception {
            CreateTrFirewallV2RoutePolicyRequestDestCandidateList self = new CreateTrFirewallV2RoutePolicyRequestDestCandidateList();
            return TeaModel.build(map, self);
        }

        public CreateTrFirewallV2RoutePolicyRequestDestCandidateList setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public CreateTrFirewallV2RoutePolicyRequestDestCandidateList setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

    }

    public static class CreateTrFirewallV2RoutePolicyRequestSrcCandidateList extends TeaModel {
        /**
         * <p>The ID of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9epancaw8t4sha****</p>
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

        public static CreateTrFirewallV2RoutePolicyRequestSrcCandidateList build(java.util.Map<String, ?> map) throws Exception {
            CreateTrFirewallV2RoutePolicyRequestSrcCandidateList self = new CreateTrFirewallV2RoutePolicyRequestSrcCandidateList();
            return TeaModel.build(map, self);
        }

        public CreateTrFirewallV2RoutePolicyRequestSrcCandidateList setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public CreateTrFirewallV2RoutePolicyRequestSrcCandidateList setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

    }

}
