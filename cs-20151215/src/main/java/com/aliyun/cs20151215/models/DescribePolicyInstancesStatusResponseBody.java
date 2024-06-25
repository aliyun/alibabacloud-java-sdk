// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesStatusResponseBody extends TeaModel {
    /**
     * <p>Information about the number of policy instances of each severity level.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;high&quot;: 11,     &quot;medium&quot;: 1  }</p>
     */
    @NameInMap("instances_severity_count")
    public java.util.Map<String, ?> instancesSeverityCount;

    /**
     * <p>Details about policy instances of different types.</p>
     */
    @NameInMap("policy_instances")
    public java.util.List<DescribePolicyInstancesStatusResponseBodyPolicyInstances> policyInstances;

    public static DescribePolicyInstancesStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyInstancesStatusResponseBody self = new DescribePolicyInstancesStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyInstancesStatusResponseBody setInstancesSeverityCount(java.util.Map<String, ?> instancesSeverityCount) {
        this.instancesSeverityCount = instancesSeverityCount;
        return this;
    }
    public java.util.Map<String, ?> getInstancesSeverityCount() {
        return this.instancesSeverityCount;
    }

    public DescribePolicyInstancesStatusResponseBody setPolicyInstances(java.util.List<DescribePolicyInstancesStatusResponseBodyPolicyInstances> policyInstances) {
        this.policyInstances = policyInstances;
        return this;
    }
    public java.util.List<DescribePolicyInstancesStatusResponseBodyPolicyInstances> getPolicyInstances() {
        return this.policyInstances;
    }

    public static class DescribePolicyInstancesStatusResponseBodyPolicyInstances extends TeaModel {
        /**
         * <p>The policy type. For more information about different types of policies and their descriptions, see <a href="https://help.aliyun.com/document_detail/359819.html">Predefined security policies of ACK</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>compliance</p>
         */
        @NameInMap("policy_category")
        public String policyCategory;

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Restricts use of the cluster-admin role.</p>
         */
        @NameInMap("policy_description")
        public String policyDescription;

        /**
         * <p>The number of policy instances that are deployed. If this parameter is empty, no policy instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("policy_instances_count")
        public Long policyInstancesCount;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKRestrictRoleBindings</p>
         */
        @NameInMap("policy_name")
        public String policyName;

        /**
         * <p>The severity level of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("policy_severity")
        public String policySeverity;

        public static DescribePolicyInstancesStatusResponseBodyPolicyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyInstancesStatusResponseBodyPolicyInstances self = new DescribePolicyInstancesStatusResponseBodyPolicyInstances();
            return TeaModel.build(map, self);
        }

        public DescribePolicyInstancesStatusResponseBodyPolicyInstances setPolicyCategory(String policyCategory) {
            this.policyCategory = policyCategory;
            return this;
        }
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        public DescribePolicyInstancesStatusResponseBodyPolicyInstances setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyInstancesStatusResponseBodyPolicyInstances setPolicyInstancesCount(Long policyInstancesCount) {
            this.policyInstancesCount = policyInstancesCount;
            return this;
        }
        public Long getPolicyInstancesCount() {
            return this.policyInstancesCount;
        }

        public DescribePolicyInstancesStatusResponseBodyPolicyInstances setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyInstancesStatusResponseBodyPolicyInstances setPolicySeverity(String policySeverity) {
            this.policySeverity = policySeverity;
            return this;
        }
        public String getPolicySeverity() {
            return this.policySeverity;
        }

    }

}
