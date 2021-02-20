// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<DescribeSceneDefensePoliciesResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSceneDefensePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDefensePoliciesResponseBody self = new DescribeSceneDefensePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDefensePoliciesResponseBody setPolicies(java.util.List<DescribeSceneDefensePoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeSceneDefensePoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribeSceneDefensePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneDefensePoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("oldValue")
        public String oldValue;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("PolicyType")
        public Integer policyType;

        public static DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies self = new DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies();
            return TeaModel.build(map, self);
        }

        public DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies setPolicyType(Integer policyType) {
            this.policyType = policyType;
            return this;
        }
        public Integer getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeSceneDefensePoliciesResponseBodyPolicies extends TeaModel {
        @NameInMap("Done")
        public Integer done;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ObjectCount")
        public Integer objectCount;

        @NameInMap("Template")
        public String template;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuntimePolicies")
        public java.util.List<DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies> runtimePolicies;

        public static DescribeSceneDefensePoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneDefensePoliciesResponseBodyPolicies self = new DescribeSceneDefensePoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setDone(Integer done) {
            this.done = done;
            return this;
        }
        public Integer getDone() {
            return this.done;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setObjectCount(Integer objectCount) {
            this.objectCount = objectCount;
            return this;
        }
        public Integer getObjectCount() {
            return this.objectCount;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setRuntimePolicies(java.util.List<DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies> runtimePolicies) {
            this.runtimePolicies = runtimePolicies;
            return this;
        }
        public java.util.List<DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies> getRuntimePolicies() {
            return this.runtimePolicies;
        }

    }

}
