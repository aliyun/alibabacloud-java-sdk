// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAbacPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Policy")
    public GetAbacPolicyResponseBodyPolicy policy;

    /**
     * <strong>example:</strong>
     * <p>2B7844DE-A0C3-50ED-A796-8F07D377144C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAbacPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAbacPolicyResponseBody self = new GetAbacPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAbacPolicyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAbacPolicyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAbacPolicyResponseBody setPolicy(GetAbacPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetAbacPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetAbacPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAbacPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAbacPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthorizedQuantity")
        public String authorizedQuantity;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;Statement&quot;: [
         *     {
         *       &quot;Action&quot;: &quot;<em>&quot;,
         *       &quot;Effect&quot;: &quot;Allow&quot;,
         *       &quot;Resource&quot;: &quot;</em>&quot;,
         *       &quot;Condition&quot;: {
         *         &quot;StringEqualsIgnoreCase&quot;: {
         *           &quot;dms:DbType&quot;: [
         *             &quot;redis&quot;
         *           ]
         *         }
         *       }
         *     }
         *   ],
         *   &quot;Version&quot;: &quot;1&quot;
         * }</p>
         */
        @NameInMap("PolicyContent")
        public String policyContent;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PolicyDesc")
        public String policyDesc;

        /**
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicySource")
        public String policySource;

        public static GetAbacPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetAbacPolicyResponseBodyPolicy self = new GetAbacPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetAbacPolicyResponseBodyPolicy setAuthorizedQuantity(String authorizedQuantity) {
            this.authorizedQuantity = authorizedQuantity;
            return this;
        }
        public String getAuthorizedQuantity() {
            return this.authorizedQuantity;
        }

        public GetAbacPolicyResponseBodyPolicy setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetAbacPolicyResponseBodyPolicy setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public GetAbacPolicyResponseBodyPolicy setPolicyDesc(String policyDesc) {
            this.policyDesc = policyDesc;
            return this;
        }
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        public GetAbacPolicyResponseBodyPolicy setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public GetAbacPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetAbacPolicyResponseBodyPolicy setPolicySource(String policySource) {
            this.policySource = policySource;
            return this;
        }
        public String getPolicySource() {
            return this.policySource;
        }

    }

}
