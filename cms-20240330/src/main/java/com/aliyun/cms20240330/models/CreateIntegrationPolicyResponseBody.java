// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateIntegrationPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("created")
    public Boolean created;

    @NameInMap("policy")
    public CreateIntegrationPolicyResponseBodyPolicy policy;

    /**
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateIntegrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationPolicyResponseBody self = new CreateIntegrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationPolicyResponseBody setCreated(Boolean created) {
        this.created = created;
        return this;
    }
    public Boolean getCreated() {
        return this.created;
    }

    public CreateIntegrationPolicyResponseBody setPolicy(CreateIntegrationPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreateIntegrationPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public CreateIntegrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIntegrationPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eg-b79f65d11fb94e779867cf937c3a3002</p>
         */
        @NameInMap("entityGroupId")
        public String entityGroupId;

        /**
         * <strong>example:</strong>
         * <p>policy-14c8e9a29b0a46da843f8781471062ff</p>
         */
        @NameInMap("policyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>metrics-inner-manage</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("policyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>u1234567</p>
         */
        @NameInMap("userId")
        public String userId;

        @NameInMap("workspace")
        public String workspace;

        public static CreateIntegrationPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegrationPolicyResponseBodyPolicy self = new CreateIntegrationPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public CreateIntegrationPolicyResponseBodyPolicy setEntityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        public CreateIntegrationPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public CreateIntegrationPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public CreateIntegrationPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public CreateIntegrationPolicyResponseBodyPolicy setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateIntegrationPolicyResponseBodyPolicy setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateIntegrationPolicyResponseBodyPolicy setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
