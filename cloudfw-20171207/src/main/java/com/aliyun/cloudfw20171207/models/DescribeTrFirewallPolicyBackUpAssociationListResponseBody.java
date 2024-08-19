// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallPolicyBackUpAssociationListResponseBody extends TeaModel {
    /**
     * <p>The route tables.</p>
     */
    @NameInMap("PolicyAssociationBackupConfigs")
    public java.util.List<DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs> policyAssociationBackupConfigs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C264A756-9B48-57E3-B312-716941E146C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTrFirewallPolicyBackUpAssociationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallPolicyBackUpAssociationListResponseBody self = new DescribeTrFirewallPolicyBackUpAssociationListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallPolicyBackUpAssociationListResponseBody setPolicyAssociationBackupConfigs(java.util.List<DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs> policyAssociationBackupConfigs) {
        this.policyAssociationBackupConfigs = policyAssociationBackupConfigs;
        return this;
    }
    public java.util.List<DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs> getPolicyAssociationBackupConfigs() {
        return this.policyAssociationBackupConfigs;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs extends TeaModel {
        /**
         * <p>The ID of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9grb8ng3y7h7lf2****</p>
         */
        @NameInMap("CandidateId")
        public String candidateId;

        /**
         * <p>The name of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CandidateName")
        public String candidateName;

        /**
         * <p>The type of the traffic redirection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("CandidateType")
        public String candidateType;

        /**
         * <p>The route table that is used after traffic redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-wz9898grickmh5j09****</p>
         */
        @NameInMap("CurrentRouteTableId")
        public String currentRouteTableId;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-wz9slp3s7m4qrzvnq****</p>
         */
        @NameInMap("OriginalRouteTableId")
        public String originalRouteTableId;

        public static DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs self = new DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs setCandidateId(String candidateId) {
            this.candidateId = candidateId;
            return this;
        }
        public String getCandidateId() {
            return this.candidateId;
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs setCandidateName(String candidateName) {
            this.candidateName = candidateName;
            return this;
        }
        public String getCandidateName() {
            return this.candidateName;
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs setCandidateType(String candidateType) {
            this.candidateType = candidateType;
            return this;
        }
        public String getCandidateType() {
            return this.candidateType;
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs setCurrentRouteTableId(String currentRouteTableId) {
            this.currentRouteTableId = currentRouteTableId;
            return this;
        }
        public String getCurrentRouteTableId() {
            return this.currentRouteTableId;
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBodyPolicyAssociationBackupConfigs setOriginalRouteTableId(String originalRouteTableId) {
            this.originalRouteTableId = originalRouteTableId;
            return this;
        }
        public String getOriginalRouteTableId() {
            return this.originalRouteTableId;
        }

    }

}
