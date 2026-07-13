// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateProtectionPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of associated resource categories.</p>
     */
    @NameInMap("BoundResourceCategoryIds")
    public java.util.List<String> boundResourceCategoryIds;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-<strong><strong>-</strong></strong>-****-a1b2c3d4f5e6</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the protection policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My***Policy</p>
     */
    @NameInMap("ProtectionPolicyName")
    public String protectionPolicyName;

    /**
     * <p>The region ID of the protection policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ProtectionPolicyRegionId")
    public String protectionPolicyRegionId;

    /**
     * <p>The sub-protection policies.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubProtectionPolicies")
    public java.util.List<CreateProtectionPolicyRequestSubProtectionPolicies> subProtectionPolicies;

    public static CreateProtectionPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionPolicyRequest self = new CreateProtectionPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtectionPolicyRequest setBoundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
        this.boundResourceCategoryIds = boundResourceCategoryIds;
        return this;
    }
    public java.util.List<String> getBoundResourceCategoryIds() {
        return this.boundResourceCategoryIds;
    }

    public CreateProtectionPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProtectionPolicyRequest setProtectionPolicyName(String protectionPolicyName) {
        this.protectionPolicyName = protectionPolicyName;
        return this;
    }
    public String getProtectionPolicyName() {
        return this.protectionPolicyName;
    }

    public CreateProtectionPolicyRequest setProtectionPolicyRegionId(String protectionPolicyRegionId) {
        this.protectionPolicyRegionId = protectionPolicyRegionId;
        return this;
    }
    public String getProtectionPolicyRegionId() {
        return this.protectionPolicyRegionId;
    }

    public CreateProtectionPolicyRequest setSubProtectionPolicies(java.util.List<CreateProtectionPolicyRequestSubProtectionPolicies> subProtectionPolicies) {
        this.subProtectionPolicies = subProtectionPolicies;
        return this;
    }
    public java.util.List<CreateProtectionPolicyRequestSubProtectionPolicies> getSubProtectionPolicies() {
        return this.subProtectionPolicies;
    }

    public static class CreateProtectionPolicyRequestSubProtectionPolicies extends TeaModel {
        /**
         * <p>The configuration of the sub-protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;PlaybookUuid\&quot;: \&quot;2093d1ea-0651-48a6-bea2-fa7157285dc1\&quot;, \&quot;ParamType\&quot;: \&quot;custom\&quot;, \&quot;InputParams\&quot;: \&quot;\&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The type of the sub-protection policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_AUTO_SNAPSHOT_POLICY</p>
         */
        @NameInMap("SubProtectionPolicyType")
        public String subProtectionPolicyType;

        public static CreateProtectionPolicyRequestSubProtectionPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectionPolicyRequestSubProtectionPolicies self = new CreateProtectionPolicyRequestSubProtectionPolicies();
            return TeaModel.build(map, self);
        }

        public CreateProtectionPolicyRequestSubProtectionPolicies setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateProtectionPolicyRequestSubProtectionPolicies setSubProtectionPolicyType(String subProtectionPolicyType) {
            this.subProtectionPolicyType = subProtectionPolicyType;
            return this;
        }
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

    }

}
