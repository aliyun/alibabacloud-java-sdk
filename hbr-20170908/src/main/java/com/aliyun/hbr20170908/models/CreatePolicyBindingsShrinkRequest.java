// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyBindingsShrinkRequest extends TeaModel {
    /**
     * <p>The data sources that you want to bind to the backup policy.</p>
     */
    @NameInMap("PolicyBindingList")
    public String policyBindingListShrink;

    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static CreatePolicyBindingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyBindingsShrinkRequest self = new CreatePolicyBindingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyBindingsShrinkRequest setPolicyBindingListShrink(String policyBindingListShrink) {
        this.policyBindingListShrink = policyBindingListShrink;
        return this;
    }
    public String getPolicyBindingListShrink() {
        return this.policyBindingListShrink;
    }

    public CreatePolicyBindingsShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
