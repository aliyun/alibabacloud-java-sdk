// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyInstancesStatusResponseBody extends TeaModel {
    @NameInMap("instances_severity_count")
    public java.util.Map<String, ?> instancesSeverityCount;

    // 不同策略类型下的策略实例计数列表
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
        @NameInMap("policy_category")
        public String policyCategory;

        @NameInMap("policy_description")
        public String policyDescription;

        @NameInMap("policy_instances_count")
        public Long policyInstancesCount;

        @NameInMap("policy_name")
        public String policyName;

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
