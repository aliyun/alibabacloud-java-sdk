// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public CreatePolicyResponseBodyPolicy policy;

    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponseBody self = new CreatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponseBody setPolicy(CreatePolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreatePolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public CreatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolicyResponseBodyPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Definition")
        public Definition definition;

        /**
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:policyset/default-policy-set/policy/rate-limit-policy</p>
         */
        @NameInMap("PolicyArn")
        public String policyArn;

        /**
         * <strong>example:</strong>
         * <p>rate-limit-policy</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>default-policy-set</p>
         */
        @NameInMap("PolicySetName")
        public String policySetName;

        public static CreatePolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyResponseBodyPolicy self = new CreatePolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public CreatePolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePolicyResponseBodyPolicy setDefinition(Definition definition) {
            this.definition = definition;
            return this;
        }
        public Definition getDefinition() {
            return this.definition;
        }

        public CreatePolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicyResponseBodyPolicy setPolicyArn(String policyArn) {
            this.policyArn = policyArn;
            return this;
        }
        public String getPolicyArn() {
            return this.policyArn;
        }

        public CreatePolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public CreatePolicyResponseBodyPolicy setPolicySetName(String policySetName) {
            this.policySetName = policySetName;
            return this;
        }
        public String getPolicySetName() {
            return this.policySetName;
        }

    }

}
