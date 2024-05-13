// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesResponseBody extends TeaModel {
    /**
     * <p>A list of policy instances.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribePolicyInstancesResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the associated cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the policy instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The action of the policy. Valid values:</p>
         * <br>
         * <p>*   deny: blocks deployments that match the policy.</p>
         * <p>*   warn: generates alerts for deployments that match the policy.</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <p>The type of the policy.</p>
         */
        @NameInMap("PolicyCategory")
        public String policyCategory;

        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The parameters of the policy instance.</p>
         */
        @NameInMap("PolicyParameters")
        public java.util.Map<String, String> policyParameters;

        /**
         * <p>The applicable scope of the policy instance.</p>
         * <br>
         * <p>A value of \\* indicates all namespaces. This is the default value.</p>
         * <br>
         * <p>Multiple namespaces are separated by commas (,).</p>
         */
        @NameInMap("PolicyScope")
        public String policyScope;

        /**
         * <p>The severity level of the policy.</p>
         */
        @NameInMap("PolicySeverity")
        public String policySeverity;

        /**
         * <p>The total number of deployments that match the policy in the associated cluster, including the deployments that are blocked and the deployments that have triggered alerting.</p>
         */
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
