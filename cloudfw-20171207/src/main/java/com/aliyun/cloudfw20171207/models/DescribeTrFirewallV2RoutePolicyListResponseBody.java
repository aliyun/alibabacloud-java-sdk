// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallV2RoutePolicyListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95EB5F3A-67FE-5780-92BD-5ECBA772AB7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The routing policies.</p>
     */
    @NameInMap("TrFirewallRoutePolicies")
    public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies> trFirewallRoutePolicies;

    public static DescribeTrFirewallV2RoutePolicyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallV2RoutePolicyListResponseBody self = new DescribeTrFirewallV2RoutePolicyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallV2RoutePolicyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrFirewallV2RoutePolicyListResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeTrFirewallV2RoutePolicyListResponseBody setTrFirewallRoutePolicies(java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies> trFirewallRoutePolicies) {
        this.trFirewallRoutePolicies = trFirewallRoutePolicies;
        return this;
    }
    public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies> getTrFirewallRoutePolicies() {
        return this.trFirewallRoutePolicies;
    }

    public static class DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList extends TeaModel {
        /**
         * <p>The ID of the secondary traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9epancaw8t4sha****</p>
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The type of the secondary traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("CandidateType")
        public String candidateType;

        public static DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList self = new DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

    }

    public static class DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList extends TeaModel {
        /**
         * <p>The ID of the primary traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze9epancaw8t4sha****</p>
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The type of the primary traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("CandidateType")
        public String candidateType;

        public static DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList self = new DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

    }

    public static class DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies extends TeaModel {
        /**
         * <p>The secondary traffic redirection instances.</p>
         */
        @NameInMap("DestCandidateList")
        public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList> destCandidateList;

        /**
         * <p>The description of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The name of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_VPC_FW</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The status of the routing policy. Valid values:</p>
         * <ul>
         * <li>creating: The policy is being created.</li>
         * <li>deleting: The policy is being deleted.</li>
         * <li>opening: The policy is being enabled.</li>
         * <li>opened: The policy is enabled.</li>
         * <li>closing: The policy is being disabled.</li>
         * <li>closed: The policy is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>The type of the traffic redirection scenario of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>fullmesh</strong>: interconnected instances</li>
         * <li><strong>one_to_one</strong>: instance to instance</li>
         * <li><strong>end_to_end</strong>: instance to instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fullmesh</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The primary traffic redirection instances.</p>
         */
        @NameInMap("SrcCandidateList")
        public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList> srcCandidateList;

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-7b66257c14e141fb****</p>
         */
        @NameInMap("TrFirewallRoutePolicyId")
        public String trFirewallRoutePolicyId;

        public static DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies self = new DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setDestCandidateList(java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList> destCandidateList) {
            this.destCandidateList = destCandidateList;
            return this;
        }
        public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList> getDestCandidateList() {
            return this.destCandidateList;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setSrcCandidateList(java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList> srcCandidateList) {
            this.srcCandidateList = srcCandidateList;
            return this;
        }
        public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList> getSrcCandidateList() {
            return this.srcCandidateList;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePolicies setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }
        public String getTrFirewallRoutePolicyId() {
            return this.trFirewallRoutePolicyId;
        }

    }

}
