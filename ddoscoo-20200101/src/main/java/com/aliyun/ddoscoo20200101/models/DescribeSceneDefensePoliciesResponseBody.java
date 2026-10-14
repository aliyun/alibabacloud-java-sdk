// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSceneDefensePoliciesResponseBody extends TeaModel {
    /**
     * <p>The detailed configurations of the scenario-specific policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeSceneDefensePoliciesResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F65DF043-E0EB-4796-9467-23DDCDF92C1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The protection rule when the policy takes effect.</p>
         * <p>If <strong>PolicyType</strong> is <strong>1</strong>, the value is <strong>{&quot;cc_rule_enable&quot;: false }</strong>, which indicates that frequency control is disabled.</p>
         * <p>If <strong>PolicyType</strong> is <strong>2</strong>, the value is <strong>{&quot;ai_rule_enable&quot;: 0}</strong>, which indicates that AI-based intelligent analysis is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cc_rule_enable&quot;: false }</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The type of protection feature change triggered when the policy takes effect. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: frequency control feature change.</li>
         * <li><strong>2</strong>: AI-based intelligent analysis feature change.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PolicyType")
        public Integer policyType;

        /**
         * <p>The runtime status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not delivered or policy restored successfully.</li>
         * <li><strong>1</strong>: active (policy takes effect).</li>
         * <li><strong>2</strong>: being restored (policy restoration).</li>
         * <li><strong>3</strong>: policy took effect successfully.</li>
         * <li><strong>4</strong>: policy failed to take effect.</li>
         * <li><strong>5</strong>: policy restoration failed.</li>
         * <li><strong>6</strong>: the configuration of the object associated with the policy does not exist (may have been deleted).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The protection rule before the policy takes effect.</p>
         * <p>If <strong>PolicyType</strong> is <strong>1</strong>, the value is <strong>{&quot;cc_rule_enable&quot;: true}</strong>, which indicates that frequency control is enabled.</p>
         * <p>If <strong>PolicyType</strong> is <strong>2</strong>, the value is <strong>{&quot;ai_rule_enable&quot;: 1}</strong>, which indicates that AI-based intelligent analysis is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cc_rule_enable&quot;: true}</p>
         */
        @NameInMap("oldValue")
        public String oldValue;

        public static DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies self = new DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeSceneDefensePoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The execution status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: not executed or execution completed.</li>
         * <li><strong>0</strong>: being executed.</li>
         * <li><strong>-1</strong>: execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Done")
        public Integer done;

        /**
         * <p>The time when the policy stops taking effect. The value is a timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1586016000000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testpolicy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of protected objects in the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectCount")
        public Integer objectCount;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>321a-fd31-df51-****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The runtime rules of the policy.</p>
         */
        @NameInMap("RuntimePolicies")
        public java.util.List<DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies> runtimePolicies;

        /**
         * <p>The time when the policy starts to take effect. The value is a timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1585670400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: pending activation.</li>
         * <li><strong>2</strong>: active.</li>
         * <li><strong>3</strong>: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The templatetype used by the policy. Valid values:</p>
         * <ul>
         * <li><strong>promotion</strong>: Important Activity template.</li>
         * <li><strong>bypass</strong>: full forwarding template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        @NameInMap("Template")
        public String template;

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

        public DescribeSceneDefensePoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setObjectCount(Integer objectCount) {
            this.objectCount = objectCount;
            return this;
        }
        public Integer getObjectCount() {
            return this.objectCount;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setRuntimePolicies(java.util.List<DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies> runtimePolicies) {
            this.runtimePolicies = runtimePolicies;
            return this;
        }
        public java.util.List<DescribeSceneDefensePoliciesResponseBodyPoliciesRuntimePolicies> getRuntimePolicies() {
            return this.runtimePolicies;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeSceneDefensePoliciesResponseBodyPolicies setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

}
