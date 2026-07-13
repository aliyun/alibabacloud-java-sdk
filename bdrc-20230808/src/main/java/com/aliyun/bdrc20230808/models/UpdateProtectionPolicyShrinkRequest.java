// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateProtectionPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The list of associated resource category IDs.</p>
     */
    @NameInMap("BoundResourceCategoryIds")
    public String boundResourceCategoryIdsShrink;

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
    public String subProtectionPoliciesShrink;

    public static UpdateProtectionPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProtectionPolicyShrinkRequest self = new UpdateProtectionPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProtectionPolicyShrinkRequest setBoundResourceCategoryIdsShrink(String boundResourceCategoryIdsShrink) {
        this.boundResourceCategoryIdsShrink = boundResourceCategoryIdsShrink;
        return this;
    }
    public String getBoundResourceCategoryIdsShrink() {
        return this.boundResourceCategoryIdsShrink;
    }

    public UpdateProtectionPolicyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProtectionPolicyShrinkRequest setProtectionPolicyName(String protectionPolicyName) {
        this.protectionPolicyName = protectionPolicyName;
        return this;
    }
    public String getProtectionPolicyName() {
        return this.protectionPolicyName;
    }

    public UpdateProtectionPolicyShrinkRequest setSubProtectionPoliciesShrink(String subProtectionPoliciesShrink) {
        this.subProtectionPoliciesShrink = subProtectionPoliciesShrink;
        return this;
    }
    public String getSubProtectionPoliciesShrink() {
        return this.subProtectionPoliciesShrink;
    }

}
