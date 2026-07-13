// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateProtectionPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of associated resource categories.</p>
     */
    @NameInMap("BoundResourceCategoryIds")
    public String boundResourceCategoryIdsShrink;

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
    public String subProtectionPoliciesShrink;

    public static CreateProtectionPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionPolicyShrinkRequest self = new CreateProtectionPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProtectionPolicyShrinkRequest setBoundResourceCategoryIdsShrink(String boundResourceCategoryIdsShrink) {
        this.boundResourceCategoryIdsShrink = boundResourceCategoryIdsShrink;
        return this;
    }
    public String getBoundResourceCategoryIdsShrink() {
        return this.boundResourceCategoryIdsShrink;
    }

    public CreateProtectionPolicyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProtectionPolicyShrinkRequest setProtectionPolicyName(String protectionPolicyName) {
        this.protectionPolicyName = protectionPolicyName;
        return this;
    }
    public String getProtectionPolicyName() {
        return this.protectionPolicyName;
    }

    public CreateProtectionPolicyShrinkRequest setProtectionPolicyRegionId(String protectionPolicyRegionId) {
        this.protectionPolicyRegionId = protectionPolicyRegionId;
        return this;
    }
    public String getProtectionPolicyRegionId() {
        return this.protectionPolicyRegionId;
    }

    public CreateProtectionPolicyShrinkRequest setSubProtectionPoliciesShrink(String subProtectionPoliciesShrink) {
        this.subProtectionPoliciesShrink = subProtectionPoliciesShrink;
        return this;
    }
    public String getSubProtectionPoliciesShrink() {
        return this.subProtectionPoliciesShrink;
    }

}
