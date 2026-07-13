// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateProtectionPolicyRequest extends TeaModel {
    /**
     * <p>The list of associated resource category IDs.</p>
     */
    @NameInMap("BoundResourceCategoryIds")
    public java.util.List<String> boundResourceCategoryIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters. If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-<strong><strong>-</strong></strong>-****-a1b2c3d4f5e6</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The protection policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>My***Policy</p>
     */
    @NameInMap("ProtectionPolicyName")
    public String protectionPolicyName;

    /**
     * <p>The list of enabled sub-protection policies.</p>
     */
    @NameInMap("SubProtectionPolicies")
    public java.util.List<UpdateProtectionPolicyRequestSubProtectionPolicies> subProtectionPolicies;

    public static UpdateProtectionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProtectionPolicyRequest self = new UpdateProtectionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProtectionPolicyRequest setBoundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
        this.boundResourceCategoryIds = boundResourceCategoryIds;
        return this;
    }
    public java.util.List<String> getBoundResourceCategoryIds() {
        return this.boundResourceCategoryIds;
    }

    public UpdateProtectionPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProtectionPolicyRequest setProtectionPolicyName(String protectionPolicyName) {
        this.protectionPolicyName = protectionPolicyName;
        return this;
    }
    public String getProtectionPolicyName() {
        return this.protectionPolicyName;
    }

    public UpdateProtectionPolicyRequest setSubProtectionPolicies(java.util.List<UpdateProtectionPolicyRequestSubProtectionPolicies> subProtectionPolicies) {
        this.subProtectionPolicies = subProtectionPolicies;
        return this;
    }
    public java.util.List<UpdateProtectionPolicyRequestSubProtectionPolicies> getSubProtectionPolicies() {
        return this.subProtectionPolicies;
    }

    public static class UpdateProtectionPolicyRequestSubProtectionPolicies extends TeaModel {
        /**
         * <p>The sub-protection policy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;autoSnapshotPolicyId\&quot;:\&quot;sp-123***7890\&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The sub-protection policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_AUTO_SNAPSHOT_POLICY</p>
         */
        @NameInMap("SubProtectionPolicyType")
        public String subProtectionPolicyType;

        public static UpdateProtectionPolicyRequestSubProtectionPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateProtectionPolicyRequestSubProtectionPolicies self = new UpdateProtectionPolicyRequestSubProtectionPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateProtectionPolicyRequestSubProtectionPolicies setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public UpdateProtectionPolicyRequestSubProtectionPolicies setSubProtectionPolicyType(String subProtectionPolicyType) {
            this.subProtectionPolicyType = subProtectionPolicyType;
            return this;
        }
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

    }

}
