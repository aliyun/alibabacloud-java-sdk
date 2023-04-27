// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<DescribePolicyInstancesResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesResponseBody self = new DescribePolicyInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesResponseBody setPolicies(java.util.List<DescribePolicyInstancesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribePolicyInstancesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribePolicyInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolicyInstancesResponseBodyPolicies extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PolicyAction")
        public String policyAction;

        @NameInMap("PolicyCategory")
        public String policyCategory;

        @NameInMap("PolicyDescription")
        public String policyDescription;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyParameters")
        public java.util.Map<String, String> policyParameters;

        @NameInMap("PolicyScope")
        public String policyScope;

        @NameInMap("PolicySeverity")
        public String policySeverity;

        @NameInMap("TotalViolations")
        public Long totalViolations;

        public static DescribePolicyInstancesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesResponseBodyPolicies self = new DescribePolicyInstancesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesResponseBodyPolicies setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyInstancesResponseBodyPolicies setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicyCategory(String policyCategory) {
            this.policyCategory = policyCategory;
            return this;
        }
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicyParameters(java.util.Map<String, String> policyParameters) {
            this.policyParameters = policyParameters;
            return this;
        }
        public java.util.Map<String, String> getPolicyParameters() {
            return this.policyParameters;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicyScope(String policyScope) {
            this.policyScope = policyScope;
            return this;
        }
        public String getPolicyScope() {
            return this.policyScope;
        }

        public DescribePolicyInstancesResponseBodyPolicies setPolicySeverity(String policySeverity) {
            this.policySeverity = policySeverity;
            return this;
        }
        public String getPolicySeverity() {
            return this.policySeverity;
        }

        public DescribePolicyInstancesResponseBodyPolicies setTotalViolations(Long totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }
        public Long getTotalViolations() {
            return this.totalViolations;
        }

    }

}
