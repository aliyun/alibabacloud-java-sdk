// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public GetPolicyResponseBodyPolicy policy;

    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponseBody self = new GetPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponseBody setPolicy(GetPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicyResponseBodyPolicy extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyResponseBodyPolicy self = new GetPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPolicyResponseBodyPolicy setDefinition(Definition definition) {
            this.definition = definition;
            return this;
        }
        public Definition getDefinition() {
            return this.definition;
        }

        public GetPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPolicyResponseBodyPolicy setPolicyArn(String policyArn) {
            this.policyArn = policyArn;
            return this;
        }
        public String getPolicyArn() {
            return this.policyArn;
        }

        public GetPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyResponseBodyPolicy setPolicySetName(String policySetName) {
            this.policySetName = policySetName;
            return this;
        }
        public String getPolicySetName() {
            return this.policySetName;
        }

        public GetPolicyResponseBodyPolicy setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
