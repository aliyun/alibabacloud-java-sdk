// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesStatusResponseBody extends TeaModel {
    /**
     * <p>The number of policy instances of each policy type.</p>
     */
    @NameInMap("Policies")
    public DescribePolicyInstancesStatusResponseBodyPolicies policies;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyInstancesStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesStatusResponseBody self = new DescribePolicyInstancesStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesStatusResponseBody setPolicies(DescribePolicyInstancesStatusResponseBodyPolicies policies) {
        this.policies = policies;
        return this;
    }
    public DescribePolicyInstancesStatusResponseBodyPolicies getPolicies() {
        return this.policies;
    }

    public DescribePolicyInstancesStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters extends TeaModel {
        /**
         * <p>The ID of the associated cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The status of the deployment.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters self = new DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances extends TeaModel {
        /**
         * <p>The type of the policy.</p>
         */
        @NameInMap("PolicyCategory")
        public String policyCategory;

        /**
         * <p>The associated clusters in which the policy instances are deployed.</p>
         */
        @NameInMap("PolicyClusters")
        public java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters> policyClusters;

        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The number of policy instances that are deployed. If this parameter is empty, no policy instance is deployed.</p>
         */
        @NameInMap("PolicyInstancesCount")
        public Long policyInstancesCount;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The severity level of the policy.</p>
         */
        @NameInMap("PolicySeverity")
        public String policySeverity;

        public static DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances self = new DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances setPolicyCategory(String policyCategory) {
            this.policyCategory = policyCategory;
            return this;
        }
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances setPolicyClusters(java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters> policyClusters) {
            this.policyClusters = policyClusters;
            return this;
        }
        public java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstancesPolicyClusters> getPolicyClusters() {
            return this.policyClusters;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances setPolicyInstancesCount(Long policyInstancesCount) {
            this.policyInstancesCount = policyInstancesCount;
            return this;
        }
        public Long getPolicyInstancesCount() {
            return this.policyInstancesCount;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances setPolicySeverity(String policySeverity) {
            this.policySeverity = policySeverity;
            return this;
        }
        public String getPolicySeverity() {
            return this.policySeverity;
        }

    }

    public static class DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo extends TeaModel {
        /**
         * <p>The number of policy instances.</p>
         */
        @NameInMap("SeverityCount")
        public String severityCount;

        /**
         * <p>The severity level.</p>
         */
        @NameInMap("SeverityType")
        public String severityType;

        public static DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo self = new DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo setSeverityCount(String severityCount) {
            this.severityCount = severityCount;
            return this;
        }
        public String getSeverityCount() {
            return this.severityCount;
        }

        public DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo setSeverityType(String severityType) {
            this.severityType = severityType;
            return this;
        }
        public String getSeverityType() {
            return this.severityType;
        }

    }

    public static class DescribePolicyInstancesStatusResponseBodyPolicies extends TeaModel {
        /**
         * <p>The number of policy instances of each policy type.</p>
         */
        @NameInMap("PolicyInstances")
        public java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances> policyInstances;

        /**
         * <p>The number of policy instances that are deployed in the cluster.</p>
         */
        @NameInMap("SeverityInfo")
        public java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo> severityInfo;

        public static DescribePolicyInstancesStatusResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesStatusResponseBodyPolicies self = new DescribePolicyInstancesStatusResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesStatusResponseBodyPolicies setPolicyInstances(java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances> policyInstances) {
            this.policyInstances = policyInstances;
            return this;
        }
        public java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesPolicyInstances> getPolicyInstances() {
            return this.policyInstances;
        }

        public DescribePolicyInstancesStatusResponseBodyPolicies setSeverityInfo(java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo> severityInfo) {
            this.severityInfo = severityInfo;
            return this;
        }
        public java.util.List<DescribePolicyInstancesStatusResponseBodyPoliciesSeverityInfo> getSeverityInfo() {
            return this.severityInfo;
        }

    }

}
