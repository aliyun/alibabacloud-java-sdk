// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallV2RoutePolicyListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

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
        @NameInMap("CandidateId")
        public String candidateId;

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
        @NameInMap("CandidateId")
        public String candidateId;

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
        @NameInMap("DestCandidateList")
        public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesDestCandidateList> destCandidateList;

        @NameInMap("PolicyDescription")
        public String policyDescription;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyStatus")
        public String policyStatus;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("SrcCandidateList")
        public java.util.List<DescribeTrFirewallV2RoutePolicyListResponseBodyTrFirewallRoutePoliciesSrcCandidateList> srcCandidateList;

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
