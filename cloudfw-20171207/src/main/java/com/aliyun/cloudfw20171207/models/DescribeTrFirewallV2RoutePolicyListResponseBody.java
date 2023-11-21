// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallV2RoutePolicyListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The type of the secondary traffic redirection instance.</p>
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
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The type of the primary traffic redirection instance.</p>
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
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The name of the routing policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The status of the routing policy. Valid values:</p>
         * <br>
         * <p>*   creating: The policy is being created.</p>
         * <p>*   deleting: The policy is being deleted.</p>
         * <p>*   opening: The policy is being enabled.</p>
         * <p>*   opened: The policy is enabled.</p>
         * <p>*   closing: The policy is being disabled.</p>
         * <p>*   closed: The policy is disabled.</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>The type of the traffic redirection scenario of the VPC firewall. Valid values:</p>
         * <br>
         * <p>*   **fullmesh**: interconnected instances</p>
         * <p>*   **one_to_one**: instance to instance</p>
         * <p>*   **end_to_end**: instance to instances</p>
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
